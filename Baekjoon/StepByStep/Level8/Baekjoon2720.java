import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        int[] arr = {25, 10, 5, 1};
        int[] resultArr = new int[4];
        
        for(int i = 0; i < T; i++) {
            int C = Integer.valueOf(br.readLine());
            for(int j = 0; j < 4; j++) {
                if(C % arr[j] > 0) {
                    C %= arr[j];
                    resultArr[i] += 1;
                } else {
                    resultArr[i] = 0;
                }
            }
        }
        
        for(int i = 0; i < 4; i++) {
            bw.write(String.valueOf(resultArr[i] + " "));
        }
        bw.close();
    }
}
