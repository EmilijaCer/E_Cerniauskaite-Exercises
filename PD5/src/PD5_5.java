public class PD5_5 {
    public static void main(String[] args) {
        for (int n = 1; n <100; n ++){
            if (n % 5 == 0) {
                continue;
                } else if (n == 88) {
                break;
            }
            System.out.println(n);

        }

    }
}