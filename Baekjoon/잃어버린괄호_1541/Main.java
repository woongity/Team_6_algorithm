package 잃어버린괄호_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String newStr= br.readLine();
        int plus=0,minus=0,ans=0;
        int startIdx = 0, endIdx = 0;
        boolean isMinus = false;
        newStr+='+';
        for(int i=0;i<newStr.length();i++){
            if(newStr.charAt(i)=='-'){
                if(isMinus){
                    minus += Integer.parseInt(newStr.substring(startIdx,endIdx));
                }
                else{
                    plus+=Integer.parseInt(newStr.substring(startIdx,endIdx));
                }
                startIdx = i+1;
                endIdx = i+1;
                isMinus = true;
            }
            else if(newStr.charAt(i)=='+'){
                if(isMinus){
                    minus += Integer.parseInt(newStr.substring(startIdx,endIdx));
                }
                else{
                    plus+=Integer.parseInt(newStr.substring(startIdx,endIdx));
                }
                startIdx = i+1;
                endIdx = i+1;
            }
            else{
                endIdx++;
            }
        }
//        System.out.println(plus);
//        System.out.println(minus);
        System.out.println(plus-minus);
    }
}
