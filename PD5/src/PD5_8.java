import java.util.Scanner;

public class PD5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite kuro bako talpą: ");
        int talpa = scanner.nextInt();

        System.out.print("Įveskite kuro sąnaudas n: ");
        int sanaudos = scanner.nextInt();

        int likutis = talpa;
        int dienos = 0;

        while (likutis >= 0) {
            dienos++;
            likutis -= (dienos % 2 == 0) ? sanaudos  : sanaudos*2;
            //while, if ir užduotis padaryta
        }
        System.out.println("Keliauti bus galima " + (dienos) + " dienas.");
    }
}
