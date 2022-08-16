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
 * Servlet implementation class AdminShowEditDoctorServlet
 */
@WebServlet("/AdminShowEditDoctor")
public class AdminShowEditDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long doctor_Id = Long.parseLong(request.getParameter("doctor_Id"));

        System.out.println("inside AdminShowEditDoctorServlet doctor_Id " + doctor_Id);
        DoctorDao doctorDao = new DoctorDaoSqlImpl();
        Doctor doctor = doctorDao.getDoctorDetails(doctor_Id);
        request.setAttribute("doctor", doctor);
        request.getRequestDispatcher("admin-edit-doctor.jsp").forward(request, response);

    }

}
