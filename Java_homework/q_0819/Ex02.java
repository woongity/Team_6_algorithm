package q_0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] step = input.toCharArray();
		// 최종 칼로리
		int totalKcal = 0;
		// 현재 드는 칼로리
		int currKcal = 0;
		// 경사도
		int add = 1;
		// 직전에 올라가고 있었는지 내려가고 있었는지 방향 설정
		int direction = 1;
		
		for (int i = 0; i < step.length; i++) {
			
			// 1. 경사도 
			// 기본 경사도 1일 때 #을 만나면 경사도를 2로 바꾸고 다음 index로 진행한다.
			if (step[i] == '#' && add == 1) {
				add *= 2;
				continue;
			// 기본 경사도 2일 때 #을 만나면 경사도를 1로 되돌리고 다음 index로 진행한다.
			} else if (step[i] == '#' && add == 2) {
				add /= 2;
				continue;
			}
			
			// 2. 현재 칼로리 계산
			// 현재 경사가 ( 일 때 이전에 내려오던 중이었다면, 소모 칼로리 유지
			// 올라가던 중이었다면, 소모 칼로리를 +1한다.
			if (step[i] == '(') {
				if (direction == 1) currKcal++;
				totalKcal += currKcal * add;
				direction = 1;
			// 현재 경사가 ) 일 때 이전에 올라가던 중이었다면, 소모 칼로리 유지
			// 내려가던 중이었다면, 소모 칼로리를 -1한다.
			} else if (step[i] == ')') {
				if (direction == -1) currKcal--;
				direction = -1;
				totalKcal += currKcal * add;
			} 
			
		}
		
		System.out.println(totalKcal);
	}
	
}
