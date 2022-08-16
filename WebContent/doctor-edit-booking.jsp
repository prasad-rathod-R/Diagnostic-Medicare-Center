<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="e"%>
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
    <e:set var="booking" value="${booking}"></e:set>
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

    <table class="form" cellspacing=18px>
        <form action="DoctorApprovalBooking" method="post">
            <th colspan=2><h2>Patient Booking</h2></th>
            <tr>
                <td>Booking Id</td>
                <td><input type="text" name="bookingId" value="${booking.getBooking_id()}"
                    readOnly="readonly" /></td>
            </tr>

            <tr>
                <td>Booking Date*</td>
                <td><input type="date" name="bookingDate" value="${booking.getBooking_date()}"
                    readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Patient Id*</td>
                <td><input type="text" name="PatientId" value="${booking.getPatient_Id()}"
                    readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="doctorId" value="${booking.getDoctor_ID()}"
                    readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Status</td>
                <td><Input type="text" name="status" value="${booing.getBooking_status()}"
                    placeholder="Approve Or Reject"></td>
            </tr>
            <tr>

                <td colspan=2 align="center"><input type="submit" name="submit" value="Submit"
                    class="submit" /></td>
            </tr>
        </form>
    </table>


    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
