package loopDemo;

public class DivisibleNumber {
 /*1. Write a function and create a loop inside it from 20-50
       and find which number is divisible by 7.
*/

public void DivisibleNumber(){
    int[] num ={21,28,35,42,49};
    for (int a = 20; a <= 50; a++) {
        System.out.println(a%7);
    }

}

    public static void main(String[] args) {
        DivisibleNumber obj = new DivisibleNumber();
        obj.DivisibleNumber();
    }





}

