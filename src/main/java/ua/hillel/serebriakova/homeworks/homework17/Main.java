package ua.hillel.serebriakova.homeworks.homework17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean orderMore = true;

        while (orderMore) {
            System.out.println("Виберіть напій (COFFEE, TEA, LEMONADE, MOJITO, SODA, COCA_COLA): ");
            String choice = scanner.nextLine().toUpperCase();

            try {
                DrinksMachine drink = DrinksMachine.valueOf(choice);
                Drinks.makeDrink(drink);

                System.out.println("Хочете замовити ще напій? (yes/no)");
                String anotherDrink = scanner.nextLine().toLowerCase();

                if (anotherDrink.equals("no")) {
                    orderMore = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Неправильний вибір напою. Будь ласка, виберіть зі списку.");
            }
        }

        Drinks.displayTotalCost();
    }
}


