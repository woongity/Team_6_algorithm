package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String line = "";
		
		// 1개씩 더하면서 출력
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < i; j++) line += "*";
			System.out.println(line);
			line = "";
		}
		// 1개씩 빼면서 출력
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++) line += "*";
			System.out.println(line);
			line = "";
		}
	}


}
