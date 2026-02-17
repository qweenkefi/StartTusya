import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ответ");
        //        int x = scanner.nextInt();
        String answer = scanner.nextLine();
//        boolean condition = x > 0 && x < 10; //false, when x <= 0
        boolean condition = answer.equals("ДА");
        if (condition) {
            System.out.println("Вы меня увидите, если condition = TRUE");
        } else {
            if (answer.equals ("НЕТ")) {
                System.out.println("Вы ввели \"НЕТ\"");
            } else {
                System.out.println("Вы ввели что-то непонятное");
            }
        }
        System.out.println("Я открываюсь,когда condition = FALSE");
        System.out.println("Меня вы видите Всегда");
    }

}



