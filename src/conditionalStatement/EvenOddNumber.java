package conditionalStatement;

import java.util.Scanner;

public class EvenOddNumber {
/* 1. Write a Java function and take an int parameter and determine that the number
      is divided by 2 or not. If divided by 2 that is even else the number is odd.
 */

    public void evnoddNUmber(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is an even number ");
        }
        else if (number % 2 == 1){
            System.out.println(number + " is an odd number ");
        }

    }




    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();
        obj.evnoddNUmber(19);

    }




}
