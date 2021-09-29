package q11047_동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static int value;
	public static String[] input;
	public static int[] coins;
	public static int count;
	
	public static void main(String[] args) throws IOException {
		
		input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		value = Integer.parseInt(input[1]);
		coins = new int[N];
		count = 0;
		
		// 큰 가치의 동전부터 계산해야 동전이 최소개수가 되므로 내림차순으로 배열에 저장한다.
		for (int i = N - 1; i >= 0; i--) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int i = 0;
		while (value > 0) {
			
			// 현재 비교하는 동전의 가치와 남은 금액이 같다면 동전 한 개만 더해주면 계산이 끝난다.
			if (coins[i] == value) {
				count++;
				break;
			}
			
			// 현재 비교하는 동전이 몇 개까지 들어갈 수 있는지 계산하여 count에 더해주고 그 금액만큼 현재 value에서 빼준다.
			if (coins[i] < value) {
				count += value / coins[i];
				value -= (value / coins[i]) * coins[i];
			}
				
			i++;
		}
		
		System.out.println(count);
	}
}
