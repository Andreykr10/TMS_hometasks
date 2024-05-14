package QA27_2_1;

import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int month = in.nextInt();
        switch (month){
            case 1:
                System.out.println("Месяц: январь. Пора года: зима.");
                break;
            case 2:
                System.out.println("Месяц: февраль. Пора года: зима.");
                break;
            case 3:
                System.out.println("Месяц: март. Пора года: весна.");
                break;
            case 4:
                System.out.println("Месяц: апрель. Пора года: весна.");
                break;
            case 5:
                System.out.println("Месяц: май. Пора года: весна.");
                break;
            case 6:
                System.out.println("Месяц: июнь. Пора года: лето.");
                break;
            case 7:
                System.out.println("Месяц: июль. Пора года: лето.");
                break;
            case 8:
                System.out.println("Месяц: август. Пора года: лето.");
                break;
            case 9:
                System.out.println("Месяц: сентябрь. Пора года: осень.");
                break;
            case 10:
                System.out.println("Месяц: октябрь. Пора года: осень.");
                break;
            case 11:
                System.out.println("Месяц: ноябрь. Пора года: осень.");
                break;
            case 12:
                System.out.println("Месяц: декабрь. Пора года: зима.");
                break;
            default:
                System.out.println("В году 12 меяцев а не "+month);
        }
    }
}
