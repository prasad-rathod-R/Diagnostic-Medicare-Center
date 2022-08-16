package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.PatientDao;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Patient;
import com.cognizant.medicare.util.DateUtil;

@WebServlet("/AdminEditPatient")
public class AdminEditPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long Patient_Id = Long.parseLong(request.getParameter("Patient_Id"));
        String First_Name = request.getParameter("First_Name");
        String Last_Name = request.getParameter("Last_Name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String DoB = request.getParameter("DoB");
        long Contact_Number = Long.parseLong(request.getParameter("Contact_Number"));
        long Alt_Contact_Number = Long.parseLong(request.getParameter("Alt_Contact_Number"));
        String Email_ID = request.getParameter("Email_ID");
        String pass_word = request.getParameter("pass_word");
        String Address_Line_1 = request.getParameter("Address_Line_1");
        String Address_Line_2 = request.getParameter("Address_Line_2");
        String City = request.getParameter("City");
        String State = request.getParameter("State");
        long Zip_Code = Long.parseLong(request.getParameter("Zip_Code"));
        String Status = request.getParameter("status");

        Patient patient = null;
        try {
            patient = new Patient(Patient_Id, First_Name, Last_Name, age, gender,
                    DateUtil.convertStringToUtilDate(DoB), Contact_Number, Alt_Contact_Number,
                    Email_ID, pass_word, Address_Line_1, Address_Line_2, City, State, Zip_Code,
                    Status);
            PatientDao patientDao = new PatientDaoSqlImpl();
            patientDao.updatePatientDetails(patient);
            request.setAttribute("successmessage", "Updated Successfully");
            request.getRequestDispatcher("admin-update-patient-status.jsp").forward(request,
                    response);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
