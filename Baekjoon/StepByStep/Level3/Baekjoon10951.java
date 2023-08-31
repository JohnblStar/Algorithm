import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str;
            if((str = br.readLine()) != null){
                String[] a = str.split(" ");
                bw.write(Integer.valueOf(a[0]) + Integer.valueOf(a[1]) + "\n");
            } else {
                break;
            }
        }
        
        bw.flush();
        bw.close();
    }
}
