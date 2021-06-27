import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(womensAge(n));
    }

    public static String womensAge(int n) {
        return n + "? That's just "+ (20+ n % 2) + ", in base " + n / 2 + "!";
    }

}