package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.medicare.dao.DoctorDao;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.model.Doctor;

/**
 * Servlet implementation class DoctorLoginServlet
 */
@WebServlet("/DoctorLogin")
public class DoctorLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DoctorDao registerDao = new DoctorDaoSqlImpl();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Doctor doctor = registerDao.getDoctorDetails(username);
            doctor.setFirst_Name(username);
            if (doctor.getPass_word().equals(password)) {
                request.setAttribute("message", "Successfully Registered");
                HttpSession session1 = request.getSession();
                session1.setAttribute("doctorId", doctor.getDoctor_Id());
                request.getRequestDispatcher("doctor-home-page.jsp").forward(request, response);
            } else if (doctor != null && doctor.getFirst_Name() != null) {
                request.getRequestDispatcher("doctor-login.jsp").forward(request, response);
            } else if (doctor != null && doctor.getFirst_Name() != null) {
                request.setAttribute("status", "You are rejected");
                request.getRequestDispatcher("doctor-login.jsp").forward(request, response);
            } else {
                request.setAttribute("message1", "Invalid Username or Password");
                request.getRequestDispatcher("doctor-login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message1", "Invalid Username or Password");
            request.getRequestDispatcher("doctor-login.jsp").forward(request, response);
        }
    }

}
