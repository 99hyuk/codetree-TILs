import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String n = scanner.next();
            System.out.println(a * b);
            
            if(n.equals("C")){     
                break;
            }
        }
    }
}