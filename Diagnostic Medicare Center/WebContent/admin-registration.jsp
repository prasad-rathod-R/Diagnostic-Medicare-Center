<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Registration Form</title>
<link rel="icon" href="images\symbol-logo.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script src="js\script.js">
    
</script>
</head>
<body class="background">
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>
    <ul>
        <li><a href="home.jsp">Home</a></li>
    </ul>
    </nav></header>
    <form action="LoginRegistration" method="post" name="medicare2"
        onsubmit="return validateFormAdmin()" autocomplete="off">
        <table class="form" cellspacing=25px>
            <th colspan=2><h2>Admin Registration</h2></th>
            <tr>
                <td>Admin Id</td>
                <td><input type="text" name="adminId"
                    value="<%Random random = new Random();
            Set<Integer> randomNumbers = new HashSet();
            while (randomNumbers.size() < 1)
                randomNumbers.add(new Integer(random.nextInt(999) + 1000));
            for (Integer randomNumber : randomNumbers) {
                out.println(randomNumber);
            }%>"
                    size=30 id="adminId" /></td>
            </tr>
            <tr>
                <td>First Name*</td>
                <td><input type="text" name="firstName" placeholder="Enter First Name" size=30
                    id="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name*</td>
                <td><input type="text" name="lastName" placeholder="Enter Last Name" size=30
                    id="lastName" /></td>
            </tr>
            <tr>
                <td>Date Of Birth*</td>
                <td><input type="Date" name="dob" size=30 id="dob" onblur="ageCount(this)" /></td>
            </tr>
            <tr>
                <td>Age*</td>
                <td><input type="text" name="age" placeholder="Enter Age" size=30 id="ageId" /></td>
            </tr>
            <tr>
                <td>Gender*</td>

                <td><select name="gender" id="gender">
                        <option value="" disabled selected hidden>Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>
                </select></td>
            </tr>
            <tr>
                <td>Contact Number*</td>
                <td><input type="text" name="contactNumber" placeholder="##########" size=30
                    id="contactNumber" /></td>
            </tr>
            <tr>
                <td>Alternate Number</td>
                <td><input type="text" name="alternateNumber" placeholder="##########" size=30 /></td>
            </tr>
            <tr>
                <td>Email*</td>
                <td><input type="text" name="email" placeholder="@gmail.com" size=30 id="email" /></td>
            </tr>
            <tr>
                <td>Password*</td>
                <td><input type="password" name="password" id="password" placeholder="password"
                    size=30 id="password" /></td>
            </tr>
            <tr>
                <td>Retype Password*</td>
                <td><input type="password" name="retype" placeholder=" Retype password" size=30
                    id="retype" /></td>
            </tr>
            <tr>
                <td colspan=2 align="center"><input type="submit" value="Register"
                    name="submit" class="submit" /></td>
            </tr>
        </table>
    </form>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>