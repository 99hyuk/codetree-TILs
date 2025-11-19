import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int countDay = 0;
        if (m1 <= m2 && d1 <= d2) {
            while(true) {
                if(m1 == m2 && d1 == d2) {
                    break;
                }
                
                countDay++;
                d1++;

                if (d1 > month[m1-1]) {
                    m1++;
                    d1=1;
                }
            }
            System.out.print(day[countDay%7]);
        } else {
            while(true) {
                if(m1 == m2 && d1 == d2) {
                    break;
                }
                
                countDay++;
                d1--;

                if (d1 < 1) {
                    m1--;
                    d1=month[m1-1];
                }
            }
            System.out.print(day[(7-countDay%7)%7]);
        }
        
    }
}