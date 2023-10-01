import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int x = 0;
        int y = 0;
        int[][] arr = new int[9][9];
        
        for(int i = 0; i < 9; i++) {
            StringTokenizer strtk = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.valueOf(strtk.nextToken());
                if(result < arr[i][j]) {
                    result = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                } else if(result == 0){
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        bw.write(String.valueOf(result) + "\n" + String.valueOf(x) + " " + String.valueOf(y));
        bw.close();
    }
}
