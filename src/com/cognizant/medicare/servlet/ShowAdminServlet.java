package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.AdminDao;
import com.cognizant.medicare.dao.AdminDaoSqlImpl;
import com.cognizant.medicare.model.Admin;

/**
 * Servlet implementation class ShowAdminServlet
 */
@WebServlet("/ShowAdmin")
public class ShowAdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {
        AdminDao registerDao = new AdminDaoSqlImpl();
        Admin registration = registerDao.getAdminDetails();
        System.out.println("Gender: " + registration.getGender());
        request.setAttribute("register", registration);
        request.getRequestDispatcher("admin-profile.jsp").forward(request, response);
    }
}
