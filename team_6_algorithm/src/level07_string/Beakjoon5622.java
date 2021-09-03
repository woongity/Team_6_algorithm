package level07_string;

import java.util.Scanner;

//백준 : 문제 > 단계별로 풀어보기 > 단계 7 : 문자열  > 5622

//문제] 다이얼
//숫자 1을 걸려면 총 2초가 필요
//1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
public class Beakjoon5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int time = 0;
		
		int len = num.length();
		for(int i=0; i<len; i++) {
			switch(num.charAt(i)) {
			case 'A': case 'B': case 'C':
				time += 3;
				break;
			case 'D': case 'E': case 'F':
				time += 4;
				break;
			case 'G': case 'H': case 'I':
				time += 5;
				break;
			case 'J': case 'K': case 'L': 
				time += 6;
				break;
                
			case 'M': case 'N': case 'O':
				time += 7;
				break;
                
			case 'P': case 'Q': case 'R': case 'S': 
				time += 8; 
				break;
                
			case 'T': case 'U': case 'V': 
				time += 9;
				break;
                
			case 'W': case 'X': case 'Y': case 'Z': 
				time += 10;
				break;
			} 
		}
		
		System.out.println(time);
		
	}
}
