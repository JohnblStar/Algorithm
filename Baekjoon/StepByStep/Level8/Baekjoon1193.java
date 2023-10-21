import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        int i = 1;
        while(i < N){
            N -= i;
            i++;
        }
        
        bw.write(String.valueOf(i));
        bw.close();
    }
}
