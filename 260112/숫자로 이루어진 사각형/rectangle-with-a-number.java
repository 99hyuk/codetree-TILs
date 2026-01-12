import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
        // Please write your code here.
    }

    static void printRect(int n) {
        int point = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(point++ + " ");
                if (point > 9) point = 1;
            }
            System.out.println();
        }
    }
}