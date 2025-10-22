
public class Task6 {
    public static void main(String[] args) {
        int one = 1;
        int two = 5;
        int three = 9;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }

}