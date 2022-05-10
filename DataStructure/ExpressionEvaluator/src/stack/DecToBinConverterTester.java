package stack;
/************************************************
 * @author: Adesh Rai
 * Class: CSC205
 * Prof: Dr. E.K. Iskrenova-Ekiert
 * Assignment: Lab 9
 * @since: April/14/2022
 * File: DecToBinConverterTester.jave
 ************************************************/

/**
 * Tester class for decimal to binary number
 **/
public class DecToBinConverterTester extends DecToBinConverter{
    public static void main(String[] args) {
        int[] numbers = {13, 59, 259, 1023, 0, 92, 512, 100, 2049, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " = ");
            printInBinary(numbers[i]); //Print binary
            System.out.println();
        }

    }
}
