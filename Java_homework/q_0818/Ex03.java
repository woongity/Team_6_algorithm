package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] scores = br.readLine().split(" ");
		char[] obstacle1 = br.readLine().toCharArray();
		char[] obstacle2 = br.readLine().toCharArray();
		int total = 0;
		
		// 장애물1, 장애물2 가 모두 뚫려있으면 해당 index의 점수를 total에 더한다.
		for (int i = 0; i < N; i++) {
			if (obstacle1[i] == 'O' && obstacle2[i] == 'O') total += Integer.parseInt(scores[i]);
		}
		
		System.out.println(total);
		
	}

}
