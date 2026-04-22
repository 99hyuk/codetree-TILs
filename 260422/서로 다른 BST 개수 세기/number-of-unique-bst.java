import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[20];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i=4; i<=19; i++) {
            for (int j=1; j<=i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }

        System.out.print(dp[n]);
    }
}