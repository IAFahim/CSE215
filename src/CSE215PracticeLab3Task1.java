import java.util.Scanner;

public class CSE215PracticeLab3Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        double balance = sc.nextDouble();
        if (withdraw <= balance - .5 && withdraw % 5 == 0) {
            double afterBalance = (balance - .5 - withdraw);
            System.out.print(afterBalance + "0");
        } else {
            System.out.print(balance + "0");
        }
    }
}