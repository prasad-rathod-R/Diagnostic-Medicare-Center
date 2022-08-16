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

    <table cellspacing=20px class="form1" cellpadding=50px>
        <tr>
            <th>Patient Id</th>
            <th>Booking Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>

            <th>Booking Date</th>
            <th>Booking Status</th>
            <th>Action</th>

        </tr>

        <e:forEach items="${register}" var="register">


            <tr>
                <td>${register.getPatient_Id()}</td>
                <td>${register.getBooking_id()}</td>
                <td>${register.getFirst_Name()}</td>
                <td>${register.getLast_Name()}</td>
                <td>${register.getAge()}</td>
                <td>${register.getBooking_date()}</td>
                <td>${register.getBooking_status()}</td>
                <td><a href="DoctorEditBooking?bookingId=${register.getBooking_id()}"
                    class="submit1">Edit</a> <a
                    href="DoctorEditTestResult?bookingId=${register.getBooking_id()}" class="submit">Add
                        Test Result</a> <%-- <a
                    href="DoctorApprovalBooking?doctorId=${register.getDoctor_ID()}&bookingId=${register.getBooking_id()}&bookingDate=${register.getBooking_date()}&PatientId=${register.getPatient_Id()}"
                    class="submit1">Update</a> --%></td>




            </tr>

        </e:forEach>

    </table>


    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
