package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Message message = (Message) ois.readObject();
        Visitor visitor = new PrintMessageVisitor();
        message.visit(visitor);

        message = (Message) ois.readObject();
        message.visit(visitor);
    }
}