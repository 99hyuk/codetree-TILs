import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}