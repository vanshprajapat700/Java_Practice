package java_loops;
import java.util.*;
public class java09 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter a number : ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
         } while(true);
         System.out.println("multiple of 10");
        }
    }

