import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (isDay(m, d, isP(y))) {
            if (m <=2 || m>=12) {
                System.out.print("Winter");
            } else if (m<=11) {
                System.out.print("Fall");
            } else if (m<=8){
                System.out.print("Summer");
            } else if (m<=5) {
                System.out.print("Spring");
            }
        } else {
            System.out.print(-1);
        }
    }

    static boolean isP(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else if (y % 100 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    static boolean isDay(int m, int d, boolean check) {
        int[] month;
        if (check == true) {
            month = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        } else {
            month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        }

        if (m>=1 && m<=12 && d<=month[m-1]) {
            return true;
        } else {
            return false;
        }
    }
}