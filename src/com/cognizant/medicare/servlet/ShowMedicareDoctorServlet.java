package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.MedicareDaoSqlImpl;
import com.cognizant.medicare.dao.MedicareServicesDao;
import com.cognizant.medicare.model.MedicareServices;

/**
 * Servlet implementation class ShowMedicareDoctorServlet
 */
@WebServlet("/ShowMedicareDoctor")
public class ShowMedicareDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MedicareServicesDao medicareDao = new MedicareDaoSqlImpl();
        List<MedicareServices> medicareList = medicareDao.getMedicareDetails();
        request.setAttribute("medicare", medicareList);
        request.getRequestDispatcher("doctor-show-medicare.jsp").forward(request, response);
    }

}
