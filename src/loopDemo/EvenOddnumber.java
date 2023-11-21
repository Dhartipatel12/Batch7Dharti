package loopDemo;

public class EvenOddnumber {
 /*
 3.Write a java function and create an array in 4,5,6,7,8,9,10 and use a loop and determine that
   which number is divided by 2 or not.if divided by 2 that is even else the number is odd.
  */

    int []myNum={4,5,6,7,8,9,10};


    public void EvenOddnumber(int Number) {

        int num = 4;
        for (int a = 1; a <=1;a++) {
            if (4 % 2 == 0) {
                System.out.println(4 + " is an even number ");
            }
            int b = 5;
            if (5 % 2 == 1) {
                System.out.println(5 + " is an odd number ");
            }

        }

    }
        public static void main (String[]args) {
            EvenOddnumber obj = new EvenOddnumber();
            obj.EvenOddnumber(5);

        }




}
