import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean satisfied = false;

        for(int i=2; i<=(n-1); i++){
            if(n % i == 0){
                satisfied = true;
            }
        }

        if(satisfied == true){
            System.out.println("C");
        } else{
            System.out.println("N");
        }

    }
}