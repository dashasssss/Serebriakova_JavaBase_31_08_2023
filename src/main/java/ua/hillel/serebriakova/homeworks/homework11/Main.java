package ua.hillel.serebriakova.homeworks.homework11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (M): ");
        int M = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (N): ");
        int N = scanner.nextInt();


        int[][] originalMatrix = new int[M][N];

        System.out.println("Початкова матриця:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                originalMatrix[i][j] =(int) (Math.random() * 11);
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
