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

/**
 * Servlet implementation class ShowEditTestResultServlet
 */
@WebServlet("/ShowEditTestResult")
public class ShowEditTestResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long reportId = Long.parseLong(request.getParameter("reportId"));
        TestResultsDao testDao = new TestDaoSqlImpl();
        TestResults test = testDao.getTestResults(reportId);
        request.setAttribute("test", test);
        request.getRequestDispatcher("admin-add-test-result.jsp").forward(request, response);
    }

}
