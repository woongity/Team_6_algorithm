package q05086_배수와약수;

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
	

	public static void main(String[] args) throws IOException {
		
		while (true) {
			
			input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);
			
			if (N == 0 && M == 0) break;
			
			if (N % M == 0) bw.write(line + "multiple\n");
			else if (M % N == 0) bw.write(line + "factor\n");
			else bw.write("neither\n");
		}
		
		bw.flush();
		bw.close();
	}
}
