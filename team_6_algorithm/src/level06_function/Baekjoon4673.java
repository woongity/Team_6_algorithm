package level06_function;

// 백준 : 문제 > 단계별로 풀어보기 > 단계 6 : 함수 > 4673

// 문제] 셀프 넘버 = 생성자가 없는 숫자
// 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의
// 예를 들어, d(75) = 75+7+5 = 87, 75는 77의 생성자
public class Baekjoon4673 {
	static int d(int n) {
		int ans = n;
		
		while(n != 0) {
			ans += n % 10; // 첫째 자리수 더하기
			n = n / 10; // 첫째 자리수 지우기
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		boolean[] notSelfNumCheck = new boolean[10001]; // 인덱스는 0부터 시작하기 때문에 +1이 더 필요
		
		for(int i=1; i<10001; i++) {
			int notSelfNum = d(i);
			
			if(notSelfNum < 10001) {
				notSelfNumCheck[notSelfNum] = true; // 생성자가 아닌 값 표시
			}
		}
		
		for(int i=1; i<10001; i++) {
			if (!notSelfNumCheck[i]) {
				System.out.println(i);
			}
		}
	}
}