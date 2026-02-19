import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int step = 0, personX, personY;
        int personLive = 3;
        int sizeBoard = 5;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
        String castle = "\\uD83C\\uDFF0";
        int castleY = 1;
        Random random = new Random();
        int castleX = 1 + random.nextInt(sizeBoard);
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
        switch (answer) {
            case "ДА":
                System.out.println("Выбери уровень сложности(От 1 до 5):");
                int difficultGame = sc2.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);
                break;
            case "НЕТ":
                System.out.println("Жаль, приходи ещё!");
                break;
            default:
                System.out.println("Данные введены некорректно");
        }
        System.out.println("Ну мы начнём");
        System.out.println("Количество жизней " + personLive);
        System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
        System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");
        int x = sc2.nextInt();
        int y = sc2.nextInt();

        if (x != personX && y != personY) {
            System.out.println("Некорректный ход");
        } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
            personX = x;
            personY = y;
            step += 1;
            System.out.println("Ход корректный; Новые координаты: " +
                    personX + ", " + personY + "\nХод номер: " + step);
        } else {
            System.out.println("Координаты не изменены");
            while (true) {
                if (personLive <= 0) {
                    break;
                }
            }
            System.out.println("Закончились жизни");


        }
        for (int counterY = 1; counterY < sizeBoard; counterY += 1) {

        }
        for (int y = 1; y <= sizeBoard; y++) {
            for (int x = 1; x <= sizeBoard; x++) {
            }
        }
    }

}







