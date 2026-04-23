import java.util.*;

public class Main {
    static class Point implements Comparable<Point> {
        int r,c,t;
        Point(int r, int c ,int t) {
            this.r = r;
            this.c = c;
            this.t = t;
        }
        public int compareTo(Point o) {
            return this.t-o.t;
        }
    }
    static int dr[] = {1,0};
    static int dc[] = {0,-1};
    static int N, map[][];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
            }
        }


        System.out.print(bfs());
    }

    static int bfs() {
        int dist[][] = new int[N][N];
        for(int i=0; i<N; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[0][N-1] = map[0][N-1];
        PriorityQueue <Point> Q = new PriorityQueue<>();
        Q.offer(new Point(0,N-1,map[0][N-1]));

        while(!Q.isEmpty()) {
            Point p = Q.poll();
            if(dist[p.r][p.c] < p.t) continue;

            for(int i=0; i<2; i++) {
                int nr = p.r + dr[i];
                int nc = p.c + dc[i];

                if(nr <0 || nr >= N || nc <0 || nc >= N) continue;
                if(dist[nr][nc] > dist[p.r][p.c] + map[nr][nc]) {
                    dist[nr][nc] = dist[p.r][p.c] + map[nr][nc];
                    Q.offer(new Point(nr,nc,dist[nr][nc]));
                }
            }
        }
        return dist[N-1][0];
    }
}