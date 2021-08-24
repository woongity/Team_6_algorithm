import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws IOException {
        String a ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        int count =0;
        for(int i=0;i<a.length();i++){

            int check=0;
            if(a.charAt(i)=='c'){
                if(a.charAt(i+1)=='-' || a.charAt(i+1) =='='){
                    count++;
                    i++;
                    check=1;

                }
            }
            else if(a.charAt(i)=='d'){
                if(a.charAt(i+1)=='z' && a.charAt(i+2)=='='){
                    i+=2;
                    count++;

                    check=1;
                }
                else if(a.charAt(i+1)=='-'){
                    i++;
                    count++;

                    check=1;
                }
            }
            else if(a.charAt(i)=='l' && a.charAt(i+1)=='j'){
                i++;
                count++;
                check=1;
            }
            else if(a.charAt(i)=='n' && a.charAt(i+1)=='j'){
                i++;
                count++;
                check=1;
            }
            else if(a.charAt(i)=='s' && a.charAt(i+1)=='='){
                i++;
                count++;
                check=1;
            }
            else if(a.charAt(i)=='z' && a.charAt(i+1)=='='){
                i++;
                count++;
                check=1;
            }
            if(check==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
