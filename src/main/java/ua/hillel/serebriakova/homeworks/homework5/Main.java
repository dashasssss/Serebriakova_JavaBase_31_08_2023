package ua.hillel.serebriakova.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        int attackWarriorLi = 13;
        int attackArcherLi = 24;
        int attackHorsemanLi = 46;

        int attackWarriorMin = 9;
        int attackArcherMin = 35;
        int attackHorsemanMin = 12;

        int numWarriorsLi = 860;
        int numArchersLi = 860;
        int numHorsemenLi = 860;

        int numWarriorsMin = (int) (1.5 * numWarriorsLi);
        int numArchersMin = (int) (1.5 * numArchersLi);
        int numHorsemenMin = (int) (1.5 * numHorsemenLi);

        int totalAttackLi = (attackWarriorLi * numWarriorsLi) + (attackArcherLi * numArchersLi) + (attackHorsemanLi * numHorsemenLi);
        int totalAttackMin = (attackWarriorMin * numWarriorsMin) + (attackArcherMin * numArchersMin) + (attackHorsemanMin * numHorsemenMin);

        System.out.println("Загальний показник атаки династії Лі: " + totalAttackLi);
        System.out.println("Загальний показник атаки династії Мінь: " + totalAttackMin);
    }
}
