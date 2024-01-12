public class PD6_3 {
    public static void main(String[] args) {
        String[] names = {"Jonas", "Akvile", "Jone"};
        String namesString = "";
        for (int i = 0; i < names.length; i++) {
            namesString += names[i]; //namesString = namesString + names[i]
        }
        System.out.println(namesString);

        //kitas metodas
        StringBuilder boxForStrings = new StringBuilder();
        for (String element : names) {  //for each nereikia pradzios ir pabaigos
            boxForStrings.append(element); //append prijunkt
        }
        System.out.println(boxForStrings);

    }
    }
/**
 * Parašykite programą, kuri paverčia masyvą simbolių eilute (String).
 */
