# server

import socket
import os
import hashlib
import struct

HOST = 'localhost'
PORT = 18763
BUFFER_SIZE = 4096
HEAD_STRUCT = '128sIq32s'

def cal_md5(file_path):
    with open(file_path, 'rb') as fr:
        md5 = hashlib.md5()
        md5.update(fr.read())
        md5 = md5.hexdigest()
        return md5


def get_file_info(file_path):
    file_name = os.path.basename(file_path)
    file_name_len = len(file_name)
    file_size = os.path.getsize(file_path)
    md5 = cal_md5(file_path)
    return file_name, file_name_len, file_size, md5

def send_file():
	try:
		serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		serverSocket.bind((HOST, PORT))
		serverSocket.listen(1)

		connectSocket, client_address = serverSocket.accept()
		print "The server is ready to receive from "+str(client_address)
		
		
		file_path = connectSocket.recv(1024).decode()
		temp = file_path.split(' ')
		file_path = str(temp[1])
		
		file_name, file_name_len, file_size, md5 = get_file_info(file_path)
		file_head = struct.pack(HEAD_STRUCT, file_name, file_name_len, file_size, md5)
		connectSocket.send(file_head)
		
		sent_size = 0
		with open(file_path) as fr:
			while sent_size < file_size:
				remained_size = file_size - sent_size
				send_size = BUFFER_SIZE if remained_size > BUFFER_SIZE else remained_size
				data = fr.read(send_size)
				sent_size += send_size
				connectSocket.send(data)
	except socket.errno, e:
		print "Socket error: %s" % str(e)
	except OSError:
		print 'No such file or directory: ' + str(file_path)
		file_head = struct.pack(HEAD_STRUCT, '', 0, 0, '')
		connectSocket.send(file_head)
		serverSocket.close()
		connectSocket.close()
	finally:
		serverSocket.close()
		connectSocket.close()
		
if(__name__ == "__main__"):
	send_file()