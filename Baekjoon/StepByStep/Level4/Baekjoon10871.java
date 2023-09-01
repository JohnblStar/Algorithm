import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        StringTokenizer strtk = new StringTokenizer(str);
        
        String strA = br.readLine();
        StringTokenizer A = new StringTokenizer(strA);
        
        int N = Integer.valueOf(strtk.nextToken()); 
        int X = Integer.valueOf(strtk.nextToken());
        int[] arr = new int[N];
        
        if(N == A.countTokens()){
            for(int i = 0; i < N; i++){
                int num = Integer.valueOf(A.nextToken());
                if(X > num){
                    arr[i] = num;
                    bw.write(String.valueOf(arr[i]) + " ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
