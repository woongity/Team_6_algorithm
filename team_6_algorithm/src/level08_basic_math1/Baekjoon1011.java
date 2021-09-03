package level08_basic_math1;

import java.util.Scanner;

//백준 : 문제 > 단계별로 풀어보기 > 단계 8 : 기본 수학1 > 1011

//문제] Fly me to the Alpha Centauri
//이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다.
//사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다.
//여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다.
//y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년
//x지점에서 y지점을 향해 최소한의 작동 횟수
public class Baekjoon1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int X = sc.nextInt(); // 현재 위치
			int Y = sc.nextInt(); // 목표 위치
			
			int dis = Y - X; // 거리
			int max = (int)Math.sqrt(dis); // 최댓값 = 루트(거리)
			
			if(max == Math.sqrt(dis)) { // 2의 dis승의 자리라서 루트 값이 딱 떨어짐!
				System.out.println(2 * max - 1);
			} else if(dis <= max * max + max) {
				System.out.println(2 * max);
			} else {
				System.out.println(2 * max + 1);
			}
		}
	} //main end
}