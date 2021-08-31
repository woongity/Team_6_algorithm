package 별찍기_2447;
import java.io.*;

public class Main {
    static char[][] mat = new char[6600][6600];
    public static void sol(int x, int y ,int num){
        if(num==1){
            mat[y][x] = '*';
            return;
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i!=1 || j!=1) {
                        sol(x + j * num / 3, y + i * num / 3, num / 3);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++) {
                mat[i][j] =' ';
            }
        }
        sol(0,0,num);
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                bw.write(mat[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
