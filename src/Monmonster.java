import java.util.Random;
import java.util.Scanner;

public class Monmonster extends Monster{
    private String image = " 0";
    Monmonster(int sizeBoard) {super(sizeBoard); }
    @Override
    public String getImage() {
        return image;
    }
    @Override
    public boolean taskMonster(int difficultGame) {
        Random r = new Random();
        if (difficultGame == 1) {
            return taskMonster();}
        System.out.println("Ответьте на вопрос:");
        System.out.println("Какое число я загадал от 0 до 10?");
        int number = (int)(Math.random() * ((10 - 0) + 1)) + 0;
        int num = number;

        Scanner question = new Scanner(System.in);
        int answer = question.nextInt();
        if (num == answer) {
            System.out.println("Ого,проходи");
            return true;
        } else {
            System.out.println("Судьба тебе не благоволит.Ты проиграл эту битву. Правильный ответ:" + num);
            return false;


            }

        }

    public boolean taskMonster() {
        return super.taskMonster(0);
    }
}

