package java_pattern;

public class java03 {
    public static void main(String[] args) {
        int n =3;
        char ch = 'A';
        for(int line = 1; line<=n; line++){
            for(int j = 1; j<=line; j++){
                 System.out.print(ch);
                   ch++;
            } System.out.println();
        }
    }
}
