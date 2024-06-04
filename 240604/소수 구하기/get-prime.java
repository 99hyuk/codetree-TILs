import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int sum = 0;
            boolean b = false;

            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    b = true;
                    break;
                }
            }

            if(b){
                continue;
            } else{
                System.out.print(i+" ");
            }
        }
    }
}