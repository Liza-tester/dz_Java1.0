package appline;
import java.util.Scanner;

public class ArchVirus {

    public static void main(String[] args) {

        System.out.println("Угадай загадку!!!\n\nСидит дед, во сто шуб одет, \nкто его раздевает, тот слезы проливает");

        Scanner scan = new Scanner(System.in);

        byte count = 0;
        String realResp;

        while (count < 3) {
            System.out.println("\nНапиши отгадку!");
            realResp = scan.nextLine().toLowerCase();

            switch (realResp) {
                case "заархивированный вирус":
                    System.out.println("\nПравильно!");
                    count+=3;
                    break;
                case "подсказка":
                    if (count==0){
                        System.out.println("\nДед ненастоящий...");
                        count+=2; }
                    else {System.out.println("\nПодсказка уже недоступна");}
                    break;
                default:
                    if (count==2) {
                        System.out.println("\nОбидно, приходи в другой раз");}
                    else {System.out.println("\nПодумай еще!");}
                    count++;
                    break;
            }
        }
    }
}

