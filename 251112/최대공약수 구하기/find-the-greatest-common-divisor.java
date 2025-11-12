import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(maxdiv(n, m));
    }

    static int maxdiv(int n, int m) {
        int max = 1;
        
        if (n > m) {
            for (int i=1; i<=n; i++) {
                if (n%i==0 && m%i==0) {
                    if (i > max) {
                        max=i;
                    }
                }
            }
        } else {
            for (int i=1; i<=m; i++) {
                if (n%i==0 && m%i==0) {
                    if (i > max) {
                        max=i;
                    }
                }
            }
        }

        return max;
    }
}