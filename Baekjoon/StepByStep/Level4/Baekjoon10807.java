import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.valueOf(br.readLine());
        String str = br.readLine();
        StringTokenizer strtk = new StringTokenizer(str);
        String v = br.readLine();
        int cnt = 0;
        
        if(N == strtk.countTokens()){
            while(strtk.hasMoreTokens()){
                if(v.equals(strtk.nextToken())){
                    cnt++;
                }
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
