import java.lang.reflect.Array;
import java.util.Arrays;

public class PD6_8 {
    public static void main(String[] args) {
        String [] chars = {"A", "a", "C", "A", "D", "d", "F", "h"};
        String [] newChars = new String [chars.length];
        int uniqueElementCounter = 0; // =0, nes turi buti inicializuoti //skaitliukas unikaliems elementams

        for (int i = 0; i < chars.length; i++){
            boolean isDuplicate = false;  //kad elemntas neturi dublikato
            for (int j = i + 1; j < chars.length; j++) //i + 1 kad A palygintu su a
            {
                if (chars[i].equalsIgnoreCase(chars[j])){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                newChars[uniqueElementCounter] = chars[i];
                uniqueElementCounter ++;  //skailiukas, naujo masyvo ilgis
            }
        }
        System.out.println(uniqueElementCounter);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(newChars));

    }
}
/**
 * Parašykite programą, kuri pašalina pasikartojančius elementus iš masyvo (nepaisykite didžiųjų ir
 * mažųjų raidžių).
 */

