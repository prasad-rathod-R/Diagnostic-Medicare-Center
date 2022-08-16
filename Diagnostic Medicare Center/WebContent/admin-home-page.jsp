
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
        <li><a href="admin-login.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <h1 class="heading">Admin Portal</h1>
    <span class="span">
        <div>
            <form action="admin-doctor-page.jsp" method="post">
                <input type="submit" name="submit" value="Doctor" id="submit" />
            </form>
        </div>
        <div>
            <form action="admin-patient-page.jsp" method="post">
                <input type="submit" name="submit" value="Patient" id="submit" />
            </form>
        </div>
        <div>
            <form action="ShowAdmin" method="post">
                <input type="submit" name="submit" value="View Profile" id="submit" />
            </form>
        </div>
        <div>
            <form action="AdminAppointment" method="post">
                <input type="submit" name="submit" value="Appointment" id="submit" />
            </form>
        </div>
        <div>
            <form action="medicare-admin-page.jsp" method="post">
                <input type="submit" name="submit" value="Medicare" id="submit" />
            </form>
        </div>
        <div>
            <form action="AdminViewTestResult" method="post">
                <a><input type="submit" name="submit" value="Test Result" id="submit" /></a>
            </form>
        </div>>
    </span>
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>