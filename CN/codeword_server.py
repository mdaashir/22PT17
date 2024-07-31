import socket

def compute_remainder(codeword, generator):
    # Perform binary XOR addition between codeword and generator
    remainder = ""
    codeword_list = list(map(int, codeword))
    generator_list = list(map(int, generator))
    
    # Perform CRC calculation (XOR)
    for i in range(len(codeword)- len(generator) + 1):
        if codeword_list[i] == 1:
            for j in range(len(generator)):
                codeword_list[i + j] ^= generator_list[j]
    
    # Convert remainder back to string
    remainder = ''.join(map(str, codeword_list[-(len(generator) - 1):]))
    return remainder

def main():
    # Create a TCP/IP socket
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    # Bind the socket to the port
    server_address = ('localhost', 12345)
    print('Starting up on {} port {}'.format(*server_address))
    server_socket.bind(server_address)
    
    # Listen for incoming connections
    server_socket.listen(1)
    
    while True:
        print('Waiting for a connection...')
        connection, client_address = server_socket.accept()
        
        try:
            print('Connection from', client_address)
            
            # Receive codeword from client
            codeword = connection.recv(1024).decode()
            print('Received codeword:', codeword)

            # Receive generator from client
            generator = connection.recv(1024).decode()
            print('Received generator:', generator)
            
            # Inside the try block after receiving codeword and generator
            print('Length of codeword list:', len(codeword))
            print('Length of generator list:', len(generator))

            # Compute remainder (CRC) to check for errors
            remainder = compute_remainder(codeword, generator)
            
            if int(remainder) == 0:
                print("No error in transmission.")
            else:
                print("Error in transmission detected.")
            
        finally:
            # Clean up the connection
            connection.close()

if __name__ == '__main__':
    main()
