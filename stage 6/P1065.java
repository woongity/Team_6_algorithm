import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());
        int count =0;
        for(int i=1;i<=num;i++){
            if (i / 100 == 0) {
                count++;
            }else if(i==1000){
                continue;
            }
            else{
                int a= i;
                int first = a/100;
                a = a%100;
                int second = a/10;
                int third = a%10;
                if(second-first == third-second){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
