import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n*2 + 1; i++){
            for(int j=0; j<n*2 + 1; j++){
                if(i%2==0 || j%2==0){
                    System.out.print("* ");
                } 
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}