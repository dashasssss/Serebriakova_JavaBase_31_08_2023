package ua.hillel.serebriakova.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 1; count < 100; num++) {

            int digit1 = num / 10;
            int digit2 = num % 10;
            int digit3 = 0;
            int digit4 = 0;

            if(digit1 > 10) {
                digit3 = digit1 / 10;
                digit4 = digit1 % 10;
            }

            if(digit1 == 4 || digit1 == 9 || digit2 == 4 || digit2 == 9 || digit3 == 9 || digit3 == 4 || digit4 == 9 || digit4 == 4){
                continue;
            }

            System.out.println("Shuttel number " + num);
            count++;
        }

        System.out.println("");
        System.out.println("Total number of shuttles: "+ count);
    }
}
