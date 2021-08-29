package stage10.recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11729 {
    static StringBuilder sb = new StringBuilder();

    static void hanoi(int a, int b, int num) {
        if(num==1) {
            sb.append(a+" "+b+"\n");
            return;
        }
        hanoi(a, 6 - a - b, num - 1);
        sb.append(a+" "+b+"\n");
        hanoi(6 - a - b, b, num - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append((1<<n)-1 + "\n");
        hanoi(1, 3, n);

        System.out.println(sb.toString());
    }
}
