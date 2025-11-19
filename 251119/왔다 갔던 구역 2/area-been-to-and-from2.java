import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2000];
        int point = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'L') {
                for (int j=point-1; j>=point-x; j--) {
                    arr[j]++;
                }
                point -= x;
            } else if (dir == 'R') {
                for (int j=point; j<point+x; j++) {
                    arr[j]++;
                }
                point += x;
            }
        }

        int count = 0;
        for (int i=0; i<2000; i++) {
            if (arr[i] >=2 ) {
                count++;
            }
        }

        System.out.print(count);
    }
}