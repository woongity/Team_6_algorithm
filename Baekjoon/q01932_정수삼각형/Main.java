package q01932_정수삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int N;
	public static int[][] arr;
	public static Integer[][] dp;
	public static String[] input;
	
	public static int getValue(int n, int index) {
		
		// 최대 높이에 도착하면 그 값을 return
		if (n == N - 1) return dp[n][index];
		
		// 아직 탐색하지 않아 null이 저장되어있으면 그 아래에 두 값을 비교해 큰값을 더해 저장한다.
		if (dp[n][index] == null) {
			if (getValue(n + 1, index) > getValue(n + 1, index + 1)) {
				dp[n][index] = getValue(n +  1, index) + arr[n][index];
			} else {
				dp[n][index] = getValue(n + 1, index + 1) + arr[n][index];
			}

		}
		
		return dp[n][index];
	}
	
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dp = new Integer[N][N];
		
		// 정수 삼각형의 수들을 저장하는 배열
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		// 마지막 한 줄의 숫자를 dp라는 2차원배열에 저장하고, 이후 더해 올라오면서 탐색한다.
		for (int j = 0; j < N; j++) {
			dp[N - 1][j] = arr[N - 1][j];
		}
		
		System.out.println(getValue(0,0));
	}

}
