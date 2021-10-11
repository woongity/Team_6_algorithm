package algorithm.boj;

import java.awt.*;
import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj16235 {
    static class tree {
        int age;
        int x;
        int y;

        public tree(int age, int x, int y) {
            this.age = age;
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, k;
    static int[][] board = new int[12][12];
    static int[][] a = new int[12][12];
    static Deque<tree> trees = new LinkedList<>();
    static ArrayList<tree> dead = new ArrayList<tree>();
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        k = Integer.parseInt(line[2]);

        for(int i=1;i<=n;i++) {
            line = br.readLine().split(" ");
            for(int j=1;j<=n;j++) {
                a[i][j] = Integer.parseInt(line[j - 1]);
                board[i][j] = 5;
            }
        }

        for(int i=0;i<m;i++) {
            line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int z = Integer.parseInt(line[2]);
            trees.add(new tree(z, x, y));
        }

        for(int i=1;i<=k;i++) {
            spring();
            summer();
            fall();
            winter();
        }

        System.out.println(trees.size());

    }

    private static void spring() {
        int size = trees.size();
        for(int i=0;i<size;i++) {
            tree cur = trees.poll();
            int age = cur.age;
            int x = cur.x;
            int y = cur.y;

            if (board[x][y] >= age) {
                board[x][y] -= age;
                trees.addLast(new tree(age + 1, x, y));
            } else {
                dead.add(cur);
            }

        }
    }

    private static void summer() {
        for (tree cur : dead) {
            int age = cur.age;
            int x = cur.x;
            int y = cur.y;
            board[x][y] += age/2;
        }
        dead.clear();
    }

    private static void fall() {
        ArrayList<tree> tmp = new ArrayList<>();
        for (tree cur : trees) {
            int age = cur.age;
            int x = cur.x;
            int y = cur.y;

            if(age%5!=0) continue;

            for(int dir = 0;dir<8;dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx<1||ny<1||nx>n||ny>n) continue;
                tmp.add(new tree(1, nx, ny));
            }
        }
        for (tree cur : tmp) {
            trees.addFirst(cur);
        }
    }

    private static void winter() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] += a[i][j];
            }
        }
    }
}
