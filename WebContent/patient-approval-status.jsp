<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Home Page</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js\script.js">
    
</script>

</head>
<body class="background">
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="patient-login.jsp">Home</a></li>
        <li><a href="PatientLogout">Logout</a></li>
    </ul>
    </nav></header>
    <h1 class="heading">Patient Portal</h1>
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
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>