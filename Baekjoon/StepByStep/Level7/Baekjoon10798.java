import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] ch = new char[5][15];
        
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();
        
            for(int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }
        
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(ch[j][i] != '\0') {
                    bw.write(String.valueOf(ch[j][i]));
                
                }
            }
        
        }
        bw.close();
    }
}
