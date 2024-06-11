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

            if(n < 10){
                continue;
            }

            arr[n / 10]++;
        }

        for(int i=1; i<=9; i++){
            System.out.println(i + " - " + arr[i]);
        }


    }
}