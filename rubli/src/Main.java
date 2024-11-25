public class Main {
    public static void main(String[] args) {

        int account = 950;
        int replenishment = 1340;
        int iBonus = 0;

        int bonus;
        int outcome;
        if (replenishment >= 1000) {
            bonus = replenishment / 100 * 1;
            outcome = account + bonus;
            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + bonus);
        } else {
            System.out.println("Итоговая сумма на счету: " + account);
            System.out.printf("Из них бонусов: " + iBonus);
        }
    }
}