<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Registration Form</title>
<link rel="icon" href="images\symbol-logo.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javascript" src="js\script.js">
    
</script>
</head>
<body class="background">
    <c:set var="medicare" value="${patient}"></c:set>
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>
    <ul>

        <li><a href="admin-login.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <form action="admin-registered-patient.jsp" method="post">
        <input type="submit" name="submit" value="Add Patient" id="submit1" />
    </form>
    <form action="AdminViewPatient" method="post">
        <input type="submit" name="submit" value="View Patient" id="submit1" />
    </form>

    <table class="form" cellspacing=18px>
        <th colspan=2><h2>Patient Edit</h2></th>
        <form action="AdminEditPatient" method="post">
            <H4>${successmessage}</H4>
            <h4>${failure}</h4>
            <tr>
                <td>Patient Id</td>
                <td><input type="text" name="Patient_Id" value="${patient.getPatient_Id()}"
                    size=30 id="patientId" /></td>
            </tr>

            <tr>
                <td>First Name*</td>
                <td><input type="text" name="First_Name" placeholder="Enter First Name" size=30
                    id="firstName" value="${patient.getFirst_Name()}" /></td>
            </tr>
            <tr>
                <td>Last Name*</td>
                <td><input type="text" name="Last_Name" placeholder="Enter Last Name" size=30
                    id="lastName" value="${patient.getLast_Name()}" /></td>
            </tr>
            <tr>
                <td>Date Of Birth*</td>
                <td><input type="Date" name="DoB" size=30 id="dateOfBirth"
                    onblur="ageCount(this)" value="${patient.getDoB()}" /></td>
            </tr>
            <tr>
                <td>Age*</td>
                <td><input type="text" name="age" placeholder="Enter Age" size=30 id="age"
                    value="${patient.getAge()}" /></td>
            </tr>
            <tr>
                <td>Gender*</td>

                <td><select name="gender" id="gender" value="${patient.getGender()}">
                        <option value="" disabled selected hidden>Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>
                </select></td>
            </tr>
            <tr>
                <td>Contact Number*</td>
                <td><input type="text" name="Contact_Number" placeholder="##########" size=30
                    id="contactNumber" value="${patient.getContact_Number()}" /></td>
            </tr>
            <tr>
                <td>Alternate Number</td>
                <td><input type="text" name="Alt_Contact_Number" placeholder="##########"
                    size=30 value="${patient.getAlt_Contact_Number()}" /></td>
            </tr>
            <tr>
                <td>Email*</td>
                <td><input type="text" name="Email_ID" placeholder="@gmail.com" size=30
                    id="email" value="${patient.getEmail_ID()}" /></td>
            </tr>
            <tr>
                <td>Password*</td>
                <td><input type="password" name="pass_word" placeholder="password" size=30
                    id="password" value="${patient.getPass_word()}" /></td>
            </tr>
            <tr>
                <td>Address Line1*</td>
                <td><input type="text" name="Address_Line_1" placeholder="Address Line1"
                    size=30 id="addressLine1" value="${patient.getAddress_Line_1() }" /></td>
            </tr>
            <tr>
                <td>Address Line2</td>
                <td><input type="text" name="Address_Line_2" placeholder="Address Line2"
                    size=30 value="${patient.getAddress_Line_2() }" /></td>
            </tr>
            <tr>
                <td>State</td>
                <td><select id="state" name="State" size="1" onchange="makeSubmenu(this.value)"
                    value="${patient.getState() }">
                        <option value="" disabled selected hidden>Choose State</option>
                        <option>Odisha</option>
                        <option>Maharashtra</option>
                        <option>Kerala</option>
                        <option>AndraPradesh</option>
                        <option>ArunachalPradesh</option>
                        <option>Assam</option>
                        <option>Bihar</option>
                        <option>Chhattisgarh</option>
                        <option>Goa</option>
                        <option>Gujarat</option>
                        <option>Haryana</option>
                        <option>HimachalPradesh</option>
                        <option>Jharkhand</option>
                        <option>Karnataka</option>
                        <option>Kerala</option>
                        <option>MadhyaPradesh</option>
                        <option>Manipur</option>
                        <option>Meghalaya</option>
                        <option>Mizoram</option>
                        <option>Nagaland</option>
                        <option>Punjab</option>
                        <option>Rajasthan</option>
                        <option>Sikkim</option>
                        <option>TamilNadu</option>
                        <option>Telangana</option>
                        <option>Tripura</option>
                        <option>UttarPradesh</option>
                        <option>Uttarakhand</option>
                        <option>WestBengal</option>
                </select></td>
            </tr>
            <tr>
                <td>City</td>
                <td><select id="citySelect" size="1" name="City" value="${patient.getCity() }"></br>
                        <option value="" disabled selected>Choose City</option>
                        <option></option>
                </select></td>
            </tr>
            <%---  <tr>
                <td>City*</td>
                <td><input type="text" name="city" placeholder="City" size=30 id="city" />
            </tr>--%>

            <td>Zip Code*</td>
            <td><input type="text" name="Zip_Code" placeholder="Zip Code" size=30 id="zipCode"
                value="${patient.getZip_Code() }" />
            </tr>

            <tr>
                <td colspan=2 align="center"><input type="submit" value="Edit" name="submit"
                    class="submit" /></td>
            </tr>
    </table>
    </form>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>