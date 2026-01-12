import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (demical(i) && sums(i)) {
                cnt ++;
            }
        }

        System.out.print(cnt);
    }

    static boolean demical(int n) {
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }

    static boolean sums(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10; 
        }

        if (sum % 2 == 1) {
            return false;
        }
        return true;
    }
}