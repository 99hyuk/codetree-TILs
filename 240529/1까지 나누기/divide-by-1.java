import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt=0;

        for(int i=1; i<n; i++){
            n /= i;
            cnt++;
            if(n <= 1){
                System.out.println(cnt);
                break;
            }
        }
    }
}