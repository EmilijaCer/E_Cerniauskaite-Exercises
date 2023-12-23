import java.util.Scanner;

public class PD4_9 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Sienos ilgis m: ");
        int ilgis = scanNumbers1.nextInt() * 100;
        System.out.println(ilgis);

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Sienos aukštis m: ");
        int aukstis = scanNumbers2.nextInt() * 100;
        System.out.println(aukstis);

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Plytos kaina Eur: ");
        int kaina = scanNumbers3.nextInt();
        System.out.println(kaina);

        double plytosIlgis = 20;
        double plytosAukstis = 10;

        double kiekis = (ilgis * aukstis) / (plytosIlgis * plytosAukstis);
        System.out.println("Plytų kiekis" + " " + kiekis);

        double kainuos = kiekis * kaina;
        System.out.println("Plytos kainuos" + " " +kainuos+ " " + "Eur");


    }
}
