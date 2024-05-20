package QA27_2_7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isContinue = true;
        while (isContinue) {
        System.out.println("Введите целое положительное число n ");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(second);
        int i = 1;
        while (i<=n) {
            int x = first + second;
            first = second;
            second = x;
            System.out.println(x);
            i= i+1;
        }
        System.out.println("Хотите ли вы продолжить?");
        isContinue = scanner.nextBoolean();
    }
}
}