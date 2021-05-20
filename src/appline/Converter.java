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
                        System.out.println("Мили : " + (num * 0.00062));
                        System.out.println("Ярды : " + (num * 1.09361));
                        System.out.println("Футы : " + (num * 3.28084));
                        break;
                    case 2:
                        System.out.println("Метры : " + (num * 1609.34));
                        System.out.println("Мили : " + num);
                        System.out.println("Ярды : " + (num * 1760));
                        System.out.println("Футы : " + (num * 5280));
                        break;
                    case 3:
                        System.out.println("Метры : " + (num * 0.9144));
                        System.out.println("Мили : " + (num * 0.00057));
                        System.out.println("Ярды : " + num);
                        System.out.println("Футы : " + (num * 3));
                        break;
                    case 4:
                        System.out.println("Метры : " + (num * 0.3048));
                        System.out.println("Мили : " + (num * 0.00019));
                        System.out.println("Ярды : " + (num * 0.33333));
                        System.out.println("Футы : " + num);
                        break;
                    default:
                        System.out.println("Введен некорректный запрос!");
                }
                break;
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стон, 4 - унция");
                y = scan.nextByte();
                System.out.println("Введите число");
                num = scan.nextFloat();
                System.out.println("Результат:");

                switch (y){
                    case 1:
                        System.out.println("Килограммы : " + num);
                        System.out.println("Фунты : " + (num * 2.20462));
                        System.out.println("Стоны : " + (num * 0.15747));
                        System.out.println("Унции : " + (num * 35.274));
                        break;
                    case 2:
                        System.out.println("Килограммы : " + (num * 0.45359));
                        System.out.println("Фунты : " + num);
                        System.out.println("Стоны : " + (num * 0.07143));
                        System.out.println("Унции : " + (num * 16));
                        break;
                    case 3:
                        System.out.println("Килограммы : " + (num * 6.35029));
                        System.out.println("Фунты : " + (num * 14));
                        System.out.println("Стоны : " + num);
                        System.out.println("Унции : " + (num * 224));
                        break;
                    case 4:
                        System.out.println("Килограммы : " + (num * 0.02835));
                        System.out.println("Фунты : " + (num * 0.625));
                        System.out.println("Стоны : " + (num * 0.00446));
                        System.out.println("Унции : " + num);
                        break;
                    default:
                        System.out.println("Введен некорректный запрос!");
                }
                break;
            default:
                System.out.println("Введен некорректный запрос!");
        }
    }
}
