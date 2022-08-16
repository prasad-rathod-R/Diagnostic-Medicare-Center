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
        <li><a href="admin-login.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <form action="PendingDoctor" method="post">
        <input type="submit" name="submit" value="Doctor Approval" id="submit1" />
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
            <th>Status</th>
        </tr>
        <e:forEach items="${pending}" var="pending">
            <tr>
                <td>${pending.getDoctor_Id()}</td>
                <td>${pending.getFirst_Name()}</td>
                <td>${pending.getLast_Name()}</td>
                <td>${pending.getSpeciality()}</td>
                <td>${pending.getHospital_Name()}</td>
                <td>${pending.getWorking_Hours()}</td>
                <td>${pending.getMedicare_Service_ID()}</td>
                <td>${pending.getContact_Number()}</td>
                <td>${pending.getEmail_ID()}</td>
                <td>${pending.getPass_word()}</td>
                <td>${pending.getAddress_Line_1()}</td>
                <td>${pending.getStatus()}</td>
                <td><a href="AdminEditDoctorPending?doctorId=${pending.getDoctor_Id()}"
                    class="submit1">Edit</a></td>
            </tr>
        </e:forEach>
    </table>
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
