package appline;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class LatinWords {

    public static void main(String[] args) {

        System.out.println("Введите строку");

        Scanner scan = new Scanner(System.in);
        String[] allWords = scan.nextLine().split(" ");

        // Строка для проверки:
       // String[] allWords = "I love java 8 Я люблю java 14 core1".split(" ");

        int count = 0; // Счетчик количества латинских слов
        boolean marker; // Индикатор наличия в слове невалидных символов

        for (String word : allWords){

            String[] newWord = word.split("");
            marker = true;

            for (String letter : newWord){

               if (letter.toLowerCase().compareTo("a") < 0 || letter.toLowerCase().compareTo("z") > 0) {
                   marker = false;
                   break;
               }
            }

            if (marker) {
                count += 1;
                System.out.println(word);
            }
        }
        System.out.println(count);

    }
}
