import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());
        char[] arrA = new char[3];
        char[] arrB = new char[3];
        String strA = String.valueOf(str.nextToken());
        String strB = String.valueOf(str.nextToken());
        int j = 0;
        String resultA = "";
        String resultB = "";
        
        for(int i = 2; i >= 0; i--) {
            arrA[i] = strA.charAt(j);
            arrB[i] = strB.charAt(j);
            j++;
        }
        
        for(int i = 0; i < 3; i++) {
            resultA += String.valueOf(arrA[i]);
            resultB += String.valueOf(arrB[i]);
        }
        
        String result = (Integer.valueOf(resultA) > Integer.valueOf(resultB)) ? resultA : resultB;
        
        bw.write(result);
        
        bw.close();
    }
}
