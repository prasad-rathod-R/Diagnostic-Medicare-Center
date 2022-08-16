<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Medicare Services</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js\script.js">
    
</script>

</head>
<body class="background">
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="doctor-home-page.jsp">Home</a></li>
        <li><a href="DoctorLogout">Logout</a></li>
    </ul>
    </nav></header>

    <form action="medicare-home-page.jsp" method="post">
        <input type="submit" name="submit" value="Add Medicare" id="submit1" />
    </form>
    <form action="ShowMedicareDoctor" method="post">
        <input type="submit" name="submit" value="View Medicare" id="submit1" />
    </form>
    <form action="ShowPatient" method="post">
        <input type="submit" name="submit" value="View Patients" id="submit1" />
    </form>
    <form action="DoctorViewTestResult" method="post">
        <input type="submit" name="submit" value="View Test Results" id="submit1" />
    </form>
    <table class="form4" cellspacing=30px>


        <tr>

            <th>Patient Id</th>
            <th>Doctor Id</th>

            <th>Service Date</th>
            <th>Test Result Date</th>
            <th>Diag_1 Actual Value</th>
            <th>Diag_1 Normal Value</th>
            <th>Diag_2 Actual Value</th>
            <th>Diag_2 Normal Value</th>
            <th>Diag_3 Actual Value</th>
            <th>Diag_3 Normal Value</th>


            <th>Doctor Comments</th>
            <th>Other Info</th>

        </tr>
        <c:forEach items="${test}" var="test">
            <tr>

                <td>${test.getPatient_Id()}</td>
                <td>${test.getDoctor_ID()}</td>

                <td>${test.getService_date()}</td>
                <td>${test.getTest_Result_date()}</td>

                <td>${test.getDiag_1_Actual_Value()}</td>
                <td>${test.getDiag_1_NormaL_Range()}</td>
                <td>${test.getDiag_2_Actual_Value()}</td>
                <td>${test.getDiag_2_NormaL_Range()}</td>
                <td>${test.getDiag_3_Actual_Value()}</td>
                <td>${test.getDiag_3_NormaL_Range()}</td>

                <td>${test.getDoctors_Comments()}</td>
                <td>${test.getOther_info()}</td>

            </tr>


        </c:forEach>
    </table>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>