package appline;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        int n = scan.nextInt();

        if (n < 1) {
            System.out.println("Ошибка. Введено отрицательное число");
        }
        else {
            int sum = 0;
            // Вариант для суммы, не включающей число n
            for (int i=1; i < n; i+=2){
            /* // Вариант для суммы, влючающей число n
            for (int i=1; i <= n; i+=2){
             */
                sum += i;
            }
            System.out.println("Сумма нечетных чисел от 1 до " + n + " = " + sum);
        }
    }
}
