import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int i = scan.nextInt();
       
       if(i >= 90){
           System.out.print("A");
       } else if(i >= 80) {
           System.out.print("B");
       } else if(i >= 70) {
           System.out.print("C");
       } else if(i >= 60) {
            System.out.print("D");
       } else {
           System.out.print("F");
       }
       
    }
}
