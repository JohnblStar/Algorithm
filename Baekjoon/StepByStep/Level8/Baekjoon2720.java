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
                while(true) {
                    if(C >= arr[j]){
                        C -= arr[j];
                        resultArr[j] += 1;
                    } else {
                        break;
                    }
                }
            }
            for(int k = 0; k < 4; k++) {
                bw.write(String.valueOf(resultArr[k] + " "));
                resultArr[k] = 0;
            }
            bw.newLine();
        }
        bw.close();
    }
}
