import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(arr[ch - 97] == -1){
                arr[ch - 97] = i;
            }
        }
        
        for(int result : arr){
            bw.write(String.valueOf(result) + " ");
        }
        bw.flush();
        bw.close();
    }
}
