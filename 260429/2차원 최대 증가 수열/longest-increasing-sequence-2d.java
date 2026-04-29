import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] grid = new int[N+1][M+1];

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[N+1][M+1];
        int max = 0;

        for (int r1=1; r1<=N; r1++) {
            for (int c1=1; c1<=M; c1++) {
                dp[r1][c1] = 1;
                for (int r2=1; r2<r1; r2++) {
                    for (int c2=1; c2<c1; c2++) {
                        if(r1==r2 && c1==c2) continue;

                        if(grid[r1][c1] > grid[r2][c2]) {
                            dp[r1][c1] = Math.max(dp[r1][c1], dp[r2][c2] + 1);
                            max = Math.max(max, dp[r1][c1]);
                        }
                    }
                }
            }
        }

        System.out.print(max);
    }
}