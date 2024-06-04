import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char alp = 'A';

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(alp);
                int k = (int)++alp;
                alp = (char)k;
            }
            System.out.println();
        }
    }
}