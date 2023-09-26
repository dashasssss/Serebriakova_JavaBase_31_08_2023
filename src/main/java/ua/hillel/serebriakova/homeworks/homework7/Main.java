package ua.hillel.serebriakova.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);

        System.out.println("Вітаємо в грі 'Вгадай число'!");
        System.out.println("Маєте 3 спроби, щоб вгадати число від 0 до 10.");

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Спроба " + i + ". Введіть свою догадку: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Вітаємо! Ви вгадали число " + randomNumber);
                return;
            } else if (userGuess < randomNumber) {
                System.out.println("Число більше. ");
            } else {
                System.out.println("Число менше. ");
            }
        }

        System.out.println("На жаль, ви не вгадали число. Було загадано: " + randomNumber);
    }
}

