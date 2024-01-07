public class PD5_1 {
    public static void main(String[] args) {
for (int i = 1; i <= 5; i++){ //Trikampis
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i || i == 5){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        for (int r = 1; r <= 5; r++){ //staciakampis
            for (int c = 1; c <= 8; c++){
                if (r == 1 || r == 5 || c == 1 || c == 8){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int r = 1; r <= 5; r++){ //kvadratas
            for (int c = 1; c <= 5; c++){
                if (r == 1 || r == 5 || c == 1 || c == 5){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
