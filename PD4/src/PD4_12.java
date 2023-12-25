import java.util.Scanner;

public class PD4_12 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Kiek žuvų gyvena akvariume? ");
        int zuvuSkaicius = scanNumbers1.nextInt();

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
        int zuvuPerDiena = scanNumbers2.nextInt();

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Kiek dienų praėjo? ");
        int dienu = scanNumbers3.nextInt();

        int kiekis = zuvuSkaicius + (zuvuPerDiena * zuvuPerDiena);

        System.out.println("Po" + " "+ "dienų akvariume gyvens"+ " " +kiekis+ " " + "žuvų.");
    }
}
