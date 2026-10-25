package java_conditional;
import java.util.*;
public class practice {
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a nuber :");
    int a = sc.nextInt();

    if(a>0){
        System.out.println("positive");

    }else if(a<0){
       System.out.println("negative");
    
    } else{
        System.out.println("zero");
    }
    }
}
