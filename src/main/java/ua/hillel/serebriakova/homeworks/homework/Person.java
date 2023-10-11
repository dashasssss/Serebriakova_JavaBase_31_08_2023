package ua.hillel.serebriakova.homeworks.homework;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String phoneNumber = "";
        String city = "";

        while (firstName.isEmpty()) {
            System.out.print("Введіть ім'я: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("Ім'я не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }


        while (lastName.isEmpty()) {
            System.out.print("Введіть призвіще: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("Призвіще не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }

        while (phoneNumber.isEmpty()) {
            System.out.print("Введіть номер телефона: ");
            phoneNumber = scanner.nextLine().trim();
            if (phoneNumber.isEmpty()) {
                System.out.println("Номер телефону не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }

        while (city.isEmpty()) {
            System.out.print("Введіть місто: ");
            city = scanner.nextLine().trim();
            if (city.isEmpty()) {
                System.out.println("Місто не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }
    }
}
