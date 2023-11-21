package loopDemo;

public class PositiveNegativenumber {
 /* 2. Write a function that create a loop between 1-10,And determine
       which number is Positive and which number is negative.
 */

 public void PositiveNegativenumber(){
     for (int a = 0; a <=10; a++) {
         System.out.println(a +1 );
     }
     for (int a =1; a>=0; a--){
         System.out.println(a-1);
     }
 }


    public static void main(String[] args) {
        PositiveNegativenumber obj = new PositiveNegativenumber();
        obj.PositiveNegativenumber();

    }




}
