package level15_dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

//백준 11053번 문제] 가장 긴 증가하는 부분 수열
public class Backjoon11053 {
    public static void main(String[] args) {
        //입력strat
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int dp[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //입력end

        //dp
        for(int i=0; i<n; i++) {
            dp[i] = 1;

            // 각 자리마다(i) 0부터 i 이전까지의 원소 비교!
            for (int j=0; j<i; j++) {
                // j번째 원소보다 작으면서 && dp[i]가 dp[j]+1(초기값이 1이기 때문에)보다 작은 경우
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

        }

        //최댓값 구하기
        Arrays.sort(dp);
        System.out.println(dp[n-1]);
    }//main end
}
