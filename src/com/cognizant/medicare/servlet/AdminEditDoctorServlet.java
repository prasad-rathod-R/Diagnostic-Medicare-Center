package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.DoctorDao;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.model.Doctor;
import com.cognizant.medicare.util.DateUtil;

@WebServlet("/AdminEditDoctor")
public class AdminEditDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long Doctor_Id = Long.parseLong(request.getParameter("Doctor_Id"));
        String First_Name = request.getParameter("First_Name");
        String Last_Name = request.getParameter("Last_Name");
        int age = Integer.parseInt(request.getParameter("age"));
        String Gender = request.getParameter("Gender");
        String DoB = (request.getParameter("DoB"));
        long Contact_Number = Long.parseLong(request.getParameter("Contact_Number"));
        long Alt_Contact_Number = Long.parseLong(request.getParameter("Alt_Contact_Number"));
        String Email_ID = request.getParameter("Email_ID");
        String pass_word = request.getParameter("pass_word");
        String Address_Line_1 = request.getParameter("Address_Line_1");
        String Address_Line_2 = request.getParameter("Address_Line_2");
        String City = request.getParameter("City");
        String State = request.getParameter("State");
        long Zip_Code = Long.parseLong(request.getParameter("Zip_Code"));
        String Degree = request.getParameter("Degree");
        String Speciality = request.getParameter("Speciality");
        String Hospital_Name = request.getParameter("Hospital_Name");

        String working_Hours = request.getParameter("working_Hours");
        long Medicare_Service_ID = Long.parseLong(request.getParameter("medicareserviceId"));

        Doctor doctor = null;
        try {
            doctor = new Doctor(Doctor_Id, First_Name, Last_Name, age, Gender,
                    DateUtil.convertStringToUtilDate(DoB), Contact_Number, Alt_Contact_Number,
                    Email_ID, pass_word, Address_Line_1, Address_Line_2, City, State, Zip_Code,
                    Degree, Speciality, Hospital_Name, working_Hours, Medicare_Service_ID);

            DoctorDao doctorDao = new DoctorDaoSqlImpl();
            doctorDao.updateDoctorDetails(doctor);
            request.setAttribute("successmessage", "Updated Successfully");
            request.getRequestDispatcher("admin-update-doctor-status.jsp").forward(request,
                    response);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
