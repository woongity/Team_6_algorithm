package q02447_별찍기10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 별을 찍는 함수
	public static void printStar(int i, int j, int n, String[][] arr) {
		// 공백이 들어가야한느 조건
		if ((i / n) % 3 == 1 && (j / n) % 3 == 1) arr[i][j] = " ";
		else {
			// 최소단위에 도달했을 때 별을 찍는다.
			if (n == 1) arr[i][j] = "*";
			// 최소단위가 아닐 경우 계속해서 재귀를 호출해 들어간다.
			else printStar(i, j, n / 3, arr);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][N];
		
		// 2차원 배열의 각 좌표에 문자를 넣는다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				printStar(i, j, N, arr);
			}
		}
		
		// 한 줄씩 출력한다.
		for (int i = 0; i < N; i++) {
			String line = String.join("", arr[i]);
			System.out.println(line);
		}
		
	}

}
