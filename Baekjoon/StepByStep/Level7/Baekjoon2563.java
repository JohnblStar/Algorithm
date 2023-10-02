import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.valueOf(br.readLine());
        boolean[][] arr = new boolean[100][100];
        int cnt = 0;
        
        for(int i = 0; i < N; i++) {
            StringTokenizer strtk = new StringTokenizer(br.readLine());
            int x = Integer.valueOf(strtk.nextToken());
            int y = Integer.valueOf(strtk.nextToken());
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }
        
        
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] == true){
                    cnt++;
                }
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
