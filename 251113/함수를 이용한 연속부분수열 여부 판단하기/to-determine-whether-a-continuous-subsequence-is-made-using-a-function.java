import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if (part(a, b)) System.out.print("Yes");
        else System.out.print("No");
    }

    static boolean part(int[] a, int[] b) {
        if (a.length < b.length) return false;
        boolean check = false;
        for (int i=0; i<a.length-b.length+1; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i+j] != b[j]) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) return true;
        }
        return false;
    }
}