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
 * Servlet implementation class ShowDoctorServlet
 */
@WebServlet("/ShowDoctor")
public class ShowDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DoctorDao doctorDao = new DoctorDaoSqlImpl();
        List<Doctor> doctorList = doctorDao.getDoctorDetails();
        System.out.println(doctorList);
        request.setAttribute("register", doctorList);
        request.getRequestDispatcher("admin-doctor-view.jsp").forward(request, response);
    }

}
