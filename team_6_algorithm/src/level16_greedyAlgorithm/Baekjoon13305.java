package level16_greedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 13305번 문제: 주유소
public class Baekjoon13305 {
    public static void main(String[] args) throws IOException {
        //입력 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());//도시 수
        int[] length = new int[n-1]; //도시 간 거리
        int[] price = new int[n]; //기름 값

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n-1; i++) {
            length[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        //입력 끝

        int total = 0;
        int minPrice = price[0]; //이전까지의 과정 중 최저값
        for(int i=0; i<n-1; i++) { //마지막 주유소 가격은 고려X
            if(price[i] < minPrice) {
                minPrice = price[i];
            }

            total += (minPrice * length[i]);
        }

        System.out.println(total);
    }
}
