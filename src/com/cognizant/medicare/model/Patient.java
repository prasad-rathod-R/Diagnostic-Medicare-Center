package com.cognizant.medicare.model;

import java.util.Date;

public class Patient {
    private long Patient_Id;
    private String First_Name;
    private String Last_Name;
    private int age;
    private String gender;
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

    public Patient() {
        // TODO Auto-generated constructor stub
    }

    public Patient(long Patient_Id, String First_Name, String Last_Name, int age, String gender,
            Date DoB, long Contact_Number, long Alt_Contact_Number, String Email_ID,
            String pass_word, String Address_Line_1, String Address_Line_2, String City,
            String State, long Zip_Code, String Status) {
        super();
        this.Patient_Id = Patient_Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.age = age;
        this.gender = gender;
        this.DoB = DoB;
        this.Contact_Number = Contact_Number;
        this.Alt_Contact_Number = Alt_Contact_Number;
        this.Email_ID = Email_ID;
        this.pass_word = pass_word;
        this.Address_Line_1 = Address_Line_1;
        this.Address_Line_2 = Address_Line_2;
        this.City = City;
        this.State = State;
        this.Zip_Code = Zip_Code;

    }

    public long getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(long patient_Id) {
        this.Patient_Id = patient_Id;
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

    @Override
    public String toString() {
        return "Patient [Patient_Id=" + Patient_Id + ", First_Name=" + First_Name + ", Last_Name="
                + Last_Name + ", age=" + age + ", gender=" + gender + ", DoB=" + DoB
                + ", Contact_Number=" + Contact_Number + ", Alt_Contact_Number="
                + Alt_Contact_Number + ", Email_ID=" + Email_ID + ", pass_word=" + pass_word
                + ", Address_Line_1=" + Address_Line_1 + ", Address_Line_2=" + Address_Line_2
                + ", City=" + City + ", State=" + State + ", Zip_Code=" + Zip_Code + ", Status="
                + "]";
    }

}
