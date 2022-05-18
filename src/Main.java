public class Main {
    public static void main(String[] args) {

        int accountMoney = 2000;
        int bonus = 0;
        int refill = 2345;


        if (refill > 100) {
            bonus = bonus + refill / 100;
            accountMoney = accountMoney + refill + refill / 100;
        } else {
            accountMoney = accountMoney + refill;
        }
        System.out.println("Денег на счете: " + accountMoney);
        System.out.println("Бонусов на счете: " + bonus);
    }
}