import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String str = new String(br.readLine() );
            String[] a = str.split(" "); 
            bw.write(Integer.valueOf(a[0]) + Integer.valueOf(a[1]) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
