import java.util.Scanner;

public class CSE215Lab2Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean bool = isPrime(x);
        if (bool) {
            System.out.println(x + " is a Prime Number.");
        } else {
            System.out.println(x + " is not a Prime Number.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}