package ua.hillel.serebriakova.homeworks.homework;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personFirstName = "";
        String personLastName = "";
        String personPhoneNumber = "";
        String personCity = "";

        while (personFirstName.isEmpty()) {
            System.out.print("Введіть ім'я: ");
            personFirstName = scanner.nextLine().trim();
            if (personFirstName.isEmpty()) {
                System.out.println("Ім'я не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }


        while (personLastName.isEmpty()) {
            System.out.print("Введіть призвіще: ");
            personLastName = scanner.nextLine().trim();
            if (personLastName.isEmpty()) {
                System.out.println("Призвіще не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }

        while (personPhoneNumber.isEmpty()) {
            System.out.print("Введіть номер телефона: ");
            personPhoneNumber = scanner.nextLine().trim();
            if (personPhoneNumber.isEmpty()) {
                System.out.println("Номер телефону не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }

        while (personCity.isEmpty()) {
            System.out.print("Введіть місто: ");
            personCity = scanner.nextLine().trim();
            if (personCity.isEmpty()) {
                System.out.println("Місто не може бути пустим. Будь ласка, введіть ще раз.");
            }
        }
        personInfo(personFirstName,personLastName,personCity , personPhoneNumber);

    }

    static void personInfo(String name, String  lastName, String city, String tel) {
        System.out.println("Зателефонувати громадянину "+name + " " + lastName+ " із міста "+ city +" можна за номером "+ tel);
    }
}
