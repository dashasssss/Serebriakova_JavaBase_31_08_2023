package ua.hillel.serebriakova.homeworks.homework10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] FirstArrNumbers = new int[7];
        int[] SecondArrNumbers = new int[7];

        for (int i = 0; i < FirstArrNumbers.length; i++) {
            FirstArrNumbers[i] = (int) (Math.random() * 11);
        }

        System.out.println("Введите 7 цифр от 0 до 9:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SecondArrNumbers.length; i++) {
            System.out.print("Цифра " + (i + 1) + ": ");

            while (true) {
                if (scanner.hasNextInt()) {
                    int inputDigit = scanner.nextInt();

                    if (inputDigit >= 0 && inputDigit <= 9) {
                        SecondArrNumbers[i] = inputDigit;
                        break;
                    } else {
                        System.out.println("Неверный ввод. Введите цифру от 0 до 9.");
                        scanner.next();
                    }
                } else {
                    System.out.println("Неверный ввод. Введите цифру от 0 до 9.");
                    scanner.next();
                }
            }
        }

        for (int i = 0; i < FirstArrNumbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < FirstArrNumbers.length; j++) {
                if (FirstArrNumbers[j] < FirstArrNumbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = FirstArrNumbers[i];
            FirstArrNumbers[i] = FirstArrNumbers[minIndex];
            FirstArrNumbers[minIndex] = temp;
        }

        for (int i = 0; i < SecondArrNumbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < SecondArrNumbers.length; j++) {
                if (SecondArrNumbers[j] < SecondArrNumbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = SecondArrNumbers[i];
            SecondArrNumbers[i] = SecondArrNumbers[minIndex];
            SecondArrNumbers[minIndex] = temp;
        }
        
        int count = 0;
        for (int i = 0; i < FirstArrNumbers.length; i++) {
            if (FirstArrNumbers[i] == SecondArrNumbers[i]) {
                count++;
            }
        }

        System.out.print("Числа,які загадано лотереєю: ");
        for (int i = 0; i < FirstArrNumbers.length; i++) {
            System.out.print(FirstArrNumbers[i] + " ");
        }

        System.out.println("");
        System.out.print("Числа,які загадав гравець:   ");
        for (int i = 0; i < SecondArrNumbers.length; i++) {
            System.out.print(SecondArrNumbers[i] + " ");
        }

        System.out.println("");
        System.out.println("Кількість збігів: " + count);
    }
}
