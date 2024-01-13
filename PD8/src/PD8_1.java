import java.util.Arrays;
import java.util.SortedMap;


    public class PD8_1 {
        public static void main(String[] args) {
            RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
            int [] myRandomNumbers = randomArrayGenerator.generateRandom(10);
            System.out.println(Arrays.toString(myRandomNumbers));
        }
    }

/**
 * Sukurkite klasę / objektą kuris moka generuoti atsitiktinių skaičių masyvą. Masyvo dydis yra
 * pateikiamas kaip argumentas.
 */
