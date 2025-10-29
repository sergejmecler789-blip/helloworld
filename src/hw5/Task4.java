package hw5;

public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 1");
        }
    }
}