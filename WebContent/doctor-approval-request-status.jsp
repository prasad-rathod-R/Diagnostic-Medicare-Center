<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

    <e:set var="doctor" value="${doctor}"></e:set>
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="admin-login.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <form action="" method="post">
        <input type="submit" name="submit" value="Patient Approval" id="submit1" />
    </form>
    <form action="PendingDoctor" method="post">
        <input type="submit" name="submit" value="Doctor Approval" id="submit1" />
    </form>

    <h3 class="successmessage">${doctor2}</h3>
    <h3 class="successmessage">${doctor1}</h3>


    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
