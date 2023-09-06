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
        
        for(int k = 0; k < M; k++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int i = Integer.valueOf(str.nextToken()) - 1;
            int j = Integer.valueOf(str.nextToken()) - 1;
            
            for(int l = i; l <= j; l++){
                int num = 0;
                
                num = arr[l];
                arr[l] = arr[j];
                arr[j] = num;
                j--;
            }
        }
        
        for(int i : arr){
            bw.write(String.valueOf(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}
