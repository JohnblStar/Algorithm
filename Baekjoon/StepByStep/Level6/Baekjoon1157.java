import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];
        char result = '?';
        int num = -1;
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char search = str.charAt(i);
            if('A' <= search && search <= 'Z'){
                arr[search - 'A'] += 1;
            } else {
                arr[search - 'a'] += 1;
            }
        }
        
        for(int i = 0; i < 26; i++) {
            if(arr[i] > num) {
                num = arr[i];
                result = (char)(i + 'A');
            } else if(arr[i] == num) {
                result = '?';
            }
        }
        
        bw.write(String.valueOf(result));
        
        bw.close();
    }
}
