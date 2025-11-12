import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for (int i=A; i<=B; i++) {
            if (magicNumber(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    static boolean magicNumber(int n) {
        return n%3==0 || threeCheck(n);
    }

    static boolean threeCheck(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '3' || arr[i] == '6' || arr[i] == '9') {
                return true;
            }
        }
        return false;
    }
}