import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < i * 2 - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        for(int i = N - 1; i > 0; i--) {
            for(int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < i * 2 - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}
