package ua.hillel.serebriakova.homeworks.homework9;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int minAge = 18;
        int maxAge = 40;

        int[] FirstTeam = new int[25];
        int[] SecondTeam = new int[25];

        for (int i = 0; i < FirstTeam.length; i++) {
            FirstTeam[i]= (int) (Math.random() * (maxAge - minAge + 1)) + minAge;
        }

        for (int i = 0; i < FirstTeam.length; i++) {
            if(i==0){
                System.out.print("Вік гравців першої команди: "+ FirstTeam[i] + ", ");
            } else if (i== FirstTeam.length-1) {
                System.out.println(FirstTeam[i]+".");
            }else {
                System.out.print(FirstTeam[i]+", ");
            }
        }
        
        for (int i = 0; i < SecondTeam.length; i++) {
            SecondTeam[i]= (int) (Math.random() * (maxAge - minAge + 1)) + minAge;
        }

        for (int i = 0; i < SecondTeam.length; i++) {
            if(i==0){
                System.out.print("Вік гравців другої команди: "+ SecondTeam[i] + ", ");
            } else if (i== SecondTeam.length-1) {
                System.out.println(SecondTeam[i]+".");
            }else {
                System.out.print(SecondTeam[i]+", ");
            }
        }


    }
}
