import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        
        int N = Integer.valueOf(strtk.nextToken());
        int M = Integer.valueOf(strtk.nextToken());
        int[] arr = new int[N];
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int num = 0; num < M; num++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            i = Integer.valueOf(str.nextToken());
            j = Integer.valueOf(str.nextToken());
            k = Integer.valueOf(str.nextToken());
    
            for(i = i-1; i <= j-1; i++){
                arr[i] = k;
            }
        }
        for(int num = 0; num < N; num++){
            bw.write(String.valueOf(arr[num]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
