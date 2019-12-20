package ru.job4j.tracker.professions;


public class Diagnose {
    private Doctor doctor;
    private Patient patient;
    private String description;


    public Diagnose(Doctor doctor, Patient patient, String description) {
        this.doctor = doctor;
        this.patient = patient;
        this.description = description;
    }


    public Doctor getDoctor() {
        return doctor;
    }


    public Patient getPatient() {
        return patient;
    }


    public String getDescription() {
        return description;
    }
}