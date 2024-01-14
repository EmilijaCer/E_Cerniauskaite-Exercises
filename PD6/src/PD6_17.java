import java.util.Arrays;

public class PD6_17 {
    public static void main(String[] args) {
        int[] mas = {23, 45, 12, 3, 78, 98, 15, -3};
        int newMas = 0;



        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0){
                newMas++;
        }
    }
        int [] newArray = new int [newMas];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                newArray[newMas-1] = mas[i];
                newMas--;
            }
            }
        System.out.println(Arrays.toString(newArray));
    }
}

//Parašykite programą, kuri iš masyvo su sveikaisiais skaičiais atrenka tik lyginius skaičius ir įrašo
//juos į naują masyvą