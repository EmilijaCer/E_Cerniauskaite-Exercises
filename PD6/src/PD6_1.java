import java.util.Arrays;

public class PD6_1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, -10}; //masyvas
        int[] clonedArray = new int[originalArray.length]; //kuriam nauja dezute su tokiu maciu masyvo dydziu
        for (int i = 0; i <originalArray.length; i++){
            clonedArray[i] = originalArray[i]; //int i=0 kopijuojame nuo pradzios, is vienos dezutes paimam ideda
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(clonedArray));

    }
}
/**
 * Parašykite programą, kuri kopijuoja masyvą.
 */
