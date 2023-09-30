import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strArr = {"c=", "c-", "dz=", "d-","nj", "lj", "s=", "z="};
        int cnt = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(str.contains(String.valueOf(strArr[i]))) {
                cnt++;
                str = str.replace(String.valueOf(strArr[i]), ";");
            }
        }

        bw.write(String.valueOf(str.length()));
        bw.close();
    }
}
