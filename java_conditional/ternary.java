package java_conditional;
import java.util.*;
public class ternary {
public static void main(String[]arg) { 
    Scanner sc = new Scanner(System.in);
  //  int a = 4;
   // String type =((a%2)==0) ? "EVEN" : "ODD";
  //  System.out.println(type);

  int marks = sc.nextInt();
  String result = (marks>=33) ? "pass" : "fail";
     System.out.println(result);

}
}
