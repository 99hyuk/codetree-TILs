import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        for(int i=1; i<=n1; i++){
            for(int j=1; j<=n2; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

        

    }
}