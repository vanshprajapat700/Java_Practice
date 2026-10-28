package java_function;

public class java07 {
    //function overloading
    // return (int sum) is same.
    // parameter decide-two parameter
    public static int sum (int a, int b){
        return a+b;
    }
    // three  parameter
   public static int sum(int a, int b, int c){
    return a+b+c;
   }
   public static void main(String args[]){
    System.out.println(sum(4,4));
    System.out.println(sum(4,4,4));

   }
}