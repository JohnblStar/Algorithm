import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWirter(new OutputStreamWrier(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
    
        int a = 0;
        int b = 0;
        int result = 0;
        String str = "";
        
        while(true){
            a = Integer.valueOf(strtk.nextToken());
            b = Integer.valueOf(strtk.nextToken());
            if(a == 0 && b == 0){
                break;
            } else {
                if(a > b){
                    result = a/b;
                } else {
                    
                }
            }
        }
    }
}
