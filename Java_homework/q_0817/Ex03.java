package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(",");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		// 0 ~ 9번째 index가 있는 배열을 초기화한다.
		int[] arr = new int[10];
		// A * B * C를 int형으로 바꾸어 계산을 하고 다시 string으로 변환한다.
		int intNumber = A * B * C;
		String strNumber = Integer.toString(intNumber);

		// 숫자문자열을 앞에서부터 하나씩 떼서 숫자에 해당하는 index번호를 +1 해준다.
		for (int i = 0; i < strNumber.length(); i++) {
			int index = strNumber.charAt(i) - '0';
			arr[index]++;
		}
		
		// 더해진 배열을 출력한다.
		for (int i = 0; i < 10; i++) System.out.println(arr[i]);
	}

}
