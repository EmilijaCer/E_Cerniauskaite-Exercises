import java.util.Arrays;
import java.util.Random;

public class PD6_9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Random random = new Random(); //inicializuojam objekta
        for (int i = numbers.length -1; i > 0 ; i--) {
            int indexRnd = random.nextInt(i+1);
            //swap numbers
            int tmp = numbers [i]; //issisaugajm reiksme ktoje dezuteje
            numbers [i] = numbers [indexRnd];
            numbers[indexRnd] = tmp;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
/**
 * Parašykite programą, kuri sumaišo masyvo elementus.
 */

