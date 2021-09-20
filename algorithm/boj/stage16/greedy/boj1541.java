package algorithm.boj.stage16.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Character> ops = new ArrayList<>();

        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                tmp += str.charAt(i);
            } else {
                nums.add(Integer.parseInt(tmp));
                ops.add(str.charAt(i));
                tmp = "";
            }
        }
        nums.add(Integer.parseInt(tmp));

        int sum = nums.get(0);
        for(int i=0;i<ops.size();i++) {
            if(ops.get(i)=='-') {
                for(int j=i+1;j<nums.size();j++) {
                    sum -= nums.get(j);
                }
                break;
            }
            else sum += nums.get(i + 1);
        }

        System.out.println(sum);
    }
}
