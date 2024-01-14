import java.util.Arrays;

public class PD6_18 {
    public static void main(String[] args) {
        int[] firstArray ={23,45,12,3,78,98,15,-3};
        int[] secondArray ={2,12,24,15,48,64,-5,65};
        int [] arrayTemp = new int [firstArray.length + secondArray.length];
        int arrayLenght = 0;

            for (int i = 0; i < secondArray.length; i++) {
                int count = 0;
                for (int j = 0; j < firstArray.length; j++) {
                    if (firstArray[j] == secondArray[i]) {
                        count++;
                    }
                }
                if (count == 0) {
                    arrayTemp[arrayLenght] = secondArray[i];
                    arrayLenght++;
                }
            }
        int [] newArray = new int [arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
        newArray[i]=arrayTemp[i];
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(newArray));
    }
}





//Yra duoti du sveikųjų skaičių masyvai. Parašykite programą, kuri atrenka visus antro masyvo
//elementus, kurie nepasikartoja pirmame masyve. Rezultatą įrašykite į trečia masyvą.
