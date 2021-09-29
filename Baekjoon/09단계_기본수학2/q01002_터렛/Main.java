package q01002_터렛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// 두 좌표 (x1, y1) 과 (x2, y2) 사이의 거리를 구하는 함수
	public static double getDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		return distance;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		ArrayList<String> results = new ArrayList<String>();
	
		for (int tc = 0; tc < T; tc++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			
			// 두개의 같은 원인 경우
			if (x1 == x2 && y1 == y2 && r1 == r2) results.add("-1");
			// 멀어서 안만나는 경우
			else if (getDistance(x1, y1, x2, y2) > r1 + r2) results.add("0");
			// 큰 원의 내부에 작은 원이 들어가있어서 안만나는 경우
			else if (getDistance(x1, y1, x2, y2) < Math.abs(r1 - r2)) results.add("0");
			// 외접한 경우
			else if (getDistance(x1, y1, x2, y2) == r1 + r2) results.add("1");
			// 내접한 경우
			else if (getDistance(x1, y1, x2, y2) == Math.abs(r1 - r2)) results.add("1");
			else results.add("2");
		}

		System.out.println(String.join("\n", results));
	}

}