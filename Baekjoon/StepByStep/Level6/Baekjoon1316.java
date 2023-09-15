import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        int cnt = 0;
        
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean check[] = new boolean[26];
            boolean val = true;
            
            for(int j = 0; j < str.length(); j++) {
                int num = str.charAt(j)-'a';
                if(check[num]) {
                    if(str.charAt(j) != str.charAt(j-1)){
                        val = false;
                        break;
                    }
                } else {
                    check[num] = true;  
                }
            }
            if(val) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
