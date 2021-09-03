package level09_basic_math2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 2581 문제] 소수
// 자연수 M과 N이 주어질 때 M 이상 N 이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램
public class Baekjoon2581 {
    public static boolean prime(int n) {
        if(n < 2) return false; // 1은 소수도 합성수도 아니다!

        // n을 2부터 n-1까지의 수로 n-1(1과 자기자신 제외) 나눴을 때 나머지가 0이면 합성수
        for(int i=2; i<n; i++) {
            if(n%i == 0) return false;
        }

        // 위의 조건문을 모두 통과시 소수이기 때문에 true 리턴
        return true;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt(); // m부터
        int last = sc.nextInt(); // n까지
        int sum = 0;
        ArrayList<Integer> minArr = new ArrayList<Integer>();

        for(int i=start; i<=last; i++) {
            if(prime(i)) {
                sum += i;
                minArr.add(i);
            }
        }

        if(minArr.size() == 0) {
            System.out.println(-1);
        } else {
            int min = Collections.min(minArr);
            System.out.println(sum);
            System.out.println(min);
        }

    } //main end
}
