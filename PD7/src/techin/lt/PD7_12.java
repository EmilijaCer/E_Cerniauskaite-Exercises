
package techin.lt;

public class PD7_12 {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrimeNumber = isPrime(number);
        System.out.println(isPrimeNumber);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i < number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
/**
 * Parašykite Java metodą, kuris patikrina ar skaičius yra pirminis, ar ne.
 */
