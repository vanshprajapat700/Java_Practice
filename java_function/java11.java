package java_function;
//Decimal to Binary
public class java11 {

    public static void decTobin(int n){
        int pow =0;
        int binNum = 0;
        while(n>0){
          int rem =  n%2;
          binNum = binNum + rem*(int)Math.pow(10,pow); //store num in binNum its a loop
          pow++;
          n= n/2; //remove ecach number from back
        }
          System.out.print("decimal to binary : " +binNum );
        

    }
    
    public static void main(String[] args) {
       decTobin(7);
    }
}
