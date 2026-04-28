import java.util.Scanner;

public class Main {

    static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][] memo;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        memo = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                dp[i][j] = 1;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                dfs(i,j);
            }
        }

        int max = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                max = Int
            }
        }
    }

    static int dfs(int r, int c) {

        if(memo[r][c] > 0) {
            return memo[r][c];
        }

        for (int dir=0; dir<4; dir++) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if(nr>=0 && nr<n && nc>=0 && nc<n) {
                if (grid[r][c] < grid[nr][nc]) {
                    return memo[nr][nc] = Math.max(memo[r][c]+1, memo[nr][nc]);
                }
            }
        }        

    }
}