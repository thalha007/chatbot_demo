package chat;

import chat.Chatui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Testit {


    public static void main(String[] args) throws Throwable{
        BufferedReader keyboard =
                new BufferedReader(new InputStreamReader(System.in));
         Chatui theui  = new Chatui("Window Title", new OutputStreamWriter(System.out));
         String line;
         while ((line = keyboard.readLine()) != null){
             theui.appendText(line);
        }
    }
}
