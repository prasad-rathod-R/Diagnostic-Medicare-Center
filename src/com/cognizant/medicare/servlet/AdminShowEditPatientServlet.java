package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.PatientDao;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Patient;

/**
 * Servlet implementation class AdminShowEditPatientServlet
 */
@WebServlet("/AdminShowEditPatient")
public class AdminShowEditPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long patientId = Long.parseLong(request.getParameter("patientId"));
        System.out.println(" AdminShowEditPatientServlet patientId " + patientId);
        PatientDao patientDao = new PatientDaoSqlImpl();
        Patient patient = patientDao.getPatientDetails(patientId);
        request.setAttribute("patient", patient);
        request.getRequestDispatcher("admin-edit-patient.jsp").forward(request, response);
    }

}
