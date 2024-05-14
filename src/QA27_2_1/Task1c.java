package QA27_2_1;

import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 6");
        int month = in.nextInt();
        if (month>=1 && month<=6){
            if (month == 1){
                System.out.println("Январь");
            }
            if (month == 2){
                System.out.println("Февраль");
            }
            if (month == 3){
                System.out.println("Март");
            }
            if (month == 4){
                System.out.println("Апрель");
            }
            if (month == 5){
                System.out.println("Май");
            }
            if (month == 6){
                System.out.println("Июнь");
            }
            }else
            System.out.println("В полугодии 6 месяцев а не "+month);

    }
}
