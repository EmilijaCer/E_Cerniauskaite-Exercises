public class PD3_7 {
    public static void main(String[] args) {
        String text1 = "Emilija";
        String text2 = "Cerniauskaite";
        System.out.println(text1 + " " + text2);

        StringBuilder stringBuilder = new StringBuilder(); //apjungimas
        stringBuilder.append(text1).append(text2);
        System.out.println(stringBuilder);

        String text3 = "Emilija";
        String text4 = new String("Ema");

        System.out.println(text3.equals(text4)); //lyginimas

        int lenght = text1.length(); //spausdina ilgi
        System.out.println(lenght);

        String subStr = text2.substring(2, 3); //dalies istraukimas
        System.out.println(subStr);

        char charAt = text1.charAt(5);
        System.out.println(text1);

        String upperCase = text2.toUpperCase();
        System.out.println(upperCase);

    }
}
