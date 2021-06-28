import java.util.Scanner;

public class CSE215PracticeLab3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum, nums[] = new int[num], a, b = 0;
        for (a = 0; a < num; a++) {
            nums[a] = sc.nextInt();
        }
        a = 0;
        sum = sc.nextInt();
        while (a < num - 1) {
            while (++b < num) {
                if (sum - nums[a] == nums[b]) {
                    System.out.print("[" + a + "," + b + "]");
                    return;
                }
            }
            b = a++;
        }
    }
}