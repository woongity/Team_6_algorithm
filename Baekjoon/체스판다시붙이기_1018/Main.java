package 체스판다시붙이기_1018;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        char[][] map = new char[51][51];
        int sizeY = Integer.parseInt(str[0]);
        int sizeX = Integer.parseInt(str[1]);
        for (int i = 0; i < sizeY; i++) {
            String mapStr = br.readLine();
            for (int j = 0; j < sizeX; j++) {
                map[i][j] = mapStr.charAt(j);
            }
        }
        char[][] blackB= new char[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i%2==0 && j%2==0)||(i%2==1 && j%2==1)){
                    blackB[i][j]= 'B';
                }else{
                    blackB[i][j]= 'W';
                }
            }
        }
        char[][] whiteB = new char[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i%2==0 && j%2==0)||(i%2==1 && j%2==1)){
                    whiteB[i][j]= 'W';
                }
                else{
                    whiteB[i][j]= 'B';
                }
            }
        }

        int plusX = sizeX-8;
        int plusY = sizeY-8;
        int ans = 9999;
        for(int x=0;x<=plusX;x++){
            for(int y=0;y<=plusY;y++){// map
                int countB = 0;
                int countW = 0;
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(blackB[i][j]!=map[i+y][j+x]){
                            countB++;
                        }
                    }
                }
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(whiteB[i][j]!=map[i+y][j+x]){
                            countW++;
                        }
                    }
                }
                ans = Math.min(ans,countB);
                ans = Math.min(ans,countW);
            }
        }
        System.out.println(ans);
    }
}
