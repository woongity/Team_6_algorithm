package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// N¹ø Ãâ·Â
		for (int i = 0; i < N; i++) System.out.println("Hello MyCompany!");
	}

}
