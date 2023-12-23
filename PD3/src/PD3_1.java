public class PD3_1 {
    public static void main(String[] args) {
        byte myNumber = 127;
        System.out.println(myNumber);
        short myShort = 45; // 2B
        System.out.println(myShort);
        int myInt = 78; // 4B
        System.out.println(myInt);
        long myLong = 756L;
        System.out.println(myLong);
        // EEE754
        float myFloat = 4.5f; //4B (32 bit)
        System.out.println(myFloat);
        double myDouble = 7.896; //8B (64 bit)
        System.out.println(myDouble);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (b1 == b2);
        System.out.println(false);
        char intChar = 65;
        System.out.println(intChar);
    }
}
