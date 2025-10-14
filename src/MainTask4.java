
public class MainTask4 {
    public static void main(String[] args) {
        byte countPerMinute = 16 / 2;

        System.out.println("За 20 минут машина произвела " + countPerMinute * 20 + " штук бутылок");
        System.out.println("В сутки машина произвела " + countPerMinute * 60 * 24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + countPerMinute * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За месяц  машина произвела " + countPerMinute * 60 * 24 * 30 + " штук бутылок");
    }
}