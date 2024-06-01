import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 1;
        int sum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0){
                    System.out.print(cnt + " ");
                    cnt++;
                    sum = cnt;
                } else{
                    System.out.print((sum + n - j - 1 + " "));
                    cnt++;
                }
            }
            
            System.out.println();
        }
    }
}