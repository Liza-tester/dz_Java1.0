package appline;

import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {

        System.out.println("Введите уравнение");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int answer;

        if (line.startsWith("x+")){ // Случай : x+...=...
            answer = Character.getNumericValue(line.charAt(4))- Character.getNumericValue(line.charAt(2));
        }
        else if (line.startsWith("x")){ // Случай: x-...=...
            answer = Character.getNumericValue(line.charAt(4)) + Character.getNumericValue(line.charAt(2));
        }
        else if (line.contains("+x")){ // Случай: ...+x=...
            answer = Character.getNumericValue(line.charAt(4))- Character.getNumericValue(line.charAt(0));
        }
        else if (line.contains("-x")){ // Случай: ...-x=...
            answer = Character.getNumericValue(line.charAt(0))- Character.getNumericValue(line.charAt(4));
        }
        else if (line.contains("+")){ // Случай: ...+...=x
            answer = Character.getNumericValue(line.charAt(0))+ Character.getNumericValue(line.charAt(2));
        }
        else { // Случай: ...-...=x
            answer = Character.getNumericValue(line.charAt(0))- Character.getNumericValue(line.charAt(2));

        }

        System.out.println("Ответ: x = " + answer);
        }

    }

