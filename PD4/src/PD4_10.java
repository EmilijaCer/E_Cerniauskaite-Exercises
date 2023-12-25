import java.util.Scanner;

public class PD4_10 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius: ");
        int kiekis = scanNumbers1.nextInt();
        int kiekisDezeje = 3;

        int deziuKiekis = kiekis / kiekisDezeje;
        System.out.println("Pilnų dėžučių skaičius:" + " " + deziuKiekis);

        int likutis = kiekis - (deziuKiekis * 3);
        System.out.println("Nesupakuotų puodelių skaičius:" + " " + likutis);
    }
}
