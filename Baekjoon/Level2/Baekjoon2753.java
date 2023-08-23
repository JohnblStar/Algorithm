import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int i = scan.nextInt();
       
       if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
           System.out.print("1");
       }else{
           System.out.print("0");
       }
       
    }
}
