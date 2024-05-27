import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        double avg;

        for(int i=0; i<n; i++){
            int k = scanner.nextInt();
            sum += k;
        }

        avg = (double)sum / n;

        System.out.printf("%d %.1f", sum, avg);
    }
}