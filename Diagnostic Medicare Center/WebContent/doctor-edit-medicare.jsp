<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Page</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js\script.js">
    
</script>

</head>
<body class="background">
    <c:set var="medicare" value="${medicare}"></c:set>
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
    <table class="form2" cellspacing=25px>
        <form action="DoctorEditMedicare" method="post">
            <th colspan=2><h2>Medicare Details</h2>
                <h3 align="center">${successmessage}</h3>
                <h3 align="center">${failuremessage}</h3></th>

            <tr>
                <td>Medicare Service Id</td>
                <td><input type="text" name="medicareId"
                    value="${medicare.getMedicare_Service_ID()}" /></td>
            </tr>

            <tr>
                <td>Medicare Service Name</td>
                <td><input type="text" name="medicareName"
                    value="${medicare.getMedicare_Service()}" /></td>
            </tr>
            <tr>
                <td>Medicare Service Description</td>
                <td><input type="text" name="description"
                    value="${medicare.getService_Description()}" /></td>
            </tr>
            <tr>
                <td>Amount</td>
                <td><input type="text" name="amount" value="${medicare.getAmount()}" /></td>
            </tr>
            <tr>
                <td colspan=2 align="center"><input type="submit" value="Edit" name="submit"
                    class="submit" /></td>
            </tr>
        </form>
    </table>
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
