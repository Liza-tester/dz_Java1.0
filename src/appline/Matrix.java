package appline;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        System.out.println("Введите размерность матрицы в формате 'строки столбцы'");
        Scanner scan = new Scanner(System.in);
        int size_a = scan.nextInt();
        int size_b = scan.nextInt();
        double[][] Matrix = new double[size_a][size_b];
        System.out.println("Введите матрицу");

        for (int i = 0; i < size_a; i++){
            for (int j = 0; j < size_b; j++){
                Matrix[i][j] = scan.nextDouble();
            }
        }
        System.out.println("Первая строка, умноженная на 3:");
        for (double element : Matrix[0] ){
            System.out.print((element * 3) + " ");
        }

    }
}
