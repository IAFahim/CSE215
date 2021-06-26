import java.util.Scanner;

public class CSE215Lab2Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Divisors of " + num + " are 1");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.print(".");
    }

}