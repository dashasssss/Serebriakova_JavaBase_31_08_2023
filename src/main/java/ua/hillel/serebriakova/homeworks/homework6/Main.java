package ua.hillel.serebriakova.homeworks.homework6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name for the first team");
        String team1Name = scanner.nextLine();

        int team1Scores1 = 0;
        System.out.println("Enter the number of frags for the player 1");
        if (scanner.hasNextInt()) {
            team1Scores1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores2 = 0;
        System.out.println("Enter the number of frags for the player 2");
        if (scanner.hasNextInt()) {
            team1Scores2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores3 = 0;
        System.out.println("Enter the number of frags for the player 3");
        if (scanner.hasNextInt()) {
            team1Scores3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores4 = 0;
        System.out.println("Enter the number of frags for the player 4");
        if (scanner.hasNextInt()) {
            team1Scores4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team1Scores5 = 0;
        System.out.println("Enter the number of frags for the player 5");
        if (scanner.hasNextInt()) {
            team1Scores5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }



        scanner.nextLine();
        System.out.println("");
        System.out.println("Enter a name for the second team");
        String team2Name = scanner.nextLine();

        int team2Scores1 = 0;
        System.out.println("Enter the number of frags for the player 1");
        if (scanner.hasNextInt()) {
            team2Scores1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores2 = 0;
        System.out.println("Enter the number of frags for the player 2");
        if (scanner.hasNextInt()) {
            team2Scores2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores3 = 0;
        System.out.println("Enter the number of frags for the player 3");
        if (scanner.hasNextInt()) {
            team2Scores3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores4 = 0;
        System.out.println("Enter the number of frags for the player 4");
        if (scanner.hasNextInt()) {
            team2Scores4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int team2Scores5 = 0;
        System.out.println("Enter the number of frags for the player 5");
        if (scanner.hasNextInt()) {
            team2Scores5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }


        double team1Average = (team1Scores1 + team1Scores2 + team1Scores3 + team1Scores4 + team1Scores5) / 5.0;
        double team2Average = (team2Scores1 + team2Scores2 + team2Scores3 + team2Scores4 + team2Scores5) / 5.0;

        String winner;
        if (team1Average > team2Average) {
            winner = team1Name;
        } else if (team1Average < team2Average) {
            winner = team2Name;
        } else {
            winner = "Nobody";
            System.out.println("Nobody won!");
            System.exit(0);
        }

        System.out.println("");
        System.out.println("Arithmetic average of points for team 1 " +team1Name +"- " + team1Average);
        System.out.println("Arithmetic average of points for team 2 "+team2Name +"- " + team2Average);
        System.out.println("The winning team " + winner + " scored " + (winner.equals(team1Name) ? team1Average : team2Average) + " points");
    }

}
