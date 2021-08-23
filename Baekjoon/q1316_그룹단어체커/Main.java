package q1316_그룹단어체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		// testcase N개만큼 반복
		for (int t = 0; t < N; t++) {
			// 입력받은 단어를 char로 분리해서 word 배열에 넣는다.
			char[] word = br.readLine().toCharArray();
			// 한번 나온 alphabet들을 넣어두고 이후에 또 나오는지를 확인할 ArrayList
			ArrayList<Character> charArr = new ArrayList<Character>();
			
			int i = 0;
			while (i < word.length) {
				
				// 현재 alphabet이 ArrayList에 이미 있다면 그룹단어가 아니므로 break
				if (charArr.contains(word[i])) break;		
				// 현재 alphabet과 다음 index의 alphabet이 같아면 i를 +1씩 해주면서 지나친다.
				while (true) {
					if (i < word.length - 1 && word[i] == word[i + 1]) {
						i++;
						continue;
					}
					break;
				}
				// 모두 지나친 후에 해당 alphabet을 ArrayList에 저장한다.
				charArr.add(word[i]);
				// 마지막 알파벳에 도달했다면 그룹단어이므로 count +1
				if (i == word.length - 1) count++;
				i++;
			}
		}
		
		System.out.println(count);
	}

}
