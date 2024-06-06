import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();

        double[] arr = new double[8];
        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt++;
        }

        double avg = sum / cnt;
        System.out.printf("%.1f\n", avg);
    }
}