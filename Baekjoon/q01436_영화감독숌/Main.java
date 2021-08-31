package q01436_영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int endNumber = 666;
		int cnt = 0;
		// 최소의 종말숫자인 666부터 시작해서 666이 포함된 숫자를 만날 cnt +1을 한다.
		while (true) {
			if (Integer.toString(endNumber).contains("666")) cnt++;
			if (N == cnt) break;
			
			endNumber++;
		}
		
		System.out.println(endNumber);		
	}

}