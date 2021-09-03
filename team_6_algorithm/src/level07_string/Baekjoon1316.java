package level07_string;

import java.util.Scanner;

//백준 : 문제 > 단계별로 풀어보기 > 단계 7 : 문자열  > 1316

//문제] 그룹 단어 체커
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성
//단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다. ==> 알파벳 소문자만; 아스키코드 사용
public class Baekjoon1316 {
	public static boolean check() {
		String str = sc.next(); // 입력 받는 문자
		boolean[] check = new boolean[26]; // 문자(알파벳 26개)들이 이전에 나왔는지 체크하는 배열
		int prev = 0; // 바로 이전 문자

		for(int j=0; j<str.length(); j++) {
			int now = str.charAt(j); // 현재 문자
			
			if(prev != now) { // 비연속되는 경우
				if(check[now - 'a'] == false) { // 이전에 나오지 않은 새로운 문자인 경우; check[]에 인덱스 0에 a부터 차례대로  체크!
					check[now - 'a'] = true;
			 		prev = now;
				} else { // 이전에 나왔던 문자인 경우
					return false;
				}
			}
		}
		
		return true;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int count = 0;

		for(int i=0; i<N; i++) {
			if(check() == true) count++;
		}
		
		System.out.println(count);		
	}
}
