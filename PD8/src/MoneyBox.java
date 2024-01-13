public class MoneyBox {

        private double totalAmount;
        private double depositCount;
        private static final double MAX_AMOUNT = 1000.0;

        public MoneyBox() {
            this.totalAmount = 0.0;
            this.depositCount = 0;
        }

        public boolean deposit(double amount) {
            if (amount <= 0 || totalAmount > MAX_AMOUNT) {
                return false;
            }
            totalAmount += amount;
            depositCount++;
            return true;
        }

        public boolean withDraw(double amount) {
            if (amount < 0 || amount > totalAmount) {
                return false;
            }
            totalAmount -= amount;
            return true;
        }

        public double getAverageAmount() {
            if (depositCount == 0) {
                return 0.0;
            }
            return totalAmount / depositCount;
        }

        public boolean isEmpty() {
            return totalAmount == 0.0;
        }
    }

