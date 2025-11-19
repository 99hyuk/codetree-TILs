import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.

        Distance[] distance = new Distance[n];
        for (int i=0; i<n; i++) {
            distance[i] = new Distance(points[i][0], points[i][1], i+1);
        }

        Arrays.sort(distance);

        for (int i=0; i<n; i++) {
            System.out.println(distance[i].num);
        }

    }
}

class Distance implements Comparable<Distance>{
    int x,y,num;

    public Distance(int x, int y, int num) {
        this.x=x;
        this.y=y;
        this.num=num;
    }
    
    @Override
    public int compareTo(Distance distance) {
        if(x < 0) x = -x;
        if(y < 0) x = -y;
        if(distance.x < 0) distance.x = -distance.x;
        if(distance.y < 0) distance.y = -distance.y;

        int sum1 = x+y;
        int sum2 = distance.x + distance.y;

        if (sum1 == sum2) {
            return num - distance.num;
        } else {
            return sum1 - sum2;
        } 
    }
}