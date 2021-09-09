package chat;

import chat.Chatui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws Throwable{
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        BufferedReader input =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        Writer output = new OutputStreamWriter(s.getOutputStream());

        Chatui theui = new Chatui("Server end ", output);

        String line;
        while ((line = input.readLine()) != null){
            theui.appendText(line);
        }
        theui.appendText("Connection lost");
    }
}
