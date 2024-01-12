public class PD6_7 {
    public static void main(String args[]) {
        int[] numbers = {1,1,3,-3, 2, 3,3, 4, 5, -10, 3};
        int sum = 0;
        int multiplication = 1; //daugyba turi buti vienetas
        for (int element : numbers){
            sum += element; //sudedam su kitu elementu
            multiplication *=element; //sudauginam su kitu elementu
        }
        System.out.println("sum" + sum);
        System.out.println("multi" + multiplication);
    }
}
/**
 * Parašykite programą sveikųjų skaičių masyvo sumai ir sandaugai apskaičiuoti.
 */
