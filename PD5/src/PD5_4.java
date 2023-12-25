import java.util.Scanner;

public class PD5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        do {
            System.out.println("Iveskite skaiciu :" );
            n = scanner.nextInt();
            sum += n;
        }
        while (n != 0);
        System.out.println("Iveskite skaiciu suma:" + sum);

    }
}
