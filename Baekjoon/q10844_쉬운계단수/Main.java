package q10844_쉬운계단수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static long[][] arr;
	public static long n = 1000000000;
	public static long result = 0;
	
		
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
        arr = new long[N + 1][10];
        
        for(int i = 1; i < 10; i++) {
            arr[1][i] = 1; //1자리 수의 i번째 수가 계단이 되는 경우는 한가지 밖에 없으므로 초기화.
        }
        
        for(int i = 2; i < N + 1; i++) {
            for(int j = 0; j < 10; j++) {
            	//끝 자리가 0일때는 앞에 올 수 있는 수는 1뿐이다.
                if(j == 0) arr[i][j] = arr[i - 1][j + 1] % n;
                //끝 자리가 9 일때는 앞에 올 수 있는 수는 8뿐이다.
                else if(j == 9) arr[i][j] = arr[i - 1][j - 1] % n;
                // 나머지 경우에는 2가지 경우이다.
                else arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % n;
            }    
        }
        
        for(int i = 0; i < 10; i++ ) result += arr[N][i];
        
        System.out.println(result % n);
	}

}