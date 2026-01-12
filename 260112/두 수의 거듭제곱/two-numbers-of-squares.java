import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int n = ext(a, b);
        System.out.print(n);
    }

    static int ext(int a, int b) {
        int p = 1;
        for (int i=0; i<b; i++) {
            p *= a;
        }
        return p;
    }
}