package com.cognizant.medicare.model;

import java.util.Date;

public class Doctor {
    private long Doctor_Id;
    private String First_Name;
    private String Last_Name;
    private int age;
    private String Gender;
    private Date DoB;
    private long Contact_Number;
    private long Alt_Contact_Number;
    private String Email_ID;
    private String pass_word;
    private String Address_Line_1;
    private String Address_Line_2;
    private String City;
    private String State;
    private long Zip_Code;
    private String Degree;
    private String Speciality;
    private String Hospital_Name;
    private String working_Hours;
    private long Medicare_Service_ID;

    public Doctor() {
        // TODO Auto-generated constructor stub
    }

    public Doctor(long doctor_Id, String first_Name, String last_Name, int age, String gender,
            Date doB, long contact_Number, long alt_Contact_Number, String email_ID,
            String pass_word, String address_Line_1, String address_Line_2, String city,
            String state, long zip_Code, String degree, String speciality, String hospital_Name,
            String working_Hours, long medicare_Service_ID) {
        super();
        this.Doctor_Id = doctor_Id;
        this.First_Name = first_Name;
        this.Last_Name = last_Name;
        this.age = age;
        this.Gender = gender;
        this.DoB = doB;
        this.Contact_Number = contact_Number;
        this.Alt_Contact_Number = alt_Contact_Number;
        this.Email_ID = email_ID;
        this.pass_word = pass_word;
        this.Address_Line_1 = address_Line_1;
        this.Address_Line_2 = address_Line_2;
        this.City = city;
        this.State = state;
        this.Zip_Code = zip_Code;
        this.Degree = degree;
        this.Speciality = speciality;
        this.Hospital_Name = hospital_Name;
        this.working_Hours = working_Hours;
        this.Medicare_Service_ID = medicare_Service_ID;

    }

    public long getDoctor_Id() {
        return Doctor_Id;
    }

    public void setDoctor_Id(long doctor_Id) {
        this.Doctor_Id = doctor_Id;
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
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        this.DoB = doB;
    }

    public long getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(long contact_Number) {
        this.Contact_Number = contact_Number;
    }

    public long getAlt_Contact_Number() {
        return Alt_Contact_Number;
    }

    public void setAlt_Contact_Number(long alt_Contact_Number) {
        this.Alt_Contact_Number = alt_Contact_Number;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String email_ID) {
        this.Email_ID = email_ID;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getAddress_Line_1() {
        return Address_Line_1;
    }

    public void setAddress_Line_1(String address_Line_1) {
        this.Address_Line_1 = address_Line_1;
    }

    public String getAddress_Line_2() {
        return Address_Line_2;
    }

    public void setAddress_Line_2(String address_Line_2) {
        this.Address_Line_2 = address_Line_2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }

    public long getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(long zip_Code) {
        this.Zip_Code = zip_Code;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        this.Degree = degree;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        this.Speciality = speciality;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        this.Hospital_Name = hospital_Name;
    }

    public String getWorking_Hours() {
        return working_Hours;
    }

    public void setWorking_Hours(String working_Hours) {
        this.working_Hours = working_Hours;
    }

    public long getMedicare_Service_ID() {
        return Medicare_Service_ID;
    }

    public void setMedicare_Service_ID(long medicare_Service_ID) {
        this.Medicare_Service_ID = medicare_Service_ID;
    }

    @Override
    public String toString() {
        return "Doctor [Doctor_Id=" + Doctor_Id + ", First_Name=" + First_Name + ", Last_Name="
                + Last_Name + ", age=" + age + ", Gender=" + Gender + ", DoB=" + DoB
                + ", Contact_Number=" + Contact_Number + ", Alt_Contact_Number="
                + Alt_Contact_Number + ", Email_ID=" + Email_ID + ", pass_word=" + pass_word
                + ", Address_Line_1=" + Address_Line_1 + ", Address_Line_2=" + Address_Line_2
                + ", City=" + City + ", State=" + State + ", Zip_Code=" + Zip_Code + ", Degree="
                + Degree + ", Speciality=" + Speciality + ", Hospital_Name=" + Hospital_Name
                + ", working_Hours=" + working_Hours + ", Medicare_Service_ID="
                + Medicare_Service_ID + "]";
    }

}
