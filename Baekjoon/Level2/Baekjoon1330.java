import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int i = scan.nextInt();
       int j = scan.nextInt();
       
       if(i > j){
           System.out.print(">");
       }else if(i < j){
           System.out.print("<");
       }else{
           System.out.print("==");
       }
    }
}
