
public class MainTask7 {
    public static void main(String[] args) {
        int weightToLoseKg = 7;
        int weightToLoseGrams = weightToLoseKg * 1000;
        int minLossPerDay = 250;
        int maxLossPerDay = 500;
        int daysMinLoss = weightToLoseGrams / minLossPerDay;
        int daysMaxLoss = weightToLoseGrams / maxLossPerDay;
        int averageLossPerDay = (minLossPerDay + maxLossPerDay) / 2;
        int daysAverage = weightToLoseGrams / averageLossPerDay;

        System.out.println("Для похудения на " + weightToLoseKg + " кг:");
        System.out.println("При потере веса 250 грамм в день: " + daysMinLoss + " дней");
        System.out.println("При потере веса 500 грамм в день: " + daysMaxLoss + " дней");
        System.out.println("В среднем потребуется: " + daysAverage + " дней");





    }
}