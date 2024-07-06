import socket
import threading

def handle_session(player1, player2):
    global board
    print("correct")
    player1['socket'].send("You are player1 with token 'X'".encode())
    player2['socket'].send("You are player2 with token 'O'".encode())

    try:
        while True:
            send_board(player1, player2)
            handle_player_turn(player1)

            if check_winner(player1['token']):
                send_board(player1, player2)
                notify_winner(player1,player2)
                break

            send_board(player1, player2)
            handle_player_turn(player2)
            if check_winner(player2['token']):
                send_board(player1, player2)
                notify_winner(player2,player1)
                break

    except Exception as e:
        print(f"Error in handle_session: {e}")

def handle_player_turn(player):
    player['socket'].send("Your turn. Enter position (1-9): ".encode())
    position = int(player['socket'].recv(1024).decode()) - 1
    if is_valid_move(position):
        board[position] = player['token']
    else:
        player['socket'].send("Invalid move. Try again.\n".encode())
        handle_player_turn(player)
def send_board(player1, player2):
    board_str = format_board()
    player1['socket'].send(board_str.encode())
    player2['socket'].send(board_str.encode())
def format_board():
    return f" {board[0]} | {board[1]} | {board[2]}\n" \
    f"-----------\n" \
    f" {board[3]} | {board[4]} | {board[5]}\n" \
    f"-----------\n" \
    f" {board[6]} | {board[7]} | {board[8]}\n"
def is_valid_move(position):
    return 0 <= position <= 8 and board[position] == ''
def check_winner(token):
    winning_combinations = [(0,1,2),(3,4,5),(6,7,8),
    (0,3,6),(1,4,7),(2,5,8),
    (0,4,8),(2,4,6)]
    for combo in winning_combinations:
        if all(board[i] == token for i in combo):
            return True
    return False
def notify_winner(winner, loser):
    winner['socket'].send("Congratulations! You win.".encode())
    loser['socket'].send("You lose. Better luck next time.".encode())
    reset_board()
def reset_board():
    global board
    board = [''] * 9

board = [''] * 9
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('127.0.0.1', 9999))
server_socket.listen(8)
players = []
while len(players) < 2:
    client, addr = server_socket.accept()
    print(client)
    print(f"Connection established with {addr}")
    players.append({'socket': client, 'token': 'X' if len(players) == 1 else 'O'})
    if len(players) == 2:
        print(players[0])
        print(players[1])
threading.Thread(target=handle_session, args=(players[0], players[1])).start()
