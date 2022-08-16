package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.DoctorDao;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.model.Doctor;

/**
 * Servlet implementation class AdminDeletedDoctorServlet
 */
@WebServlet("/AdminDeletedDoctor")
public class AdminDeletedDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("before1");
            long doctorId = Long.parseLong(request.getParameter("doctorId"));
            System.out.println(doctorId);
            DoctorDao registerDao = new DoctorDaoSqlImpl();
            System.out.println("before");
            registerDao.removeDoctorDetails(doctorId);
            List<Doctor> doctorList = registerDao.getDoctorDetails();
            System.out.println(registerDao.getDoctorDetails());
            System.out.println(doctorList);
            request.setAttribute("removedStatus", true);
            request.setAttribute("register", doctorList);
            request.setAttribute("patient", doctorList);
            request.getRequestDispatcher("admin-doctor-view.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("admin-doctor-view-empty.jsp").forward(request, response);
        }
    }

}
