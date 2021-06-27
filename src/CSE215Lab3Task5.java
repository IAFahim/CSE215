public class CSE215Lab3Task5 {
    public static void main(String[] args) {
        boolean bool = false;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 0; j < i; j++) {
                if (bool) {
                    System.out.print('+');
                } else {
                    System.out.print('*');
                }
            }
            bool = !bool;
            System.out.println();
        }
    }
}