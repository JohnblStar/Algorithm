import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System,.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        int line = 4;
        int dot = 4;
        
        if(N > 0) {
            
        } else {
            bw.write(String.valueOf(dot));
        }
        bw.close();
    }
}
