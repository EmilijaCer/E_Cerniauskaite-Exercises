public class PD5_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){ //Trikampis
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i || i == 10){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int r = 1; r <= 15; r++){ //kvadratas
            for (int c = 1; c <= 15; c++){
                if (r == 1 || r == 15 || c == 1 || c == 15){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int r = 1; r <= 10; r++){ //staciakampis
            for (int c = 1; c <= 15; c++){
                if (r == 1 || r == 10 || c == 1 || c == 15){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}