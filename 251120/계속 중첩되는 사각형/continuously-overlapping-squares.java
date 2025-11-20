import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for (int cnt = 0; cnt < n; cnt++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            for (int i=x1; i<x2; i++) {
                for (int j=y1; j<y2; j++) {
                    if (cnt%2==0 && (arr[i][j]==0 || arr[i][j]==1)) {
                        arr[i][j] = -1;
                    } else if (cnt%2==1 && (arr[i][j]==0 || arr[i][j]==-1)) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        // Please write your code here.

        int count=0;
        for (int i=0; i<201; i++) {
            for (int j=0; j<201; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}