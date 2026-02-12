import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 300;
        int z = 250;
        int sum = x + y;
        System.out.println("hello world");
        System.out.println(sum);
        System.out.println(y + z);
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя?");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Какое сегодня число?");
        Scanner sc1 = new Scanner(System.in);
        int date = sc1.nextInt();
        System.out.print("Много...");

        String person = "hero";
        String monster = "monst";
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
        System.out.println("");




    }
}
