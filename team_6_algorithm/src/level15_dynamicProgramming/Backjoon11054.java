package level15_dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

//백준 11053번 문제] 가장 긴 바이토닉 부분 수열
//바이토닉 :
public class Backjoon11054 {
    public static void main(String[] args) {
        //입력strat
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int lisDp[] = new int[n];
        int ldsDp[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //입력end

        //LIS(최장 증가 부분수열)
        for(int i=0; i<n; i++) {
            lisDp[i] = 1;

            // 0부터 i 이전까지의 원소 비교!
            for (int j=0; j<i; j++) {
                // j번째 원소보다 작으면서 && lisDp[i]가 lisDp[j]+1(초기값이 1이기 때문에)보다 작은 경우
                if(arr[j] < arr[i] && lisDp[i] < lisDp[j] + 1) {
                    lisDp[i] = lisDp[j] + 1;
                }
            }

        }

        //LDS(최장 감소 부분수열)
        for(int i=n-1; i>=0; i--) {
            ldsDp[i] = 1;

            // 맨 뒤부터 i 이전까지의 원소 비교!
            for (int j=n-1; j>i; j--) {

                // i번째 원소가 j번째 원소보다 크면서 && ldsDp[i]가 ldsDp[j]+1 값보다 작은 경우
                if (arr[j] < arr[i] && ldsDp[i] < ldsDp[j] + 1) {
                    ldsDp[i] = ldsDp[j] + 1;
                }
            }
        }

        //최댓값 구하기
        int max[] = new int[n];
        for(int i=0; i<n; i++) {
            max[i] = lisDp[i] + ldsDp[i] - 1; //단순 더하기는 원소 1개가 중복되기 때문에 1 빼줘야 함
        }
        Arrays.sort(max);
        System.out.println(max[n-1]);
    }//main end
}
