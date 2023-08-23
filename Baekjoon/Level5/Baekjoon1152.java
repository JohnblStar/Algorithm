/* 
 * 백준 알고리즘 1152번 문제 해결
 * 난이도 : 브론즈 2
 * 작성일자 : 2022-08-19
 * 작성자 : 조한별
 */
import java.util.Scanner;
import java.util.StringTokenizer; // StringTokenizer 사용을 위한 import

public class Baekjoon1152 {

	public static void main(String[] args) {

//		알고리즘(오류) 
// 		알고리즘을 떠올렸을 때 split 메소드를 이용, 문자열 공백을 매개변수로 하여 공백의 개수를 이용해 단어의 개수를 계산하게 되면 크게 두가지 논리적 오류가 존재했다.
//		1. 문자열 맨 앞과 맨 뒤 부분에 공백이 들어가게 된다면 제대로 된 계산이 되지 않는다.
//		2. 공백, 즉 문자 " "이 두개 이상 연결되어 있을 때 계산이 제대로 되지 않는다.
//		해결 방안은 아래의 새로운 코드를 통해 설명한다.
//		Scanner scan = new Scanner(System.in); // 스캐너 선언
//		
//		String q = scan.nextLine(); // 문자열을 입력값으로 하는 변수 생성
//		String a = " "; // split 함수의 매개변수를 위한 변수 선언
//		int cnt = 0; // 카운트 변수
//		
//		String[] result = q.split(a); // split 메소드를 이용해 매개변수를 기준으로 나누어진 문자열의 각 인자들을 저장할 배열 생성
//		for(int i = 0; i < result.length; i++) { // 나누어진 문자열을 저장한 배열의 길이만큼 반복
//			cnt++; // 카운트 변수 + 1
//		}
//		System.out.println(cnt); // 결과값 출력
		
		
		
//		알고리즘(해결)
//		그렇기 때문에 구글링을 하여 해결방법을 찾아보았을 때 'StringTokenizer'를 새로 알게 되었다.
//		메소드를 사용할 때 매개변수의 값을 기본 문자열 값으로 하여 이를 작성한 분리 기준으로 문자열을 분리해주는 역할을 한다.
//		StringTokenizer는 import하여 사용할 수 있다.
		Scanner scan = new Scanner(System.in); // 스캐너 선언
		String q = scan.nextLine(); // 문자열 입력값 저장 변수
		int cnt = 0; // 카운트 변수
		
		StringTokenizer stz = new StringTokenizer(q, " "); // 매개변수 q를 공백 기준으로 나눈 StringTokenizer 선언
	 										//	매개변수, 나누고자 하는 기준
		
		System.out.println(stz.countTokens()); // 결과값 출력 (문자열을 나눈 값.나눈 문자의 수를 세어주는 메소드)
	
		}
}
