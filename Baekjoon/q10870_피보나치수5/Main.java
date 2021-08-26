package q10870_피보나치수5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int fibonacci(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(fibonacci(Integer.parseInt(br.readLine())));
	}

}
