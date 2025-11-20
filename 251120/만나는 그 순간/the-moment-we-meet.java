import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Please write your code here.
        Move[] A = new Move[n];
        Move[] B = new Move[m];

        for (int i=0; i<n; i++) {
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            A[i] = new Move(time, dir);
        }

        for (int i=0; i<m; i++) {
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            B[i] = new Move(time, dir);
        }

        int[] posA = new int[1000];
        int cntA = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<A[i].time; j++) {
                if (A[i].dir == 'L') {
                    posA[cntA++] = -1;
                } else {
                    posA[cntA++] = 1;
                }
            }
        }

        int[] posB = new int[1000];
        int cntB = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<B[i].time; j++) {
                if (B[i].dir == 'L') {
                    posB[cntB++] = -1;
                } else {
                    posB[cntB++] = 1;
                }
            }
        }

        int ap = 0;
        int bp = 0;
        boolean check = false;
        for (int t=0; t<=1000; t++) {
            ap += posA[t];
            bp += posB[t];
            if (ap == bp) {
                System.out.print(t+1);
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.print(-1);
        }
    }
}

class Move {
    int time;
    char dir;

    public Move(int time, char dir) {
        this.time = time;
        this.dir = dir;
    }
}