public class While {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;

        while (x < 10) {// проверяем истину условия
            System.out.println(x ++  + "X больше -1");
            // можно также ++ перед х,тогда подсчет будет от 1 до 9,а не от 0
  //          Thread.sleep(50);

        } // возвращаемся к проверке
/// после break мы будем тут

        for(int i = 0;i < 15;i += 2) // i ++ прибавление к i задаёт шаг
            System.out.println("I =" + i);

        String[] array = new String[10];
        array[9] = "Mm";
        array[8] = "Mm";
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }


    }




}




