import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        if(a%3 == 0 && b%3 == 0 && c%3 == 0 && d%3 == 0 && f%3 == 0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}