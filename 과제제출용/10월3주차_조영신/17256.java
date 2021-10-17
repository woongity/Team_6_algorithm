package q17256_달달함이넘쳐흘러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		int cx = Integer.parseInt(b[0]) - Integer.parseInt(a[2]);
		int cy = Integer.parseInt(b[1]) / Integer.parseInt(a[1]);
		int cz = Integer.parseInt(b[2]) - Integer.parseInt(a[0]);
		
		System.out.println(cx + " " + cy + " " + cz);
	}
}