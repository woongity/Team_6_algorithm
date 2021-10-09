package q21300_BottleReturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int refund = 0;
		
		for (int i = 0; i < 6; i++) {
			refund += Integer.parseInt(input[i]);
		}
		
		System.out.println(refund * 5);
	}

}
