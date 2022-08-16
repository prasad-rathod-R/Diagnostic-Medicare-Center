package com.cognizant.medicare.model;

import java.util.Date;

public class Admin {
    private long Admin_Id;
    private String First_Name;
    private String Last_Name;
    private int age;
    private String gender;
    private Date DoB;
    private long Contact_Number;
    private long Alt_Contact_Number;
    private String Email_ID;
    private String pass_word;

    public Admin() {
        // TODO Auto-generated constructor stub
    }

    public Admin(long admin_Id, String first_Name, String last_Name, int age, String gender,
            Date doB, long contact_Number, long alt_Contact_Number, String email_ID,
            String pass_word) {
        super();
        Admin_Id = admin_Id;
        First_Name = first_Name;
        Last_Name = last_Name;
        this.age = age;
        this.gender = gender;
        DoB = doB;
        Contact_Number = contact_Number;
        Alt_Contact_Number = alt_Contact_Number;
        Email_ID = email_ID;
        this.pass_word = pass_word;
    }

    public long getAdmin_Id() {
        return Admin_Id;
    }

    public void setAdmin_Id(long admin_Id) {
        Admin_Id = admin_Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
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
        DoB = doB;
    }

    public long getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(long contact_Number) {
        Contact_Number = contact_Number;
    }

    public long getAlt_Contact_Number() {
        return Alt_Contact_Number;
    }

    public void setAlt_Contact_Number(long alt_Contact_Number) {
        Alt_Contact_Number = alt_Contact_Number;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String email_ID) {
        Email_ID = email_ID;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    @Override
    public String toString() {
        return "Admin [Admin_Id=" + Admin_Id + ", First_Name=" + First_Name + ", Last_Name="
                + Last_Name + ", age=" + age + ", Gender=" + gender + ", DoB=" + DoB
                + ", Contact_Number=" + Contact_Number + ", Alt_Contact_Number="
                + Alt_Contact_Number + ", Email_ID=" + Email_ID + ", pass_word=" + pass_word + "]";
    }

}
