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
import com.cognizant.medicare.util.DateUtil;

/**
 * Servlet implementation class AdminRegisteredDoctorServlet
 */
@WebServlet("/AdminRegisteredDoctor")
public class AdminRegisteredDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside loginservlet begin");
        DoctorDao registerDao = new DoctorDaoSqlImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        try {
            System.out.println("inside loginservlet inside else if");
            long Doctor_Id = Long.parseLong(request.getParameter("doctorId"));
            String First_Name = request.getParameter("firstName");
            String Last_Name = request.getParameter("lastName");
            int age = Integer.parseInt(request.getParameter("age"));
            String Gender = request.getParameter("gender");

            String Degree = request.getParameter("degree");
            String Speciality = request.getParameter("speciality");
            String fromWorkhours = request.getParameter("from");
            String toWorkhours = request.getParameter("to");

            String workhours = fromWorkhours + " " + toWorkhours;
            System.out.println("inside servlet workhours " + workhours);
            String Hospital_Name = request.getParameter("hospitalName");
            long Medicare_Service_ID = Long.parseLong(request.getParameter("medicareServiceId"));
            String DoB = (request.getParameter("dateOfBirth"));
            long Contact_Number = Long.parseLong(request.getParameter("contactNumber"));
            String alternateNumber = request.getParameter("alternateNumber");
            long Alt_Contact_Number = 0;
            if (!alternateNumber.equals("")) {
                Alt_Contact_Number = Long.parseLong(alternateNumber);
            }
            String Email_ID = request.getParameter("email");
            String pass_word = request.getParameter("password");
            String Address_Line_1 = request.getParameter("addressLine1");
            String Address_Line_2 = request.getParameter("addressLine2");
            String City = request.getParameter("city");
            String state = request.getParameter("state");
            long Zip_Code = Long.parseLong(request.getParameter("zipCode"));

            Doctor doctor = new Doctor(Doctor_Id, First_Name, Last_Name, age, Gender,
                    DateUtil.convertStringToUtilDate(DoB), Contact_Number, Alt_Contact_Number,
                    Email_ID, pass_word, Address_Line_1, Address_Line_2, City, state, Zip_Code,
                    Degree, Speciality, Hospital_Name, workhours, Medicare_Service_ID);
            System.out.println("inside loginservlet before insert");
            registerDao.insertDoctorDetails(doctor);
            System.out.println("inside loginservlet after insert");
            request.setAttribute("successmessage", "Successfully registeres,click here to login");
            request.getRequestDispatcher("admin-registered-doctor.jsp").forward(request, response);

            /*
             * else { request.setAttribute("message",
             * "Data not found,click here to register");
             * request.getRequestDispatcher("admin-login.jsp").forward(request, response); }
             */
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("failure", "not inserted");
            request.getRequestDispatcher("admin-registered-doctor.jsp").forward(request, response);
        }
    }

}
