package 회의실배정_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Time implements Comparable{
    int start;
    int end;

    Time(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Object o) {
        Time newTime = (Time)o;
        if(this.end> newTime.end){
            return 1;
        }else if(this.end== newTime.end){
            if(this.start> newTime.start){
                return 1;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Time[] times = new Time[num];
        for(int i=0;i<num;i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b= Integer.parseInt(str[1]);
            Time time = new Time(a,b);
            times[i] = time;
        }
        int last = 0;
        int count = 0;
        Arrays.sort(times);
        for(int i=0;i<num;i++){
            if(times[i].start>=last){
                last = times[i].end;
                count++;
            }
        }
        System.out.println(count);
    }
}
