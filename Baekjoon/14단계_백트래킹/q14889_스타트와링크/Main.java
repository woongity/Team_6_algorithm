package q14889_스타트와링크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	static int N;
	// 능력치 테이블
	static int[][] statusArr;
	// 모든 멤버들중 뽑힌멤버와 그렇지 않은 멤버를 표시하는 배열
	static boolean[] members;
	static int minValue = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		statusArr = new int[N][N];
		members = new boolean[N];

		
		// 능력치 테이블에 입력해서 값을 저장한다.
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < N; j++) {
				statusArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		btk(0, 0);
		
		System.out.println(minValue);
	}
	
	static void btk(int index, int n) {
		
		if (n == N / 2) {
			
			getBalance();
			
			return;
		}
		
		// 1. 아직 뽑히지않은 번호의 멤버면 true로 바꾸어 뽑혔다는 표시를 해주고 Start팀에 배정을한다.
		// 2. 이미 뽑힌 멤버라면 continue
		// 3. n에서 1씩 더해가며 1 ~ 3을 반복한다.
		// 4. Start팀에 모든 멤버가 배치되면 (n == N / 2) 두가지 예외처리를 거치고 만족하는 경우에 두 팀사이의 밸런스를 구한다.
		// 5. 해당 경우의 수의 밸런스가 구해지면 스택이 종료되므로 해당 멤버를 다시 뽑지 않음 false로 바꾸고 현재 스택도 종료된다.
		for (int i = index; i < N; i++) {
			
			if (members[i]) continue;
			
			members[i] = true;

			btk(i + 1, n + 1);
			
			members[i] = false;
			
			
		}
	}
	
	// 한쪽 멤버를 모두 선정하면, 자동으로 선정되지 못한 멤버는 반대팀이다.
	// 두 팀의 능력치 점수의 총합의 차이를 얻는 함수
	static void getBalance() {
		
		int sumStart = 0;
		int sumLink = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				
				// 뽑힌 멤버를 Start팀에 넣는다고 생각하면
				if (members[i] && members[j]) {
					sumStart += statusArr[i][j] + statusArr[j][i];
				}
				
				// 뽑히지않고 남은 멤버는 자동으로 Link팀에 배정한다.
				else if (!members[i] && !members[j]) {
					sumLink += statusArr[i][j] + statusArr[j][i];
				}
			}
		}
		
		int difference = Math.abs(sumStart - sumLink);
		if (difference == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		if (difference < minValue) minValue = difference;
		
	}
	

}
