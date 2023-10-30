package ua.hillel.serebriakova.homeworks.homework17;

public class Drinks {
    public static final double COFFEE = 2.50;
    public static final double TEA = 1.80;
    public static final double LEMONADE = 2.20;
    public static final double MOJITO = 3.00;
    public static final double SODA = 1.50;
    public static final double COCA_COLA = 2.00;

    private static int totalDrinks;
    private static double totalPrice;

    public static void makeDrink(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case SODA:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCola();
                break;
        }
    }

    private static void makeCoffee() {
        totalDrinks++;
        totalPrice += COFFEE;
        System.out.println("Ваша кава готова!");
    }

    private static void makeTea() {
        totalDrinks++;
        totalPrice += TEA;
        System.out.println("Ваш чай готовий!");
    }

    private static void makeLemonade() {
        totalDrinks++;
        totalPrice += LEMONADE;
        System.out.println("Ваш лимонад готовий!");
    }

    private static void makeMojito() {
        totalDrinks++;
        totalPrice += MOJITO;
        System.out.println("Ваш мохіто готовий!");
    }

    private static void makeMineralWater() {
        totalDrinks++;
        totalPrice += SODA;
        System.out.println("Ваша мінеральна вода готова!");
    }

    private static void makeCola() {
        totalDrinks++;
        totalPrice += COCA_COLA;
        System.out.println("Ваша кока-кола готова!");
    }

    public static void displayTotalCost() {
        System.out.println("Вам потрібно заплатити: " + totalPrice + " грн за " + totalDrinks + " напоїв.");
    }
}
