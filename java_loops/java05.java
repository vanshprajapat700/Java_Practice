package java_loops;
 // print reverse 
public class java05 {
      public static void main(String arg []){
        int n =10945;
         while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit + "" );
            n=n/10 ;
         }

      }
}
