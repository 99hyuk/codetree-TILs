import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N+2][N+2];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

    int[][] dp = new int[N+2][N+2];
    for (int i=1; i<=N; i++) {
        dp[1][N-i+1] = dp[1][N-i+2] + map[1][N-i+1];
        dp[i][N] = dp[i-1][N] + map[i][N];
    }

    for (int i=2; i<=N; i++) {
        for (int j=N-1; j>=1; j--) {
            dp[i][j] = Math.min(dp[i-1][j], dp[i][j+1]) + map[i][j]; 
            // System.out.print(dp[i][j]  + " ");
        }
        // System.out.println();
    }

    System.out.print(dp[N][1]);
}
}