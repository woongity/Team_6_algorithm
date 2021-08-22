package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex04 {
	
	// 새로 들어온 단어가 암기하고 있는 단어의 평균보다 긴지 아닌지 여부를 확인하는 함수 isLonger
	public static boolean isLonger(ArrayList al, String s) {
		float avg = 0;
		
		// memory ArrayList에 있는 단어들의 각각의 길이들을 더하고 개수로 나누어 평균을 구한다.
		for (int i = 0; i < al.size(); i++) {
			String word = (String)al.get(i);
			avg += (float)word.length();
		}
		
		avg /= (float)al.size();
		
		// 평균보다 길다면 return 1, 같거나 짧다면 return 0
		if (s.length() > avg) return true;
		else return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int W = Integer.parseInt(input[1]);
		// 앞으로 선생님이 물어볼 단어 배열
		String[] words = br.readLine().split(" ");
		// 암기할 기억배열 memory
		ArrayList<String> memory = new ArrayList<String>();
		int total = 0;
		
		// 선생님이 물어볼 단어 W개를 반복한다.
		for (int i = 0; i < W; i++) {
			
			// 1. 걸린 시간처리
			// 물어본 단어가 기억에 이미 있다면 +1초, 없다면 +3초를 해준다.
			if (memory.contains(words[i])) total += 1;
			else total += 3;
			
			// 2. 기억 memory 처리
			// 기억 memory가 가득 찼고 , 가장 오래된 단어가 평균보다 길다면 해당 단어를 제거한다.
			// 기억 memory가 가득 찼고, 가장 오래된 단어가 평균보다 길다면 다음 index의 단어를 제거한다.
			if (memory.size() == N) {
				int j = 0;
				while (j < memory.size()) {
					if (isLonger(memory, (String)memory.get(j)) == false) {
						memory.remove(j);
						break;
					}
					j++;
				}
			}
			
			// memory ArrayList에 해당 단어를 추가한다.
			memory.add(words[i]);
			
			System.out.println("memery: " + memory);
		}
		
		// 걸린시간 출력
		System.out.println(total);	
	}

}
