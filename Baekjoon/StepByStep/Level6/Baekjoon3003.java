import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        int[] chess = {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i < chess.length; i++){
            bw.write(String.valueOf(chess[i] - Integer.valueOf(strtk.nextToken())) + " ");
        }
        bw.close();
    }
}
