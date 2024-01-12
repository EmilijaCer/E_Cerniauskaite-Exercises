import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.SortedMap;

public class PD6_4 {
    public static void main(String[] args) {
        int[] originalArray = {1,1,3,-3, 2, 3,3, 4, 5, -10, 3};
        //reikia inicializuoti kintamaji pagal kuri ims masyva ir ieskos emelemnto
        int targetNumber = 3;
        int occurrenceCounter = 0; //skaitliukas

        for (int element : originalArray) {
            if (element == targetNumber){
                occurrenceCounter ++; //skaitliuka padidiname vienetu, ieskoti masine nuo o iki
            }
        }
        System.out.println(occurrenceCounter);

    }
}
/**
 * Parašykite programą, kuri randą mažiausią ir didžiausią skaičių integer tipo masyve.
 */
