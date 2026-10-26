package java_loops;
import java.util.*;

public class java02 {
    public static void main(String arg []){
     Scanner sc = new Scanner(System.in);

    int counter = 1;
        System.out.println("enter number");
    int a = sc.nextInt();

        while(counter <= a){
        System.out.print(counter +" ");
        counter++;
        }
        System.out.println();
    }
}
