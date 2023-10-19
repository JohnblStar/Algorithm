import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        int num = 4;
        int a = 1;
        int b = 1;
        
        for(int i = 0; i < N; i++){
             if(b % 2 == 1 && a % 2 == 1){
                a 
            } else {
                b += 1;
            }
        }
        
        bw.write(String.valueOf(a + "/" + b));
        bw.close();
    }
}
