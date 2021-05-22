package appline;

import java.util.Scanner;

public class MathMeanOfArrayElements {
    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        double[] Array = new double[size];
        System.out.println("Введите элементы массива");
        double sum = 0;

        for ( int i=0 ; i < size; i++) {
            Array[i] = scan.nextDouble();
            sum += Array[i];
        }
        double MathMean = sum / size;
        System.out.println("Измененный массив:");

        for (double num : Array) {
            System.out.print(" " + (num * MathMean));

        }

    }
}
