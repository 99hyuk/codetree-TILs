import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for (int i=0; i<n; i++) {
            if (i==n-1 || arr[i] != arr[i+1]) {
                max = Math.max(cnt, max);
                cnt = 0;
            }
            cnt++;
        }
        System.out.print(max);
    }
}