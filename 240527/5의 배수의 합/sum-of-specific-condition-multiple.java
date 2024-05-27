import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        if( a > b ){
            int temp = b;
            b = a;
            a = temp;
        }

        for(int i=a; i<=b; i++){
            if(i % 5 == 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }
}