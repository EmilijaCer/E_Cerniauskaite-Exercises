import java.util.Arrays;

public class PD6_11 {
    public static void main(String[] args) {
        int[] originalArray = {1,1,3,-3, 2, 3,3, 4, 5, -10, 3};

        Arrays.sort(originalArray);

        System.out.println("full sorted array: " + Arrays.toString(originalArray));
        System.out.println("3rd smallest: " + originalArray[2]);
    }
}
/**
 * Parašykite programą, kuri paima skaičių masyvą ir grąžina trečią mažiausią masyvo skaičių
 */