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
                writer.write(a + "" + Character.toLowerCase(a) + " ");
            }

            writer.write("\n");

            for(int i = 1; i <= 10; i++) {                                    // Numbers from 1 to 10
                writer.write(i + " ");
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try(FileReader reader = new FileReader("File.txt")) {         // Reading the File.txt
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
