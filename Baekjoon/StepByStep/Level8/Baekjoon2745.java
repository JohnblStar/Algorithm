import java.io.*;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        String N = strtk.nextToken();
        int B = Integer.valueOf(strtk.nextToken());
        char[] arr36 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V' ,'W' ,'X' , 'Y' ,'Z'};
        int val = 0;
        int result = 0;
        
        
        for(int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            for(int j = 0; j < B; j++) {
                if(i != 0) {
                    if(ch == arr36[j]){
                        val = Math.pow(36 , i) * j ;
                    }
                } else if(i == 0){
                    if(ch == arr36[j]){
                        val = j;
                    }
                }
                result += val;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
