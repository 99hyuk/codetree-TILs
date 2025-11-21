import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int count = 0;
        boolean isTrue = true;
        char start = grid[0][0];
        for (int i=1; i<R; i++) {
            for (int j=1; j<C; j++) {
                if (grid[i][j] != start) {
                    char point1 = grid[i][j];
                    for (int k=i+1; k<R; k++) {
                        for (int p=j+1; p<C; p++) {
                            if (grid[k][p] != point1) {
                                char point2 = grid[k][p];
                                for (int z=k+1; z<R; z++) {
                                    for (int x=p+1; x<C; x++) {
                                        if (grid[z][x] != point2) {
                                            if (z == R-1 && x == C-1){
                                                count++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }
            }
        }
        System.out.print(count);
    }
}