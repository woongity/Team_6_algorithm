package q2775_부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 배열이 있을 때 처음부터 특정 index까지의 요소의 합을 return하는 함수
	public static int getSum(int[] arr, int index) {
		int sum = 0;
		
		for (int i = 0; i < index; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 각 testcase의 결과값을 저장하는 배열
		String[] result = new String[T];
		
		for (int t = 0; t < T; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			// 각층의 호수의 주거인원을 저장하는 배열
			int[][] arr = new int[k + 1][n];
			
			// 각 층의 해당 호수에 전층의 호수의 배열의 더한 값을 저장한다.
			// getSum() 함수는 배열이 있을 때 특정 index까지의 합을 return한다.
			for (int i = 0; i < k + 1; i++) {
				for (int j = 0; j < n; j++) {
					// 0층에서는 그냥 1명부터 +1씩 늘어난다.
					if (i == 0) arr[i][j] = j + 1;
					else arr[i][j] = getSum(arr[i - 1], j + 1);
				}
			}
			
			result[t] = Integer.toString(arr[k][n - 1]);
		}
		
		System.out.println(String.join("\n", result));
	}

}
