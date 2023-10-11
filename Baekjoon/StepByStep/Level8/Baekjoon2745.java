import java.io.*;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        String N = strtk.nextToken();
        int B = Integer.valueOf(strtk.nextToken());
        int result = 0;
        int tmp = 1;
        
        
        for(int i = N.length()-1; i>=0; i--){
            char ch = N.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                result += (ch - 'A'+10) * tmp;
            }
            else{
                result += (ch - '0') * tmp;
            }
            tmp *= B;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
