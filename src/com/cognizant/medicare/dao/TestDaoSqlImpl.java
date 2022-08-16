package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.model.TestResults;
import com.cognizant.medicare.util.DateUtil;

public class TestDaoSqlImpl implements TestResultsDao {
    public void insertTestResultsDetails(TestResults test) throws ParseException {

        System.out.println("doctor id " + test.getDoctor_ID());
        System.out.println("Patient_Id " + test.getPatient_Id());
        System.out.println("Medicare_Service_ID " + test.getMedicare_Service_ID());

        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO `diagnosticmedicarecenter`.`medical_test_history`(`Report_ID`,`Patient_Id`,`Doctor_ID`,`Medicare_Service_ID`,`Service_date`,`Test_Result_date`,`Diag_1–Actual_Value`,`Diag_1–NormaL_Range`,`Diag_2–Actual_Value`,\r\n"
                    + "`Diag_2–NormaL_Range`,`Diag_3–Actual_Value`,`Diag_3–NormaL_Range`,`Diag_4–Actual_Value`,`Diag_4–NormaL_Range`,`Diag_5–Actual_Value`,`Diag_5–NormaL_Range`,`Diag_6–Actual_Value`,`Diag_6–NormaL_Range`,\r\n"
                    + "`Doctors_Comments`,`Other_info`)\r\n"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, test.getReport_ID());
            statement.setLong(2, test.getPatient_Id());
            statement.setLong(3, test.getDoctor_ID());
            statement.setLong(4, test.getMedicare_Service_ID());
            statement.setDate(5, DateUtil.convertUtilToSql(test.getService_date()));
            statement.setDate(6, DateUtil.convertUtilToSql(test.getTest_Result_date()));
            statement.setDouble(7, test.getDiag_1_Actual_Value());
            statement.setDouble(8, test.getDiag_1_NormaL_Range());
            statement.setDouble(9, test.getDiag_2_Actual_Value());
            statement.setDouble(10, test.getDiag_2_NormaL_Range());
            statement.setDouble(11, test.getDiag_3_Actual_Value());
            statement.setDouble(12, test.getDiag_3_NormaL_Range());
            statement.setDouble(13, test.getDiag_4_Actual_Value());
            statement.setDouble(14, test.getDiag_4_NormaL_Range());
            statement.setDouble(15, test.getDiag_5_Actual_Value());
            statement.setDouble(16, test.getDiag_5_NormaL_Range());
            statement.setDouble(17, test.getDiag_6_Actual_Value());
            statement.setDouble(18, test.getDiag_6_NormaL_Range());
            statement.setString(19, test.getDoctors_Comments());
            statement.setString(20, test.getOther_info());
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
    public List<TestResults> getTestResultsDetails() {
        List<TestResults> registration = new ArrayList<>();

        Connection con = ConnectionHandler.getConnection();

        try {

            String insert = "select * from  medical_test_history";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                TestResults test = new TestResults();
                test.setReport_ID(result.getLong(1));
                test.setPatient_Id(result.getLong(2));

                test.setDoctor_ID(result.getLong(3));
                test.setMedicare_Service_ID(result.getLong(4));
                test.setService_date(result.getDate(5));
                test.setTest_Result_date(result.getDate(6));
                test.setDiag_1_Actual_Value(result.getDouble(7));
                test.setDiag_1_NormaL_Range(result.getDouble(8));
                test.setDiag_2_Actual_Value(result.getDouble(9));
                test.setDiag_2_NormaL_Range(result.getDouble(10));
                test.setDiag_3_Actual_Value(result.getDouble(11));
                test.setDiag_3_NormaL_Range(result.getDouble(12));
                test.setDiag_4_Actual_Value(result.getDouble(13));
                test.setDiag_4_NormaL_Range(result.getDouble(14));
                test.setDiag_5_Actual_Value(result.getDouble(15));
                test.setDiag_5_NormaL_Range(result.getDouble(16));
                test.setDiag_6_Actual_Value(result.getDouble(17));
                test.setDiag_6_NormaL_Range(result.getDouble(18));
                test.setDoctors_Comments(result.getString(19));
                test.setOther_info(result.getString(20));

                registration.add(test);

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
    public void updateTestResults(TestResults test) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update medical_test_history set Patient_Id=?,"
                    + " Doctor_ID=?,Medicare_Service_ID=?,Service_date=?, "
                    + "Test_Result_date=?,Diag_1–Actual_Value=?, Diag_1–NormaL_Range=? ,"
                    + "Diag_2–Actual_Value=?, Diag_2–NormaL_Range=?,Diag_3–Actual_Value=?,"
                    + " Diag_3–NormaL_Range=?,Diag_4–Actual_Value=?, Diag_4–NormaL_Range=?,Diag_5–Actual_Value=?, "
                    + "Diag_5–NormaL_Range=?,Diag_6–Actual_Value=?, Diag_6–NormaL_Range=?,Doctors_Comments=?,Other_info=? where Report_Id=?";

            statement = connection.prepareStatement(update);

            statement.setLong(1, test.getPatient_Id());
            statement.setLong(2, test.getDoctor_ID());
            statement.setLong(3, test.getMedicare_Service_ID());
            statement.setDate(4, DateUtil.convertUtilToSql(test.getService_date()));
            statement.setDate(5, DateUtil.convertUtilToSql(test.getTest_Result_date()));
            statement.setDouble(6, test.getDiag_1_Actual_Value());
            statement.setDouble(7, test.getDiag_1_NormaL_Range());
            statement.setDouble(8, test.getDiag_2_Actual_Value());
            statement.setDouble(9, test.getDiag_2_NormaL_Range());
            statement.setDouble(10, test.getDiag_3_Actual_Value());
            statement.setDouble(11, test.getDiag_3_NormaL_Range());
            statement.setDouble(12, test.getDiag_4_Actual_Value());
            statement.setDouble(13, test.getDiag_4_NormaL_Range());
            statement.setDouble(14, test.getDiag_5_Actual_Value());
            statement.setDouble(15, test.getDiag_5_NormaL_Range());
            statement.setDouble(16, test.getDiag_6_Actual_Value());
            statement.setDouble(17, test.getDiag_6_NormaL_Range());
            statement.setString(18, test.getDoctors_Comments());
            statement.setString(19, test.getOther_info());
            statement.setLong(20, test.getReport_ID());

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
    public TestResults getTestResults(long reportId) {

        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection = ConnectionHandler.getConnection();
        TestResults test = new TestResults();
        try {
            String select = "select * from medical_test_history WHERE Report_Id=?";
            statement = connection.prepareStatement(select);
            statement.setLong(1, reportId);
            System.out.println(reportId);
            result = statement.executeQuery();
            while (result.next()) {
                test.setReport_ID(result.getLong(1));
                test.setPatient_Id(result.getLong(2));
                test.setDoctor_ID(result.getLong(3));
                test.setMedicare_Service_ID((result.getLong(4)));
                test.setService_date((result.getDate(5)));
                test.setTest_Result_date((result.getDate(6)));
                test.setDiag_1_Actual_Value((result.getDouble(7)));
                test.setDiag_1_NormaL_Range((result.getDouble(8)));
                test.setDiag_2_Actual_Value((result.getDouble(9)));
                test.setDiag_2_NormaL_Range((result.getDouble(10)));
                test.setDiag_3_Actual_Value((result.getDouble(11)));
                test.setDiag_3_NormaL_Range((result.getDouble(12)));
                test.setDiag_4_Actual_Value((result.getDouble(13)));
                test.setDiag_4_NormaL_Range((result.getDouble(14)));
                test.setDiag_5_Actual_Value((result.getDouble(15)));
                test.setDiag_5_NormaL_Range((result.getDouble(16)));
                test.setDiag_6_Actual_Value((result.getDouble(17)));
                test.setDiag_6_NormaL_Range((result.getDouble(18)));
                test.setDoctors_Comments((result.getString(19)));
                test.setOther_info((result.getString(20)));
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
        return test;

    }

    @Override
    public TestResults getTestDetails() {
        Connection con = ConnectionHandler.getConnection();

        TestResults test = new TestResults();
        try {

            String insert = "select * from  medical_test_history";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                test.setReport_ID(result.getLong(1));
                test.setPatient_Id(result.getLong(2));

                test.setDoctor_ID(result.getLong(3));
                test.setMedicare_Service_ID(result.getLong(4));
                test.setService_date(result.getDate(5));
                test.setTest_Result_date(result.getDate(6));
                test.setDiag_1_Actual_Value(result.getDouble(7));
                test.setDiag_1_NormaL_Range(result.getDouble(8));
                test.setDiag_2_Actual_Value(result.getDouble(9));
                test.setDiag_2_NormaL_Range(result.getDouble(10));
                test.setDiag_3_Actual_Value(result.getDouble(11));
                test.setDiag_3_NormaL_Range(result.getDouble(12));
                test.setDiag_4_Actual_Value(result.getDouble(13));
                test.setDiag_4_NormaL_Range(result.getDouble(14));
                test.setDiag_5_Actual_Value(result.getDouble(15));
                test.setDiag_5_NormaL_Range(result.getDouble(16));
                test.setDiag_6_Actual_Value(result.getDouble(17));
                test.setDiag_6_NormaL_Range(result.getDouble(18));
                test.setDoctors_Comments(result.getString(19));
                test.setOther_info(result.getString(20));

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
        return test;
    }

}
