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
import com.cognizant.medicare.util.DateUtil;

/**
 * Servlet implementation class PatientRegistrationServlet
 */
@WebServlet("/PatientRegistration")
public class PatientRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside loginservlet begin");
        PatientDao registerDao = new PatientDaoSqlImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        try {
            System.out.println("inside loginservlet inside else if");
            long Patient_Id = Long.parseLong(request.getParameter("patientId"));
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
            String Address_Line_1 = request.getParameter("addressLine1");
            String Address_Line_2 = request.getParameter("addressLine2");
            String City = request.getParameter("city");
            String State = request.getParameter("state");
            long Zip_Code = Long.parseLong(request.getParameter("zipCode"));
            String Status = request.getParameter("status");
            Patient patient = new Patient(Patient_Id, First_Name, Last_Name, age, gender,
                    DateUtil.convertStringToUtilDate(DoB), Contact_Number, Alt_Contact_Number,
                    Email_ID, pass_word, Address_Line_1, Address_Line_2, City, State, Zip_Code,
                    Status);
            System.out.println("inside loginservlet before insert");
            registerDao.insertPatientDetails(patient);
            System.out.println("inside loginservlet after insert");
            request.setAttribute("successmessage", "Successfully registeres,click here to login");
            request.getRequestDispatcher("patient-registration-status.jsp").forward(request,
                    response);

            /*
             * else { request.setAttribute("message",
             * "Data not found,click here to register");
             * request.getRequestDispatcher("admin-login.jsp").forward(request, response); }
             */
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("failure", "not inserted");
            request.getRequestDispatcher("patient-registration.jsp").forward(request, response);
        }
    }

}
