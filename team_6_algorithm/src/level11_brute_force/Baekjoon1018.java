package level11_brute_force;

import java.util.Scanner;

// 백준 1018번 문제] 체스판 다시 칠하기
public class Baekjoon1018 {
    public static boolean[][] board;
    public static int min = 64; // 최대 변경 횟수 64

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        board = new boolean[x][y];

        String str;
        for(int i = 0; i < x; i++) {
            str = sc.nextLine();
            for(int j = 0; j < y; j++) {
                if(str.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        int xEnd = x - 7;
        int yEnd = y - 7;

        // 보드의 경우의 수 만큼 테스트; (n - 7) * (m - 7)
        for(int i = 0; i < xEnd; i++) {
            for(int j = 0; j < yEnd; j++) {
                   check(i, j);
            }
        }

        System.out.println(min);
    } //main end

    // 보드의 흰색과 검은색을 체크하여 최소 변경 개수를 구하는 함수; 2
    public static void check(int xStart, int yStart) {
        int xEnd = xStart + 8;
        int yEnd = yStart + 8;
        int count = 0;

        boolean color = board[xStart][yStart];

        for(int i = xStart; i < xEnd; i++) {
            for(int j = yStart; j < yEnd; j++) {
                if(board[i][j] != color) {
                    count++;
                }

                color = (!color); // 다음 칸은 반대 컬러가 와야하기 때문에 바꿔줌
            }
            color = (!color);
        }

        count = Math.min(count, 64 - count); // 흰색으로 시작할 경우 vs 검정색으로 시작할 경우 더 작은 값 가져오기

        min = Math.min(min, count); // 가장 교체 수가 적은 케이스의 최솟값 가져오기
    } //check() end
}
