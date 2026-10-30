package java_array;
import java.util.*;
public class java01 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int marks[] =new int[100];  
     System.out.println("length of array : " + marks.length);

     marks[0] =sc.nextInt();
     marks[1] = sc.nextInt();
     marks[2] = sc.nextInt();

System.out.println("math : " + marks[0]);
System.out.println("che : " + marks[1]);
System.out.println("phy : " + marks[2]);


 // marks[1] =marks[1] + 7;
 // System.out.println("che : " + marks[1]);

  int percentage =( (marks[0]+marks[1]+marks[2])/3);
  System.out.println("percentage : " +percentage +"%");
    }
}
