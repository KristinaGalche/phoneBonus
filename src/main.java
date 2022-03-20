public class main {
    public static void main(String[] args) {

        int currentBalance = 200;
        int payment = 500;
        int bonus = 0;

        if (payment >= 1000) {
            bonus = payment / 100;
        }

        int newBalance = currentBalance + payment + bonus;

        System.out.println("Баланс вашего счета: " + newBalance);

    }
}
