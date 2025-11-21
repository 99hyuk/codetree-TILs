import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int[] dirX = new int[]{1, 0 ,-1, 0};
        int[] dirY = new int[]{0, 1 , 0, -1};
        int[][] arr = new int[n][n];

        int cnt = n*n;
        arr[n-1][n-1] = cnt;
        int dirnum = 2;
        int dx = n-1;
        int dy = n-1;

        for (int i=1; i<n*n; i++) {
            dx = dx + dirX[dirnum];
            dy = dy + dirY[dirnum];
            if (isChecked(dx, dy, n) && arr[dy][dx]==0) {
                arr[dy][dx] = --cnt;
            } else {
                dx = dx - dirX[dirnum];
                dy = dy - dirY[dirnum];
                dirnum = (dirnum+1) % 4; 
                dx = dx + dirX[dirnum];
                dy = dy + dirY[dirnum];
                arr[dy][dx] = --cnt;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isChecked(int x, int y, int n) {
        if (x < 0 || x > n-1 || y < 0 || y > n-1) {
            return false;
        }
        return true;
    }
}