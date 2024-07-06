import socket
client=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
client.connect(('127.0.0.1',9999))
while True:
    message=client.recv(1024).decode()
    print(message)
    if "Your turn" in message:
        position=input()
        client.send(position.encode())
    elif 'Congratulations!' in message or 'lose' in message:
        break