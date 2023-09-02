import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.valueOf(br.readLine());
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            int n = Integer.valueOf(strtk.nextToken());
            arr[i] = n;
        }
        
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[N-1]);
        bw.flush();
        bw.close();
    }
}
