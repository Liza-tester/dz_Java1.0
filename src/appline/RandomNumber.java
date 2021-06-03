package appline;

import java.util.Random;
import java.lang.Math;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        Integer[] array = new Integer[15];

        for (int i = 0; i < 15; i++){
            array[i] = random.nextInt(41); // Верхняя граница интервала: 20 - (-20) + 1  = 41
            array[i] = array[i] - 20; // Сдвиг нижней границы с 0 до -20
        }
        System.out.print("Массив: \n");

        for (int number : array){
            System.out.print(number + " ");
        }

        int max = array[0];
        int min = array[0];

        for ( int i = 1; i < 15; i++){
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
                }
            }
        int maxAbs = Math.max(Math.abs(max), Math.abs(min));

        System.out.println("\n\nМаксимум: " + max);
        System.out.println("\nМинимум: " + min);
        System.out.println("\nНаибольшее по модулю\nиз максимума и минимума: " + maxAbs);
    }
}
