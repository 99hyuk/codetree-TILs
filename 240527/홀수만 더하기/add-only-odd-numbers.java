import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            int t = scanner.nextInt();
            if ((t % 2 == 1) && (t % 3 == 0)){
                sum += t;
            }
        }

        System.out.println(sum);
    }
}