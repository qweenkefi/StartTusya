import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int step = 0, personX, personY;
       int personLive= 3;
       int sizeBoard = 5;
       personX = 1 + sizeBoard / 2;
       personY = 1 + sizeBoard / 2;
        step += 1;
        String person = "@";
        String monster = "*";
        String gamingField = " + - + - + - +\n"
                + "|   |   |   | \n"
                + " + - + - + - +\n"
                + "|   | " + monster + " |   |\n"
                + " + - + - + - +\n"
                + "|   " + person + " |   |   |\n"
                + " + - + - + - +";
        System.out.println(gamingField);
        String begin = "|   | |";
        String end = "|   |";
        System.out.println(begin + monster + end);

        System.out.println("Начинаем?");
        Scanner sc2 = new Scanner(System.in);
        String answer = sc2.nextLine();
        if (answer.equals("Да")) {
            System.out.println("Класс");
        } else  if (answer.equals("Нет")) {
            System.out.println("Нет?");
            System.out.println("Ну, в следующий раз");
        } else {
            System.out.println("Я так не понимаю (");
        }
        System.out.println("Ну мы начнём");
        System.out.println("Количество жизней " + personLive);
        System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
        System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");
        int x = sc2.nextInt();
        int y = sc2.nextInt();
        if (x !=personX) {
            if (y != personY) {
                System.out.println("Некорректный ход");
            }
        }

        }


    }
