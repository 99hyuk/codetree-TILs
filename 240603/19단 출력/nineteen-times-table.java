import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                if(j % 2 == 1){
                    System.out.print(i + " * " + j + " = " + i*j);
                } else{
                    System.out.println(" / " + i + " * " + j + " = " + i*j);
                }
            }
            System.out.println();
        }
    }
}