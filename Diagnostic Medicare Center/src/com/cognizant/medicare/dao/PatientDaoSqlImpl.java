package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.medicare.model.Patient;
import com.cognizant.medicare.util.DateUtil;

public class PatientDaoSqlImpl implements PatientDao {
    @Override
    public void insertPatientDetails(Patient patient) throws ParseException {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO diagnosticmedicarecenter.patient_details (Patient_Id, First_Name, Last_Name, age,gender,DoB, Contact_Number, Alt_Contact_Number, Email_ID, pass_word,Address_Line_1,Address_Line_2,City,State,Zip_Code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, patient.getPatient_Id());
            statement.setString(2, patient.getFirst_Name());
            statement.setString(3, patient.getLast_Name());
            statement.setInt(4, patient.getAge());
            statement.setString(5, patient.getGender());
            statement.setDate(6, DateUtil.convertUtilToSql(patient.getDoB()));
            statement.setLong(7, patient.getContact_Number());
            statement.setLong(8, patient.getAlt_Contact_Number());
            statement.setString(9, patient.getEmail_ID());
            statement.setString(10, patient.getPass_word());
            statement.setString(11, patient.getAddress_Line_1());
            statement.setString(12, patient.getAddress_Line_2());
            statement.setString(13, patient.getCity());
            statement.setString(14, patient.getState());
            statement.setLong(15, patient.getZip_Code());

            result = statement.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

    }

    @Override
    public Patient getPatientDetails(String username) {
        Patient registration = new Patient();
        Connection connection = ConnectionHandler.getConnection();
        try {
            String login = "select pass_word,Patient_Id from patient_details where First_Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(login);
            preparedStatement.setString(1, username);

            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                registration.setPass_word(result.getString(1));
                registration.setPatient_Id(result.getLong(2));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registration;
    }

    @Override
    public List<Patient> getPatientDetails() {
        List<Patient> registration = new ArrayList<Patient>();

        Connection con = ConnectionHandler.getConnection();
        try {

            String insert = "select Patient_Id, First_Name, Last_Name, age, gender, DoB, Contact_Number, Email_ID, pass_word from  patient_details";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                Patient patient = new Patient();
                patient.setPatient_Id(result.getLong(1));
                patient.setFirst_Name(result.getString(2));
                patient.setLast_Name(result.getString(3));
                patient.setAge(result.getInt(4));
                patient.setGender(result.getString(5));
                patient.setDoB(result.getDate(6));
                patient.setContact_Number(result.getLong(7));
                patient.setEmail_ID(result.getString(8));
                patient.setPass_word(result.getString(9));
                registration.add(patient);

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registration;
    }

    @Override
    public void removePatientDetails(long Patient_Id) {
        PreparedStatement statement = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String delete = "delete from patient_details where Patient_Id = ?";
            statement = connection.prepareStatement(delete);
            statement.setLong(1, Patient_Id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("SQL Exception when removing details.");
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void updatePatientDetails(Patient patient) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update patient_details set First_Name=?, Last_Name=?, age=?,gender=?,DoB=?, Contact_Number=?,Email_ID=?, pass_word=? where Patient_Id=?";

            statement = connection.prepareStatement(update);

            statement.setString(1, patient.getFirst_Name());
            statement.setString(2, patient.getLast_Name());
            statement.setInt(3, patient.getAge());
            statement.setString(4, patient.getGender());
            statement.setDate(5, DateUtil.convertUtilToSql(patient.getDoB()));
            statement.setLong(6, patient.getContact_Number());

            statement.setString(7, patient.getEmail_ID());
            statement.setString(8, patient.getPass_word());

            statement.setLong(9, patient.getPatient_Id());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Exception Message: " + e);
            throw new RuntimeException("SQL Exception When Editing the Details.");
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            }
        }
    }

    @Override
    public Patient getPatientDetails(long patientId) {
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection = ConnectionHandler.getConnection();
        Patient patient = new Patient();
        try {
            String select = "select * from  patient_details WHERE Patient_Id=?";
            statement = connection.prepareStatement(select);
            statement.setLong(1, patientId);
            System.out.println(patientId);
            result = statement.executeQuery();
            while (result.next()) {
                patient.setPatient_Id(result.getLong(1));
                patient.setFirst_Name(result.getString(2));
                patient.setLast_Name(result.getString(3));
                patient.setAge((result.getInt(4)));
                patient.setGender((result.getString(5)));
                patient.setDoB((result.getDate(6)));
                patient.setContact_Number((result.getLong(7)));
                patient.setAlt_Contact_Number((result.getLong(8)));
                patient.setEmail_ID((result.getString(9)));
                patient.setPass_word((result.getString(10)));
                patient.setAddress_Line_1((result.getString(11)));
                patient.setAddress_Line_2((result.getString(12)));
                patient.setCity((result.getString(13)));
                patient.setState((result.getString(14)));
                patient.setState((result.getString(14)));
                patient.setZip_Code((result.getLong(15)));

            }
        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return patient;

    }

    @Override
    public Patient getPatientDetail() {
        Connection con = ConnectionHandler.getConnection();
        Patient patient = new Patient();
        try {

            String insert = "select * from  patient_details";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                patient.setPatient_Id(result.getLong(1));
                patient.setFirst_Name(result.getString(2));
                patient.setLast_Name(result.getString(3));
                patient.setAge(result.getInt(4));
                patient.setGender(result.getString(5));
                patient.setDoB(result.getDate(6));
                patient.setContact_Number(result.getLong(7));
                patient.setAlt_Contact_Number(result.getLong(8));
                patient.setEmail_ID(result.getString(9));
                patient.setPass_word(result.getString(10));
                patient.setAddress_Line_1(result.getString(11));
                patient.setAddress_Line_2(result.getString(12));
                patient.setCity(result.getString(13));
                patient.setState(result.getString(14));
                patient.setZip_Code(result.getLong(15));

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return patient;
    }
}
