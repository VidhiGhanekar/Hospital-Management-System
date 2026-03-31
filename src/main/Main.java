package main;

import model.Appointment;
import model.Doctor;
import model.Patient;
import service.AppointmentService;
import service.DoctorService;
import service.PatientService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService(patientService);

        int choice;

        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Add Doctor");
            System.out.println("6. View Doctors");
            System.out.println("7. Book Appointment");
            System.out.println("8. View Appointments");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient p = new Patient(id, name, age, gender, disease);
                    patientService.addPatient(p);
                    break;

                case 2:
                    patientService.viewPatients();
                    break;

                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();
                    patientService.searchPatient(searchId);
                    break;

                case 4:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = sc.nextInt();
                    patientService.deletePatient(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    Doctor doctor = new Doctor(did, dname, spec);
                    doctorService.addDoctor(doctor);
                    break;

                case 6:
                    doctorService.viewDoctors();
                    break;

                case 7:
                    System.out.print("Enter Appointment ID: ");
                    int aid = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int did2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    Appointment ap = new Appointment(aid, pid, did2, date);
                    appointmentService.addAppointment(ap);
                    break;

                case 8:
                    appointmentService.viewAppointments();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}