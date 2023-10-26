package ua.hillel.serebriakova.homeworks.homawork16;

 class IPhones implements Smartphones, IOS {
    public void call() {
        System.out.println("iPhone is making a call.");
    }

    @Override
    public void sms() {
        System.out.println("iPhone is sending an SMS.");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is browsing the internet.");
    }
    @Override
    public void runIOSApp() {
        System.out.println("iPhone is running an iOS app.");
    }
}
