import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (checkDay(m,d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    
    static boolean checkDay(int m, int d) {
        int[] day = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        if (m>=1 && m<=12 && day[m-1] >= d) {
            return true;
        }
        return false;
    }
}