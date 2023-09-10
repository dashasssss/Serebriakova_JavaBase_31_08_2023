package ua.hillel.serebriakova.homeworks.homework2;

public class Main {
    public static void main(String[] args) {

        double longitude = -74.045448 ;
        double latitude =  40.689978 ;
        char specSymbol = '\u00B0';
        char specSymbol1 = '\'';

        System.out.println();
        System.out.println("GPS COORDINATES OF STATUE OF LIBERTY NATIONAL MONUMENT, UNITED STATES");
        System.out.println("Longitude : " + longitude + " Latitude : " + latitude);
        System.out.println("\"DMS lat\" : 40" + specSymbol + "41" + specSymbol1 + "23.92\" N \"DMS long\" : -74" + specSymbol + "02" + specSymbol1 + "43.61\" W");

    }
}
