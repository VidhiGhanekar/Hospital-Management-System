package model;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;

    // Constructor
    public Appointment(int appointmentId, int patientId, int doctorId, String date) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }
     public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }


    // Display
    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Date: " + date);
        System.out.println("------------------------");
    }
}