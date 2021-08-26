package q11729_하노이탑이동순서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// 하노이의 탑의 이동을 저장하는 함수
	// 탑의 위치: t1, t2,t3 
	// 탑의 높이: n 
	// 어디서 어디로 이동하는지를 저장하는 배열: arr
	public static void towerHanoi(int t1, int t2, int t3, int n, ArrayList arr) {
		
		if (n == 1) {
			arr.add(Integer.toString(t1) + " " + Integer.toString(t3));
			return;
		}
		
		// 1. n - 1 층 높이의 하노이탑을 t2로 옮기고,
		towerHanoi(t1, t3, t2, n - 1, arr);
		// 2. 맨 아래 한 칸으로 t1에서 t3로 옮긴 후,
		arr.add(Integer.toString(t1) + " " + Integer.toString(t3));
		// 3. 다시 n - 1 층 높이의 하노이탑을 t3로 옮긴다.
		towerHanoi(t2, t1, t3, n - 1, arr);
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = (int)Math.pow(2, N) - 1;
		ArrayList<String> steps = new ArrayList<String>();
		// 1, 2, 3은 탑의 위치 번호
		towerHanoi(1, 2, 3, N, steps);
		
		System.out.println(K);
		System.out.println(String.join("\n", steps));
		
	}

}
