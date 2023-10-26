package ua.hillel.serebriakova.homeworks.homawork16;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        IPhones iPhone = new IPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxApp();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runIOSApp();
    }

}
