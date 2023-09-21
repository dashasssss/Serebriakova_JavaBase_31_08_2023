package ua.hillel.serebriakova.homeworks.homework6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name for the first team");
        String NameFirstTeam = scanner.nextLine();

        int team1Scores1 = 0;
        System.out.println("Enter the number of frags for the player 1");
        if (scanner.hasNextInt()) {
            team1Scores1 = scanner.nextInt();
            System.out.println("number = " + team1Scores1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores2 = 0;
        System.out.println("Enter the number of frags for the player 2");
        if (scanner.hasNextInt()) {
            team1Scores2 = scanner.nextInt();
            System.out.println("number = " + team1Scores2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores3 = 0;
        System.out.println("Enter the number of frags for the player 3");
        if (scanner.hasNextInt()) {
            team1Scores3 = scanner.nextInt();
            System.out.println("number = " + team1Scores3);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores4 = 0;
        System.out.println("Enter the number of frags for the player 4");
        if (scanner.hasNextInt()) {
            team1Scores4 = scanner.nextInt();
            System.out.println("number = " + team1Scores4);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores5 = 0;
        System.out.println("Enter the number of frags for the player 5");
        if (scanner.hasNextInt()) {
            team1Scores5 = scanner.nextInt();
            System.out.println("number = " + team1Scores5);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        scanner.nextLine();
        System.out.println("Enter a name for the second team");
        String NameSecondTeam = scanner.nextLine();
        System.out.println("The name of the second team - " + NameSecondTeam);

        int team2Scores1 = 0;
        System.out.println("Enter the number of frags for the player 1");
        if (scanner.hasNextInt()) {
            team2Scores1 = scanner.nextInt();
            System.out.println("number = " + team2Scores1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores2 = 0;
        System.out.println("Enter the number of frags for the player 2");
        if (scanner.hasNextInt()) {
            team2Scores2 = scanner.nextInt();
            System.out.println("number = " + team2Scores2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores3 = 0;
        System.out.println("Enter the number of frags for the player 3");
        if (scanner.hasNextInt()) {
            team2Scores3 = scanner.nextInt();
            System.out.println("number = " + team2Scores3);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores4 = 0;
        System.out.println("Enter the number of frags for the player 4");
        if (scanner.hasNextInt()) {
            team2Scores4 = scanner.nextInt();
            System.out.println("number = " + team2Scores4);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores5 = 0;
        System.out.println("Enter the number of frags for the player 5");
        if (scanner.hasNextInt()) {
            team2Scores5 = scanner.nextInt();
            System.out.println("number = " + team2Scores5);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

    }
}
