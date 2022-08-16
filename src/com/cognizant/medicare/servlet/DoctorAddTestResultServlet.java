package com.cognizant.medicare.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.TestDaoSqlImpl;
import com.cognizant.medicare.dao.TestResultsDao;
import com.cognizant.medicare.model.TestResults;
import com.cognizant.medicare.util.DateUtil;

/**
 * Servlet implementation class EditTestResultServlet
 */
@WebServlet("/DoctorAddTestResult")
public class DoctorAddTestResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TestResultsDao testDao = new TestDaoSqlImpl();
        long Report_ID = Long.parseLong(request.getParameter("reportId"));
        long Patient_Id = Long.parseLong(request.getParameter("patientId"));
        long Doctor_ID = Long.parseLong(request.getParameter("doctorId"));
        long Medicare_Service_ID = Long.parseLong(request.getParameter("medicareserviceId"));
        String Service_date = (request.getParameter("servicedate"));
        String Test_Result_date = (request.getParameter("testresult"));
        double Diag_1_Actual_Value = Double.parseDouble(request.getParameter("diag1actualvalue"));
        double Diag_1_NormaL_Range = Double.parseDouble(request.getParameter("diag1normalvalue"));
        double Diag_2_Actual_Value = Double.parseDouble(request.getParameter("diag2actualvalue"));
        double Diag_2_NormaL_Range = Double.parseDouble(request.getParameter("diag2normalvalue"));
        double Diag_3_Actual_Value = Double.parseDouble(request.getParameter("diag3actualvalue"));
        double Diag_3_NormaL_Range = Double.parseDouble(request.getParameter("diag3normalvalue"));
        double Diag_4_Actual_Value = Double.parseDouble(request.getParameter("diag4actualvalue"));
        double Diag_4_NormaL_Range = Double.parseDouble(request.getParameter("diag4normalvalue"));
        double Diag_5_Actual_Value = Double.parseDouble(request.getParameter("diag5actualvalue"));
        double Diag_5_NormaL_Range = Double.parseDouble(request.getParameter("diag5normalvalue"));
        double Diag_6_Actual_Value = Double.parseDouble(request.getParameter("diag6actualvalue"));
        double Diag_6_NormaL_Range = Double.parseDouble(request.getParameter("diag6normalvalue"));
        String Doctors_Comments = (request.getParameter("doctorscomments"));
        String Other_info = (request.getParameter("otherinfo"));
        try {
            TestResults test = new TestResults(Report_ID, Patient_Id, Doctor_ID,
                    Medicare_Service_ID, DateUtil.convertStringToUtilDate(Service_date),
                    DateUtil.convertStringToUtilDate(Test_Result_date), Diag_1_Actual_Value,
                    Diag_1_NormaL_Range, Diag_2_Actual_Value, Diag_2_NormaL_Range,
                    Diag_3_Actual_Value, Diag_3_NormaL_Range, Diag_4_Actual_Value,
                    Diag_4_NormaL_Range, Diag_5_Actual_Value, Diag_5_NormaL_Range,
                    Diag_6_Actual_Value, Diag_6_NormaL_Range, Doctors_Comments, Other_info);
            testDao.insertTestResultsDetails(test);

            request.setAttribute("successmessage", "Successfully Added");
            request.getRequestDispatcher("doctor-add-test-result.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("failuremessage", "Details not Added");
            request.getRequestDispatcher("doctor-add-test-result.jsp").forward(request, response);
        }
    }
}
