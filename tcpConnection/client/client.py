# client

import socket
import os
import hashlib
import struct

HOST = 'localhost'
PORT = 18763
BUFFER_SIZE = 4096
HEAD_STRUCT = '128sIq32s'
info_size = struct.calcsize(HEAD_STRUCT)

def cal_md5(file_path):
    with open(file_path, 'rb') as fr:
        md5 = hashlib.md5()
        md5.update(fr.read())
        md5 = md5.hexdigest()
        return md5

def unpack_file_info(file_info):
    file_name, file_name_len, file_size, md5 = struct.unpack(HEAD_STRUCT, file_info)
    file_name = file_name[:file_name_len]
    return file_name, file_size, md5

def get_file(file_path):
	clientSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	try:
		print 'Start connect'
		clientSocket.connect((HOST, PORT))
		clientSocket.send(file_path.encode())
		
		file_info_package = clientSocket.recv(info_size)
		file_name, file_size, md5_recv = unpack_file_info(file_info_package)
		if not file_size:
			temp = file_path.split(' ')
			print 'No such file or directory: ' + str(temp[1])
			clientSocket.close()
			return
			
		recved_size = 0
		with open(file_name, 'wb') as fw:
			while recved_size < file_size:
				remained_size = file_size - recved_size
				recv_size = BUFFER_SIZE if remained_size > BUFFER_SIZE else remained_size
				recv_file = clientSocket.recv(recv_size)
				recved_size += recv_size
				fw.write(recv_file)
		md5 = cal_md5(file_name)
		if md5 != md5_recv:
			print 'MD5 compared fail!'
		else:
			print 'Received successfully'
	except socket.errno, e:
		print "Socket error: " + str(e)
	finally:
		clientSocket.close()

if __name__ == '__main__':
	file_path = raw_input('Please input the file path: ')
	if not file_path:
		file_path = 'inputFile.txt'
	file_path = 'GET ' + file_path
	get_file(file_path)