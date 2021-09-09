package chat;

import chat.Chatui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class ChatClient {
    public static void  main(String[] args) throws Throwable {
        Socket s = new Socket("127.0.0.1",1234);

        BufferedReader input =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        Writer output = new OutputStreamWriter(s.getOutputStream());

        Chatui theui = new Chatui("CLient End ", output);

        String line;
        while ((line = input.readLine()) != null){
            theui.appendText(line);
        }
        theui.appendText("Connection lost");
    }
}
