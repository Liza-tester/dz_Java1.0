package appline;

import java.util.Scanner;

public class SameNumbers {

    public static void main(String[] args) {

        double x = 5;
        double y =60;
        double z = -1.2;

        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        // Первый вариант решения
        double[] Array = new double[size];
        System.out.println("Введите элементы массива");

        for ( int i=0 ; i < size; i++) {
            Array[i] = scan.nextDouble();
        }
        for (double num : Array) {
            if (num == x || num == y || num == z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

        /*
        //Второй вариант решения


        double num;
        System.out.println("Введите элементы массива");

        for ( int i=0 ; i < size; i++) {
            num = scan.nextDouble();
            if (num == x || num == y || num == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
        */

    }
}
