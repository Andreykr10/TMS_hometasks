package QA27_2_7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Введите целое положительное число n ");
            int n = scanner.nextInt();
            int first = 0;
            int second = 1;
            System.out.println(second);
            for (int i = 2; i<=n; i++) {
                int x = first + second;
                first = second;
                second = x;
                System.out.println(x);
            }
            System.out.println("Хотите ли вы продолжить?");
            isContinue = scanner.nextBoolean();
        }
    }
}