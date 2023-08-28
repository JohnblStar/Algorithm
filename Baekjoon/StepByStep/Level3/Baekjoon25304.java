import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int N = scan.nextInt();
        int result = 0;
        
        for(int i = 0; i < N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            result += a * b;
        }
        if(result == X){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
