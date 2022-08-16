<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Login</title>
<link rel="icon" href="images\symbol-logo.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script src="js\script.js">
    
</script>
</head>
<body class="background">
    <nav> <image src="images\symbol-logo.png" width=60 height=60 class="image" /> <label
        class="logo">Diagnostic Medicare Center</label>
    <ul>
        <li><a href="home.jsp">Home</a></li>
    </ul>
    </nav>
    <div class="login-box">
        <h1>Patient Login here</h1>
        <h4 class="message1">${message1}</h4>
        <form action="PatientLogin" method="post" name="login" onsubmit="return validateLogin()"
            autocomplete="off">
            <p>Username</p>
            <input type="text" name="username" placeholder="Enter Username" />
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password" /> <input
                type="submit" name="login" value="Login" /> <a href="patient-registration.jsp">Don't
                have account? Register now</a>
        </form>
    </div>

    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>