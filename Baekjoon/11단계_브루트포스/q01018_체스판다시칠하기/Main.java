package q01018_체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		String[] myBoard = new String[N];
		
		for (int i = 0; i < N; i++) {
			myBoard[i] = br.readLine();
		}
		// 흰색으로 시작하는 정상 체스판
		String[] white = {
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW"
		};
		// 검은색으로 시작하는 정상 체스판
		String[] black = {
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB"
		};
		// 최소 횟수 초기화
		int minCount = 65;
		int count = 0;
		
		// 바꿔야하는 체스판 myBoard와 맨 왼쪽 위칸이 white인 체스판을 비교한다.
		// n, m index를 8x8 체스판의 맨 왼쪽 위칸을 기준으로 잡고 돌면서 비교한다. 
		for (int n = 0; n < N - 7; n++) {
			for (int m = 0; m < M - 7; m++) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
					      // 바꿔야 하는 칸의 개수가 최소값보다 크다면 더이상 의미가 없으므로 break
						if (myBoard[n + i].charAt(m + j) == white[i].charAt(j)) {
							count++;
						}
					}
					
					if (count > minCount) break;
				}
			    // 바꿔야 하는 칸의 개수가 최소값보다 작다면 최소값을 갱신한다.
				if(count < minCount) minCount = count;
			    // 비교해야한 체스판의 기준점 n, m index가 변경되면 count를 초기화
				count = 0;
			}
		}
		
		count = 0;
		// 맨 왼쪽 위칸이 black인 경우와 비교한다. 논리는 위쪽과 완전히 같다.
		for (int n = 0; n < N - 7; n++) {
			for (int m = 0; m < M - 7; m++) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (myBoard[n + i].charAt(m + j) == black[i].charAt(j)) {
							count++;
						}
					}
					
					if (count > minCount) break;
				}
				if(count < minCount) minCount = count;
				count = 0;
			}
		}
		
		System.out.println(minCount);
	}
}
