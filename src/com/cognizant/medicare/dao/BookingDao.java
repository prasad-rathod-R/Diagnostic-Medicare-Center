package com.cognizant.medicare.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.medicare.model.BookingDetails;

public interface BookingDao {
    public void insertBookingDetails(BookingDetails booking) throws ParseException;

    public List<BookingDetails> getBookingDetails();

    public void updateBookingDetails(BookingDetails booking);

    public BookingDetails getBookingDetail(long bookingId);

    public BookingDetails getBookPatientDetail(long bookingId);
}
