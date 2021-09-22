package q01541_잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int result;
	public static String input;
	public static String inputArr[];
	public static int[] arr;
	public static int len;
	public static int flag;
	public static int index;
	
	public static void main(String[] args) throws IOException {

		// split은 여러가지 기준으로도 나눌 수 있고, 기호를 쓸때는 앞에 \\를 붙여주면된다.
		input = br.readLine();
		inputArr = input.split("\\+|\\-");
		len = inputArr.length;
		result = 0;
		arr = new int[len];
		// 처음으로 -기호가 나오는 시점을 구하기위한 index
		index = 0;
		
		// -기호가 나오기 전까지 +기호가 나올때마다 index +1
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+') index++;
			else if (input.charAt(i) == '-') break;
		}
		
		// -기호가 나온 이후의 숫자들은 모두 빼주면 되므로 index 이전숫자들은 모두 더하고 그 이후는 모두 뺀다.
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(inputArr[i]);
			
			if (i > index) result -= arr[i];
			else result += arr[i];
		}
		
		System.out.println(result);
		
	}

}