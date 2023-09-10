import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int T = Integer.valueOf(br.readLine());
        
        for(int i = 0; i < T; i++){
            
            StringTokenizer strtk = new StringTokenizer(br.readLine());
            int n = Integer.valueOf(strtk.nextToken());
            String str = strtk.nextToken();
            
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < n; k++){
                    bw.write(String.valueOf(str.charAt(j)));
                }
            }
            bw.newLine();
        }
        bw.close();
    }
}
