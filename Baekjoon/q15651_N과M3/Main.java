package q15651_N과M3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int N;
	public static int M;
	public static String[] input;
	public static int[] numbers;
	public static String line = "";
	
	public static void btk(int n) throws IOException {
		if (n == M) {
			for (int i = 0; i < M; i++) {
				bw.write(line + numbers[i]);
				if (i != M -1) bw.write(" ");
			}

			bw.write("\n");
			return;
		}
		
		// 1. numbers에 1부터 숫자를 넣는다.
		// 2. 아직 현재 숫자 n이 M보다 작다면 기존에 진행되던 n = 0인 경우는 놔두고 n + 1인 경우로 btk함수가 다시 호출된다.
		// 3. n에 +1씩 더해가면서 해당 경우에 대해 다시 1 ~ 3을 반복한다.
		// 4. n == M인 조건을 만족하는 n에 도달하면 지금까지 numbers 배열에 저장했던 숫자들을 버퍼에 쓰고 해당 경우는 종료된다.
		// 5. 모든 스택들이 종료되면 지금까지는 반복문이 i = 1인 경우였고, i = 2인 다음 경우를 위해 지금 까지의 논리를 반복한다.
		for (int i = 1; i < N + 1; i++) {
			numbers[n] = i;
		
			btk(n + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		
		input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		numbers = new int[M];
		
		btk(0);
		
		bw.flush();
		bw.close();
	}
}
