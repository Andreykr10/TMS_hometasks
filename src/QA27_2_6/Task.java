package QA27_2_6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите шаг ");
        int step = scanner.nextInt();
        System.out.println("Введите критическое значение ");
        int criticalValue = scanner.nextInt();

        if (firstNumber < criticalValue && step > 0) {
            for (int conclusion = firstNumber; conclusion <= criticalValue; conclusion += step)
                System.out.println(conclusion);
        } else {
            if (firstNumber > criticalValue && step < 0) {
                for (int conclusion = firstNumber; conclusion >= criticalValue; conclusion += step)
                    System.out.println(conclusion);
            } else {
                System.out.println("Введено неверное значение!");
            }

        }
    }
}