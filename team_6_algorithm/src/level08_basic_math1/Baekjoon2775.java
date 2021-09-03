package level08_basic_math1;

import java.util.Scanner;

// 백준 : 문제 > 단계별로 풀어보기 > 단계 8 : 기본 수학1 > 2775

// 문제] 부녀회장이 될테야
// “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
// 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 
// 주어어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력
// 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명
public class Baekjoon2775 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수
		
		// 아파트 만들기
		int[][] apart = new int[15][15];
		
		for(int i=1; i<=14; i++) { // 0호는 존재하지 않기 때문에 1부터 시작
			apart[0][i] = i; // 0층의 i호에는 i명
			apart[i][1] = 1; // 1호는 항상 1명
		}
		
		for(int i=1; i<=14; i++) { // 층
			for(int j=1; j<=14; j++) { // 호
				apart[i][j] = apart[i-1][j] + apart[i][j-1]; 
			}
		}
		
		// 해당 층, 호의 사람 수 출력
		for(int i=0; i<T; i++) {
			int floor = sc.nextInt();
			int room = sc.nextInt();
			
			System.out.println(apart[floor][room]);
		}
	} //main end
}
