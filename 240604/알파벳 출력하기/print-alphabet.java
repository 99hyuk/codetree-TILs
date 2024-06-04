import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char cnt = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(cnt);
                if(cnt == 'Z'){
                    cnt = 'A';
                }
                cnt++;
            }
            System.out.println();
        }
    }
}