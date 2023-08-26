import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
 
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = 0;
 
        if(a != b && b != c && a != c){
            result = (a > b) ? a : b;
            result = (result > c) ? result : c;
            System.out.print(result * 100);
        } else {
            if(a == b && b == c){
                System.out.print(10000 + (a * 1000));
            } else {
                if(a == b || a == c){
                    System.out.print(1000 + (a * 100));
                } else {
                    System.out.print(1000 + (c * 100));
                }
            }
        }
    }
}
