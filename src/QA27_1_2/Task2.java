package QA27_1_2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task2 {
    public static void main(String[] args) {
        int radius = 16;
        boolean isCurve = false;
        System.out.println("Зимний радиус = "+radius);
        System.out.println ("Кривое? = "+isCurve);
        Scanner in = new Scanner(System.in);
        System.out.print("Летний радиус колес = ");
        radius = in.nextInt();
        System.out.println("Радиус = "+radius);
        System.out.println("Новые колеса кривые? = ");
        isCurve = in.nextBoolean();
        System.out.println("Кривое? = "+isCurve);
        System.out.println("Хорошего дня!");
    }
}