package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int startNumber = Integer.parseInt(br.readLine());
		int endNumber = Integer.parseInt(br.readLine());
		int multiple = Integer.parseInt(br.readLine());
		int total = 0;
		
		// startNumber를 +1씩 하면서 배수이면 total에 합산한다.
		while (startNumber < endNumber + 1) {
			if (startNumber % multiple == 0) total += startNumber;
			startNumber++;
		}
		
		System.out.println(total);
		
	}

}
