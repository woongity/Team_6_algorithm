package level07_string;

import java.util.Scanner;

// 백준 : 문제 > 단계별로 풀어보기 > 단계 7 : 문자열  > 2908

// 문제] 상수
// 두 수를 거꾸로 읽어서 비교한 후 더 큰 수 출력
public class Baekjoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String reverseA = "";
		String reverseB = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			reverseA += a.charAt(i);
		}
		
		for(int i=b.length()-1; i>=0; i--) {
			reverseB += b.charAt(i);
		}
		
		if(Integer.parseInt(reverseA) > Integer.parseInt(reverseB)) {
			System.out.println(reverseA);
		} else {
			System.out.println(reverseB);
		}
	}
}
