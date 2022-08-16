
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Appointment</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js\script.js">
    
</script>

</head>
<body class="background">
    <c:set value="${patient}" var="patient"></c:set>
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
    <table class="form" cellspacing=18px>
        <form action="PatientBooking" method="post" name="booking"
            onsubmit="return validatebooking()" s>
            <th colspan=2><h2>Patient Booking</h2></th>
            <h3 class="successmessage">${successmessage}</h3>
            <h3 class="failure">${message}</h3>
            <tr>
                <td>Booking Id</td>
                <td><input type="text" name="bookingId"
                    value="<%Random random = new Random();
            Set<Integer> randomNumbers = new HashSet();
            while (randomNumbers.size() < 1)
                randomNumbers.add(new Integer(random.nextInt(999) + 1000));
            for (Integer randomNumber : randomNumbers) {
                out.println(randomNumber);
            }%>" /></td>
            </tr>

            <tr>
                <td>Booking Date*</td>
                <td><input type="date" name="dob1" id="dob1" /></td>
            </tr>
            <tr>
                <td>Patient Id*</td>
                <td><input type="text" name="PatientId" value="${patientId}"
                    readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="DoctorId" id="DoctorId" /></td>
            </tr>
            <tr>
                <td>Status</td>
                <td><Input type="text" name="status" value="pending" raedOnly="readonly"></td>
            </tr>
            <tr>

                <td colspan=2 align="center"><input type="submit" name="submit" value="Book"
                    class="submit" /></td>
            </tr>
        </form>
    </table>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>

