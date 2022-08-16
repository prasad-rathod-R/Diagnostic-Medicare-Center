package com.cognizant.medicare.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.medicare.dao.AdminDao;
import com.cognizant.medicare.dao.AdminDaoSqlImpl;
import com.cognizant.medicare.model.Admin;

/**
 * Servlet implementation class AdminLginServlet
 */
@WebServlet("/AdminLginServlet")
public class AdminLginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            AdminDao registerDao = new AdminDaoSqlImpl();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Admin admin = registerDao.getAdminDetails(username);
            admin.setFirst_Name(username);
            if (admin.getPass_word().equals(password)) {
                request.setAttribute("message", "Successfully Registered");
                HttpSession session1 = request.getSession();
                session1.setAttribute("adminId", admin.getAdmin_Id());
                request.getRequestDispatcher("admin-home-page.jsp").forward(request, response);
            } else {
                request.setAttribute("message1", "Invalid Username or Password");
                request.getRequestDispatcher("admin-login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message1", "Invalid Username or Password");
            request.getRequestDispatcher("admin-login.jsp").forward(request, response);
        }

    }

}
