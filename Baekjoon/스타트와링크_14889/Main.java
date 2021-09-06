package 스타트와링크_14889;

import java.io.*;

public class Main {
    static int n;
    static int ans = Integer.MAX_VALUE;
    public static boolean[] isVisited = new boolean[21];
    public static int[][] map = new int[21][21];
    public static void select(int start, int count) {
        if (count == n / 2) {
            diff();
            return ;
        } else {
            for (int i = start; i < n; i++) {
                if (!isVisited[i]) {
                    isVisited[i] = true;
                    select(i + 1, count + 1);
                    isVisited[i] = false;
                }
            }
        }
    }
    //
    static public void diff(){
        int score1= 0;
        int score2= 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isVisited[i] && isVisited[j]){
                    score1+=map[i][j];
                    score1+=map[j][i];
                }else if(!isVisited[i] && !isVisited[j]){
                    score2+=map[i][j];
                    score2+=map[j][i];
                }
            }
        }
        int minus = Math.abs(score1-score2);
        if(minus==0){
            System.out.println("0");
            System.exit(0);
        }
        ans = Math.min(ans,minus);
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] str = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                map[i][j]= Integer.parseInt(str[j]);
            }
        }
        select(0,0);
        bw.write(ans+" ");
        bw.flush();
    }
}
