package q01929_소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// 소수인지 구하는 함수
	// 에라토스테네스의 체의 원리에 의해 n의 제곱근 까지만 검사해도 된다.
	public static boolean isPrimeNumber(int n) {	
		// 완전제곱수이면 제외한다.
		if (Math.sqrt((double)n) == Math.ceil(Math.sqrt((double)n))) return false;
		
		for (int i = 2; i < Math.sqrt((double)n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		// 범위 내의 소수를 저장할 ArrayList
		ArrayList<String> primeNumber = new ArrayList<String>();
			
		for (int i = M; i < N + 1; i++) {
			if (isPrimeNumber(i) == true) primeNumber.add(Integer.toString(i));
		}
		
		System.out.println(String.join("\n", primeNumber));
	}

}