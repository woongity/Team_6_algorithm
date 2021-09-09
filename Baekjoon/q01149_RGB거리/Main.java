package q01149_RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static int[][] prices;
	public static int[][] building;
	public static String[] input;
	public static int red;
	public static int green;
	public static int blue;
	public static int minValue;
	
	// 현재 검사하는 집의 색깔의 비용과 그 전 집의 비용중 적은 쪽을 검사하면서 비용을 합해나가는 함수
	public static int getValue(int n, int color) {
		
		// 아직 비용을 검사하지 않은 집이면 검사를 진행한다.
		if (building[n][color] == 0) {
			
			// red = 0 / green = 1 / blue = 2
			if (color == 0) {
				building[n][0] = Math.min(getValue(n - 1, 1), getValue(n - 1, 2)) + prices[n][0];
			} else if (color == 1) {
				building[n][1] = Math.min(getValue(n - 1, 0), getValue(n - 1, 2)) + prices[n][1];
			} else {
				building[n][2] = Math.min(getValue(n - 1, 0), getValue(n - 1, 1)) + prices[n][2];
			}
		}

		return building[n][color];
	}
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		prices = new int[N][3];
		building = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				prices[i][j] = Integer.parseInt(input[j]);

			}
			

		}
		
		// 집이 한 개일 경우는 세가지 색깔중 가장 싸게드는 비용이 답이므로 미리 배열에 저장한다.
		building[0][0] = prices[0][0];
		building[0][1] = prices[0][1];
		building[0][2] = prices[0][2];
		
		minValue = 1000001;
		// 각각의 색깔마다 현재 집의 순서와 색깔번호를 넣고 비용을 구한다.
		red = getValue(N - 1, 0);
		green = getValue(N - 1, 1);
		blue = getValue(N - 1, 2);
		
		// 모든 색깔의 경우를 검사하고 최소비용을  minValue에 저장한다.
		if (minValue > red) minValue = red;
		if (minValue > green) minValue = green;
		if (minValue > blue) minValue = blue;
		
		System.out.println(minValue);
		

	}
}
