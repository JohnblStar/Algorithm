/* 
 * 백준 알고리즘 2577번 문제 해결
 * 난이도 : 브론즈 2
 * 작성일자 : 2022-08-16
 * 작성자 : 조한별
 */
import java.util.Scanner;

public class Baekjoon2577 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 스캐너 생성
		
		// 입력값 받아오기
		int inputNum1 = scan.nextInt(); 
		int inputNum2 = scan.nextInt();
		int inputNum3 = scan.nextInt();
		
		// 정수형태의 계산 내용을 문자열로 변경
		String result = Integer.toString(inputNum1 * inputNum2 * inputNum3);
		
		//알고리즘
		for(int i = 0; i < 10; i++) { // 숫자 0부터 9까지를 한번씩 비교하기 위한 반복문
			int count = 0; // 카운트
			for(int j = 0; j < result.length(); j++) { // 계산된 결과값에 대한 문자열의 길이만큼 반복되는 반복문
				if(result.charAt(j) - '0' == i) { // 0부터 9까지의 수인 i와 계산된 결과값 중의 문자인 j를 비교하기 위한 조건문
					count++; // i와 j의 문자가 동일할 시 카운트 증가
				}
			}
			System.out.println(count); // 카운트 출력
		}
		
	}

}
