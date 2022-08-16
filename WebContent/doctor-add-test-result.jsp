<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Home Page</title>
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
    <c:set var="booking" value="${booking}"></c:set>
    <table cellspacing=10px class="form" cellpadding=30px>
        <form action="DoctorAddTestResult" method="post" name="addPatient"
            onsubmit="return validateTest()" autocomplete="off">
            <th colspan=2><h2>Test Results</h2></th>
            <h2 class="successmessage">${successmessage}</h2>
            <h2 class="failure">${failuremessage}</h2>
            <tr>
                <td>Report Id</td>
                <td><input type="text" name="reportId" id="reportId"
                    value="${booking.getBooking_id()}" size=30 /></td>
            </tr>
            <tr>
                <td>Patient Id</td>
                <td><input type="text" name="patientId" id="patientId"
                    value="${booking.getPatient_Id()}" size=30 /></td>
            </tr>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="doctorId" id="doctorId"
                    value="${booking.getDoctor_ID()}" size=30 /></td>
            </tr>
            <tr>
                <td>Medicare Service Id</td>
                <td><input type="text" name="medicareserviceId"
                    value="<%Random random3 = new Random();
            Set<Integer> hash = new HashSet();
            while (hash.size() < 1)
                hash.add(new Integer(random3.nextInt(999) + 1000));
            for (Integer randomNumber : hash) {
                out.println(randomNumber);
            }%>"
                    size=30 /></td>
            </tr>
            <tr>
                <td>Service date</td>
                <td><input type="Date" name="servicedate" id="servicedate"
                    value="${booking.getBooking_date()}" size=30 /></td>
            </tr>
            <tr>
                <td>Test Result Date</td>
                <td><input type="Date" name="testresult" id="testresult" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic1-Actual Value</td>
                <td><input type="text" name="diag1actualvalue" id="diag1actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic1-Normal Value</td>
                <td><input type="text" name="diag1normalvalue" id="diag1normalvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic2-Actual Value</td>
                <td><input type="text" name="diag2actualvalue" id="diag2actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic2-Normal Value</td>
                <td><input type="text" name="diag2normalvalue" id="diag2normalvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic3-Actual Value</td>
                <td><input type="text" name="diag3actualvalue" id="diag3actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic3-Normal Value</td>
                <td><input type="text" name="diag3normalvalue" id="diag3normalvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic4-Actual Value</td>
                <td><input type="text" name="diag4actualvalue" id="diag4actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic4-Normal Value</td>
                <td><input type="text" name="diag4normalvalue" id="diag4normalvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic5-Actual Value</td>
                <td><input type="text" name="diag5actualvalue" id="diag5actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic5-Normal Value</td>
                <td><input type="text" name="diag5normalvalue" id="diag5normalvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic6-Actual Value</td>
                <td><input type="text" name="diag6actualvalue" id="diag6actualvalue" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic6-Normal Value</td>
                <td><input type="text" name="diag6normalvalue" id="diag6normalvalue" size=30 /></td>
            </tr>



            <tr>
                <td>Doctors Comments</td>
                <td><input type="text" name="doctorscomments" id="doctorscomments" size=30 /></td>
            </tr>
            <tr>
                <td>Other info</td>
                <td><input type="text" name="otherinfo" id="otherinfo" size=30 /></td>
            </tr>
            <tr>
                <td colspan=2 align="center"><input type="submit" value="Add" name="submit"
                    class="submit" />
            </tr>
        </form>
    </table>



    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>