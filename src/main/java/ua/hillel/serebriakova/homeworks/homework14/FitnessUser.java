package ua.hillel.serebriakova.homeworks.homework14;

public class FitnessUser {
    private  final String firstName;
    private  final int birthDay;
    private  final int birthMonth;
    private  final int birthYear;
    private  final String email;
    private  final String phone;
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

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
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
