import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt=0;
        int div = n;

        for(int i=1; i<n; i++){
            div /= i;
            cnt++;
            if(div <= 1){
                System.out.println(cnt);
                break;
            }
        }
    }
}