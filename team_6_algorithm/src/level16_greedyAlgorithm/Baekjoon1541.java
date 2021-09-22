package level16_greedyAlgorithm;

import java.io.IOException;
import java.util.Scanner;

//백준 1541번 문제] 잃어버린 괄호
public class Baekjoon1541 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;

        String[] arr = str.split("-|\\+");

        for(int i=0; i<arr.length; i++) {
            if(i == 0) {
                result += Integer.parseInt(arr[i]);
            } else {
                result -= Integer.parseInt(arr[i]);
            }
        }

        System.out.println(result);
    }
}
