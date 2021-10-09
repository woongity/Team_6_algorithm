package q20492_세금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[2];
		
		arr[0] = (int)(N * 0.78);
		arr[1] = (int)(N * 0.8 + N * 0.2 * 0.78);
		
		System.out.println(arr[0] + " " + arr[1]);
	}

}
