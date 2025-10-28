package hw6;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTask9 {
    public static void main(String[] args) {
        int monthlySavings = 29000;
        double totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings = totalSavings + monthlySavings;
            totalSavings = totalSavings + (totalSavings * 0.01);

            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int)totalSavings + " рублей");
        }
    }
}
