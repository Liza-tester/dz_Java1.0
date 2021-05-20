package appline;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        byte x = scan.nextByte();
        byte y;
        float num;

        switch (x){
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                y = scan.nextByte();
                System.out.println("Введите число");
                num = scan.nextFloat();
                System.out.println("Результат:");

                switch (y){
                    case 1:
                        System.out.println("Метры : " + num);
                        System.out.println("Мили : " + (num * 0.0006));
                        System.out.println("Ярды : " + (num * 1.0936));
                        System.out.println("Футы : " + (num * 3.2808));
                        break;
                    case 2:
                        System.out.println("Метры : " + (num * 1609.34));
                        System.out.println("Мили : " + num);
                        System.out.println("Ярды : " + (num * 1760));
                        System.out.println("Футы : " + (num);
                        break;
                    case 3:
                        System.out.println("Метры : " + num);
                        System.out.println("Мили : " + num);
                        System.out.println("Ярды : " + num);
                        System.out.println("Футы : " + num);
                        break;
                    case 4:
                        System.out.println("Метры : " + num);
                        System.out.println("Мили : " + num);
                        System.out.println("Ярды : " + num);
                        System.out.println("Футы : " + num);
                        break;
                    default:
                        System.out.println("Введен некорректный запрос!");
                }
                break;
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - карат, 4 - унция");
                y = scan.nextByte();
                System.out.println("Введите число");
                num = scan.nextFloat();
                System.out.println("Результат:");

                switch (y){
                    case 1:
                        System.out.println("Килограммы : " + num);
                        System.out.println("Фунты : " + num);
                        System.out.println("Караты : " + num);
                        System.out.println("Унции : " + num);
                        break;
                    case 2:
                        System.out.println("Килограммы : " + num);
                        System.out.println("Фунты : " + num);
                        System.out.println("Караты : " + num);
                        System.out.println("Унции : " + num);
                        break;
                    case 3:
                        System.out.println("Килограммы : " + num);
                        System.out.println("Фунты : " + num);
                        System.out.println("Караты : " + num);
                        System.out.println("Унции : " + num);
                        break;
                    case 4:
                        System.out.println("Килограммы : " + num);
                        System.out.println("Фунты : " + num);
                        System.out.println("Караты : " + num);
                        System.out.println("Унции : " + num);
                        break;
                break;
            default:
                System.out.println("Введен некорректный запрос!");
        }
    }
}
