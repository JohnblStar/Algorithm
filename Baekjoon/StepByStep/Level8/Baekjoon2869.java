import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtk = new StringTokenizer(br.readLine());
        
        int A = Integer.valueOf(strtk.nextToken());
        int B = Integer.valueOf(strtk.nextToken());
        int V = Integer.valueOf(strtk.nextToken());
        
        
        bw.write(String.valueOf(day));
        bw.close();
    }
}
