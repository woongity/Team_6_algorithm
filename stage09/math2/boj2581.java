package stage09.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2581 {

    static boolean[] prime = new boolean[10002];

    static void getPrime(int x) {
        Arrays.fill(prime,true);

        prime[1] = false;
        for(int i=2;i<=x;i++) {
            if(!prime[i]) continue;
            for(int j=i*i;j<=x;j+=i){
                prime[j] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        getPrime(n);

        int sum = 0;
        int min_num = 0;

        for(int i=m;i<=n;i++) {
            if(prime[i]) {
                sum+=i;
                if(min_num==0)
                    min_num = i;
            }
        }

        if(sum==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min_num);
        }
    }
}
