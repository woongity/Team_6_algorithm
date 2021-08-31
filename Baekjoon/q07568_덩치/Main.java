package q07568_덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] xArr = new int[N];
		int[] yArr = new int[N];
		int rank = 1;
		String[] results = new String[N];
		
		// 몸무게와 키 배열을 따로 만들어서 N개 만큼 입력을 받는다.
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			xArr[i] = x;
			yArr[i] = y;
		}
		
		// 2중 for문을 돌면서 자신보다 몸무게와 키 모두 크면 rank +1씩 해서 각각의 최종 순위를 results 배열에 저장한다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (xArr[i] < xArr[j] && yArr[i] < yArr[j]) rank++;
			}
			
			results[i] = Integer.toString(rank);
			rank = 1;
		}
		
		System.out.println(String.join(" ", results));
	}

}