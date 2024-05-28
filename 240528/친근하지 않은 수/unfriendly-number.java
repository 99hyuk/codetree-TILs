import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                continue;
            } else if(i%3 == 0){
                continue;
            } else if(i%5 == 0){
                continue;
            } else{
                sum++;
            }
        }
        System.out.println(sum);

    }
}