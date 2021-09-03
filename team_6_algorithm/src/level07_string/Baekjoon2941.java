package level07_string;

import java.util.Scanner;

//백준 : 문제 > 단계별로 풀어보기 > 단계 7 : 문자열  > 2941

//문제] 크로아티아 알파벳
public class Baekjoon2941 {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		
		String alp = sc.next();
		int count = 0;
		
		int len = alp.length();
		for(int i=0; i<len; i++) {
	
			if(alp.charAt(i) == 'c') {
				if(i < len-1) { // IndexOutOfBounds 에러 방지
					if(alp.charAt(i+1) == '=') {
						i++; // 두 문자가 하나의 문자임으로 +1	
					} else if (alp.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			else if(alp.charAt(i) == 'd') {
				if(i < len-1) {
					if(alp.charAt(i+1) == 'z') {
						if(i < len-2) {
							if(alp.charAt(i+2) == '=') {
								i += 2;
							}
						}
					} else if(alp.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			else if(alp.charAt(i) == 'l') {
				if(i < len-1) {
					if(alp.charAt(i+1) == 'j') {
						i++;
					}
				}
			} 
			else if(alp.charAt(i) == 'n') {
				if(i < len-1) {
					if(alp.charAt(i+1) == 'j') {
						i++;
					}
				}
			} 
			else if(alp.charAt(i) == 's') {
				if(i < len-1) {
					if(alp.charAt(i+1) == '=') {
						i++;
					}
				}
			} 
			else if(alp.charAt(i) == 'z') {
				if(i < len-1) {
					if(alp.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			count++;
			
		} //for end
		System.out.println(count);
	} //main end
}
