/* 
 * 백준 알고리즘 2702번 문제 해결
 * 난이도 : 브론즈 2
 * 작성일자 : 2022-08-17
 * 작성자 : 조한별
 * *유클리드 호제법 이용*
 */
import java.util.Scanner;

public class Baekjoon2702 {

	// 알고리즘
	// 유클리드 호제법을 이용, 재귀 함수로 구현
	// gcd(a,b) = gcd(b,r) <= 유클리드 호제법 약식화
	// gcd(a,b)를 다시 gcd(b,r)로 인자값을 재사용 할 수 있음 = 재귀 함수 가능
	public static int math(int a, int b) { // math라는 이름의 인자값 a, b를 가진 최소 공배수를 구하는 메소드 생성
		int r = a % b; // r은 나머지, 즉 a를 b로 나누고 남은 값을 저장
		if (r == 0) { // 만약 a를 b로 나눈 나머지가 0일 경우
			return b; // b를 리턴
		} else { // 아닐 경우
			return math(b, r); // 재귀 함수를 통해 b와 기존 a, b를 나눈 나머지 값 r을 인자값으로 하여 메소드를 다시 호출 
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너 선언
		
		int n = scan.nextInt(); // 테스트 케이스의 수를 위한 입력값 선언
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.print(a * b / math(a, b)); // 최대 공약수를 구하기 위해 입력값 a와 b를 곱한 후 최소 공배수를 구하는 math 메소드 호출
			System.out.println(" " + math(a, b)); // 최소 공배수를 구하기 위해 최소 공배수를 구하는 메소드 math를 호출
		}
		
	}
}
