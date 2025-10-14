
public class MainTask5 {
    public static void main(String[] args) {
        byte paintCount = 120;
        byte whitePaintCans = 2;
        byte brownPaintCans = 4;
        int numberOfClasses = paintCount / (whitePaintCans + brownPaintCans);

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно банок белой краски " + numberOfClasses * whitePaintCans + " и банок коричневой краски " + numberOfClasses * brownPaintCans + "");
    }
}