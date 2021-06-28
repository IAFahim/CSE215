import java.util.Scanner;

public class CSE215PracticeLab3Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = getSum(sc.nextInt());
            System.out.println(sum);
        }
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}