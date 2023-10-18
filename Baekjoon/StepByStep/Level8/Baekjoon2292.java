import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = {1, 7, 19, 37, 61, 70};
        int N = Integer.valueOf(br.readLine());
        int cnt = 1;
        
        if(N == 1) {
            cnt = 1;
        } else {
            for(int i = 0; i < 6; i++) {
             if(N > arr[i]) {
                    cnt++;
                } 
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
