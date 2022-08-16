<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <form action="admin-registered-doctor.jsp" method="post">
        <input type="submit" name="submit" value="Add Doctor" id="submit1" />
    </form>
    <form action="ShowDoctor" method="post">
        <input type="submit" name="submit" value="View Doctor" id="submit1" />
    </form>
    <table cellspacing=20px id="form3" cellpadding=50px>
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Speciality</th>
            <th>Working Hours</th>
            <th>Hospital Name</th>
            <th>Medicare Service Id</th>
            <th>Contact Number</th>
            <th>Email</th>
            <th>Password</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${register}" var="doctor">
            <tr>
                <td>${doctor.getDoctor_Id()}</td>
                <td>${doctor.getFirst_Name()}</td>
                <td>${doctor.getLast_Name()}</td>
                <td>${doctor.getSpeciality()}</td>
                <td>${doctor.getHospital_Name()}</td>
                <td>${doctor.getWorking_Hours()}</td>
                <td>${doctor.getMedicare_Service_ID()}</td>
                <td>${doctor.getContact_Number()}</td>
                <td>${doctor.getEmail_ID()}</td>
                <td>${doctor.getPass_word()}</td>
                <td>${doctor.getAddress_Line_1()}</td>
                <td><a href="AdminDeletedDoctor?doctorId=${doctor.getDoctor_Id()}"
                    class="submit2">Delete</a><a
                    href="AdminShowEditDoctor?doctor_Id=${doctor.getDoctor_Id()}" class="submit1">Edit</a></td>
            </tr>
        </c:forEach>
    </table>

    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
