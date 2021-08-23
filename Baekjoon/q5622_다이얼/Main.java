package q5622_다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 문자 c가 몇번 다이얼에 존재하는 알파벳인지 구하는 함수이다.
	public static int getNumber(char c) {
		if (c <= 'C') return 2;
		else if (c <= 'F') return 3;
		else if (c <= 'I') return 4;
		else if (c <= 'L') return 5;
		else if (c <= 'O') return 6;
		else if (c <= 'S') return 7;
		else if (c <= 'V') return 8;
		else return 9;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] str = input.toCharArray();
		int total = 0;
		
		// 입력받은 알파벳이 있는 다이얼보다 +1초씩 더 걸리므로 각각의 다이얼 +1 씩 모두 더한다.
		for (int i = 0; i < input.length(); i++) {
			total += getNumber(str[i]) + 1;
		}
		
		System.out.println(total);
	}

}
