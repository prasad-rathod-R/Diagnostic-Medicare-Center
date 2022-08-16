<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
        <li><a href="patient-home-page.jsp">Home</a></li>
        <li><a href="PatientLogout">Logout</a></li>
    </ul>
    </nav></header>
    <form action="ShowMedicarePatient" method="post">
        <input type="submit" name="submit" value="View Medicare" id="submit1" />
    </form>
    <form action="PatientViewDoctor" method="post">
        <input type="submit" name="submit" value="View Doctors" id="submit1" />
    </form>
    <form action="PatientId" method="post">
        <input type="submit" name="submit" value="Booking Appointment" id="submit1" />
    </form>
    <form action="PatientViewTestResult" method="post">
        <input type="submit" name="submit" value="View Test Results" id="submit1" />
    </form>
    <table class="form1" cellspacing=25px>
        <tr>
            <th>Medicare Service Id</th>
            <th>Medicare Service Name</th>
            <th>Medicare Service Description</th>
            <th>Amount</th>

        </tr>
        <c:forEach items="${medicare}" var="medicare">
            <tr>
                <td>${medicare.getMedicare_Service_ID()}</td>
                <td>${medicare.getMedicare_Service()}</td>
                <td>${medicare.getService_Description()}</td>
                <td>${medicare.getAmount()}</td>
            </tr>
        </c:forEach>
    </table>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
