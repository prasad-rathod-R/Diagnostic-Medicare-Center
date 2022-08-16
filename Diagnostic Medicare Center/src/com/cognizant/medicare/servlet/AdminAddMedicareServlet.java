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
 * Servlet implementation class AdminAddMedicareServlet
 */
@WebServlet("/AdminAddMedicare")
public class AdminAddMedicareServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            MedicareServicesDao medicareDao = new MedicareDaoSqlImpl();
            long Medicare_Service_ID = Long.parseLong(request.getParameter("medicareId"));
            String Medicare_Service = request.getParameter("medicareName");
            String Service_Description = request.getParameter("description");
            double Amount = Double.parseDouble(request.getParameter("amount"));
            MedicareServices medicare = new MedicareServices(Medicare_Service_ID, Medicare_Service,
                    Service_Description, Amount);
            medicareDao.insertMedicareDetails(medicare);
            request.setAttribute("successmessage", "Successfully Added");
            request.getRequestDispatcher("medicare-admin-page.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("failuremessage", "Details not Added");
            request.getRequestDispatcher("medicare-admin-page.jsp").forward(request, response);
        }
    }

}
