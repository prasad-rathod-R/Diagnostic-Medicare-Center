package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.medicare.model.Doctor;
import com.cognizant.medicare.util.DateUtil;

public class DoctorDaoSqlImpl implements DoctorDao {

    @Override
    public void insertDoctorDetails(Doctor doctor) throws ParseException {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO diagnosticmedicarecenter.doctor_details (Doctor_Id, First_Name, Last_Name, age,gender,Degree,Speciality,working_Hours,Hospital_Name,Medicare_Service_ID, DoB, Contact_Number, Alt_Contact_Number, Email_ID, pass_word,Address_Line_1,Address_Line_2, City,State,Zip_Code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, doctor.getDoctor_Id());
            statement.setString(2, doctor.getFirst_Name());
            statement.setString(3, doctor.getLast_Name());
            statement.setInt(4, doctor.getAge());
            statement.setString(5, doctor.getGender());
            statement.setString(6, doctor.getDegree());
            statement.setString(7, doctor.getSpeciality());
            statement.setString(8, doctor.getWorking_Hours());
            statement.setString(9, doctor.getHospital_Name());
            statement.setLong(10, doctor.getMedicare_Service_ID());
            statement.setDate(11, DateUtil.convertUtilToSql(doctor.getDoB()));
            statement.setLong(12, doctor.getContact_Number());
            statement.setLong(13, doctor.getAlt_Contact_Number());
            statement.setString(14, doctor.getEmail_ID());
            statement.setString(15, doctor.getPass_word());
            statement.setString(16, doctor.getAddress_Line_1());
            statement.setString(17, doctor.getAddress_Line_2());
            statement.setString(18, doctor.getCity());
            statement.setString(19, doctor.getState());
            statement.setLong(20, doctor.getZip_Code());

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
    public Doctor getDoctorDetails(String username) {
        Doctor registration = new Doctor();
        Connection connection = ConnectionHandler.getConnection();
        try {
            String login = "select pass_word,Doctor_Id from doctor_details where First_Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(login);
            preparedStatement.setString(1, username);

            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                registration.setPass_word(result.getString(1));
                registration.setDoctor_Id(result.getLong(2));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registration;
    }

    @Override
    public List<Doctor> getDoctorDetails() {
        List<Doctor> registration = new ArrayList<Doctor>();
        Connection con = ConnectionHandler.getConnection();
        try {

            String insert = "select Doctor_Id, First_Name, Last_Name,Speciality,Hospital_Name,working_Hours,Medicare_Service_ID,Contact_Number, Email_ID, pass_word,Address_Line_1 from  doctor_details";

            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                Doctor doctor = new Doctor();
                doctor.setDoctor_Id(result.getLong(1));
                doctor.setFirst_Name(result.getString(2));
                doctor.setLast_Name(result.getString(3));
                doctor.setSpeciality(result.getString(4));
                doctor.setWorking_Hours(result.getString(5));
                doctor.setHospital_Name(result.getString(6));
                doctor.setMedicare_Service_ID(result.getLong(7));
                doctor.setContact_Number(result.getLong(8));
                doctor.setEmail_ID(result.getString(9));
                doctor.setPass_word(result.getString(10));
                doctor.setAddress_Line_1(result.getString(11));
                registration.add(doctor);
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
    public void removeDoctorDetails(long doctor_Id) {
        PreparedStatement statement = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String delete = "delete from doctor_details where Doctor_Id = ?";
            statement = connection.prepareStatement(delete);
            statement.setLong(1, doctor_Id);
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
    public void updateDoctorDetails(Doctor doctor) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update doctor_details set First_Name=?, Last_Name=?,Speciality=?,working_Hours=?,Hospital_Name=?,Medicare_Service_ID=?, Contact_Number=?,  Email_ID=?, pass_word=?,Address_Line_1=? where Doctor_Id=?";
            statement = connection.prepareStatement(update);
            statement.setString(1, doctor.getFirst_Name());
            statement.setString(2, doctor.getLast_Name());

            statement.setString(3, doctor.getSpeciality());
            statement.setString(4, doctor.getWorking_Hours());
            statement.setString(5, doctor.getHospital_Name());
            statement.setLong(6, doctor.getMedicare_Service_ID());

            statement.setLong(7, doctor.getContact_Number());

            statement.setString(8, doctor.getEmail_ID());
            statement.setString(9, doctor.getPass_word());
            statement.setString(10, doctor.getAddress_Line_1());

            statement.setLong(11, doctor.getDoctor_Id());
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
    public Doctor getDoctorDetails(long doctor_Id) {
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection = ConnectionHandler.getConnection();
        Doctor doctor = new Doctor();
        try {
            String select = "select * from  doctor_details WHERE Doctor_Id=?";
            statement = connection.prepareStatement(select);
            statement.setLong(1, doctor_Id);
            result = statement.executeQuery();
            while (result.next()) {
                doctor.setDoctor_Id(result.getLong(1));
                doctor.setFirst_Name(result.getString(2));
                doctor.setLast_Name(result.getString(3));
                doctor.setAge(result.getInt(4));
                doctor.setGender(result.getString(5));
                doctor.setDoB(result.getDate(6));
                doctor.setContact_Number(result.getLong(7));
                doctor.setAlt_Contact_Number(result.getLong(8));
                doctor.setEmail_ID(result.getString(9));
                doctor.setPass_word(result.getString(10));
                doctor.setAddress_Line_1(result.getString(11));
                doctor.setAddress_Line_2(result.getString(12));
                doctor.setCity(result.getString(13));
                doctor.setState(result.getString(14));
                doctor.setZip_Code(result.getLong(15));
                doctor.setDegree(result.getString(16));

                doctor.setSpeciality(result.getString(17));
                doctor.setWorking_Hours(result.getString(18));
                doctor.setHospital_Name(result.getString(19));
                doctor.setMedicare_Service_ID(result.getLong(20));

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
        return doctor;

    }

    @Override
    public Doctor getDoctorPendingDetails(Long doctorId) {
        Connection connection = ConnectionHandler.getConnection();

        ResultSet result = null;
        Doctor doctor = null;
        try {
            String sql = "select * from doctor_details where Doctor_Id=?";
            System.out.println("sql" + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, doctorId);
            result = statement.executeQuery();
            while (result.next()) {
                doctor = new Doctor();
                doctor.setDoctor_Id(result.getLong(1));
                doctor.setFirst_Name(result.getString(2));
                doctor.setLast_Name(result.getString(3));
                doctor.setAge(result.getInt(4));
                doctor.setGender(result.getString(5));
                doctor.setDoB(DateUtil.convertUtilToSql(result.getDate(6)));
                doctor.setContact_Number(result.getLong(7));
                doctor.setAlt_Contact_Number(result.getLong(8));
                doctor.setEmail_ID(result.getString(9));
                doctor.setPass_word(result.getString(10));
                doctor.setAddress_Line_1(result.getString(11));
                doctor.setAddress_Line_2(result.getString(12));
                doctor.setCity(result.getString(13));
                doctor.setState(result.getString(14));
                doctor.setZip_Code(result.getLong(15));
                doctor.setDegree(result.getString(16));
                doctor.setSpeciality(result.getString(17));
                doctor.setWorking_Hours(result.getString(18));
                doctor.setHospital_Name(result.getString(19));
                doctor.setMedicare_Service_ID(result.getLong(20));

            }
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return doctor;
    }

    @Override
    public void updateDoctorRequest(Doctor doctor) {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "UPDATE doctor_details set Status=? where Doctor_Id=?";
            System.out.println("sql" + sql);
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setLong(2, doctor.getDoctor_Id());
            statement.executeUpdate();
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
    public List<Doctor> getPendingDetails() {
        ArrayList<Doctor> pendingDoctorList = new ArrayList<Doctor>();
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "select * from doctor_details where Status='pending'";
            System.out.println("sql" + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Doctor pendingDoctor = new Doctor(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getLong(7), rs.getLong(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
                        rs.getString(13), rs.getString(14), rs.getLong(15), rs.getString(16),
                        rs.getString(17), rs.getString(18), rs.getString(19), rs.getLong(20));
                pendingDoctorList.add(pendingDoctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return pendingDoctorList;
    }

}
