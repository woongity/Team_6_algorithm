package q02581_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 소수인지 판별하는 함수
	public static boolean isPrimeNumber(int n) {
		if (n == 1) return false;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int total = 0;
		int minNumber = 10001;
		
		// 소수면 total에 더하고 현재 minNumber보다 작으면 값을 바꾼다.
		for (int i = M; i < N; i++) {
			if (isPrimeNumber(i) == true) {
				total += i;
				if (minNumber > i) minNumber = i;
			}
		}
		
		if (total == 0) System.out.println(-1);
		else {
			System.out.println(total);
			System.out.println(minNumber);
		}
	}

}