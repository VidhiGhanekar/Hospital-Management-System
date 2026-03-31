package service;

import model.Appointment;
import model.Patient;

import java.util.ArrayList;

public class AppointmentService {

    private ArrayList<Appointment> appointmentList = new ArrayList<>();
    private PatientService patientService; // store reference

    // Constructor
    public AppointmentService(PatientService patientService) {
        this.patientService = patientService;
    }

    // Book Appointment
    public void addAppointment(Appointment a) {

        boolean patientExists = false;

        for (Patient p : patientService.getPatientList()) {
            if (p.getPatientId() == a.getPatientId()) {
                patientExists = true;
                break;
            }
        }

        if (!patientExists) {
            System.out.println("Invalid Patient ID!");
            return;
        }

        appointmentList.add(a);
        System.out.println("Appointment booked successfully!");
    }

    // View Appointments
    public void viewAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment a : appointmentList) {
            a.displayAppointment();
        }
    }
}