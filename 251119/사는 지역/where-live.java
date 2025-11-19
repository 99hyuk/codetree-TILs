import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        Address[] address = new Address[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            address[i] = new Address(names[i], addresses[i], regions[i]);
        }
        // Please write your code here.
        Arrays.sort(names);
        String finalName = names[n-1];

        for (int i = 0; i < n; i++) {
            if (address[i].name.equals(finalName)) {
                System.out.println("name" + " " + address[i].name);
                System.out.println("addr" + " " + address[i].addNum);
                System.out.println("city" + " " + address[i].region);
                break;
            }
        }
    }
}

class Address {
    String name;
    String addNum;
    String region;

    public Address(String name,String addNum, String region) {
        this.name = name;
        this.addNum = addNum;
        this.region = region;
    }
}