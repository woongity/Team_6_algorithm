package q15649_N과M1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static String[] input;
	public static String line = "";
	public static int N;
	public static int M;
	// 조건에 맞는 경우
	public static int[] numbers;
	// 이미 나온 숫자인지 확인하는 배열
	public static boolean[] visit;
	
	public static void btk(int n) throws IOException {

		if (n == M) {
			for (int i = 0; i < M; i++) {
				bw.write(line + numbers[i]);
				if (i != M - 1) bw.write(" ");
			}
			
			bw.write("\n");
			return;
		}
		// 1. 아직 나오지 않은 숫자면 visit배열에 해당하는 숫자의 index를 true로 바꾸어 나왔다는것을 표시한다.
		// 2. numbers에 해당 숫자를 넣는다.
		// 3. 아직 현재 숫자 n이 M보다 작다면 기존에 진행되던 n = 0인 경우는 놔두고 n + 1인 경우로 btk함수가 다시 호출된다.
		// 4. n + 1씩 더해가면서 해당 경우에 대해 다시 1 ~ 3을 반복한다.
		// 5. n == M인 조건을 만족하는 n에 도달하면 지금까지 numbers 배열에 저장했던 숫자들을 버퍼에 쓰고 해당 경우는 종료된다.
		// 6. 모든 스택들이 종료되면 지금까지는 반복문이 i = 1인 경우였고,
		//	  i = 2인 다음 경우를 위해 visit배열을 초기화하고 지금 까지의 논리를 반복한다.
		for (int i = 1; i < N + 1; i++) {
			if (visit[i]) continue;
			
			visit[i] = true;
			numbers[n] = i;
			
			btk(n + 1);
			
			visit[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {

		input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		numbers = new int[M];
		visit = new boolean[N + 1];
		
		btk(0);
		
		bw.flush();
		bw.close();
	}

}
