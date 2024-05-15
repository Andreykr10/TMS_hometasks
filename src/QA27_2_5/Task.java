package QA27_2_5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число ");
        int x = in.nextInt();
        int sum = 0;
       if (x>0) {
           for (int i = 0; i <= x; i++) {
               sum = sum + i;
           }
           System.out.println(sum);
       } else {
           System.out.println("Число должно быть положительным а не " + x);
       }
    }
}
