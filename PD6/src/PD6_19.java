import java.util.Arrays;

public class PD6_19 {
    public static void main(String[] args) {
        int[] array ={1,45,1,3,3,98,15,-3,-3, 1};
        int [] newArray=  new int [array.length];
        int uniqueArray = 0;

        for (int i = 0; i <array.length-1 ; i++){
            int count = 0;
            for (int j = 0; j <array.length ; j++) {
                if (array[i] == array[j]){
                        count++;
            }
        }
            if (count==1){
                newArray[uniqueArray] = array[i];
                uniqueArray++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(uniqueArray);

    }
}
//Parašykite programą kuri atrenka iš masyvo tik unikalias reikšmes. Rezultatas turi būti įrašytas į
//naują masyvą.