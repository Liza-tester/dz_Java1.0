package appline;
import java.util.Locale;
import java.util.Scanner;

public class ILikeJava {
    public static void main(String[] args) {
        System.out.println("input line" );
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        // Строка для проверки без ввода с клавиатуры:
        //String line = "I like Java!!!";

        boolean one = line.contains("Java");
        boolean two = line.startsWith("I like");
        boolean three = line.endsWith("!!!");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        if (one && two && three){
            System.out.println(line.toUpperCase());

            line = line.replace("a", "o");
            System.out.println(line.substring(7, 11));
        }
        else{
            System.out.println("ERROR: Unexpected line");
        }
    }
}
