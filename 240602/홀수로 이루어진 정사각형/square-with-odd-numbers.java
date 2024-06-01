import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 11;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((k+2*j) + " ");
            }
            k+=2;
            System.out.println();
        }

        

    }
}