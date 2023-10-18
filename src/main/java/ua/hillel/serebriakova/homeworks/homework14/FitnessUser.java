package ua.hillel.serebriakova.homeworks.homework14;

public class FitnessUser {
    private  String firstName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private  String phone;
    private String lastName;
    private double weight;
    private String bloodPressure;
    private int dailySteps;
    private int age;

    public FitnessUser(String firstName, int birthDay, int birthMonth, int birthYear,
                       String email, String phone, String lastName, double weight, String bloodPressure,
                       int dailySteps) {
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.dailySteps = dailySteps;
        calculateAge();

    }

    private void calculateAge() {
        age = 2023 - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Daily Steps: " + dailySteps);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("------------------------------");
    }
}
