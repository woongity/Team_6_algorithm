package q02609_최대공약수와최소공배수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static String line = "";
	public static String[] input;
	public static int N, M;
	
	public static int gcd(int n1, int n2) {
		if (n1 % n2 == 0) return n2;
		return gcd(n2, n1 % n2);
	}
	
	public static int lcm(int n1, int n2) {
		return n1 / gcd(n1, n2) * n2;
	}
	
	public static void main(String[] args) throws IOException {
		
		input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		bw.write(line + gcd(N, M) + "\n");
		bw.write(line + lcm(N, M));
		
		bw.flush();
		bw.close();
	}

}
