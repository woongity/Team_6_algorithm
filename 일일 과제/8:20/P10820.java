import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class P10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(", ");
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0;i<7;i++){
            int number = Integer.parseInt(s[i]);
            if(number%2==1){
                sum+=number;
                list.add(Integer.parseInt(s[i]));
            }
        }
        int min = list.get(0);
        for(Integer num:list){
            if(min>num){
                min = num;
            }
        }
        if(list.isEmpty()) {
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
