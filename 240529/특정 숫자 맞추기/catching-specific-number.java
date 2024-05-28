import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            if(n > 25){
                System.out.println("Lower");
            } else if(n < 25){
                System.out.println("Higher");
            } else{
                System.out.println("Good");
                break;
            }
        }

    }
}