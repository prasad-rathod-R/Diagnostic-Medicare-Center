<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="e"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Profile</title>
<link rel="icon" href="images\medical-logo.jpg" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javascript" src="js/script.js"></script>
</head>
<body class="background">
    <e:set value="${register}" var="admin"></e:set>
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="admin-home-page.jsp">Home</a></li>
        <li><a href="AdminLogout">Logout</a></li>
    </ul>
    </nav></header>
    <h1 class="profile-admin">
        <b>ADMIN PROFILE</b>
    </h1>
    <table cellspacing=30px class="form5" cellpadding=50px>
        <tr>
            <th>Id:${admin.getAdmin_Id()}</th>
        </tr>
        <tr>
            <th>First Name:${admin.getFirst_Name()}</th>
        </tr>
        <tr>
            <th>Last Name:${admin.getLast_Name()}</th>
        </tr>
        <tr>
            <th>Age:${admin.getAge()}</th>
        </tr>
        <tr>
            <th>Gender:${admin.getGender()}</th>
        </tr>
        <tr>
            <th>Date of Birth:${admin.getDoB()}</th>
        </tr>
        <tr>
            <th>Contact Number:${admin.getContact_Number()}</th>
        </tr>
        <tr>
            <th>Alt Contact Number:${admin.getAlt_Contact_Number()}</th>
        </tr>
        <tr>
            <th>Email:${admin.getEmail_ID()}</th>
        </tr>
        <tr>
            <th>Password:${admin.getPass_word()}</th>
        </tr>


    </table>

    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>