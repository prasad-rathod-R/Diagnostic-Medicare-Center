package com.cognizant.medicare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.model.BookingDetails;
import com.cognizant.medicare.model.Patient;
import com.cognizant.medicare.util.DateUtil;

public class BookingDaoSqlImpl implements BookingDao {

    @Override
    public void insertBookingDetails(BookingDetails booking) throws ParseException {
        Connection connection = ConnectionHandler.getConnection();
        @SuppressWarnings("unused")
        int result = 0;
        try {
            String sql = "INSERT INTO diagnosticmedicarecenter.booking_details (Booking_id,Booking_date,Patient_Id,Doctor_ID,Booking_status) values(?,?,?,?,?)";

            System.out.println("sql " + sql);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, booking.getBooking_id());
            statement.setDate(2, DateUtil.convertUtilToSql(booking.getBooking_date()));
            statement.setLong(3, booking.getPatient_Id());
            statement.setLong(4, booking.getDoctor_ID());
            statement.setString(5, booking.getBooking_status());
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
    public List<BookingDetails> getBookingDetails() {
        List<BookingDetails> registration = new ArrayList<BookingDetails>();
        // List<Patient> patients = new ArrayList<Patient>();

        Connection con = ConnectionHandler.getConnection();
        try {

            // String insert = "select Patient_Id, First_Name, Last_Name, age, gender, DoB,
            // Contact_Number, Email_ID, pass_word from patient_details";
            String select = "select p.Patient_Id,booking_details.Booking_id,p.First_Name,p.Last_Name,p.age,p.gender,booking_details.Booking_Date,booking_details.Booking_status from booking_details inner join patient_details p on booking_details.Patient_Id=p.Patient_Id";
            PreparedStatement preparedStatement = con.prepareStatement(select);

            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                BookingDetails booking = new BookingDetails();
                booking.setPatient_Id(result.getLong(1));
                booking.setBooking_id(result.getLong(2));
                booking.setFirst_Name(result.getString(3));
                booking.setLast_Name(result.getString(4));
                booking.setAge(result.getInt(5));
                booking.setGender(result.getString(6));
                booking.setBooking_date(result.getDate(7));
                booking.setBooking_status(result.getString(8));
                registration.add(booking);

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
    public void updateBookingDetails(BookingDetails booking) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionHandler.getConnection();
        try {
            String update = "update booking_details set Booking_date=?, Patient_Id=?,Doctor_ID=?,Booking_status=? where Booking_id=? AND Patient_Id=? AND Doctor_ID=?";

            statement = connection.prepareStatement(update);

            statement.setDate(1, DateUtil.convertUtilToSql(booking.getBooking_date()));
            statement.setLong(2, booking.getPatient_Id());
            statement.setLong(3, booking.getDoctor_ID());
            statement.setString(4, booking.getBooking_status());
            statement.setLong(5, booking.getBooking_id());
            statement.setLong(6, booking.getPatient_Id());
            statement.setLong(7, booking.getDoctor_ID());
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
    public BookingDetails getBookingDetail(long bookingId) {
        Connection con = ConnectionHandler.getConnection();
        BookingDetails bookingDetails = new BookingDetails();
        try {

            String insert = "select * from  booking_details where Booking_id=?";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            preparedStatement.setLong(1, bookingId);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                bookingDetails.setBooking_id(result.getLong(1));
                bookingDetails.setBooking_date(result.getDate(2));
                bookingDetails.setPatient_Id(result.getLong(3));
                bookingDetails.setDoctor_ID(result.getLong(4));
                bookingDetails.setBooking_status(result.getString(5));

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
        return bookingDetails;
    }

    @Override
    public BookingDetails getBookPatientDetail(long bookingId) {
        Connection con = ConnectionHandler.getConnection();
        BookingDetails bookingDetails = new BookingDetails();
        try {

            String insert = "select * from  booking_details where Patient_Id=?";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            preparedStatement.setLong(1, bookingId);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {

                bookingDetails.setBooking_id(result.getLong(1));
                bookingDetails.setBooking_date(result.getDate(2));
                bookingDetails.setPatient_Id(result.getLong(3));
                bookingDetails.setDoctor_ID(result.getLong(4));
                bookingDetails.setBooking_status(result.getString(5));

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
        return bookingDetails;
    }

}
