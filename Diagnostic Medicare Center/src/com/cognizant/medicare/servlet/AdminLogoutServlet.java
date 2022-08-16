package com.cognizant.medicare.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogoutServlet
 */
@WebServlet("/AdminLogout")
public class AdminLogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("messageAdmin", "Successfully Logged out");
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        Cookie c = new Cookie("ref", "username");
        c.setMaxAge(5);
        // session.setMaxInactiveInterval(100);
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
