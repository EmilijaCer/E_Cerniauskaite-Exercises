public class PD6_6 {
    public static void main(String args[]) {
        int[] numbers = {1,1,3,-3, 2, 3,3, 4, 5, -10, 3};
        // for
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers [i] + " ");

        }
        //while
        System.out.println(); //atskirti metodus
        int whileCounterIndex = 0;
        while (whileCounterIndex < numbers.length){
            System.out.println(numbers[whileCounterIndex] + " ");
            whileCounterIndex ++; //ziureti sekanciam elementui ++
        }
        //do-while
        System.out.println();
        int doWhileCounterIndex = 0;
        do {
            if (numbers.length <= 0){
                break;
            } else {
                System.out.println(numbers[doWhileCounterIndex] + " ");
                doWhileCounterIndex ++;
            }
        } while (doWhileCounterIndex < numbers.length);
    }
}
/**
 * Parašykite programą, kuri atspausdina pateikto masyvo elementus.
 */


