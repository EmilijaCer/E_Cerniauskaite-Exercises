import java.util.Scanner;

public class PD4_11 {
    public static void main(String[] args) {
           Scanner scanNumbers1 = new Scanner(System.in);
            System.out.println("Koks automobilio greitis  km/h? ");
            double greitis = scanNumbers1.nextInt();


            double tunelioIlgis =  264;
            System.out.println(tunelioIlgis + " " + "m.");

            double laikas = (tunelioIlgis / ((greitis*1000)/3600));
            System.out.println("Automobilis tunelį pravažiuos per" + " " +String.format("%.2f", laikas) + " " + "s");
        }
    }
