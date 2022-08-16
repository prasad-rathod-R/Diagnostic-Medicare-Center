package com.cognizant.medicare.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PatientLogoutServlet
 */
@WebServlet("/PatientLogout")
public class PatientLogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(1 * 60);

        session.removeAttribute("username");
        session.invalidate();
        request.setAttribute("messagePatient", "Successfully Logged out");
        // session.setMaxInactiveInterval(10);
        response.sendRedirect("home.jsp");
        PrintWriter out = response.getWriter();
        /*
         * HttpSession session=request.getSession(false); try { String
         * username=(String)session.getAttribute("ref");
         * System.out.println(username+"loggedout"+new Date());
         * request.getRequestDispatcher("home.jsp").include(request,response);
         * session.invalidate(); }catch(Exception e) {
         * session.setMaxInactiveInterval(10); System.out.print("your expired");
         * 
         * request.getRequestDispatcher("home.jsp").include(request, response); }
         */
        out.close();
    }

}
