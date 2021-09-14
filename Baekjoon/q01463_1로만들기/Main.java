package q01463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static Integer[] arr;
	
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		arr = new Integer[N + 1];

		if (N > 0)	arr[1] = 0;
		if (N > 1) arr[2] = 1;
		if (N > 2) arr[3] = 1;
		if (N > 3) arr[4] = 2;


		for (int i = 5; i < N + 1; i++) {
			
			// 아직 최소횟수가 계산이 되지않아서 값이 null이라면 이전 횟수를 참조한다.
			arr[i] = arr[i - 1] + 1;
			
			// 1번과 2번으로 해결할 수 있는 경우
			if (i % 3 == 0) {
				arr[i] = Math.min(arr[i / 3] + 1, arr[i]);
			}
			if (i % 2 == 0) {
				arr[i] = Math.min(arr[i / 2] + 1, arr[i]);
			}
		}
		

		System.out.println(arr[N]);
	}

}