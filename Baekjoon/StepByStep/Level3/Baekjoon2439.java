import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.valueOf(br.readLine());
        
        for(int i = 0; i < N; i++){
            for(int j = 1; j < N - i; j++){
                bw.write(" ");
            }
            for(int k = 0; k <= i; k++){
                bw.write("*");
            }
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
