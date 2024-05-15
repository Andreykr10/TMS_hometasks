package QA27_2_2;

import java.util.Scanner;

public class Task2 {
    final private static double HIGHT_TEMPERATURE = -5;
    final private static double LOW_TEMPERATURE = -20;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру");
        int temperature = in.nextInt();
        if (temperature > HIGHT_TEMPERATURE) {
            System.out.println("Тепло");
        }
        if (HIGHT_TEMPERATURE >= temperature && temperature > LOW_TEMPERATURE) {
            System.out.println("Нормально");
        }
        if (LOW_TEMPERATURE >= temperature) {
            System.out.println("Холодно");
        }


    }
}