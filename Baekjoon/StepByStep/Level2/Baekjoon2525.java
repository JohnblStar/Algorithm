import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
 
        int h = in.nextInt();
        int m = in.nextInt();
        int i = in.nextInt();
 
        m = 60 * h + m;
        m += i;
 
        h = (m / 60) % 24;
        m = m % 60;
 
        System.out.println(h + " " + m);
 
    }
}
