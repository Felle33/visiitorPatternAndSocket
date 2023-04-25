package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Message message = new SetUsernameMessage(3, "tommi");
        Message message1 = new SetNumberOfPlayersMessage(3, 20);

        Socket socket = new Socket("localhost", 1234);

        ObjectOutputStream outputStm = new ObjectOutputStream(socket.getOutputStream());

        outputStm.writeObject(message);
        outputStm.reset();

        outputStm.writeObject(message1);
        outputStm.reset();
    }
}
