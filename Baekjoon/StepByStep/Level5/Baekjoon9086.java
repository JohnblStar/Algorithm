import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T  = new String(br.readLine());
        
        for(int i = 0; i < Integer.parseInt(T); i++){
            String str = new String(br.readLine());
            bw.write(str.charAt(0));
            bw.write(str.charAt(str.length()-1) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
