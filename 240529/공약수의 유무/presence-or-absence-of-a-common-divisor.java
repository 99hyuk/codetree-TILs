import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean satisfied = false;

        for(int i=a; i<=b; i++){
            if((1920 % i == 0) && (2880 % i == 0)){
                satisfied = true;
            }
        }

        if(satisfied == true){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
        

    }
}