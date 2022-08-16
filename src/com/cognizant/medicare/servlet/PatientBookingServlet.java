package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.BookingDao;
import com.cognizant.medicare.dao.BookingDaoSqlImpl;
import com.cognizant.medicare.model.BookingDetails;
import com.cognizant.medicare.util.DateUtil;

/**
 * Servlet implementation class PatientBookingServlet
 */
@WebServlet("/PatientBooking")
public class PatientBookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookingDao bookingDao = new BookingDaoSqlImpl();
        try {
            long Booking_id = Long.parseLong(request.getParameter("bookingId"));
            String Booking_date = request.getParameter("dob1");
            long Patient_Id = Long.parseLong(request.getParameter("PatientId"));
            long Doctor_ID = Long.parseLong(request.getParameter("DoctorId"));
            String Booking_status = request.getParameter("status");
            BookingDetails booking = new BookingDetails(Booking_id,
                    DateUtil.convertStringToUtilDate(Booking_date), Patient_Id, Doctor_ID,
                    Booking_status);
            System.out.println("inside loginservlet before insert");
            bookingDao.insertBookingDetails(booking);
            System.out.println("inside loginservlet after insert");
            request.setAttribute("successmessage", "Your appintment is booked");
            request.getRequestDispatcher("Booking-home-page.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Failed to book appointment");
            request.getRequestDispatcher("Booking-home-page.jsp").forward(request, response);

        }
    }

}
