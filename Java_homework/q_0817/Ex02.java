package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(",");
		int sum = 0;
		int min = -1;
		
		// 7개의 수가 담긴 배열을 돌면서 짝수인 경우 continue로 지나치고,
		// 홀수인 경우 해당 숫자를 sum에 더하고, min값을 갱신한다.
		for (int i = 0; i < 7; i++) {
			if (Integer.parseInt(input[i]) % 2 == 0) continue;
			
			sum += Integer.parseInt(input[i]);
			
			// 최초의 홀수를 만났을 때 최소값 min에 저장하고,
			// 더 작은 수를 만나면 min 값을 갱신해준다.
			if (min == -1) min = Integer.parseInt(input[i]);
			else if (Integer.parseInt(input[i]) < min) min = Integer.parseInt(input[i]);
		}
		
		// 홀수를 한번도 만나지 못했다면(min이 -1이라면) 반복문이 모두 continue로 지나가 버리므로 아무 변화도 없다.
		// 따라서 그 경우에는 sum값을 출력할 필요가 없다.
		if (min != -1) System.out.println(sum);
		System.out.println(min);
	}

}
