import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int k = n*m;
        int minmul;
        for (int i=1; i<=k; i++) {
            if (k%i==0 && i%n==0 && i%m==0) {
                minmul = i;
                System.out.print(i);
                break;
            }
        }
    }
}