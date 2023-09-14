import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double result = 0.0;
        double totalScore = 0;
        double totalSubjectScore = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        
        for(int i = 0; i < 20; i++){
            StringTokenizer strtk = new StringTokenizer(br.readLine());
            String subjectName = strtk.nextToken();
            double score = Double.valueOf(strtk.nextToken());
            String subjectScore = strtk.nextToken();
            
            for(int j = 0; j < 10; j++){
                if(subjectScore.equals(gradeList[j])){
                    totalSubjectScore += (score * gradeScore[j]);
                    if(j != 9) {
                        totalScore += score;
                    }
                }
            }
        }
        
        result = totalSubjectScore / totalScore;
        System.out.printf("%.6f\n", result);
    }
}
