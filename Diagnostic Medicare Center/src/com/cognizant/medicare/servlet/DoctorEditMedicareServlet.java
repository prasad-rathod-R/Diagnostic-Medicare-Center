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
 * Servlet implementation class DoctorEditMedicareServlet
 */
@WebServlet("/DoctorEditMedicare")
public class DoctorEditMedicareServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long Medicare_Service_ID = Long.parseLong(request.getParameter("medicareId"));
        String Medicare_Service = request.getParameter("medicareName");
        String Service_Description = request.getParameter("description");
        double Amount = Double.parseDouble(request.getParameter("amount"));

        MedicareServices medicare = new MedicareServices(Medicare_Service_ID, Medicare_Service,
                Service_Description, Amount);

        MedicareServicesDao medicareServicesDao = new MedicareDaoSqlImpl();
        medicareServicesDao.updateMedicare(medicare);
        request.setAttribute("medicare", "Successfully Updated Medicare Details");
        request.getRequestDispatcher("edit-medicare-status.jsp").forward(request, response);

    }

}
