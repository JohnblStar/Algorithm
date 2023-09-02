import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.valueOf(br.readLine());
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        bw.write(String.valueOf(max + " " + (index + 1)));
        bw.flush();
        bw.close();
    }
}
