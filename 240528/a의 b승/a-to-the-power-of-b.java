import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sa = a;

        for (int i=0; i<b-1; i++){
            a *= sa;
        }

        System.out.println(a);

    }
}