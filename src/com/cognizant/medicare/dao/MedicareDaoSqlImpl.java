package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.medicare.model.MedicareServices;

public class MedicareDaoSqlImpl implements MedicareServicesDao {
    @Override
    public void insertMedicareDetails(MedicareServices medicare) throws ParseException {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO diagnosticmedicarecenter.medicare_services_details (Medicare_Service_ID,Medicare_Service,Service_Description,Amount) values(?,?,?,?)";

            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, medicare.getMedicare_Service_ID());
            statement.setString(2, medicare.getMedicare_Service());
            statement.setString(3, medicare.getService_Description());
            statement.setDouble(4, medicare.getAmount());

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

    /*
     * @Override public Admin getMedicareDetails(String username, String password) {
     * Admin registration = new Admin(); Connection connection =
     * ConnectionHandler.getConnection(); try { String login =
     * "select * from admin_details where Admin_Id = ? and pass_word = ?";
     * PreparedStatement preparedStatement = connection.prepareStatement(login);
     * preparedStatement.setString(1,username); preparedStatement.setString(2,
     * password); ResultSet result = preparedStatement.executeQuery(); while
     * (result.next()) { registration.setAdmin_Id(result.getLong(1));
     * registration.setPass_word(result.getString(9));
     * registration.setFirst_Name(result.getString(2)); } } catch (SQLException e) {
     * e.printStackTrace(); } return registration; }
     */

    @Override
    public List<MedicareServices> getMedicareDetails() {
        List<MedicareServices> registration = new ArrayList<>();

        Connection con = ConnectionHandler.getConnection();

        try {

            String insert = "select * from  medicare_services_details";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                MedicareServices medicare = new MedicareServices();
                medicare.setMedicare_Service_ID(result.getLong(1));
                medicare.setMedicare_Service(result.getString(2));

                medicare.setService_Description(result.getString(3));
                medicare.setAmount((result.getDouble(4)));
                registration.add(medicare);

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
    public void updateMedicare(MedicareServices medicare) {
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update medicare_services_details set Medicare_Service=?,Service_Description=?,Amount=? where Medicare_Service_ID=?";
            PreparedStatement statement = connection.prepareStatement(update);
            statement.setString(1, medicare.getMedicare_Service());
            statement.setString(2, medicare.getService_Description());
            statement.setDouble(3, medicare.getAmount());
            statement.setLong(4, medicare.getMedicare_Service_ID());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public MedicareServices getMedicareDetails(long medicareId) {
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection = ConnectionHandler.getConnection();
        MedicareServices medicare = new MedicareServices();
        try {
            String select = "select * from  medicare_services_details WHERE Medicare_Service_ID=?";
            statement = connection.prepareStatement(select);
            statement.setLong(1, medicareId);
            result = statement.executeQuery();
            while (result.next()) {
                medicare.setMedicare_Service_ID(result.getLong(1));
                medicare.setMedicare_Service(result.getString(2));
                medicare.setService_Description(result.getString(3));
                medicare.setAmount((result.getDouble(4)));
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
        return medicare;

    }

}
