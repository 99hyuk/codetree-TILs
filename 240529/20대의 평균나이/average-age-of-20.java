import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while(true){
            int n = scanner.nextInt();
            if((n < 20) || (n >= 30)){
                break;
            }
            sum += n;
            cnt++;
        }

        double avg = (double)sum / cnt;
        System.out.printf("%.2f", avg);

    }
}