import java.util.Scanner;

public class PD5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek dalyvavo bėgikų: ");
        int begikuSkaicius = scanner.nextInt();

        double begikuLaikas = 0;
        int geriausiasLaikas = 0;
        int number = 0;
        for (int i = 1; i <= begikuSkaicius ; i++) {
            number += 1;
            System.out.println("Įveskite" + " " + number + " " + " bėgiko laiką:");
            int begikoLaikas = scanner.nextInt();
            if (geriausiasLaikas == 0) {
                geriausiasLaikas = begikoLaikas;
            }
            else if (geriausiasLaikas > begikoLaikas) {
                geriausiasLaikas = begikoLaikas;
            }
            begikuLaikas += begikoLaikas;
        }
        double begikuLaikoVidurkis = begikuLaikas/begikuSkaicius;
        System.out.println("Bėgikų vidurkis:" + " " +  begikuLaikoVidurkis + " s.");
        System.out.println("Greičiausio bėgiko laikas:" + " " + geriausiasLaikas + " " + "sek.");
        System.out.println ("Jis buvo:" + " " +  (begikuLaikoVidurkis - geriausiasLaikas) + " sek geresnis už vidurkį.");
        }
    }