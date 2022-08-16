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

/**
 * Servlet implementation class AdminEditBookingServlet
 */
@WebServlet("/AdminEditBooking")
public class AdminEditBookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEditBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long bookingId = Long.parseLong(request.getParameter("bookingId"));
        BookingDao bookingDao = new BookingDaoSqlImpl();
        BookingDetails booking = bookingDao.getBookingDetail(bookingId);
        request.setAttribute("booking", booking);
        request.getRequestDispatcher("admin-edit-booking.jsp").forward(request, response);
    }

}
