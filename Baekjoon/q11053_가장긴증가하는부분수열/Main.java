package q11053_가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static int[] arr;
	public static int[] sequence;
	public static String[] input;
	public static int maxLength = 1;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");
		arr = new int[N];
		sequence = new int[N];
		
		// 수열 저장
		for (int i = 0; i < N; i++) {
			sequence[i] = Integer.parseInt(input[i]);
			arr[i] = 1;
		}
				
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (sequence[i] > sequence[j] && arr[i] < arr[j] + 1) {
					arr[i] = arr[j] + 1;
				}
			}

		}
		
		// DP배열 중 최대값을 저장한다.
		for (int i = 0; i < N; i++) {
			maxLength = Math.max(arr[i], maxLength);
		}
		
		System.out.println(maxLength);
	}
}
