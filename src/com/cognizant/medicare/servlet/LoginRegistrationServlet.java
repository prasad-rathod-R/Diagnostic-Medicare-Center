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
import com.cognizant.medicare.util.DateUtil;

@WebServlet("/LoginRegistration")
public class LoginRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside loginservlet begin");
        AdminDao registerDao = new AdminDaoSqlImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        try {
            // Admin admin = registerDao.getAdminDetails(username, password);

            System.out.println("inside loginservlet inside else if");
            long Admin_Id = Long.parseLong(request.getParameter("adminId"));
            String First_Name = request.getParameter("firstName");
            String Last_Name = request.getParameter("lastName");
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");
            String DoB = (request.getParameter("dob"));
            long Contact_Number = Long.parseLong(request.getParameter("contactNumber"));
            String alternateNumber = request.getParameter("alternateNumber");
            long Alt_Contact_Number = 0;
            if (!alternateNumber.equals("")) {
                Alt_Contact_Number = Long.parseLong(alternateNumber);
            }
            String Email_ID = request.getParameter("email");
            String pass_word = request.getParameter("password");
            Admin admin = new Admin(Admin_Id, First_Name, Last_Name, age, gender,
                    DateUtil.convertStringToUtilDate(DoB), Contact_Number, Alt_Contact_Number,
                    Email_ID, pass_word);
            System.out.println("inside loginservlet before insert");
            registerDao.insertAdminDetails(admin);
            System.out.println("inside loginservlet after insert");
            request.setAttribute("successmessage", "Successfully registeres,click here to login");
            request.getRequestDispatcher("admin-login.jsp").forward(request, response);
            System.out.println(gender);

        }
        /*
         * else { request.setAttribute("message",
         * "Data not found,click here to register");
         * request.getRequestDispatcher("admin-login.jsp").forward(request, response); }
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
