package q02579_계단오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static int[] steps;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		steps = new int[N];
		arr = new int[N];
		
		// 각 계단의 점수를 저장하는 배열
		for (int i = 0; i < N; i++) {
			steps[i] = Integer.parseInt(br.readLine());
		}
		
		// 계단의 개수가 3개일 때 까지는 경우의 수가 모두 1가지 씩이므로 미리 계산해둔다.
		if (N > 0) arr[0] = steps[0];
		if (N > 1) arr[1] = steps[0] + steps[1];
		if (N > 2) arr[2] = Math.max(steps[0] + steps[2], steps[1] + steps[2]);
		
		// 이후부터는 항상 마지막에서 하나 전의 계단을 밟느냐 마느냐 두가지 경우의 수가 있고 그중에 큰것을 고르며 확장해니간다.
		for (int i = 3; i < N; i++) {
			arr[i] = Math.max(arr[i - 3] + steps[i - 1] + steps[i], arr[i - 2] + steps[i]);
		}

		System.out.println(arr[N - 1]);
	}

}
