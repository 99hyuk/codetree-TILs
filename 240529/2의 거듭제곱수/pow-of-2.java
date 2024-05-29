import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;

        while (n != 1){
            n /= 2;
            x++;
        }

        System.out.println(x);

    }
}