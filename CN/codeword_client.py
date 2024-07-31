import socket

def compute_codeword(dataword, generator):
   # Pad dataword with zeros to match length of generator
   dataword_padded = dataword + '0' * (len(generator) - 1)
   
   # Convert dataword to list of integers for easier manipulation
   dataword_list = list(map(int, dataword_padded))
   generator_list = list(map(int, generator))
   
   # Perform CRC calculation (XOR)
   for i in range(len(dataword)):
       if dataword_list[i] == 1:
           for j in range(len(generator)):
               dataword_list[i + j] ^= generator_list[j]
   
   # Convert remainder back to string
   remainder = ''.join(map(str, dataword_list[-(len(generator) - 1):]))
   return remainder

def main():
    # Create a TCP/IP socket
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    # Connect the socket to the server
    server_address = ('localhost', 12345)
    print('Connecting to {} port {}'.format(*server_address))
    client_socket.connect(server_address)
    
    try:
        # Ask user whether to send the data
               
        # Get binary dataword and generator from user
        dataword = input("Enter binary dataword: ")
        generator = input("Enter binary generator: ")

        # Compute codeword
        remainder = compute_codeword(dataword, generator)

        # Compute codeword
        codeword = dataword + remainder
        print("the codeword is ",codeword)
        org_cw=codeword
      #  codeword = dataword + compute_codeword(dataword, generator)
        send_data = input("Do you want to send the codeword? (yes/no): ").lower()
        if send_data != "yes":
         # print("Data not sent.")
            print("enter the code word of len ",len(codeword),"to be sent: ")
            cw=input()
        #org_cw=codeword
            codeword=cw
        print('Sending codeword:', codeword)
        client_socket.sendall(codeword.encode())

        # Send generator to server
        print('Sending generator:', generator)
        client_socket.sendall(generator.encode())
        
    finally:
        # Clean up the connection
        client_socket.close()

if __name__ == '__main__':
    main()
