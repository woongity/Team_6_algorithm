package level09_basicMath2;

import java.util.Scanner;

// 백준 1002번 문제] 터렛
// 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고,
// 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
// 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
public class Baekjoon1002 {
    public static int contaxt(int x1, int x2, int y1, int y2, int r1, int r2) {
        // 부동소수점 타입이 정확한 값이 아니라 근사치로 처리하기 때문에
        // 좌표평면에서의 두 점 사의 거리를 제곱한 형태로 사용
        int dpow = (int)(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)); // 중점간 거리의 제곱

        // 두 원의 중점과 크기가 동일한 경우
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        // 두 원이 서로 만나지 않고, 외부에 경우 || 두 원이 서로 만나지 않고, 내부에 있을 경우
        else if (Math.pow((r2+r1),2) < dpow || Math.pow((r2-r1),2) > dpow) {
            return 0;
        }
        // 외접 || 내접
        else if(Math.pow((r2+r1),2) == dpow || Math.pow((r2-r1),2) == dpow) {
            return 1;
        }
        // 두 점에서 교차할 때
        else {
            return 2;
        }
    } //contaxt() end

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(contaxt(x1, x2, y1, y2, r1, r2));
        }
    } //main end
}
