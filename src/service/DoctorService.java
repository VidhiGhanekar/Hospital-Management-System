package service;

import model.Doctor;
import java.util.ArrayList;

public class DoctorService {

    private ArrayList<Doctor> doctorList = new ArrayList<>();

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    // View Doctors
    public void viewDoctors() {
        if (doctorList.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        for (Doctor d : doctorList) {
            d.displayDoctor();
        }
    }
}