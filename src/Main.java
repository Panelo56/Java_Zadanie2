public class Main {
    public static void main(String[] args) {

        int balance1 = 200; //текущий баланс
        int replenish = 1400; //сумма пополнения

        int bonus;
        if (replenish > 1000) {
            bonus = replenish/100;
            System.out.println("Вы пополнили баланс на " + replenish + " рублей. Вам начислено " + bonus + " бонусов) Ваш текущий баланс равен " + (balance1 + replenish + bonus) + " рублей.");
        }
        else {
            System.out.println("Вы пополнили баланс на " + replenish + " рублей. Ваш текущий баланс равен " + (balance1 + replenish) + " рублей.");
        }
    }
}
