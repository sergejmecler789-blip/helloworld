package hw5;

public class Task5 {
    public static void main(String[] args) {
        int monthNumber = 13;

        switch (monthNumber) {
            case 9: case 10: case 11:
                System.out.println("Осенний сезон");
                break;
            case 3: case 4: case 5:
                System.out.println("Весенний сезон");
                break;
            case 6: case 7: case 8:
                System.out.println("Летний сезон");
                break;
            case 1: case 2: case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("Несуществующий месяц");
        }
    }
}