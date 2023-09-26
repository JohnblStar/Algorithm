import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(strtk.nextToken());
        int M = Integer.valueOf(strtk.nextToken());
        int[][] arr = new int[N][M];
        
        for(int i = 0; i < N; i++) {
                StringTokenizer strtks = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.valueOf(strtks.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
                StringTokenizer strtks = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] += Integer.valueOf(strtks.nextToken());
                bw.write(String.valueOf(arr[i][j] + " "));
            }
            bw.newLine();
        }
        bw.close();
    }
}
