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

    <form action="PendingDoctor" method="post">
        <input type="submit" name="submit" value="Doctor Approval" id="submit1" />
    </form>
    <form action="ApprovalAdmin" method="post" name="medicare" onsubmit="return validateForm()"
        autocomplete="off">

        <table class="form" cellspacing=10px>
            <h3 class="successmessage">${doctor1}</h3>
            <th colspan=2><h2>Doctor Registration</h2></th>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="doctorId" value="${doctor.getDoctor_Id()}" size=30
                    id="doctorId" readOnly="readonly" /></td>
            </tr>

            <tr>
                <td>First Name*</td>
                <td><input type="text" name="firstName" size=30
                    value="${doctor.getFirst_Name()}" id="firstName" readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Last Name*</td>
                <td><input type="text" name="lastName" value="${doctor.getLast_Name()}" size=30
                    id="lastName" readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Date Of Birth*</td>
                <td><input type="Date" name="dateOfBirth" size=30 id="dateOfBirth"
                    value="${doctor.getDoB()}" onblur="ageCount(this)" readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Age*</td>
                <td><input type="text" name="age" value="${doctor.getAge()}" size=30 id="age"
                    readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Gender*</td>

                <td><select name="gender" id="gender" value="${doctor.getGender()}"
                    readOnly="readonly">
                        <option value="${doctor.getGender()}" disabled selected hidden>${doctor.getGender()}</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>
                </select></td>
            </tr>
            <tr>
                <td>Degree*</td>
                <td><select name="degree" id="degree" value="${doctor.getDegree()}"
                    readOnly="readonly">
                        <option value="${doctor.getDegree()}" disabled selected hidden>${doctor.getDegree()}</option>
                        <option value="MBBS">MBBS</option>
                        <option value="BMBS">BMBS</option>
                        <option value="MD">MD</option>
                        <option value="DO">DO</option>
                        <option value="MS">MS</option>
                        <option value="BDS">BDS</option>
                </select></td>
            </tr>
            <tr>
                <td>Speciality*</td>
                <td><select name="speciality" id="Speciality" value="${doctor.getSpeciality()}"
                    readOnly="readonly">
                        <option value="${doctor.getSpeciality()}" disabled selected hidden>${doctor.getSpeciality()}</option>
                        <option value="Dentist">Dentist</option>
                        <option value="Cardiologist">Cardiologist</option>
                        <option value="Surgeon">Surgeon</option>
                        <option value="Dermatologist">Dermatologist</option>
                        <option value="Neurologist">Neurologist</option>
                        <option value="Nefrologist">Nefrologist</option>
                </select></td>
            </tr>
            <tr>
                <td>Hospital/Clinic Name*</td>
                <td><input type="text" name="hospitalName" value="${doctor.getHospital_Name()}"
                    id="hospitalName" readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Medicare Service ID*</td>
                <td><input type="text" name="medicareServiceId"
                    value="${doctor.getMedicare_Service_ID()}" size=30 readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Contact Number*</td>
                <td><input type="text" name="contactNumber"
                    value="${doctor.getContact_Number()}" size=30 readOnly="readonly"
                    id="contactNumber" /></td>
            </tr>
            <tr>
                <td>Email*</td>
                <td><input type="text" name="email" value="${doctor.getEmail_ID()}" size=30
                    id="
                    email" readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>Address Line1*</td>
                <td><input type="text" name="addressLine1" size=30
                    value="${doctor.getAddress_Line_1()}" readOnly="readonly" id="addressLine1" /></td>
            </tr>
            <tr>
                <td>Address Line2</td>
                <td><input type="text" name="addressLine2"
                    value="${doctor.getAddress_Line_2() }" size=30 readOnly="readonly" /></td>
            </tr>
            <tr>
                <td>State</td>
                <td><select id="state" name="state" size="1" onchange="makeSubmenu(this.value)"
                    readOnly="readonly" value="${doctor.getState()}">
                        <option value="${doctor.getState()}" disabled selected>${doctor.getState()}</option>
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
                <td><select id="citySelect" size="1" name="city" value="${doctor.getCity()}"
                    readOnly="readonly"></br>
                        <option value="${doctor.getCity()}" disabled selected>${doctor.getCity()}</option>
                        <option></option>
                </select></td>
            <tr>
                <td>Status</td>
                <td><input type="text" name="status" value="${doctor.getStatus()}"
                    placeholder="Approve or Reject" /></td>
            </tr>
            <tr>
                <td>
                <td colspan=2 align="center"><input type="submit" value="Edit" name="submit"
                    class="submit" /></td>
                </td>

            </tr>
        </table>

    </form>

    <footer> <b> Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
</body>
</html>
