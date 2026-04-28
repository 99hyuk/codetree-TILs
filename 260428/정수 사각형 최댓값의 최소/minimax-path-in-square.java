import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int[][] dp = new int[n][n];
        dp[0][0] = matrix[0][0];

        for (int i=1; i<n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], mat)
        }
    }
}