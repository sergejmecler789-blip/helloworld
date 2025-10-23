package hw4;

public class Task6 {
    public static void main(String[] args) {
        int passengers = 102;

        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers < 102) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
}