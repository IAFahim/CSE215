import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n % 2) {
            case 0 -> System.out.println("EVEN");
            case 1 -> System.out.println("ODD");
        }
    }
}