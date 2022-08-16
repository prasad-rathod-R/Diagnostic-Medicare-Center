package com.cognizant.medicare.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.model.Patient;

public interface PatientDao {
    public void insertPatientDetails(Patient patient) throws ParseException;

    public Patient getPatientDetails(String username);

    public List<Patient> getPatientDetails();

    public Patient getPatientDetail();

    public void removePatientDetails(long patient_Id);

    public void updatePatientDetails(Patient patient);

    public Patient getPatientDetails(long patientId);
}
