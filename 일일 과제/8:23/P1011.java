import java.io.*;
import java.nio.Buffer;

public class P1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0;i<testCase;i++){
            String[] st = br.readLine().split(" ");
            long x  = Integer.parseInt(st[0]);
            long y = Integer.parseInt(st[1]);
            long minus = y-x;
            long num=0,j;

            for(j =1;j<100000;j++) {
                if(minus<=Math.pow(j,2)+j){
                    num = j;
                    break;
                }
            }
            long ans = 2*num;
            if(minus<=num*num) {
                ans--;
            }
            System.out.println(ans);
        }

    }
}
