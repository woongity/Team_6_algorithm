package q02156_포도주시식;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int n;
	public static int[] wine;
	public static int[] arr;
	public static int result;
	public static int maxValue;
	
	public static void main(String[] args) throws IOException {
		
		n = Integer.parseInt(br.readLine());
		wine = new int[n + 1];
		arr = new int[n + 1];
		result = 0;
		maxValue = -1;
		
		for (int i = 1; i < n + 1; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		
		// 경우의수가 고정된 초기값 설정
		if (n > 0) arr[1] = wine[1];
		if (n > 1) arr[2] = wine[1] + wine[2];
		if (n > 2) arr[3] = Math.max(wine[1] + wine[2], Math.max(wine[2] + wine[3], wine[3] + wine[1]));
		
		// 3개를 연속으로 먹지않는 경우의 수들끼리 비교하며 올라간다.
		for (int i = 4; i < n + 1; i++) {
			arr[i] = Math.max(arr[i - 1], Math.max(wine[i] + arr[i - 2], wine[i] + wine[i - 1] + arr[i - 3]));
		}

		
		System.out.println(arr[n]);
	}

}
