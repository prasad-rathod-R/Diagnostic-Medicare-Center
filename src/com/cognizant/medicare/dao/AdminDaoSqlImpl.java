package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.util.DateUtil;

public class AdminDaoSqlImpl implements AdminDao {

    @Override
    public void insertAdminDetails(Admin admin) throws ParseException {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO diagnosticmedicarecenter.admin_details (Admin_Id, First_Name, Last_Name, age,gender,DoB, Contact_Number, Alt_Contact_Number, Email_ID, pass_word) values(?,?,?,?,?,?,?,?,?,?)";

            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, admin.getAdmin_Id());
            statement.setString(2, admin.getFirst_Name());
            statement.setString(3, admin.getLast_Name());
            statement.setInt(4, admin.getAge());
            statement.setString(5, admin.getGender());
            statement.setDate(6, DateUtil.convertUtilToSql(admin.getDoB()));
            statement.setLong(7, admin.getContact_Number());
            statement.setLong(8, admin.getAlt_Contact_Number());
            statement.setString(9, admin.getEmail_ID());
            statement.setString(10, admin.getPass_word());
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
    public Admin getAdminDetails(String username) {
        Admin registration = new Admin();
        Connection connection = ConnectionHandler.getConnection();
        try {
            String login = "select pass_word,Admin_Id from admin_details where First_Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(login);
            preparedStatement.setString(1, username);

            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                registration.setPass_word(result.getString(1));
                registration.setAdmin_Id(result.getLong(2));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registration;
    }

    @Override
    public Admin getAdminDetails() {

        Connection con = ConnectionHandler.getConnection();
        Admin admin = new Admin();
        try {

            String insert = "select * from  admin_details";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                admin.setAdmin_Id(result.getLong(1));
                admin.setFirst_Name(result.getString(2));
                admin.setLast_Name(result.getString(3));
                admin.setAge(result.getInt(4));
                admin.setGender(result.getString(5));
                System.out.println("Gender: " + result.getString(5));
                admin.setDoB(result.getDate(6));
                admin.setContact_Number(result.getLong(7));
                admin.setAlt_Contact_Number(result.getLong(8));
                admin.setEmail_ID(result.getString(9));
                admin.setPass_word(result.getString(10));

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
        return admin;
    }

    @Override
    public void updateAdminDetails(Admin admin) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update admin_details set First_Name=?, Last_Name=?, age=?,gender=?,DoB=?, Contact_Number=?, Alt_Contact_Number=?, Email_ID=?, pass_word=? where Admin_Id=?";

            statement = connection.prepareStatement(update);
            statement.setString(1, admin.getFirst_Name());
            statement.setString(2, admin.getLast_Name());
            statement.setInt(3, admin.getAge());
            statement.setString(4, admin.getGender());
            statement.setDate(5, DateUtil.convertUtilToSql(admin.getDoB()));
            statement.setLong(6, admin.getContact_Number());
            statement.setLong(7, admin.getAlt_Contact_Number());
            statement.setString(8, admin.getEmail_ID());
            statement.setString(9, admin.getPass_word());
            statement.setLong(10, admin.getAdmin_Id());
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

}
