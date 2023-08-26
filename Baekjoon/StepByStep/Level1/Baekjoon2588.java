import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int a = scan.nextInt();
       int b = scan.nextInt();
       
       System.out.println((b % 10) * a);
       System.out.println((b % 100 / 10) * a);
       System.out.println((b / 100) * a);
       System.out.println(a * b);
    }
} 
