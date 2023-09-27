import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int result = 1;
        
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            
            if(ch != str.charAt(str.length() - i - 1)) {
                result = 0;
            }
        }
        
        bw.write(String.valueOf(result));
        bw.close();
    }
}
