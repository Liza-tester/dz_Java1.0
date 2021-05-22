package appline;

import java.util.Scanner;
import static java.lang.Math.round;

public class ConverterRubUsd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double RubToUsd = scan.nextDouble();
        if (RubToUsd <= 0){
            System.out.println("Введен некорректный курс");
        }
        else {
            System.out.println("Введите количество рублей");
            double Rub = scan.nextDouble();
            double Usd = Rub / RubToUsd;
            System.out.println("Итого : " + round(Usd * 100) / 100.00 + " долларов");
        }


    }
}
