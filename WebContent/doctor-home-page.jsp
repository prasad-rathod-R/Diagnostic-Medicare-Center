<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
        <li><a href="doctor-login.jsp">Home</a></li>
        <li><a href="DoctorLogout">Logout</a></li>
    </ul>
    </nav></header>
    <h1 class="heading">Welcome Doctor</h1>

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
    <div class="home">
        <h1 class="home1">Welcome to Diagnostic Medicare Center</h1>
        <p>From analysis to result. From science to sensitivity.</p>
        <p>High quality diagnostics are an imperative for better treatment and patient care. Our
            Hospitals Group, India's leading healthcare system, has thus far been delivering 3.5
            million high-quality diagnostic tests every year, through its Hospitals and Clinics
            earning an excellent rating from 95% of its patients.</p>
        <p>Our Diagnostics is the result of the good health for all mission that is spurring our
            Hospitals Group to touch a billion lives. Following the corporate credo of bringing
            quality, affordable healthcare closer to the consumer, 2015 saw 100+ Diagnostics
            centres, in 2016 it has been grown to 150+ centres and 2017 landed with 250 + collection
            centres , 70+ Labs springing up in neighbourhoods across India, delivering expertise
            that is empowering to doctors and patients alike.</p>
        <p>Our Diagnostics expert technicians and state-of-the-art diagnostic equipment are
            constantly guided by a 36-years legacy of excellence to ensure the accuracy and
            timeliness of test results.</p>

    </div>
    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
