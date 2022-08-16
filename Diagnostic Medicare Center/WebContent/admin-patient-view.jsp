<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="e"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medicare Services</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js\script.js">
    
</script>

</head>
<body class="background">
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="admin-home-page.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <form action="admin-registered-patient.jsp" method="post">
        <input type="submit" name="submit" value="Add Patient" id="submit1" />
    </form>
    <form action="AdminViewPatient" method="post">
        <input type="submit" name="submit" value="View Patient" id="submit1" />
    </form>
    <table cellspacing=20px class="form1" cellpadding=50px>
        <e:if test="${removeStatus==true}">
            <h4 class="paragraph" align="center">
                <b>Patient details deleted Successfully</b>
            </h4>
        </e:if>

        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Date of Birth</th>
            <th>Contact Number</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <e:forEach items="${register}" var="register">
            <tr>
                <td>${register.getPatient_Id()}</td>
                <td>${register.getFirst_Name()}</td>
                <td>${register.getLast_Name()}</td>
                <td>${register.getAge()}</td>
                <td>${register.getGender()}</td>
                <td>${register.getDoB()}</td>
                <td>${register.getContact_Number()}</td>
                <td>${register.getEmail_ID()}</td>
                <td>${register.getPass_word()}</td>
                <e:set var="patient" value="${patient}"></e:set>
                <td><a href="AdminDeletedPatient?patientId=${register.getPatient_Id()}"
                    class="submit2">Delete</a> <a
                    href="AdminShowEditPatient?patientId=${register.getPatient_Id()}"
                    class="submit1">Edit</a></td>
            </tr>
        </e:forEach>

    </table>
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
