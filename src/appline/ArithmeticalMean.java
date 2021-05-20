package appline;

import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите X");
        double x = scan.nextDouble();
        System.out.println("Введите Y");
        double y = scan.nextDouble();
        System.out.println("Введите Z");
        double z = scan.nextDouble();

        double ArMean = (x+y+z)/3;
        System.out.println("Arithmetical Mean = " + ArMean );

        ArMean = (ArMean/2*100 - (ArMean/2*100)%1)/100;

        String Result = (ArMean > 3) ?  "Программа выполнена корректно" : "";
        System.out.println(Result);
    }
}
