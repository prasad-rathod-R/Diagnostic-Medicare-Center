package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.MedicareDaoSqlImpl;
import com.cognizant.medicare.dao.MedicareServicesDao;
import com.cognizant.medicare.model.MedicareServices;

/**
 * Servlet implementation class DoctorShowEditMedicareServlet
 */
@WebServlet("/DoctorShowEditMedicare")
public class DoctorShowEditMedicareServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long medicareId = Long.parseLong(request.getParameter("medicareId"));
        MedicareServicesDao medicareDao = new MedicareDaoSqlImpl();
        MedicareServices medicare = medicareDao.getMedicareDetails(medicareId);
        request.setAttribute("medicare", medicare);
        request.getRequestDispatcher("doctor-edit-medicare.jsp").forward(request, response);
    }

}