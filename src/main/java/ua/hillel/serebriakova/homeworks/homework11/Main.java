package ua.hillel.serebriakova.homeworks.homework11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = 0;
        int N = 0;

        while (M <= 0) {
            System.out.print("Введіть кількість рядків: ");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M < 0) {
                    System.out.println("Будь ласка, введіть додатне число для M.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Будь ласка, введіть додатне число для M.");
                scanner.next();
            }
        }

        while (N <= 0) {
            System.out.print("Введіть кількість стовпців: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N < 0) {
                    System.out.println("Будь ласка, введіть додатне число для N.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Будь ласка, введіть додатне число для N.");
                scanner.next();
            }
        }


        int[][] originalMatrix = new int[M][N];

        System.out.println("Початкова матриця:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                originalMatrix[i][j] =(int) (Math.random() * 101);
                System.out.print(originalMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("\nТранспонована матриця:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
