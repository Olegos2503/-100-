public class Main {
    public static void main(String[] args) {
        int score = 500;
        int enrollment = 1200;
        int bonus;

        if (enrollment > 1000) {
            bonus = enrollment / 100;
        } else {
            bonus = 0;

        }
        System.out.println("Баланс:" + score + "руб. Пополнение :" + enrollment + "руб. Бонус :" + bonus + "руб.");
        System.out.println("Итог:");
        System.out.println(score + enrollment + bonus);

    }
}
