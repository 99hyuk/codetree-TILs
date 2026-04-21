import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        long[] dp = new long[1001];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 7;

        for (int i=3; i<=1000; i++) {
            dp[i] = (dp[i-1]*3 + dp[i-2] - dp[i-3]) % 1_000_000_007;
            if(dp[i] < 0) {
                dp[i] += 1_000_000_007;
            }
        }

        System.out.print(dp[n]);
    }
}