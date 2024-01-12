import java.util.Arrays;

public class PD6_10 {
    public static void main(String[] args) {
        int [] numbersArr1= {1, 2, 3, 4,5};
        int [] numbersArr2= {3, 4, 5, 6,7};
        int [] sujungtasMasyvas = new int[numbersArr1.length + numbersArr2.length];
        int index = 0;
        for (int elArr1 : numbersArr1) {
            sujungtasMasyvas[index++] = elArr1;
        }
        for (int elArr2 : numbersArr2){
            sujungtasMasyvas [index++] = elArr2;
        }
        int[] temArray = new int[sujungtasMasyvas.length];

        for (int i = 0; i < sujungtasMasyvas.length; i++) {
            int conter = 0;
            for (int j = i + 1; j < sujungtasMasyvas.length; j++) {
                if (sujungtasMasyvas[i] == sujungtasMasyvas[j]) {
                    conter++;
                }
            }
            if (conter == 0) {
                temArray[index] = sujungtasMasyvas[i];
                index++;
            }
        }
        sujungtasMasyvas = new int[index];
        for (int i = 0; i < index; i++) {
            sujungtasMasyvas[i] = temArray[i];


    }
        System.out.println(Arrays.toString(sujungtasMasyvas));
}
}
/**
 * Parašykite programą, kuri sujungia du masyvus ir pašalina visus pasikartojančius elementus.
 */