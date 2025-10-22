
public class Task5 {
    public static void main(String[] args) {
        int age = 15;

        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}