import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            arr[(n / 10) - 1]++;
        }

        for(int i=9; i>=0; i--){
            System.out.println((i+1)*10 + " - " + arr[i]);
        }


    }
}