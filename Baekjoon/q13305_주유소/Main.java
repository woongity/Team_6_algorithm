package q13305_주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static String[] input;
	public static long[] distance;
	public static long[] gasPrice;
	public static long total;
	public static long minPrice;
	
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		distance = new long[N - 1];
		gasPrice = new long[N];
		total = 0;
		minPrice = Long.MAX_VALUE;
		
		// distance 배열
		input = br.readLine().split(" ");
		for (int i = 0; i < N - 1; i++) {
			distance[i] = Long.parseLong(input[i]);
		}
		// gasPrice 배열
		input = br.readLine().split(" ");
		for (int i = 0; i < N - 1; i++) {
			gasPrice[i] = Long.parseLong(input[i]);
		}

		int i = 0;
		// 마지막 주유소의 가격은 고려하지 않아도 된다.
		while (i < N - 1) {
			
			// 항상 현재까지 거쳐온 주유소 중 최저가격을 유지하고, 그 가격으로 지나쳐온 거리들을 계산하여 더한다.
			if (minPrice > gasPrice[i]) minPrice = gasPrice[i];
			total += minPrice * distance[i];	

			i++;
		}
		
		System.out.println(total);
	}

}
