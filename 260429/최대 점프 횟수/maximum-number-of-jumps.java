import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for (int i=1; i<=N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=2; i<=2+arr[1]; i++) {
            dp[i] = 1;
        }

        for (int i=1; i<=N; i++) {
            for (int j=1; j<i; j++) {
                if (arr[j] >= i-j && dp[j] != 0) {    
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i=1; i<=N; i++) {
            ans = Math.max(ans, dp[i]);
        }

        System.out.print(ans);
    }
}