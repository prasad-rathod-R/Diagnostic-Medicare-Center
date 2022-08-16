<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javaScript" src="js/script.js">
    
</script>

</head>
<body class="background">
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="admin-login.jsp">Admin</a></li>
        <li><a href="doctor-login.jsp">Doctor</a></li>
        <li><a href="patient-login.jsp">Patient</a></li>
        <li><a href="home.jsp">Home</a></li>
        <li><a href="contact-us.jsp">ContactUs</a>
    </ul>
    </nav></header>

    <div class="home-images">
        <img class="mySlides" src="images/home1.jpg" height="470px" width="2000px"> <img
            class="mySlides" src="images/home2.jpg" height="470px" width="2000px"> <img
            class="mySlides" src="images/home3.jpg" height="470px" width="2000px"> <img
            class="mySlides" src="images/img-2.jpg" height="700px" width="2000px">
    </div>
    <script>
                    var myIndex = 0;
                    carousel();

                    function carousel() {
                        var i;
                        var x = document.getElementsByClassName("mySlides");
                        for (i = 0; i < x.length; i++) {
                            x[i].style.display = "none";
                        }
                        myIndex++;
                        if (myIndex > x.length) {
                            myIndex = 1
                        }
                        x[myIndex - 1].style.display = "block";
                        setTimeout(carousel, 3000); // Change image every 3 seconds
                    }
                </script>
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
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>