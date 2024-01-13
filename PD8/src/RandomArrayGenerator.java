import java.util.Random;

public class RandomArrayGenerator {
    public int[] generateRandom(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt();

        }
        return randomNumbers;
    }
}