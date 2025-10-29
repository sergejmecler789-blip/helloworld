package hw6;

public class MainTask8 {
    public static void main(String[] args) {
        int monthlySavings = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
    }
}
