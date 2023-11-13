package conditionalStatement;

import java.util.Scanner;

public class User {

/*
1. take two numbers from user and print the greater number
 */

   int a = 20;
   int b = 15;
   int c = 25;


    public void User(){
        Scanner scan = new Scanner(System.in);
        System.out.println();




}

    public static void main(String[] args) {
      User obj = new User();
      obj.User();

      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
       if ( 20>15) {
           System.out.println("the greater number is A ");
       }
       else if (15<25) {
           System.out.println(" User b is smaller than User C ");
       }
       else if (25> 15){
           System.out.println(" User c is Greater than User A");

       }
    }







}
