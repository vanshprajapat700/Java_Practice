package java_pattern;
import java.util.*;
public class java01 {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    //System.out.print("enter line : ");
    //int a = sc.nextInt();
    
for(int line =1; line<=5; line++ ){
    for( int star=1; star<=line; star++){
        System.out.print("*");
    }
    System.out.println();
}

    }
}
