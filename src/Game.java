import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String person = "\uD83E\uDDD9\u200D";
        int step = 0, personX, personY;
        step += 1;
        int personLive = 3;

        String monster = "\uD83E\uDDDF\u200D";
        String castle = "\uD83C\uDFF0";
        int sizeBoard = 5;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;

        String leftblock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    | \uD83C\uDFE0 |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";

        String[][] board = new String[sizeBoard][sizeBoard];
        for (int y = 0; y < sizeBoard; y++) {
            for (int x = 0; x < sizeBoard; x++) {
                board[y][x] = "  ";
            }
        }

        int count_monster = sizeBoard * sizeBoard - sizeBoard - 1;
        Random random = new Random();
        for (int i = 0; i <= count_monster; i++) {
            board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
        }

        int castleX = 1 + random.nextInt(sizeBoard);
        int castleY = 1;

        board[castleY][castleX] = castle;

        System.out.println("Начинаем?");

        Scanner sc2 = new Scanner(System.in);
        String answer = sc2.nextLine();
        System.out.println("Ваш ответ:\t" + answer);


        switch (answer) {
            case "ДА":
                System.out.println("Выбери уровень сложности(От 1 до 5):");
                int difficultGame = sc2.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);

                int maxStep = 2;

                while (true) {
                    board[personY - 1][personX - 1] = person;


                    for (int y = 0; y < sizeBoard; y++) {
                        System.out.println(wall);
                        for (int x = 0; x < sizeBoard; x++) {
                            System.out.print(leftblock + board[y][x]);
                        }
                        System.out.println(rightBlock);
                    }
                    System.out.println(wall);


                    System.out.println("Количество жизней " + personLive);
                    System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
                    System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + ")");

                    int x = sc2.nextInt();
                    int y = sc2.nextInt();
                    System.out.println(x + "," + y);

                    if (x != personX && y != personY) {
                        System.out.println("Некорректный ход");

                    } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                        if (board[y - 1][x - 1].equals("  ")) {
                            board[personY - 1][personX - 1] = " ";
                            personX = x;
                            personY = y;
                            step++;
                            System.out.println("Ход корректный; Новые координаты: " +
                                    personX + ", " + personY + "\nХод номер: " + step);
                        } else if (board[y - 1][x - 1].equals(castle)) {
                            System.out.println("Вы прошли игру");
                            break;
                        } else {
                            System.out.println("Решите задачу");
                            int key = random.nextInt(2);
                            if (taskMonster(0)) {
                                board[personY - 1][personX - 1] = " ";
                                personX = x;
                                personY = y;
                            } else {
                                personLive--;
                            }

                        }
                    } else {
                        System.out.println("Координаты не изменены");
                    }
                    while (true) {
                        if (personLive == 0) { /* второй шанс */ }
                        int key = random.nextInt(2);
                        if (taskMonster(0)) {
                            board[personY - 1][personX - 1] = " ";
                            personX = x;
                            personY = y;
                        }else {
                            personLive--;
                        }

                        if (personLive < 0) {
                            break;
                        }
                    }
                    System.out.println("Закончились жизни");


                }
            case "НЕТ":
                System.out.println("Жаль, приходи ещё!");
                break;
            default:
                System.out.println("Данные введены некорректно");


        }
    }

    static boolean taskMonster(int key) {
        if (key == 1) {
            Random r = new Random();
            int x = r.nextInt(400);
            int y = r.nextInt(400);
            int trueAnswer = x + y;
            System.out.println("Реши пример: " + x + " + " + y + " = ?");
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt();
            if (trueAnswer == ans) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;

        } else {
                return  true;
        }

    }
}


