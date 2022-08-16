package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.medicare.dao.PatientDao;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Patient;

/**
 * Servlet implementation class PatientLoginServlet
 */
@WebServlet("/PatientLogin")
public class PatientLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PatientDao registerDao = new PatientDaoSqlImpl();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Patient patient = registerDao.getPatientDetails(username);
            patient.setFirst_Name(username);
            if (patient.getPass_word().equals(password)) {
                request.setAttribute("message", "Successfully Registered");
                HttpSession session1 = request.getSession();
                session1.setAttribute("patientId", patient.getPatient_Id());
                request.setAttribute("patient", patient);
                request.getRequestDispatcher("patient-home-page.jsp").forward(request, response);
            } else {
                request.setAttribute("message1", "Invalid Username or Password");
                request.getRequestDispatcher("patient-login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message1", "Invalid Username or Password");
            request.getRequestDispatcher("patient-login.jsp").forward(request, response);
        }

    }

}
