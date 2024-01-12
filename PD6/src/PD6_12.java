public class PD6_12 {
    public static void main(String[] args) {
        int[] originalArray = {1,1,3,-3, 2, 3,3, 4, 5, -10, 3};
        int negativesCount = 0;

        for(int i = 0; i < originalArray.length; i++){
            if(originalArray[i] < 0){
                negativesCount++;
            }
        }
        System.out.println(negativesCount);
    }
}
/**
 * Parašykite programą, kuri suskaičiuoja, kiek yra neigiamų skaičių duotame masyve.
 */