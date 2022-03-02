package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here

        try(FileWriter writer = new FileWriter("File.txt")) {         // Creating the file.txt
            char a;

            for (a = 'A'; a <= 'Z'; ++a ) {                                   // Upper case letters from A to Z
                writer.write(a + "" + Character.toLowerCase(a) + " \n");
            }


            for(int i = 0; i < 10; i++) {                                    // Numbers from 1 to 10
                writer.write(i + " \n");
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try(FileReader reader = new FileReader("File.txt")) {         // Reading the File.txt
            Scanner scanner = new Scanner(reader);
            int counter = 0;
            while (scanner.hasNextLine()) {
                counter++;
                System.out.println(counter + ": " + scanner.nextLine() + " \n");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
