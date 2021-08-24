import java.io.*;

public class p5622 {
    public static void main(String[] args) throws IOException {
        int ans=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        for(int i = 0; i < a.length(); i++){
            if(('A' <= a.charAt(i)) && (a.charAt(i) <= 'C'))
                ans+=3;
            else if(('D' <= a.charAt(i)) && (a.charAt(i) <= 'F'))
                ans+=4;
            else if(('G' <= a.charAt(i)) && (a.charAt(i) <= 'I'))
                ans+=5;
            else if(('J' <= a.charAt(i)) && (a.charAt(i) <= 'L'))
                ans+=6;
            else if(('M' <= a.charAt(i)) && (a.charAt(i) <= 'O'))
                ans+=7;
            else if(('P' <= a.charAt(i)) && (a.charAt(i) <= 'S'))
                ans+=8;
            else if(('T' <= a.charAt(i)) && (a.charAt(i)<= 'V'))
                ans+=9;
            else if(('W' <= a.charAt(i)) && (a.charAt(i) <= 'Z'))
                ans+=10;
        }
        System.out.println(ans);
    }
}
