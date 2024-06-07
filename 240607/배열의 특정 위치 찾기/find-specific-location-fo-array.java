import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum_3 = 0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 1){
                sum += arr[i];
            }

            if(i % 3 == 2){
                sum_3 += arr[i];
            }
        }

        double avg = (double)sum_3 / 3;

        System.out.printf("%d %.1f", sum, avg);
    }
}