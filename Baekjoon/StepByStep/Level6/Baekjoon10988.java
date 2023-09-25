import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char[] strArr = new char[str.length()];
        int max = str.length() / 2;
        int min = 1;
        int result = 0;
        
        for(int i = 0; i < str.length(); i++) {
            strArr[i] = str.charAt(i);
        }
        
        for(int i = 0; i < max; i++) {
            if(strArr[i] == strArr[strArr.length - min]) {
                result = 1;
                min++;
            } else {
                result = 0;
                break;
            }
        }
        
        bw.write(String.valueOf(result));
        bw.close();
    }
}
