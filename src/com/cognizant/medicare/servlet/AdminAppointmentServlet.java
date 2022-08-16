package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.BookingDao;
import com.cognizant.medicare.dao.BookingDaoSqlImpl;
import com.cognizant.medicare.model.BookingDetails;

/**
 * Servlet implementation class AdminAppointmentServlet
 */
@WebServlet("/AdminAppointment")
public class AdminAppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookingDao registerDao = new BookingDaoSqlImpl();
        List<BookingDetails> bookingList = registerDao.getBookingDetails();
        System.out.println(registerDao.getBookingDetails());
        System.out.println(bookingList);
        request.setAttribute("register", bookingList);
        request.getRequestDispatcher("admin-appointment-view.jsp").forward(request, response);
    }

}
