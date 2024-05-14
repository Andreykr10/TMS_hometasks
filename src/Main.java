import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println ("Введите своё имя ");
        name = in.nextLine();
        System.out.println ("Добро пожаловать, "+name);

    }
}