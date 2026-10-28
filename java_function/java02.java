package java_function;
import java.util.*;

public class java02 {

    public static int calculatesum(int num1 , int num2){ //parametersnor formal parameter
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
       int sum = calculatesum(a,b) ; //arguments or actual parameter
       System.out.println("summ is :" + sum);
    }
}
