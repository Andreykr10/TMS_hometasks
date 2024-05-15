package QA27_2_2;

import java.util.Scanner;

public class Task2 {
    final private static double MAX_TEMPERATURE = -5;
    final private static double MIN_TEMPERATURE = -20;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру");
        int temperature = in.nextInt();
        if (temperature > MAX_TEMPERATURE) {
            System.out.println("Тепло");
        }
        if (MAX_TEMPERATURE >= temperature && temperature > MIN_TEMPERATURE) {
            System.out.println("Нормально");
        }
        if (MIN_TEMPERATURE >= temperature) {
            System.out.println("Холодно");
        }


    }
}