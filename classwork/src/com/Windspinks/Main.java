package com.Windspinks;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many friends do you have? ");
        int numFriends = scn.nextInt();
        scn.nextLine();

        System.out.print("What file are we writing to? ");
        String outputFileURL = scn.nextLine();

        PrintWriter outputFile;
        try {
            outputFile = new PrintWriter(outputFileURL);
        } catch (FileNotFoundException ex){
            System.out.println("File not Found, enter again");
            return;
        }
        
        for (int i = 0; i < numFriends; i++) {
            System.out.print("Enter the name of friend number " + (i + 1) + ": ");
            outputFile.println(scn.nextLine());
        }

        outputFile.close();
        System.out.println("Friends written, file closed");
    }
}