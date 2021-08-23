import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        for(int i=0;i<=14;i++){
            arr[0][i] = i;
            arr[i][0] = 0;
        }
        for(int i =1;i<=14;i++){
            for(int j=1;j<=14;j++){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        for(int i =0;i<testCase;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[k][n]);
        }
    }
}
