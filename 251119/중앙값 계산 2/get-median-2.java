import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i%2 == 0) {
                int mid;
                int[] midArr = new int[i+1];
                for (int j=0; j<=i; j++) {
                    midArr[j] = arr[j];
                }
                mid = mid(midArr);
                System.out.print(mid + " ");
            }
        }
        
        // Please write your code here.
    }

    static int mid(int[] arr) {
        Arrays.sort(arr);
        int mid = arr[arr.length/2];
        return mid;
    }
}