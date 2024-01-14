import java.util.Arrays;

public class PD6_13 {
    public static void main(String[] args) {
        int [] numbers1 = {1, 2, 3, 4, 5};
        int [] numbers2 = {10, 6, 7, 8, 9, 89};

        boolean boolen= true;
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        if (numbers1.length != numbers2.length){
            boolen = false;
        } else{
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1.length != numbers2.length){
                    boolen = false;
                    break;
                }
            }
        }
        if (boolen) {
            System.out.println("vienodi");
        }else {
            System.out.println("nevienodi");
        }
    }
}
//Parašykite programą, kuri patikrina ar du masyvai yra vienodi (negalima naudoti metodo equals()).
