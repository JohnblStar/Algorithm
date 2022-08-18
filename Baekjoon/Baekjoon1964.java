/* 
 * 백준 알고리즘 1964번 문제 해결
 * 난이도 : 브론즈 2
 * 작성일자 : 2022-08-14
 * 작성자 : 조한별
 */
import java.util.Scanner;

public class Baekjoon1964 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너 선언
		
		int n = scan.nextInt(); // 몇 단계를 증가하는지 알기 위한 입력값 선언
		int result = 5; // 초기값이자 결과값을 저장하기 위한 변수 설정
		
		
		// 알고리즘
		if(n == 1) { // 1단계일 경우
			System.out.println(result); // 초기값 그대로 결과 출력
		} else {
			for(int i = 1; i < n; i++) { // 1단계가 아닐 경우
				// 결과값 = 초기값 + (각 단계 + 증가한 겹치지 않는 점) * 변의 개수 - 겹치는 점의 개수
				result = result + (i + 2) * 3 - 2;
			}
		}
		System.out.println(result % 45678); // 문제 조건에 맞는 계산 후 결과 출력
	}

}
