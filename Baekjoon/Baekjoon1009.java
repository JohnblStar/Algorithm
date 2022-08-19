/* 
 * 백준 알고리즘 1009번 문제 해결
 * 난이도 : 브론즈 2
 * 작성일자 : 2022-08-19
 * 작성자 : 조한별
 */
import java.util.Scanner;

public class Baekjoon1009 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너 선언
		
		int n = scan.nextInt(); // 테스트 케이스 개수 선언
		int cnt = 0; // 반복문 카운트 변수 선언
		int a = 0; // 받아올 입력값 a
		int b = 0; // 받아올 입력값 b
		int result = 0; // 값 저장 변수
		
		// 알고리즘
		// 1 ~ 10번 컴퓨터까지 모두 하나씩 테스트 할 수 있으므로 11번 테스트는 1번으로 다시 넘어간다.
		// 그렇기 때문에 10을 나눈 나머지가 0일 때(정수 0이 아닌 10의 자릿수에서의 0)는 자동으로 10번 컴퓨터에서 작업이 끝나기 때문에 마지막 연산은 10번 컴퓨터가 하게 된다.
		// 그렇지 않을 시 연산 결과의 나머지 역시 10을 나눈 뒷자리 하나의 나머지 값으로만 표현을 할 수 있다.
		// 
		while(cnt < n) { // 카운트 변수 cnt가 n보다 작을 경우 반복문 실행
			a = scan.nextInt(); // 입력값 a
			b = scan.nextInt(); // 입력값 b
			r = 1; // 한번의 테스트 케이스 연산을 끝마칠 때마다 나머지값 초기화
			for(int i = 0; i < b; i++) { // a를 b만큼 제곱 해주기 위한 반복문
				// 결과값 = (결과값 * 지수) % 10
				result = (result * a) % 10;
			}
			if (result == 0) { // 만약 결과값이 0(10의 자릿수 중 뒤 한자리 0)이라면
				result = 10; // 결과값으로 10을 반환하도록 변수 값 저장
				System.out.println(result); // 결과 출력
			} else { // 아닐 시 
				System.out.println(result); // 결과 출력
			}
			cnt++; // 카운트 변수 + 1
		}
	}

}
