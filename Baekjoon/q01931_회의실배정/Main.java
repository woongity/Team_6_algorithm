package q01931_회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static String[] input;
	public static int start;
	public static int end;
	public static int[][] arr;
	public static int count;
	public static int currentTime;
	
	public static void main(String[] args) throws IOException {

		 N = Integer.parseInt(br.readLine());
		 currentTime = 0;
		 arr = new int[N][2];
		 count = 0;

		 // 2차원배열로 input을 배열에 저장한다.
		 for (int i = 0; i < N; i++) {
			 input = br.readLine().split(" ");
			 arr[i][0] = Integer.parseInt(input[0]);
			 arr[i][1] = Integer.parseInt(input[1]);
		 }
		 
		 // 회의가 끝나는 시간을 기준으로 시간표를 정렬한다. 끝나는 시간이 같다면 시작시간이 빠른것을 기준으로 정렬한다.
		 Arrays.sort(arr, new Comparator<int[]>() {
			 public int compare(int[] arr1, int[] arr2) {
				 if (arr1[1] == arr2[1]) {
					 return arr1[0] - arr2[0];
				 } else {
					 return arr1[1] - arr2[1];
				 }
			 }
		});
		
		// 현재 회의의 시간표가 시간표에 넣을 수 있는 회의이면 count +1 하고 회의가 끝난시간을 현재시간에 갱신한다.
		for (int i = 0; i < N; i++) {
			
			if (currentTime <= arr[i][0]) {
				count++;
				currentTime = arr[i][1];
			}
		}

		System.out.println(count);		
	}

}