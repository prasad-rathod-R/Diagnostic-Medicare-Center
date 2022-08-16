package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.PatientDao;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Patient;

/**
 * Servlet implementation class AdminViewPatientServlet
 */
@WebServlet("/AdminViewPatient")
public class AdminViewPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PatientDao registerDao = new PatientDaoSqlImpl();
        List<Patient> patientList = registerDao.getPatientDetails();
        System.out.println(registerDao.getPatientDetails());
        System.out.println(patientList);
        request.setAttribute("register", patientList);
        request.getRequestDispatcher("admin-patient-view.jsp").forward(request, response);
    }

}
