package level16_greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

//백준 11399번 문제] ATM
public class Baekjoon11399 {
    public static void main(String[] args) {
        //입력 시작
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //사람의 수
        int[] time = new int[n];

        for(int i=0; i<n; i++) {
            time[i] = sc.nextInt();
        }
        //입력 끝

        Arrays.sort(time);

        int waitingTotal = 0;
        int myTime = 0;
        for(int i=0; i<n; i++) {
            waitingTotal += myTime;
            myTime += time[i];
        }
        waitingTotal += myTime;
        System.out.println(waitingTotal);
    }
}
