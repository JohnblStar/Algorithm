import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        int i = 1;
        int cnt = 1;
        int x = 0;
        int y = 0;
        
        while(cnt < N){
            N -= cnt++;
            i++;
        }
        
        if(i%2==0) {
         x = i - N;
         y = N - 1;
        } else {
         x = N - 1;
         y = i - N;
        }
        bw.write(String.valueOf((y + 1) + "/" + (x + 1)));
        bw.close();
    }
}
