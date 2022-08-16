<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
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
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
    <c:set var="booking" value="${test}"></c:set>
    <table cellspacing=10px class="form" cellpadding=30px>
        <form action="AdminAddTestResult" method="post">
            <th colspan=2><h2>Test Results</h2></th>
            <tr>
                <td>Report Id</td>
                <td><input type="text" name="reportId" value="${booking.getReport_ID()}"
                    size=30 /></td>
            </tr>
            <tr>
                <td>Patient Id</td>
                <td><input type="text" name="patientId" value="${booking.getPatient_Id()}"
                    size=30 /></td>
            </tr>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="doctorId" value="${booking.getDoctor_ID()}"
                    size=30 /></td>
            </tr>
            <tr>
                <td>Medicare Service Id</td>
                <td><input type="text" name="medicareserviceId"
                    value="${booking.getMedicare_Service_ID()}" size=30 /></td>
            </tr>
            <tr>
                <td>Service date</td>
                <td><input type="Date" name="servicedate" value="${booking.getService_date()}"
                    size=30 /></td>
            </tr>
            <tr>
                <td>Test Result Date</td>
                <td><input type="Date" name="testresult"
                    value="${booking.getTest_Result_date()}" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic1-Actual Value</td>
                <td><input type="text" name="diag1actualvalue"
                    value="${booking.getDiag_1_Actual_Value()}" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic1-Normal Value</td>
                <td><input type="text" name="diag1normalvalue"
                    value="${booking.getDiag_1_NormaL_Range()}" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic2-Actual Value</td>
                <td><input type="text" name="diag2actualvalue"
                    value="${booking.getDiag_2_Actual_Value()}" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic2-Normal Value</td>
                <td><input type="text" name="diag2normalvalue"
                    value="${booking.getDiag_2_NormaL_Range() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic3-Actual Value</td>
                <td><input type="text" name="diag3actualvalue"
                    value="${booking.getDiag_3_Actual_Value() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic3-Normal Value</td>
                <td><input type="text" name="diag3normalvalue"
                    value="${booking.getDiag_3_NormaL_Range() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic4-Actual Value</td>
                <td><input type="text" name="diag4actualvalue"
                    value="${booking.getDiag_4_Actual_Value() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic4-Normal Value</td>
                <td><input type="text" name="diag4normalvalue"
                    value="${booking.getDiag_4_NormaL_Range() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic5-Actual Value</td>
                <td><input type="text" name="diag5actualvalue"
                    value="${booking.getDiag_5_Actual_Value() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic5-Normal Value</td>
                <td><input type="text" name="diag5normalvalue"
                    value="${booking.getDiag_5_NormaL_Range() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic6-Actual Value</td>
                <td><input type="text" name="diag6actualvalue"
                    value="${booking.getDiag_6_Actual_Value() }" size=30 /></td>
            </tr>
            <tr>
                <td>Dignostic6-Normal Value</td>
                <td><input type="text" name="diag6normalvalue"
                    value="${booking.getDiag_6_NormaL_Range() }" size=30 /></td>
            </tr>



            <tr>
                <td>Doctors Comments</td>
                <td><input type="text" name="doctorscomments"
                    value="${booking.getDoctors_Comments() }" size=30 /></td>
            </tr>
            <tr>
                <td>Other info</td>
                <td><input type="text" name="otherinfo" value="${booking.getOther_info() }"
                    size=30 /></td>
            </tr>
            <tr>
                <td colspan=2 align="center"><input type="submit" value="Update" name="submit"
                    class="submit" />
            </tr>
        </form>
    </table>
</body>
</html>