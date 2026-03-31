package util;

import java.io.*;
import java.util.ArrayList;
import model.Patient;

public class FileHandler {

    private static final String FILE_PATH = "data/patients.txt";

    // Save patients to file
    public static void savePatients(ArrayList<Patient> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Patient p : list) {
                bw.write(p.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // Load patients from file
    public static ArrayList<Patient> loadPatients() {
        ArrayList<Patient> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String gender = data[3];
                String disease = data[4];

                list.add(new Patient(id, name, age, gender, disease));
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return list;
    }
}