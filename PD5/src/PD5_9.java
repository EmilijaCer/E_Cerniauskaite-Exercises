import java.util.Scanner;

public class PD5_9 {
    public static void main(String[] args) {

        int sum1=0;
        int sum2 = 0;
        int sum3 = 0;

        int number = 0;
        int autobusasVal = 0;
        int autobusasMin = 0;
        int keleiviai = 0;
        int d = 0;

        Scanner scannner = new Scanner(System.in);
        System.out.println("Įveskite kiek autobusų vyksta kasdien:");
        String autobusu = scannner.nextLine();
        int autobusuSk = Integer.parseInt(autobusu);

        for (int i = 0; i < autobusuSk; i++) {
            number += 1; // numeracija
            System.out.println(number + " " + " autobuso važiavimo laikas (val.):");
            autobusasVal = scannner.nextInt();
            System.out.println(number + " " + " autobuso važiavimo laikas (min.):");
            autobusasMin = scannner.nextInt();
            System.out.println(number + " " + "  autobusas perveža keleivių:");
            keleiviai = scannner.nextInt();

            sum1 += autobusasVal; //suma
            sum2 += autobusasMin;
            sum3 += keleiviai;
        }

        System.out.println("Bendrai pervežtų keleivių skaičius =" + " " + sum3);

        int vidurkis = ((sum1 * 60) + sum2) / autobusuSk;
        System.out.println("Vidutinis sugaištas važiavimo laikas (min.):" + " " + vidurkis);
        if (keleiviai <= 10) {
            d++; //Naujas kintamasis kuris kaupia skaiciu atubusu kuriuose <10
        }
        System.out.println("Autobusų skaičius (keleiviai < 10):" + d);
    }
}