package QA27_2_1;

import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int month = in.nextInt();
        if (month >= 1 && month <=12) {
            if (month>=3 && month<=5) {
                System.out.println("Весна");
            }else
            if (month>=6 && month<=8) {
                System.out.println("Лето");
            }else
                if (month>=9 && month<=11) {
                System.out.println("Осень");
                }else{
                System.out.println("Зима");
            }
        }
        else {
            System.out.println("В году 12 меяцев а не "+month);
        }
    }
}
