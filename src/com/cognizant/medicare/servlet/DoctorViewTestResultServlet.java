package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.medicare.dao.TestDaoSqlImpl;
import com.cognizant.medicare.dao.TestResultsDao;
import com.cognizant.medicare.model.TestResults;

/**
 * Servlet implementation class DoctorViewTestResultServlet
 */
@WebServlet("/DoctorViewTestResult")
public class DoctorViewTestResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TestResultsDao testDao = new TestDaoSqlImpl();
        List<TestResults> testList = testDao.getTestResultsDetails();
        System.out.println(testDao.getTestResultsDetails());
        System.out.println(testList);
        request.setAttribute("test", testList);

        request.getRequestDispatcher("doctor-view-test-results.jsp").forward(request, response);
    }

}
