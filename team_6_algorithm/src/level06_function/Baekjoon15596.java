package level06_function;

// 백준 : 문제 > 단계별로 풀어보기 > 단계 6 : 함수 > 15596

// 문제] 정수 N개의 합
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합
public class Baekjoon15596 {
	long sum(int[] a) {
		int n = a.length;
		long ans = 0;
		
		for(int i=0; i<n; i++) {
			ans += a[i];
		}
		return ans;
	}
}