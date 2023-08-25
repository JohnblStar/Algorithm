import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
       Scanner scan = new Scanner(System.in);
       int h = scan.nextInt();
       int m = scan.nextInt();
       
       if(m >= 45){
           m = m - 45;
       } else {
           m = 60 - (45 - m);
           if(h > 0){
               h--;
           } else {
               h = 23;
           }
       }
       
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       bw.write(h + " " + m);
       
       bw.flush();
       bw.close();
    }
}
