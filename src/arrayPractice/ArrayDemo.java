package arrayPractice;

public class ArrayDemo {

String [] studentName= {"Dharti","Shefali","Sadia","Jannat"};// ArrayData
    String Location = "Texas";

public void arr(){
    System.out.println(studentName[0]);
    System.out.println(studentName[1]);
    System.out.println(studentName[2]);
    System.out.println(studentName[3]);
  // System.out.println(location);
}

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.arr();
    }

}
