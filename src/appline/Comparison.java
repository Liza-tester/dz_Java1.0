package appline;

import java.util.Scanner;
import java.lang.Math;

public class Comparison {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.nextLine();

        System.out.println("Введите второе число");
        int secondInt = scan.nextInt();

        double max = Math.max(Double.valueOf(firstStr), Double.valueOf(secondInt));
        System.out.println("Max = " + max);

        double min = Math.min(Double.valueOf(firstStr), Double.valueOf(secondInt));
        System.out.println("Min = " + min);


    }
}
