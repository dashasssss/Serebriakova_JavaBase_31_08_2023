package ua.hillel.serebriakova.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        FitnessUser user1 = new FitnessUser("John", 15, 5, 1990, "john@example.com", "097456789", "Doe", 75.5, "120/80", 8000);

        FitnessUser user2 = new FitnessUser("Alice", 10, 8, 1985, "alice@example.com", "097654321", "Smith", 68.2, "110/70", 10000);

        FitnessUser user3 = new FitnessUser("Ann", 2, 2, 2004, "ann@example.com", "098356787", "Jones", 53.2, "110/70", 12000);

        FitnessUser user4 = new FitnessUser("Griffin", 27, 1, 2009, "griffin@example.com", "098996745", "Miller", 78.9, "110/70", 5000);

        FitnessUser user5 = new FitnessUser("Hayes", 9, 9, 1977, "hayes@example.com", "098676689", "Lee", 97.5, "110/70", 8000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();
    }
}
