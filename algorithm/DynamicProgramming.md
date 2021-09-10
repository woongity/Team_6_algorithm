## **동적 계획법(Dynamic Programming)**

-   복잡한 문제를 간단한 여러 개의 하위문제로 나누어 푼 다음, 그것을 결합하여 최종적인 문제 해결을 하는 방법
-   **부분 문제 반복(Overlapping Subproblem)**과 **최적 부분 구조(Optimal Substructure)**를 가지고 있는 알고리즘을 일반적인 방법에 비해 더욱 적은 시간 내에 풀 때 사용
    -   이미 진행된 연산을 기록했다가 사용하는 방식

### **메모이제이션(Memoization)**

-   하위 문제의 연산의 값을 배열에 저장하여 재사용 하는 방식
    -   한 번 계산된 결과를 저장해 두었다가 활용하는 방식으로 중복 계산을 줄이는 것

#### **접근 방식**

1.  하위 문제 정의; 전체 문제를 하위 문제로 단순화
2.  메모이제이션 테이블 정의
3.  점화식 정의; 재귀적인 구조를 활용 할 수 있는 점화식을 만듦
4.  문제 해결; 하위 문제를 해결한 방법(메모이제이션 테이블 저장)으로 전체 문제 해결

---

[문제) 백준 10870번 피보나치 수 5](https://www.acmicpc.net/problem/10870)

-   **Top-Down 방식**

```
public static Baekjoon10870 {
	public static int dp[]; // 메모이제이션
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp, -1); // 초기화
        
        System.out.println(f(n));
    }
    
    public static int f(int i){
    	if(i == 0) return 0;
        if(i == 1) return 1;
        if(dp[i] != -1) return dp[i];
        
        int ret = f(i-1) + f(i-2); // 재귀
        dp[i] = ret;
        return ret;
    }
}
```

\-메모이제이션

\-재귀

-   **Bottom-Up 방식**

```
public class Baekjoon10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n+1]; // 0부터 시작하므로 +1

        for(int i=0; i<arr.length; i++) {
            if(i==0) dp[0] = 0;
            else if(i==1) dp[1] = 1;
            else dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
```

\-점진적 계산