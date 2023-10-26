package ua.hillel.serebriakova.homeworks.homawork16;

 class Androids implements Smartphones , LinuxOS {
     @Override
     public void call() {
         System.out.println("Android phone is making a call.");
     }

     @Override
     public void sms() {
         System.out.println("Android phone is sending an SMS.");
     }

     @Override
     public void internet() {
         System.out.println("Android phone is browsing the internet.");
     }

     @Override
     public void runLinuxApp() {
         System.out.println("Android phone is running a Linux app.");
     }
}
