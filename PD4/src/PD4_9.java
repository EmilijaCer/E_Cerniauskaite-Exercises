import java.util.Scanner;

public class PD4_9 {
    public static void main(String[] args) {
  Scanner scannner = new Scanner(System.in);

        System.out.println("Iveskite, sienos ilgis m: ");
        String ilgis = scannner.nextLine();

        System.out.println("Iveskite, sienos aukštis m: ");
        String aukstis = scannner.nextLine();

        System.out.println("Iveskite, Plytos kaina Eur: ");
        String kaina = scannner.nextLine();
        System.out.println(kaina);

        int ilgis1 = Integer.parseInt(ilgis);
        int aukstis1 = Integer.parseInt(aukstis);
        double kaina1 = Double.valueOf(kaina);

        int s = (ilgis1 * aukstis1)*10000;
        int kiekis = s / (20*10);

        System.out.println("Plytų kiekis" + " " + kiekis);

        double kainuos = kiekis * kaina1;
        System.out.println("Plytos kainuos" + " " +kainuos+ " " + "Eur");


    }
}
