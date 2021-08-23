package level8_basic_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 : 문제 > 단계별로 풀어보기 > 단계 8 : 기본 수학1 > 2869

// 문제] 달팽이는 올라가고 싶다
// 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
// 달팽이는 낮에 A미터 올라갈 수 있다.
// 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
public class Baekjoon2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
//		int result = 0;
//		int cnt = 0;
//		
//		while(true) {
//			result += up;
//			cnt++;
//			if(height == result) break;
//			result -= down;
//		}
		
		// 정상에 도달했을때 down하지 않는 다는 조건에 부합하기 위해 - down
		int day = (height - down) / (up - down);
		if((height - down) % (up - down) != 0) { // up 일 때 나머지 블럭이 남아있다면 하루가 더 소요된다는 것이므로 day++
			day++;
		}
		
		System.out.println(day);	
	}
}

