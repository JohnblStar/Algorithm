import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
       
        int N = Integer.valueOf(strtk.nextToken());
        int B = Integer.valueOf(strtk.nextToken());
        String str = "";
        String result = "";
        
        if(N == 0){
            str += "0";
        }
        
        while(N > 0){
            if(N % B < 10) {
                str += N % B;
            } else {
                char ch = (char)(N % B - 10 + 'A');
                str += ch;
            }
            N /= B;
        }
        
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            result += ch;
        }
        
        bw.write(result);
        bw.close();
    }
}
