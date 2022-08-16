package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.text.ParseException;

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
 * Servlet implementation class AdminAddTestResultServlet
 */
@WebServlet("/AdminAddTestResult")
public class AdminAddTestResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            long report_ID = Long.parseLong(request.getParameter("reportId"));
            long patient_Id = Long.parseLong(request.getParameter("patientId"));
            long doctor_ID = Long.parseLong(request.getParameter("doctorId"));
            long medicare_Service_ID = Long.parseLong(request.getParameter("medicareserviceId"));
            String service_date = request.getParameter("servicedate");
            String test_Result_date = (request.getParameter("testresult"));
            double diag_1_Actual_Value = Double
                    .parseDouble(request.getParameter("diag1actualvalue"));
            double diag_1_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag1normalvalue"));
            double diag_2_Actual_Value = Double
                    .parseDouble(request.getParameter("diag2actualvalue"));
            double diag_2_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag2normalvalue"));
            double diag_3_Actual_Value = Double
                    .parseDouble(request.getParameter("diag3actualvalue"));
            double diag_3_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag3normalvalue"));
            double diag_4_Actual_Value = Double
                    .parseDouble(request.getParameter("diag4actualvalue"));
            double diag_4_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag4normalvalue"));
            double diag_5_Actual_Value = Double
                    .parseDouble(request.getParameter("diag5actualvalue"));
            double diag_5_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag5normalvalue"));
            double diag_6_Actual_Value = Double
                    .parseDouble(request.getParameter("diag6actualvalue"));
            double diag_6_NormaL_Range = Double
                    .parseDouble(request.getParameter("diag6normalvalue"));

            String doctors_Comments = request.getParameter("doctorscomments");
            String other_info = request.getParameter("otherinfo");

            TestResultsDao testDao = new TestDaoSqlImpl();

            TestResults test = new TestResults(report_ID, patient_Id, doctor_ID,
                    medicare_Service_ID, DateUtil.convertStringToUtilDate(service_date),
                    DateUtil.convertStringToUtilDate(test_Result_date), diag_1_Actual_Value,
                    diag_1_NormaL_Range, diag_2_Actual_Value, diag_2_NormaL_Range,
                    diag_3_Actual_Value, diag_3_NormaL_Range, diag_4_Actual_Value,
                    diag_4_NormaL_Range, diag_5_Actual_Value, diag_5_NormaL_Range,
                    diag_6_Actual_Value, diag_6_NormaL_Range, doctors_Comments, other_info);

            testDao.updateTestResults(test);
            request.setAttribute("successmessage", "Updated Successfully");
            request.getRequestDispatcher("admin-update-test-status.jsp").forward(request, response);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            request.setAttribute("message", "Update is failed");
            request.getRequestDispatcher("admin-update-test-status.jsp").forward(request, response);

        }
    }

}
