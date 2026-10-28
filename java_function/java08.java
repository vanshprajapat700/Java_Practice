package java_function;

public class java08 {
    // public static boolean isprime(int n){
    //   //corner cases
    //    if(n==2){
    //         return true;
    //     } 
        
    //   for(int i=2; i<=n-1; i++) {
    //     if(n%i==0){
    //         return false;
    //     }
    //   }
    //    return true;
    // }
    // public static void main(String[] args) {
    //    System.out.println(isprime(2)); 
    // }

public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
        return false; 

        }
         
    }
    return true;

}
    public static void main(String[] args) {
   System.out.println(isprime(3)) ;
}


}