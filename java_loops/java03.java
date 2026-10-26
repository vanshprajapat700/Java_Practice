package java_loops;
import java.util.*;
public class java03 {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }

}
