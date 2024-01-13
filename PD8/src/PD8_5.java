public class PD8_5 {

        public static void main(String[] args) {
            MoneyBox moneyBox = new MoneyBox();
            moneyBox.deposit(100);
            moneyBox.deposit(400);
            moneyBox.deposit(400);
            moneyBox.deposit(300);
            System.out.println(moneyBox.withDraw(900));
            System.out.println(moneyBox.getAverageAmount());
            System.out.println(moneyBox.isEmpty());
        }
    }

/**
 * Sukurkite klasę / objektą kuris realizuoja pinigų dėžutės funkcionalumą. Pinigų dėžutė moka
 * priimti arba atiduoti pinigus. Pinigų dėžutė moka pasakyti kokia vidutinė suma buvo dedama į
 * ją per visą laikotarpį. Jei pinigų dėžutė tuščia ji moka tą pasakyti. Pinigų dėžutė negali priimti
 * daugiau negu 1000 eurų.
 */
