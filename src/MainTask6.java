
public class MainTask6 {
    public static void main(String[] args) {
        int bananasWeight = 5 * 80;
        double milkWeight = (200.0 / 100.0) * 105.0;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        double totalGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalKilograms = totalGrams / 1000;

        System.out.println("Вес завтрака: " + totalGrams + " грамм или " + totalKilograms + " кг");
    }
}