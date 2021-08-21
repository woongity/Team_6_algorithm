import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class P20820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
        int current = 0;
        int ans = 0;
        int check  = 0;
        int len = str.length();
        for(int i=0;i<len;i++) {
            if(str.charAt(i)=='('){
                current++;
                if(check == 1){
                    ans= ans + current*2;
                }else{
                    ans+=current;
                }
            }
            // #이라면, 이제 곱하기 2로
            else if(str.charAt(i)=='#'){
                if(check == 1){
                    check =0;
                }
                else check = 1;
                // #가 두번 나온거라면 check =0으로 다시 바꿔줌.
            }
            //
            else if(str.charAt(i)==')'){
                if(check ==1 ) {
                    ans = ans+current*2;
                }
                else{
                    ans += current;
                }
                current--;
            }
        }
        System.out.println(ans);
    }
}