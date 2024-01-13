package techin.lt;

public class PD7_6 {
    public static void main(String[] args) {
        String text = "Java is very beautiful language";
        int charCount = countCharsInString(text);
        System.out.println(charCount);
    }
    public static int countCharsInString(String text){
        int charCounter = 0;
        for (int i = 0; i < text.length() ; i++){
            char charAtIndex = text.charAt(i);
            if (Character.isLetter(charAtIndex)){
                charCounter++;
            }
        }
        return charCounter;
    }
}
/**
 * Parašykite Java metodą, kuris skaičiuoja kiek yra raidžių pateiktoje eilutėje.
 */
