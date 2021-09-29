package q1011_Fly_me_to_the_Alpha_Centauri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		
		// TestCase T만큼 반복
		for (int t = 0; t < T; t++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			// 가야하는거리 y - x 의 제곱근 값을 올림한 값 n
			// 도착하려면 2n - 1만큼 이동횟수가 필요하다.
			double n = Math.ceil(Math.sqrt((double)(y - x)));
			int move = 2 * (int)n - 1;
			
			// 완전 제곱수 간의 간격의 평균값보다 크면 2n - 1, 작으면 2n - 2만큼 최소 이동횟수가 필요하다.
			double avg = (n * n + (n - 1) * (n - 1)) / 2;
			if (avg < y - x) result[t] = Integer.toString(move);
			else result[t] = Integer.toString(move - 1);
		}

		System.out.println(String.join("\n", result));
	}

}
