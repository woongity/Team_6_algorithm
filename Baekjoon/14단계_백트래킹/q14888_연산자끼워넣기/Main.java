package q14888_연산자끼워넣기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int N;
	public static String[] input_An;
	public static String[] input_operators;
	// An 수열을 저장하는 배열
	public static int[] An;
	// 연산자들의 개수
	public static int[] operatorsCount = new int[4];
	public static String[] operators = {"+", "-", "*", "/"};
	// 연산자들의 계산 순서
	public static String[] order;
	public static String line = "";
	// 계산결과 저장하는 변수
	public static int result;
	// 최소값과 최대값을 갱신할 변수
	public static int minValue = 1000000001;
	public static int maxValue = -1000000001;
	
	public static void btk(int n) throws IOException {
		
		if (n == N - 1) {
			result = An[0];
			for (int i = 1; i < N; i++) {
				if (order[i - 1].equals("+")) result += An[i];
				else if (order[i - 1].equals("-")) result -= An[i];
				else if (order[i - 1].equals("*")) result *= An[i];
				else if (order[i - 1].equals("/")) result /= An[i];
			}
			if (result > maxValue) maxValue = result;
			if (result < minValue) minValue = result;
			
			return;
		}
		
		// 1. 연산자들의 개수가 0이면 계산할 필요가 없는 연산자인 경우이므로 continue
		// 2. 연산자를 사용했다는 의미로 개수 -1을 하고 해당 연산자를 order배열에 앞에서부터(n = 0) 저장한다.
		// 3. n에 1씩 더하면서 다음 함수를 호출하고 해당 경우에 대해 1 ~ 3을 반복한다.
		// 4. 사용해야하는 연산자의 개수만큼 n값이 올라가면 계산할 연산자 기호들을 저장한 order 순서에 따라 result값을 계산해나간다.
		// 5. 최대값과 최소값을 각각 비교하여 값들을 갱신한다.
		// 6. 해당 스택의 호출이 끝나고 나면 사용하여 빼주었던 연산자 개수를 다시 +1 해준다.
		for (int i = 0; i < 4; i++) {
			if (operatorsCount[i]  == 0) continue;
			
			operatorsCount[i]--;
			order[n] = operators[i];
			
			btk(n + 1);
			
			operatorsCount[i]++;
		}
	}
	
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		input_An = br.readLine().split(" ");
		input_operators = br.readLine().split(" ");
		An = new int[N];
		order = new String[N - 1];

		// 입력받은 An과 연산자의 개수들을 int 배열로 형변환 한다.
		for (int i = 0; i < N; i++) {
			An[i] = Integer.parseInt(input_An[i]);
		}
		for (int i = 0; i < 4; i++) {
			operatorsCount[i] = Integer.parseInt(input_operators[i]);
		}
		
		btk(0);
		
		bw.write(line + maxValue + "\n" + minValue);
		bw.flush();
		bw.close(); 
		
	}

}