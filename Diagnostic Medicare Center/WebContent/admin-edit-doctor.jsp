<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
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
    <header> <nav> <image src="images\symbol-logo.png" width=60 height=60
        class="image" /> <label class="logo">Diagnostic Medicare Center</label>

    <ul>
        <li><a href="admin-login.jsp">Home</a></li>
        <li><a href="home.jsp">Logout</a></li>
    </ul>
    </nav></header>
    <form action="admin-registered-doctor.jsp" method="post">
        <input type="submit" name="submit" value="Add Doctor" id="submit1" />
    </form>
    <form action="ShowDoctor" method="post">
        <input type="submit" name="submit" value="View Doctor" id="submit1" />
    </form>
    <form action="AdminEditDoctor" method="post" name="medicare" onsubmit="return validateForm()"
        autocomplete="off">
        <h2 class="successmessage">${successmessage}</h2>
        <h2 class="failure">${failure}</h2>
        <table class="form" cellspacing=10px>
            <h4>${failure}</h4>
            <th colspan=2><h2>Doctor Edit</h2></th>
            <tr>
                <td>Doctor Id</td>
                <td><input type="text" name="Doctor_Id" value="${doctor.getDoctor_Id()}"
                    size=30 id="doctorId" /></td>
            </tr>

            <tr>
                <td>First Name*</td>
                <td><input type="text" name="First_Name" placeholder="Enter First Name" size=30
                    id="firstName" value="${doctor.getFirst_Name()}" /></td>
            </tr>
            <tr>
                <td>Last Name*</td>
                <td><input type="text" name="Last_Name" placeholder="Enter Last Name" size=30
                    id="lastName" value="${doctor.getLast_Name()}" /></td>
            </tr>
            <tr>
                <td>Date Of Birth*</td>
                <td><input type="Date" name="DoB" size=30 id="dateOfBirth"
                    onblur="ageCount(this)" value="${doctor.getDoB()}" /></td>
            </tr>
            <tr>
                <td>Age*</td>
                <td><input type="text" name="age" placeholder="Enter Age" size=30 id="age"
                    value="${doctor.getAge()}" /></td>
            </tr>
            <tr>
                <td>Gender*</td>

                <td><select name="Gender" id="gender">
                        <option value="${doctor.getGender()}">${doctor.getGender()}</option>

                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>
                </select></td>
            </tr>
            <tr>
                <td>Degree*</td>


                <td><select name="Degree" id="degree">
                        <option value="${doctor. getDegree()}">${doctor. getDegree()}</option>
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
                <td><select name="Speciality" id="Speciality">
                        <option value="${doctor. getSpeciality()}">${doctor. getSpeciality()}</option>
                        <option value="Dentist">Dentist</option>
                        <option value="Cardiologist">Cardiologist</option>
                        <option value="Surgeon">Surgeon</option>
                        <option value="Dermatologist">Dermatologist</option>
                        <option value="Neurologist">Neurologist</option>
                        <option value="Nefrologist">Nefrologist</option>
                </select></td>
            </tr>
            <tr>
                <td>Work Hours*</td>
                <td>from<input type="time" name="working_Hours" id="from"
                    value="${doctor.getWorking_Hours()}" />to<input type="time"
                    name="working_Hours" id="to" value="${doctor.getFirst_Name()}" /></td>
            </tr>
            <tr>
                <td>Hospital/Clinic Name*</td>
                <td><input type="text" name="Hospital_Name" placeholder="Hospital/Clinic Name"
                    id="hospitalName" value="${doctor.getHospital_Name()}" /></td>
            </tr>
            <tr>
                <td>Medicare Service ID*</td>
                <td><input type="text" name="medicareserviceId" id="medicareServiceId"
                    value="${doctor.getMedicare_Service_ID()}" size=30 /></td>


            </tr>
            <tr>
                <td>Contact Number*</td>
                <td><input type="text" name="Contact_Number" placeholder="##########" size=30
                    id="contactNumber" value="${doctor.getContact_Number()}" /></td>
            </tr>
            <tr>
                <td>Alternate Number</td>
                <td><input type="text" name="Alt_Contact_Number" placeholder="##########"
                    size=30 value="${doctor.getAlt_Contact_Number()}" /></td>
            </tr>
            <tr>
                <td>Email*</td>
                <td><input type="text" name="Email_ID" placeholder="@gmail.com" size=30
                    id="email" value="${doctor.getEmail_ID()}" /></td>
            </tr>
            <tr>
                <td>Password*</td>
                <td><input type="password" name="pass_word" placeholder="password" size=30
                    id="password" value="${doctor. getPass_word()}" /></td>
            </tr>
            <tr>
                <td>Address Line1*</td>
                <td><input type="text" name="Address_Line_1" placeholder="Address Line" size=30
                    id="addressLine1" value="${doctor.getAddress_Line_1()}" /></td>
            </tr>
            <tr>
                <td>Address Line2</td>
                <td><input type="text" name="Address_Line_2" placeholder="Address Line" size=30
                    value="${doctor.getAddress_Line_2()}" /></td>
            </tr>
            <tr>
                <td>State</td>
                <td><select id="state" name="State" size="1" onchange="makeSubmenu(this.value)"
                    value="${doctor.getState()}">
                        <option value="" disabled selected>Choose State</option>
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
                <td><select id="citySelect" size="1" name="City" value="${doctor.getCity()}"></br>
                        <option value="" disabled selected>Choose City</option>
                        <option></option>
                </select></td>
            </tr>
            <td>Zip Code*</td>
            <td><input type="text" name="Zip_Code" placeholder="Zip Code" size=30 id="zipCode"
                value="${doctor.getZip_Code()}" />
            </tr>
            <tr>
            <tr>
                <td colspan=2 align="center"><input type="submit" value="Edit" name="submit"
                    class="submit" /></td>
            </tr>
        </table>
    </form>
    <footer> <b>Copyright &copy; 2020 | Toll Free No. 1800 267 1006</b></footer>
    </ body>
</html>