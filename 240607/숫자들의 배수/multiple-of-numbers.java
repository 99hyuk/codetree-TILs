import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print(n * (i+1) + " ");

            if((n * (i+1)) % 5 == 0 ){
                cnt++;
            }

            if(cnt == 2){
                break;
            }
        }
    }
}