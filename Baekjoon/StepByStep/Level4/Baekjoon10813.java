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
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        
        for(int i = 0; i < M; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(str.nextToken());
            int b = Integer.valueOf(str.nextToken());
            int num = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = num;
        }
        
        for(int i = 0; i < arr.length; i++){
            bw.write(String.valueOf(arr[i]) + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
