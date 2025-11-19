import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        char[] arr = N.toCharArray();
        int num = 0;
        for(int i=0; i<arr.length; i++) {
            num = num * A + (arr[i] - '0');
        }

        int cnt = 0;
        int[] Barr = new int[9];
        while (num / B > 0) {
            Barr[cnt] = num % B;
            num /= B;
            cnt++;
        }
        Barr[cnt] = num;

        for(int i=cnt; i>=0; i--) {
            System.out.print(Barr[i]);
        }
    }
}