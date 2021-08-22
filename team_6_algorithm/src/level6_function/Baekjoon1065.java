package level6_function;

import java.util.Scanner;

// 백준: 문제 > 단계별로 풀어보기 > 단계 6 : 함수 > 1065
// * 다시 풀어보기
// 1 ~ 99 는 모두 등차 수열이다.

// 문제] 한수
// X가 한수인지 판별하는 함수 정의
// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력
public class Baekjoon1065 {
	static int solution(int x) {
		int cnt = 0;
		
		if(x < 100) return x; // 1~99는 모두 등차 수열이기 때문!
		else {
			cnt = 99;
			
			// 1000은 등차수열이 아니고, 자릿수가 맞지 않기 때문에 999로 처리하여 계산!
			if(x == 1000) x = 999;
			
			for(int i=100; i<=x; i++) {
				int one = i % 10; // 일의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int hun = i / 100; // 백의 자릿수
				
				if((one - ten) == (ten - hun)) cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextInt()));
	}
}
