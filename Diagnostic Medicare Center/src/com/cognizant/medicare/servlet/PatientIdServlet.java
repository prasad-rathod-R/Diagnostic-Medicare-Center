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
 * Servlet implementation class PatientIdServlet
 */
@WebServlet("/PatientId")
public class PatientIdServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PatientDao registerDao = new PatientDaoSqlImpl();
        Patient registration = registerDao.getPatientDetail();
        System.out.println("Gender: " + registration.getGender());
        System.out.println("" + registration.getPatient_Id());
        request.setAttribute("patient", registration);
        request.getRequestDispatcher("Booking-home-page.jsp").forward(request, response);
    }

}
