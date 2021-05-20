package appline;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scan.nextDouble();
        System.out.println("Введите второе число");
        double y = scan.nextDouble();
        System.out.println("Введите оператор ( + , - , / , *) ");
        String Operator = scan.next();

        switch (Operator) {
            case "+":
                System.out.println((x + y));
                break;
            case "-":
                System.out.println((x - y));
                break;
            case "*":
                System.out.println((x * y));
                break;
            case "/":
                if (y != 0) {
                    System.out.println((x / y));
                } else {
                    System.out.printf("\nДеление на 0");
                }
                break;
            default:
                System.out.println("Введен некорректный оператор");

        }

    }
}
