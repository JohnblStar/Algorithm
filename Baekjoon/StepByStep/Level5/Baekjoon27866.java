import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = new String(br.readLine());
        int i = Integer.valueOf(br.readLine());
        
        bw.write(str.charAt(i - 1));
        
        bw.flush();
        bw.close();
    }
}
