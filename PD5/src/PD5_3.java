import java.util.Scanner;

public class PD5_3 {
    public static void main(String[] args) {
        int i, number, count;

        System.out.println(" Prime Numbers : ");
        for(number = 1; number >= 1; number++) {
            count = 0;
            for (i = 2; i <= number/2; i++) {
                while (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1 ){
                System.out.print(number + " ");
            }
        }

    }
}
