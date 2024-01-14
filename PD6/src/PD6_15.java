public class PD6_15 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 28, 16, 7};
        int average = 0;
        int sum = 0;
        int closestNumber = numbers[0];

        ///randam vidurki
        for (double element : numbers) {
            average = (sum += element) / numbers.length;
        }
        System.out.println("viso masyvo elementų vidurkis:" + average);

        //nustatom artyimiausia

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(average - numbers[i]) <= average) ;
            closestNumber = numbers[i];
        }
        System.out.println("Elementas, kurio reikšmė yra artimiausia viso masyvo elementų vidurkiui:" + " "+ closestNumber);
    }
}

//Parašykite programą, kuri randa elementą, kurio reikšmė yra artimiausia viso masyvo elementų
//vidurkiui.
