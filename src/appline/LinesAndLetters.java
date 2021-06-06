package appline;

import java.util.Scanner;

public class LinesAndLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scan.nextInt();
        System.out.println("Введите строки");
        int maxNumber = 0;
        String maxNumberLine = "";

        String trashline = scan.nextLine(); // Решает проблему пропуска строки
                                            // при использования nextLine() после nextInt()

        for (int i = 0; i < n; i++){
            String line = scan.nextLine();
            int sameLetters = (int)line.chars().distinct().summaryStatistics().getCount();
            if (maxNumber < sameLetters){
                maxNumber = sameLetters;
                maxNumberLine = line;
            }
        }
        System.out.println("Ответ: " + maxNumberLine);
    }
}
