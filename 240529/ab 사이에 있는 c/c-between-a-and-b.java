import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean satisfied = false;

        for(int i=a; i<=b; i++){
            if(i % c == 0){
                satisfied = true;
            }
        }

        if(satisfied == true){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}