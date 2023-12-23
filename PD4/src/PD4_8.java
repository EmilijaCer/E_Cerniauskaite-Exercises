import java.util.Scanner;

public class PD4_8 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra pirmadienį ");
        int p = scanNumbers1.nextInt();
        System.out.println(p);

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra antradienį ");
        int a = scanNumbers2.nextInt();
        System.out.println(a);

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra trečiadienį ");
        int t = scanNumbers3.nextInt();
        System.out.println(t);

        Scanner scanNumbers4 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra ketvirtadienį ");
        int k = scanNumbers4.nextInt();
        System.out.println(t);
;
        Scanner scanNumbers5 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra ketvirtadienį ");
        int pnk = scanNumbers5.nextInt();
        System.out.println(pnk);

        double savaite = p + a + t + k + pnk;
        System.out.println("Paskaitų skaičius per savaitę -" + " " + savaite);

        double minutes = savaite * 45;
        System.out.println("Tai sudaro" + " " + minutes + " " + "minučių");

    }
}
