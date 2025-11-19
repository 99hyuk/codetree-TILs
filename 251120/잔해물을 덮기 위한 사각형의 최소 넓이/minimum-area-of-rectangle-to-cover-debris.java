import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt() + 1000;
        int rect1_y1 = sc.nextInt() + 1000;
        int rect1_x2 = sc.nextInt() + 1000;
        int rect1_y2 = sc.nextInt() + 1000;
        int rect2_x1 = sc.nextInt() + 1000;
        int rect2_y1 = sc.nextInt() + 1000;
        int rect2_x2 = sc.nextInt() + 1000;
        int rect2_y2 = sc.nextInt() + 1000;
        // Please write your code here.
        int[][] arr = new int[2001][2001];
        
        for(int i=rect1_x1; i<rect1_x2; i++) {
            for(int j=rect1_y1; j<rect1_y2; j++) {
                arr[i][j]++;
            }
        }
                
        for(int i=rect2_x1; i<rect2_x2; i++) {
            for(int j=rect2_y1; j<rect2_y2; j++) {
                arr[i][j]--;
            }
        }

        int maxX = 0;
        int minX = rect1_x2;
        int maxY = 0;
        int minY = rect1_y2;
        boolean check = false;
        for(int i=rect1_x1; i<rect1_x2; i++) {
            for(int j=rect1_y1; j<rect1_y2; j++) {
                if (arr[i][j] > 0) {
                    maxX = Math.max(maxX, i);
                    minX = Math.min(minX, i);
                    maxY = Math.max(maxY, j);
                    minY = Math.min(minY, j);
                    check = true;
                }

                if (!check) {
                    minX = 0;
                    minY = 0;
                }
            }
        }

        System.out.print((maxX-minX+1) * (maxY-minY+1));
    }
}