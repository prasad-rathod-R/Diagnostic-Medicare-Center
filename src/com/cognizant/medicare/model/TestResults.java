package com.cognizant.medicare.model;

import java.util.Date;

public class TestResults {
    private long Report_ID;
    private long Patient_Id;
    private long Doctor_ID;
    private long Medicare_Service_ID;
    private Date Service_date;
    private Date Test_Result_date;
    private double Diag_1_Actual_Value;
    private double Diag_1_NormaL_Range;
    private double Diag_2_Actual_Value;
    private double Diag_2_NormaL_Range;
    private double Diag_3_Actual_Value;
    private double Diag_3_NormaL_Range;
    private double Diag_4_Actual_Value;
    private double Diag_4_NormaL_Range;
    private double Diag_5_Actual_Value;
    private double Diag_5_NormaL_Range;
    private double Diag_6_Actual_Value;
    private double Diag_6_NormaL_Range;
    private String Doctors_Comments;
    private String Other_info;

    public TestResults() {

    }

    public TestResults(long report_ID, long patient_Id, long doctor_ID, long medicare_Service_ID,
            Date service_date, Date test_Result_date, double diag_1_Actual_Value,
            double diag_1_NormaL_Range, double diag_2_Actual_Value, double diag_2_NormaL_Range,
            double diag_3_Actual_Value, double diag_3_NormaL_Range, double diag_4_Actual_Value,
            double diag_4_NormaL_Range, double diag_5_Actual_Value, double diag_5_NormaL_Range,
            double diag_6_Actual_Value, double diag_6_NormaL_Range, String doctors_Comments,
            String other_info) {
        super();
        Report_ID = report_ID;
        Patient_Id = patient_Id;
        Doctor_ID = doctor_ID;
        Medicare_Service_ID = medicare_Service_ID;
        Service_date = service_date;
        Test_Result_date = test_Result_date;
        Diag_1_Actual_Value = diag_1_Actual_Value;
        Diag_1_NormaL_Range = diag_1_NormaL_Range;
        Diag_2_Actual_Value = diag_2_Actual_Value;
        Diag_2_NormaL_Range = diag_2_NormaL_Range;
        Diag_3_Actual_Value = diag_3_Actual_Value;
        Diag_3_NormaL_Range = diag_3_NormaL_Range;
        Diag_4_Actual_Value = diag_4_Actual_Value;
        Diag_4_NormaL_Range = diag_4_NormaL_Range;
        Diag_5_Actual_Value = diag_5_Actual_Value;
        Diag_5_NormaL_Range = diag_5_NormaL_Range;
        Diag_6_Actual_Value = diag_6_Actual_Value;
        Diag_6_NormaL_Range = diag_6_NormaL_Range;
        Doctors_Comments = doctors_Comments;
        Other_info = other_info;
    }

    public long getReport_ID() {
        return Report_ID;
    }

    public void setReport_ID(long report_ID) {
        Report_ID = report_ID;
    }

    public long getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(long patient_Id) {
        Patient_Id = patient_Id;
    }

    public long getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(long doctor_ID) {
        Doctor_ID = doctor_ID;
    }

    public long getMedicare_Service_ID() {
        return Medicare_Service_ID;
    }

    public void setMedicare_Service_ID(long medicare_Service_ID) {
        Medicare_Service_ID = medicare_Service_ID;
    }

    public Date getService_date() {
        return Service_date;
    }

    public void setService_date(Date service_date) {
        Service_date = service_date;
    }

    public Date getTest_Result_date() {
        return Test_Result_date;
    }

    public void setTest_Result_date(Date test_Result_date) {
        Test_Result_date = test_Result_date;
    }

    public double getDiag_1_Actual_Value() {
        return Diag_1_Actual_Value;
    }

    public void setDiag_1_Actual_Value(double diag_1_Actual_Value) {
        Diag_1_Actual_Value = diag_1_Actual_Value;
    }

    public double getDiag_1_NormaL_Range() {
        return Diag_1_NormaL_Range;
    }

    public void setDiag_1_NormaL_Range(double diag_1_NormaL_Range) {
        Diag_1_NormaL_Range = diag_1_NormaL_Range;
    }

    public double getDiag_2_Actual_Value() {
        return Diag_2_Actual_Value;
    }

    public void setDiag_2_Actual_Value(double diag_2_Actual_Value) {
        Diag_2_Actual_Value = diag_2_Actual_Value;
    }

    public double getDiag_2_NormaL_Range() {
        return Diag_2_NormaL_Range;
    }

    public void setDiag_2_NormaL_Range(double diag_2_NormaL_Range) {
        Diag_2_NormaL_Range = diag_2_NormaL_Range;
    }

    public double getDiag_3_Actual_Value() {
        return Diag_3_Actual_Value;
    }

    public void setDiag_3_Actual_Value(double diag_3_Actual_Value) {
        Diag_3_Actual_Value = diag_3_Actual_Value;
    }

    public double getDiag_3_NormaL_Range() {
        return Diag_3_NormaL_Range;
    }

    public void setDiag_3_NormaL_Range(double diag_3_NormaL_Range) {
        Diag_3_NormaL_Range = diag_3_NormaL_Range;
    }

    public double getDiag_4_Actual_Value() {
        return Diag_4_Actual_Value;
    }

    public void setDiag_4_Actual_Value(double diag_4_Actual_Value) {
        Diag_4_Actual_Value = diag_4_Actual_Value;
    }

    public double getDiag_4_NormaL_Range() {
        return Diag_4_NormaL_Range;
    }

    public void setDiag_4_NormaL_Range(double diag_4_NormaL_Range) {
        Diag_4_NormaL_Range = diag_4_NormaL_Range;
    }

    public double getDiag_5_Actual_Value() {
        return Diag_5_Actual_Value;
    }

    public void setDiag_5_Actual_Value(double diag_5_Actual_Value) {
        Diag_5_Actual_Value = diag_5_Actual_Value;
    }

    public double getDiag_5_NormaL_Range() {
        return Diag_5_NormaL_Range;
    }

    public void setDiag_5_NormaL_Range(double diag_5_NormaL_Range) {
        Diag_5_NormaL_Range = diag_5_NormaL_Range;
    }

    public double getDiag_6_Actual_Value() {
        return Diag_6_Actual_Value;
    }

    public void setDiag_6_Actual_Value(double diag_6_Actual_Value) {
        Diag_6_Actual_Value = diag_6_Actual_Value;
    }

    public double getDiag_6_NormaL_Range() {
        return Diag_6_NormaL_Range;
    }

    public void setDiag_6_NormaL_Range(double diag_6_NormaL_Range) {
        Diag_6_NormaL_Range = diag_6_NormaL_Range;
    }

    public String getDoctors_Comments() {
        return Doctors_Comments;
    }

    public void setDoctors_Comments(String doctors_Comments) {
        Doctors_Comments = doctors_Comments;
    }

    public String getOther_info() {
        return Other_info;
    }

    public void setOther_info(String other_info) {
        Other_info = other_info;
    }

    @Override
    public String toString() {
        return "TestResult [Report_ID=" + Report_ID + ", Patient_Id=" + Patient_Id + ", Doctor_ID="
                + Doctor_ID + ", Medicare_Service_ID=" + Medicare_Service_ID
                + ", Diag_1_Actual_Value=" + Diag_1_Actual_Value + ", Diag_1_NormaL_Range="
                + Diag_1_NormaL_Range + ", Diag_2_Actual_Value=" + Diag_2_Actual_Value
                + ", Diag_2_NormaL_Range=" + Diag_2_NormaL_Range + ", Diag_3_Actual_Value="
                + Diag_3_Actual_Value + ", Diag_3_NormaL_Range=" + Diag_3_NormaL_Range
                + ", Diag_4_Actual_Value=" + Diag_4_Actual_Value + ", Diag_4_NormaL_Range="
                + Diag_4_NormaL_Range + ", Diag_5_Actual_Value=" + Diag_5_Actual_Value
                + ", Diag_5_NormaL_Range=" + Diag_5_NormaL_Range + ", Diag_6_Actual_Value="
                + Diag_6_Actual_Value + ", Diag_6_NormaL_Range=" + Diag_6_NormaL_Range
                + ", Doctors_Comments=" + Doctors_Comments + ", Other_info=" + Other_info + "]";
    }

}
