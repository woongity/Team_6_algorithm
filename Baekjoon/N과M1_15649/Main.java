package N과M1_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static boolean[] isVisited = new boolean[9];
    public static int[] arr = new int[9];
    public static int[] choices = new int[9];
    public static int n,m;
    static void permu( int count){
        if(count==m){
            for(int i=1;i<=m;i++){
                System.out.print(choices[i]+" ");
            }
            System.out.println();
            return;
        }else{
            for(int i=1;i<=n;i++){
                if(!isVisited[i]){
                    choices[count+1] = arr[i];
                    isVisited[i] = true;
                    permu(count+1);
                    isVisited[i]= false;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        for(int i=1;i<=n;i++){
            arr[i] = i;
        }
        permu(0);
    }
}
