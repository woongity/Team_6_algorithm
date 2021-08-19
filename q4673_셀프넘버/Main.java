package q4673_셀프넘버;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// 10001인 array 초기화
		int[] arr = new int[10001];
		arr[0] = 1;
		
		// 10000이 넘으면 계산할 필요가 없으므로 이하 값에 대해서만 셀프넘버를 구해서 해당 index에 1을 넣어준다.
		for (int i = 1; i < 10001; i++) {
			if (checkSelfNumber(i) < 10001) arr[checkSelfNumber(i)] = 1;
		}
		
		// 1 ~ 10000까지 돌면서 셀프넘버에 한번도 해당되지 않은 index를 출력한다.
		for (int i = 0; i < 10001; i++) {
			if (arr[i] == 0) System.out.println(i);				
		}
	}
	
	// 셀프넘버 구하는 함수
	public static int checkSelfNumber(int n) {
		int sum = n;
		
		while (n > 0) {
			if (n == 0) break;
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
