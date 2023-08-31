import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str = br.readLine();
             String[] a = str.split(" ");
             
            if(Integer.valueOf(a[0]) != 0 && Integer.valueOf(a[1]) != 0){
                bw.write(Integer.valueOf(a[0]) + Integer.valueOf(a[1]) + "\n");
            } else {
                break;
            }
        }
        
        bw.flush();
        bw.close();
    }
}
