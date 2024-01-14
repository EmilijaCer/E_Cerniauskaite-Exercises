import java.util.Arrays;

public class PD6_14 {
    public static void main(String[] args) {
        int [] numbers1 = {1, 2, 3, 4, 5};
        int [] numbers2 = {5, 3, 7, 8, 9};

        Arrays.sort(numbers1);
        Arrays.sort(numbers2);
        int eaqual= 0;

            for (int i = 0; i < numbers1.length; i++) {
                for (int j = 0; j < numbers2.length; j++) {

            if (numbers1[i] == numbers2[j])
                eaqual++;
            }
        }
            System.out.println("masyvai turi" +" "+ +eaqual +" "+ "bendru elementu");
    }
}
//Parašykite programą, kuri nustato, ar du duoti masyvai turi bent vieną bendrą elementą.
