package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));
        sendMessage("Welcome to our shell https://github.com/Blopaa/BlyShell", false);

        while (true) {
            sendMessage("", true);
            commandLine = console.readLine();
            switch (commandLine){
                case "exit" :
                    System.exit(0);
                default:
                    sendMessage("error, command not found", false);
            }
        }

    }
    public static void sendMessage(String msg, Boolean toWrite){
        SimpleDateFormat format = new SimpleDateFormat("(yyyy/MM/dd hh:mm)");
        String dateString = format.format( new Date());
        if(toWrite){
            System.out.print("BLY " + dateString + " > " + msg);
        }else {
            System.out.println("BLY " + dateString + " > " + msg);
        }
    }
}
