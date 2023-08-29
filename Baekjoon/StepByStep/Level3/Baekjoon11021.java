import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.valueOf(br.readLine());
        
        for(int i = 1; i <= T; i++){
            String str = new String(br.readLine());
            String[] a = str.split(" ");
            bw.write("Case #" + i + ": " + (Integer.valueOf(a[0]) + Integer.valueOf(a[1]) + "\n"));
        }
        
        bw.flush();
        bw.close();
    }
}
