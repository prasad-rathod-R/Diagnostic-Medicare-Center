package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.DoctorDao;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.model.Doctor;

/**
 * Servlet implementation class AdminEditDoctorPendingServlet
 */
@WebServlet("/AdminEditDoctorPending")
public class AdminEditDoctorPendingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long doctorId = Long.parseLong(request.getParameter("doctorId"));
        DoctorDao doctorDao = new DoctorDaoSqlImpl();
        Doctor doctor = doctorDao.getDoctorPendingDetails(doctorId);
        request.setAttribute("doctor", doctor);
        request.getRequestDispatcher("doctor-approval-request.jsp").forward(request, response);
    }

}
