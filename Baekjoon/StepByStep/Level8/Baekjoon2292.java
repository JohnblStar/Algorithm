import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.valueOf(br.readLine());
        int a = 1;
        int six = 6;
        int cnt = 1;
        
        while(a <= N){
            list.add(a);
            a += six;
            six += 6;
        }
        
        if(N == 1) {
            cnt = 1;
        } else {
            for(int i = 0; i < list.size(); i++) {
             if(N > list.get(i)) {
                    cnt++;
                } 
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
