package hw5;
public class Task3 {
    public static void main(String[] args) {
        int year = 4164;

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }
}