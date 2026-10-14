public class MainTask1 {
    public static void main(String[] args) {

        // Task 1
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;

        double[] fractionalArray = {1.57, 7.654, 9.986};

        int[] additionalArray = {4, 5, 6};

        // Task 2
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractionalArray.length; i++) {
            System.out.print(fractionalArray[i]);
            if (i < fractionalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < additionalArray.length; i++) {
            System.out.print(additionalArray[i]);
            if (i < additionalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("---------------------------");

        // Task 3
        for (int i = integerArray.length - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractionalArray.length - 1; i >= 0; i--) {
            System.out.print(fractionalArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = additionalArray.length - 1; i >= 0; i--) {
            System.out.print(additionalArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 4
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0 && i < integerArray.length) {
                integerArray[i] += 1;
            }
        }

        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
