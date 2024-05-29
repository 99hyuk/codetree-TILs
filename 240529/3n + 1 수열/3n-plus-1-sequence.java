import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        while(true){
            if(n == 1){
                break;
            } else if(n % 2 == 0){
                n /= 2;
                cnt++;
            } else if(n % 2 == 1){
                n = n*3 + 1;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}