package 덩치_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

class person{
    public int height;
    public int weight;
    public int grade;
    person(int w,int h){
        this.weight = w;
        this.height = h;
    }
    person(int w,int h,int g){
        this.weight = w;
        this.height = h;
        this.grade = g;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        ArrayList<person> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        int totalGrade = 0;
        for(int i=0;i<num;i++){
            String[] str = br.readLine().split(" ");
            list.add(new person(Integer.parseInt(str[0]),Integer.parseInt(str[1]),0));
        }
        for(int i=0;i<num;i++){
            person p = list.get(i);
            int count =1;
            for(int j=0;j<num;j++){
                person p2 = list.get(j);
                if(p.height<p2.height && p.weight<p2.weight){
                    count++;
                }
            }
            p.grade = count;
        }
        for(int i=0;i<num;i++){
            person p = list.get(i);
            System.out.print(p.grade+" ");
        }
    }
}
