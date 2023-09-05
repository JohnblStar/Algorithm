import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[42];
        int cnt = 0;
        
        for(int i = 0; i < 10; i++){
            arr[Integer.valueOf(br.readLine()) % 42] = true;
        }
        
        for(boolean i : arr){
            if(i) {
                cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        
        bw.flush();
        bw.close();
    }
}
