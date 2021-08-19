package q1065_한수;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	// 한수인지 검사하는 함수
	public static int checkNumber(int n) {
		// 두 자리수 까지는 자리수 차이가 없거나 한개 이므로 항상 등차수열이다.
		if (n < 100) return 1;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 각 자리수를 ArrayList에 넣는다.
		while (n > 0) {
			numbers.add(n % 10);
			n /= 10;
		}
		
		int digit = numbers.size();
		int x = numbers.get(0) - numbers.get(1);
		int i = 1;
		// 자리수끼리의 차이가 일정하면 while문을 지나가서 1을 return하고, 그렇지 않은 경우 0을 return한다.
		while (i < digit - 1) {
			if ((numbers.get(i) - numbers.get(i + 1)) != x) return 0;
			i++;
		}
		
		return 1;
	}

	// Main
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N + 1];
		arr[0] = 1;
		int count = 0;
		
		// 1부터 주어진 수 N까지 한수인지 검사하면서 맞을경우 count +1을 해준다.
		for (int i = 1; i < N + 1; i++) {
			if (checkNumber(i) == 1) count++;
		}
		
		System.out.println(count);
	}

}
