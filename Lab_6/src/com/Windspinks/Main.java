//Charles Dodge
//CIST 2371 CRN 63075
//Lab 6 Uppercase File Converter

package com.Windspinks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.print("What file are we reading from? ");
        String inputFileURL = scn.nextLine();

        System.out.print("What file are we writing to? ");
        String outputFileURL = scn.nextLine();

        //Take input filename, make File and Scanner
        File input = new File(inputFileURL);
        Scanner fileScn;
        try {
            fileScn = new Scanner(input);
        } catch (FileNotFoundException ex){
            System.out.println("Specified input file does not exist (Make sure to include extension)");
            System.out.println("Run again");
            scn.nextLine();
            return;
        }

        //Setup output file
        PrintWriter outputFile;
        try {
            outputFile = new PrintWriter(outputFileURL);
        } catch (FileNotFoundException ex) {
            System.out.println(outputFileURL + " File cannot be found");
            System.out.println("Run again");
            return;
        }

        while (fileScn.hasNext()){
            //Take everything in Input file, UPPERCASE IT, print to output file
            outputFile.println(fileScn.nextLine().toUpperCase());
        }

        outputFile.close();
    }
}
/*
//Lab 6 Sorted Names
package com.Windspinks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three names separated by a space: ");
        String rawNames = scn.nextLine();
        String[] splitNames = rawNames.split(" ");

        Arrays.sort(splitNames);

        for (String s : splitNames){
            System.out.println(s);
        }
    }
}
*/