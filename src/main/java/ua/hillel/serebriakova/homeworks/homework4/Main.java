package ua.hillel.serebriakova.homeworks.homework4;

public class Main {
    public static void main(String[] args) {

        int length = 25;
        int width = 16;
        int height = 17;

        int volume = length * width * height;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        int totalLength = 4 * (length + width + height);

        System.out.println("Сумарна довжина всіх сторін = " + totalLength);
    }
}
