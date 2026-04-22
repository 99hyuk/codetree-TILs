import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N+1][N+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[N+1][N+1];
        for (int i=1; i<=N; i++) {
            dp[1][i] = dp[1][i-1] + arr[1][i];
            dp[i][1] = dp[i-1][1] + arr[i][1];
        }

        for (int i=2; i<=N; i++) {
            for (int j=2; j<=N; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + arr[i][j];
            }
        }

        System.out.print(dp[N][N]);
    }
}