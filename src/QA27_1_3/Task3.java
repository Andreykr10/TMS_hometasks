package QA27_1_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a,c,x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a = ");
        a=in.nextDouble();
        System.out.println("Введите c = ");
        c=in.nextDouble();
        x=10+c-a;
        System.out.println("x="+x);

    }
}
