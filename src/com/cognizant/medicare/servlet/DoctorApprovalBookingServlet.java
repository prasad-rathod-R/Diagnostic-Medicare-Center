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
 * Servlet implementation class DoctorApprovalBookingServlet
 */
@WebServlet("/DoctorApprovalBooking")
public class DoctorApprovalBookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookingDao bookingDao = new BookingDaoSqlImpl();
        try {
            System.out.println("booking id " + request.getParameter("bookingId"));
            long Booking_id = Long.parseLong(request.getParameter("bookingId"));
            String Booking_date = request.getParameter("bookingDate");
            long Patient_Id = Long.parseLong(request.getParameter("PatientId"));
            long Doctor_ID = Long.parseLong(request.getParameter("doctorId"));
            String Booking_status = request.getParameter("status");

            System.out.println("Booking_id " + Booking_id);
            System.out.println("Booking_date " + Booking_date);
            System.out.println("Patient_Id " + Patient_Id);
            System.out.println("Booking_status  " + Booking_status);

            BookingDetails booking = new BookingDetails(Booking_id,
                    DateUtil.convertStringToUtilDate(Booking_date), Patient_Id, Doctor_ID,
                    Booking_status);
            System.out.println("inside loginservlet before update");
            bookingDao.updateBookingDetails(booking);
            System.out.println("inside loginservlet after update");
            request.setAttribute("successmessage", "Successfully Updated");
            request.getRequestDispatcher("doctor-status.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("failuremessage", " Update failed");
            request.getRequestDispatcher("doctor-status.jsp").forward(request, response);

        }
    }

}
