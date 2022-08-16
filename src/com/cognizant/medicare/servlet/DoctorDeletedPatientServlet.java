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
 * Servlet implementation class DoctorDeletedPatientServlet
 */
@WebServlet("/DoctorDeletedPatient")
public class DoctorDeletedPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("before1");
            long patientId = Long.parseLong(request.getParameter("patientId"));
            System.out.println(patientId);
            PatientDao registerDao = new PatientDaoSqlImpl();
            System.out.println("before");
            registerDao.removePatientDetails(patientId);
            List<Patient> patientList = registerDao.getPatientDetails();
            System.out.println(registerDao.getPatientDetails());
            System.out.println(patientList);
            request.setAttribute("removedStatus", true);
            request.setAttribute("register", patientList);
            request.setAttribute("patient", patientList);
            request.getRequestDispatcher("doctor-patient-view.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("doctor-patient-view-empty.jsp").forward(request,
                    response);
        }
    }

}
