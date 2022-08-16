<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient View Test Results</title>
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
    <c:set value="${test}" var="test"></c:set>

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
    <table cellspacing=20px class="form5" cellpadding=50px>




        <tr>
            <th>Patient Id:${test.getPatient_Id()}</th>
        </tr>
        <tr>
            <th>Doctor Id: ${test.getDoctor_ID()}</th>
        </tr>
        <tr>
            <th>Service Date: ${test.getService_date()}</th>
        </tr>
        <tr>
            <th>Test Result Date: ${test.getTest_Result_date()}</th>
        </tr>
        <tr>
            <th>Diag_1 Actual Value: ${test.getDiag_1_Actual_Value()}</th>
        </tr>
        <tr>
            <th>Diag_1 Normal Value: ${test.getDiag_1_NormaL_Range()}</th>
        </tr>
        <tr>
            <th>Diag_2 Actual Value: ${test.getDiag_2_Actual_Value()}</th>
        </tr>
        <tr>
            <th>Diag_2 Normal Value: ${test.getDiag_2_NormaL_Range()}</th>
        </tr>
        <tr>
            <th>Diag_3 Actual Value: ${test.getDiag_3_Actual_Value()}</th>
        </tr>
        <tr>
            <th>Diag_3 Normal Value: ${test.getDiag_3_NormaL_Range()}</th>
        </tr>
        <tr>
            <th>Doctor Comments: ${test.getDoctors_Comments()}</th>
        </tr>
        <tr>
            <th>Other Info: ${test.getOther_info()}</th>
        </tr>

    </table>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>

