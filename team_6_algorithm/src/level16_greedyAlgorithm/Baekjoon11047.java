package level16_greedyAlgorithm;

import java.util.Scanner;

//백준 11047번 문제] 동전 0
public class Baekjoon11047 {
    public static void main(String[] args) {
        //입력 시작
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];

        for(int i=0; i<n; i++) {
            coin[i] = sc.nextInt();
        }
        //입력 끝

        int count = 0; //필요한 동전의 최소 개수

        for(int i=n-1; i>=0; i--) {
            //현재 동전의 가치가 k보다 작으면
            if(coin[i] <= k){
                count += (k /coin[i]); //현재 동전의 가치로 구성할 수 있는 최대의 개수 구하기
                k = k % coin[i]; //위에서 구한 가치를 제외한 나머지 값 저장
            }
        }

        System.out.println(count);
    }
}
