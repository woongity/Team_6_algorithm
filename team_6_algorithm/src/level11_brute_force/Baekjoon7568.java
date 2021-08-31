package level11_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 7565번 문제] 덩치
public class Baekjoon7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] weAndHe = new int[n][2]; // [몸무게][키]

        String[] str;
        for(int i=0; i<n; i++) {
            str = br.readLine().split(" "); // 몸무게 키 입력받기
            weAndHe[i][0] = Integer.parseInt(str[0]); // 몸무게 저장
            weAndHe[i][1] = Integer.parseInt(str[1]); // 키 저장
        }

        for(int i=0; i<n; i++) {
            int rank = 1;
            for(int j=0; j<n; j++) {
                if(weAndHe[i][0] == weAndHe[j][0]) continue; // 동일인물끼리 비교하는 경우 피하기
                if(weAndHe[i][0] < weAndHe[j][0] && weAndHe[i][1] < weAndHe[j][1]) rank++;
            }
            System.out.print(rank + " ");
        }

    } //main end
}
