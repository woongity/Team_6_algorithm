package q2869_달팽이는올라가고싶다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		
		double result = Math.ceil((double)(V - A) / (A - B)) + 1;
		
		System.out.println((int)result);
	}

}
