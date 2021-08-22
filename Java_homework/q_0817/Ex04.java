package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// 입력받은 비밀번호를 charArray로 분리한다.
		char[] PW = input.toCharArray();
		
		// 각각의 문자를 돌면서 4개 뒤의 문자로 변환해준다.
		// ascii code 번호상으로 4개 뒤의 문자가 가 'z'를 넘어가면 -26을 해서 다시 'a'부터 시작하게 해준다.
		for (int i = 0; i < PW.length; i++) {
			if (PW[i] > 'v') PW[i] = (char)((int)PW[i] + 4 - 26);
			else PW[i] = (char)((int)PW[i] + 4);
		}
		
		System.out.println(PW);
	}

}
