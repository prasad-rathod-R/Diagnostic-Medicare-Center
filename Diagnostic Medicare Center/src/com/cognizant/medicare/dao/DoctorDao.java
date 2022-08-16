package com.cognizant.medicare.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.medicare.model.Doctor;

public interface DoctorDao {
    public void insertDoctorDetails(Doctor doctor) throws ParseException;

    public Doctor getDoctorDetails(String username);

    public List<Doctor> getDoctorDetails();

    public void removeDoctorDetails(long doctor_Id);

    public void updateDoctorDetails(Doctor doctor);

    public Doctor getDoctorPendingDetails(Long doctorId);

    public void updateDoctorRequest(Doctor doctor);

    public Doctor getDoctorDetails(long doctor_Id);

    public List<Doctor> getPendingDetails();

}
