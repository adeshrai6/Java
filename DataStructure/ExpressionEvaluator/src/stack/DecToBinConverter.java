package stack;

/************************************************
 * @author: Adesh Rai
 * Class: CSC205
 * Prof: Dr. E.K. Iskrenova-Ekiert
 * Assignment: Lab 9
 * @since: April/14/2022
 * File: DrcToBinConverter.jave
 ************************************************/

import java.util.Stack;

/**
 *  Convert decimal number to binary
 **/
public class DecToBinConverter{

    /**
     *  Method to convert decimal number to binary
     * @param n
     *      the number to be converted to binary
     **/
    public static void printInBinary(int n){
        Stack<Integer> S = new Stack<>();
        S.setSize(n);

        if(n == 0){
            System.out.print("0");
        }else {

            while (n > 0) {
                int rem = n % 2;
                S.push(rem);
                n = n / 2;
            }

            while (S.peek() != null) {
                int digit = S.pop();
                System.out.print(digit + " ");
            }
        }
    }
}
