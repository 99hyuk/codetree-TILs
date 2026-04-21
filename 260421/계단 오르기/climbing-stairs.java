import java.util.*;
import java.io.*;

public class Main {

    static int[] memo;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        memo = new int[1001];
        Arrays.fill(memo, -1);   
        memo[2] = 1;
        memo[3] = 1;

        System.out.print(recur(N));
    }

    static int recur(int n) {
        if(n <= 1) {
            return 0;
        }

        if(memo[n] != -1) {
            return memo[n];
        }

        return memo[n] = recur(n-2) + recur(n-3);
    }
    
}