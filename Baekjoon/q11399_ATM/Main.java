package q11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static String[] input;
	public static int[] p;
	public static int total;
	public static int temp;
	
	public static void main(String[] args) throws IOException {

	N = Integer.parseInt(br.readLine());
	input = br.readLine().split(" ");
	p = new int[N];
	temp = 0;
	total = 0;
	
	for (int i = 0; i < N; i++) {
		p[i] = Integer.parseInt(input[i]);
	}
	
	// 대기시간이 적은사람부터 인출 할 수록 누적 대기시간이 적어진다.
	Arrays.sort(p);

	// 현재까지의 누적시간을 구하고, 각 사람마다 필요한 대기시간을 total에 더해간다.
	for (int i = 0; i < N; i++) {
		temp += p[i];
		total += temp;
	}
	
	System.out.println(total);
	}

}