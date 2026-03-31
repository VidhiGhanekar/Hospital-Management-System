package service;

import util.FileHandler;
import model.Patient;
import java.util.ArrayList;

public class PatientService {

    private ArrayList<Patient> patientList = FileHandler.loadPatients();

    // Add Patient
    public void addPatient(Patient patient) {

        for (Patient p : patientList) {
            if (p.getPatientId() == patient.getPatientId()) {
                System.out.println("Patient ID already exists!");
                return;
            }
        }

        patientList.add(patient);
        FileHandler.savePatients(patientList);
        System.out.println("Patient added successfully!");
    }

    // View All Patients
    public void viewPatients() {
        if (patientList.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patientList) {
            p.displayPatient();
        }
    }

    // Search Patient by ID
    public void searchPatient(int id) {
        for (Patient p : patientList) {
            if (p.getPatientId() == id) {
                System.out.println("Patient Found:");
                p.displayPatient();
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // Delete Patient by ID (FIXED)
    public void deletePatient(int id) {

        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getPatientId() == id) {

                patientList.remove(i);  // ✅ SAFE removal
                FileHandler.savePatients(patientList);

                System.out.println("Patient deleted successfully!");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // ✅ IMPORTANT (needed for AppointmentService)
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
}