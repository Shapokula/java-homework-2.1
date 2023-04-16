public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // Стоимость билета
        int bonusMileCost = 20; // Количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / bonusMileCost; // Расчет бонусных миль
        System.out.println("Бонусов начислено: " + bonusMiles); // Вывод на экран
            }
}
