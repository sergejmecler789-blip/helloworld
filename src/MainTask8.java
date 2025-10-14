
public class MainTask8 {
    public static void main(String[] args) {
        double mashazp = 67760;
        double deniszp = 83690;
        double kristinazp = 76230;

        double mashazpnew = mashazp * 1.10;
        double deniszpnew = deniszp * 1.10;
        double kristinazpnew = kristinazp * 1.10;

        double mashagod = (mashazpnew - mashazp) * 12;
        double denisgod = (deniszpnew - deniszp) * 12;
        double kristinagod = (kristinazpnew - kristinazp) * 12;

        System.out.println("Маша теперь получает " + mashazpnew + " рублей. Годовой доход вырос на " + mashagod + " рублей.");
        System.out.println("Денис теперь получает " + deniszpnew + " рублей. Годовой доход вырос на " + denisgod + " рублей.");
        System.out.println("Кристина теперь получает " + kristinazpnew + " рублей. Годовой доход вырос на " + kristinagod + " рублей.");
    }

}