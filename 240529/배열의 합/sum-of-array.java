import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int[][] s = new int[4][4];

        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                s[i][j] = scanner.nextInt();
                sum += s[i][j];
            }
            System.out.println(sum);
        }
    }
}