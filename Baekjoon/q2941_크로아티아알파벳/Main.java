package q2941_크로아티아알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] charArr = input.toCharArray();
		int count = 0;
		
		// 기본적으로 알파벳을 만나면 count +1을 해준다. 이 때 다음 index의 문자를 연결했을 때 크로아티아 문자이면,
		// count는 고정시키고 길이에 따라 그만큼의 index를 더해주고 진행시킨다.
		int i = 0;
		while (i < charArr.length) {
			
			// 마지막 문자 한개가 남아있으면 무조건 기본 알파벳이므로 count +1을 하고 반복문을 나간다.
			if (i == charArr.length - 1) {
				count++;
				break;
			}
			
			if (charArr[i] == 'c' && (charArr[i + 1] == '=' || charArr[i + 1] == '-')) i++;
			else if (charArr[i] == 'd') {
				
				if (charArr[i + 1] == '-') i++;
				else if ( i + 2 < charArr.length && charArr[i + 1] == 'z' && charArr[i + 2] == '=') i += 2;
				
			} else if (charArr[i] == 'l' && charArr[i + 1] == 'j') i++;
			else if (charArr[i] == 'n' && charArr[i + 1] == 'j') i++;
			else if (charArr[i] == 's' && charArr[i + 1] == '=') i++;
			else if (charArr[i] == 'z' && charArr[i + 1] == '=') i++;
			
			count++;
			i++;
		}
		
		System.out.println(count);
	}

}
