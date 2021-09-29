package q01037_약수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static String line = "";
	public static String[] input;
	public static int N;
	public static int A1, A2;
	public static int[] numArr;

	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");
		
		// 진짜 약수의 개수가 1개이면 N은 완전제곱수이므로 진짜약수를 제곱하면 된다.
		if (N == 1) {
			A1 = Integer.parseInt(input[0]);
			
			bw.write(line + A1 * A1);
		// 진짜 약수의 입력이 오름차순이나 내림차순으로 제공되지 않으므로,
		// sort를 한 후에 첫번 째와 마지막 진짜약수를 곱해서 N을 구한다.
		} else {
			numArr = new int[N];
			
			for (int i = 0; i < N; i++) {
				numArr[i] = Integer.parseInt(input[i]);
			}
			
			Arrays.sort(numArr);
			
			A1 = numArr[0];
			A2 = numArr[N - 1];
			
			bw.write(line + A1 * A2);
		}
		
		
		bw.flush();
		bw.close();
	}

}
