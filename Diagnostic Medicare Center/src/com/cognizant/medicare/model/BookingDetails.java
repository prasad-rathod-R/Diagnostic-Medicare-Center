package com.cognizant.medicare.model;

import java.util.Date;

public class BookingDetails {
    private long Booking_id;
    private Date Booking_date;
    private long Patient_Id;
    private long Doctor_ID;
    private String Booking_status;
    private String First_Name;
    private String Last_Name;
    private int age;
    private String gender;

    public BookingDetails() {
        // TODO Auto-generated constructor stub
    }

    public BookingDetails(long booking_id, Date booking_date, long patient_Id, long doctor_ID,
            String booking_status, String first_Name, String last_Name, int age, String gender) {
        super();
        this.Booking_id = booking_id;
        this.Booking_date = booking_date;
        this.Patient_Id = patient_Id;
        this.Doctor_ID = doctor_ID;
        this.Booking_status = booking_status;
        this.First_Name = first_Name;
        this.Last_Name = last_Name;
        this.age = age;
        this.gender = gender;
    }

    public BookingDetails(long booking_id, Date booking_date, long patient_Id, long doctor_ID,
            String booking_status) {
        super();
        this.Booking_id = booking_id;
        this.Booking_date = booking_date;
        this.Patient_Id = patient_Id;
        this.Doctor_ID = doctor_ID;
        this.Booking_status = booking_status;
    }

    public long getBooking_id() {
        return Booking_id;
    }

    public void setBooking_id(long booking_id) {
        this.Booking_id = booking_id;
    }

    public Date getBooking_date() {
        return Booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.Booking_date = booking_date;
    }

    public long getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(long patient_Id) {
        this.Patient_Id = patient_Id;
    }

    public long getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(long doctor_ID) {
        this.Doctor_ID = doctor_ID;
    }

    public String getBooking_status() {
        return Booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.Booking_status = booking_status;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name = last_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "BookingDetails [Booking_id=" + Booking_id + ", Booking_date=" + Booking_date
                + ", Patient_Id=" + Patient_Id + ", Doctor_ID=" + Doctor_ID + ", Booking_status="
                + Booking_status + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
                + ", age=" + age + ", gender=" + gender + "]";
    }

}
