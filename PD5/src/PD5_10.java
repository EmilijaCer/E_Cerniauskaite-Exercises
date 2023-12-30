import java.util.Scanner;

public class PD5_10 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("n = ");
        int start = scannner.nextInt();  // imties pradzia
        System.out.println("m = ");
        int end = scannner.nextInt(); // imties pabaiga

        for (int i = start; i <= end; i++) {
            if ((i % 3 == 0) && (i % 10 != 3)) {
                System.out.println(i);
            }
            
        }
    }
}
