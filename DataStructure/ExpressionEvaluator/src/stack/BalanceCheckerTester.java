package stack;

/************************************************
 * @author: Adesh Rai
 * Class: CSC205
 * Prof: Dr. E.K. Iskrenova-Ekiert
 * Assignment: Lab 9
 * @since: April/14/2022
 * File: BalanceCheckerTester.jave
 ************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Tester class to check if the tags are balance
 **/

public class BalanceCheckerTester {

    public static void main(String[] args) {
        HTMLBalance hb = new HTMLBalance();

        String file = "src/stack/testdata2.txt";

        StringTokenizer stringTokenizer;

        ArrayList<String> htmlData1 = new ArrayList<String>();

        Scanner scanner;
        try {

            scanner = new Scanner(new File(file)); //Using scanner to read file
            while (scanner.hasNext()) {
                String fileText = scanner.next(); //read next string
                stringTokenizer = new StringTokenizer(fileText); //convert string to StringTokenizer

                while (stringTokenizer.hasMoreTokens()) {
                    htmlData1.add(stringTokenizer.nextToken()); //add every token
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }

        if(hb.isBalanced(htmlData1)){
            System.out.println("htmlData1 is balanced");
        }else {
            System.out.println("htmlData is not balanced");
        }
    }
}
