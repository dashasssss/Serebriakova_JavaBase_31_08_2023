package ua.hillel.serebriakova.homeworks.homework13;

public class Burger {
    String bun;
    String meat;
    String doubleMeat;
    String cheese;
    String greens;
    String mayonnaise;

     Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
         this.bun=bun;
         this.meat=meat;
         this.cheese=cheese;
         this.greens=greens;
         this.mayonnaise=mayonnaise;
        System.out.println("Burger with all components:"+ bun +", "+ meat+", " + cheese+", " + greens+", " + mayonnaise+".");
    }

    Burger(String bun, String meat,String doubleMeat, String cheese, String greens, String mayonnaise) {
        this.bun=bun;
        this.meat=meat;
        this.doubleMeat= doubleMeat;
        this.cheese=cheese;
        this.greens=greens;
        this.mayonnaise=mayonnaise;
        System.out.println("Burger with double meat components:"+ bun +", "+ meat+", "+ doubleMeat+", "+ cheese+", " + greens+", " + mayonnaise+".");
    }

    Burger(String bun, String meat,String cheese, String greens) {
        this.bun=bun;
        this.meat=meat;
        this.cheese=cheese;
        this.greens=greens;
        System.out.println("Diet burger components:"+ bun +", "+ meat+", "+ cheese+", " + greens+".");
    }


}
