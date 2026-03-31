package model;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;

    // Constructor
    public Patient(int patientId, String name, int age, String gender, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    // Display method
    public void displayPatient() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Disease: " + disease);
        System.out.println("------------------------");
    }
    // Convert object to file format
    public String toFileString() {
        return patientId + "," + name + "," + age + "," + gender + "," + disease;
  }
}