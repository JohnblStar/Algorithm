import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        int line = 1;
        int dot = 2;
        
        for(int i = 0; i < N; i++){
            dot += line;
            line *= 2;
        }
        int result = (int) Math.pow(dot, 2);
        
        bw.write(String.valueOf(result));
        bw.close();
    }
}
