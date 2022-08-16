function validateFormPatient() {
    var id = document.forms["medicare1"]["patientId"].value;
    var firstName = document.forms["medicare1"]["firstName"].value;
    var lastName = document.forms["medicare1"]["lastName"].value;
    var dob = document.forms["medicare1"]["dob"].value;
    var password = document.forms["medicare1"]["password"].value;
    var retype = document.forms["medicare1"]["retype"].value;
    var contactNumber = document.forms["medicare1"]["contactNumber"].value;
    var email = document.forms["medicare1"]["email"].value;
    var addressLine1 = document.forms["medicare1"]["addressLine1"].value;
    var state = document.forms["medicare1"]["state"].value;
    var zipCode = document.forms["medicare1"]["zipCode"].value;
    var regex = (/^.*[0-9].*$/);
    var regex1 = (/^.*[@][a-zA-Z]+[.][a-zA-Z]+$/);
    /*
     * if (id == "") { alert("Id is required"); return false; }
     * 
     * if (id.length < 2 || id.length > 100) { alert("Title should have 2 to 100
     * characters."); return false; }
     */
    if (firstName == "") {
        alert("First Name is required");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }
    if (firstName.match(regex)) {
        alert("First Name has to be an alphbet");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }

    if (lastName == "") {
        alert("Last Name is required");
        document.getElementById('lastName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('lastName').style.borderColor = "";
    }
    if (lastName.match(regex)) {
        alert("Last Name has to be an alphabet");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }

    if (dob == "") {
        alert("Date of Birth is required");
        document.getElementById('dob').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('dob').style.borderColor = "";
    }

    if (contactNumber == "") {
        alert("contact is required");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (!contactNumber.match(regex)) {
        alert("contact has to be number");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (contactNumber.length < 10 || contactNumber.length > 10) {
        alert("contact number should be 10 digits");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (email == "") {
        alert("Email is required");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }

    if (!email.match(regex1)) {
        alert("Email not in format");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }

    
    if (password == "") {
        alert("password is required");
        document.getElementById('password').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('password').style.borderColor = "";
       /* alert("Submitted details successfully");*/
    }


    if (password != retype) {
        alert("Passwords do not match.");
        return false;
  
        return true;
        alert("Submitted details successfully");
    }



    if (addressLine1 == "") {
        alert("Address is required");
        document.getElementById('addressLine1').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('addressLine1').style.borderColor = "";
    }

    if (state == "") {
        alert("State is required");
        document.getElementById('state').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('state').style.borderColor = "";
    }

    if (zipCode == "") {
        alert("Zip code is required");
        document.getElementById('zipCode').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('zipCode').style.borderColor = "";
    }

    if (!zipCode.match(regex)) {
        alert("Zip code has to be a number");
        document.getElementById('zipCode').style.borderColor = "red";
        return false;
    } else {
        alert("Submitted details successfully");
        document.getElementById('zipCode').style.borderColor = "";
    }
}

function validateForm() {
    var id = document.forms["medicare"]["doctorId"].value;
    var firstName = document.forms["medicare"]["firstName"].value;
    var lastName = document.forms["medicare"]["lastName"].value;
    var dob = document.forms["medicare"]["dob"].value;
    var degree = document.forms["medicare"]["degree"].value;
    var speciality = document.forms["medicare"]["speciality"].value;
    var from = document.forms["medicare"]["from"].value;
    var to = document.forms["medicare"]["to"].value;
    var hospitalName = document.forms["medicare"]["hospitalName"].value;
    var password = document.forms["medicare"]["password"].value;
    var retype = document.forms["medicare"]["retype"].value;
    var contact = document.forms["medicare"]["contactNumber"].value;
    var email = document.forms["medicare"]["email"].value;
    var addressLine1 = document.forms["medicare"]["addressLine1"].value;
    var state = document.forms["medicare"]["state"].value;
    var zipcode = document.forms["medicare"]["zipCode"].value;
    var regex = (/^.*[0-9].*$/);
    var regex1 = (/^.*[@][a-zA-Z]+[.][a-zA-Z]+$/);

    if (id == "") {
        alert("Id is required");
        return false;
    }

    if (id.length < 2 || id.length > 100) {
        alert("Title should have 2 to 100 characters.");
        return false;
    }

    if (firstName == "") {
        alert("First Name is required");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }
    if (firstName.match(regex)) {
        alert("First Name has to be an alphbet");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }

    if (lastName == "") {
        alert("Last Name is required");
        document.getElementById('lastName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('lastName').style.borderColor = "";
    }
    if (lastName.match(regex)) {
        alert("Last Name has to be an alphbet");
        document.getElementById('lastName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('lastName').style.borderColor = "";
    }

    if (dob == "") {
        alert("DOB is required");
        document.getElementById('dob').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('dob').style.borderColor = "";
    }

    if (degree == "") {
        alert("degree is required");
        document.getElementById('degree').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('degree').style.borderColor = "";
    }
    if (speciality == "") {
        alert("Speciality name is required");
        document.getElementById('speciality').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('speciality').style.borderColor = "";
    }
    if (from == "") {
        alert("Work Hours is required");
        document.getElementById('from').style.borderColor = "red";
        return false;
    } else if (!from.match(regex)) {
        alert("Work Hours has to be number");
        document.getElementById('from').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('from').style.borderColor = "";
    }

    if (to == "") {
        alert("Work Time is required");
        document.getElementById('to').style.borderColor = "red";
        return false;
    } else if (!to.match(regex)) {
        alert("Work Time has to be number");
        document.getElementById('to').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('to').style.borderColor = "";
    }

    if (hospitalName == "") {
        alert("Hospital name is required");
        document.getElementById('hospitalName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('hospitalName').style.borderColor = "";
    }

    if (contact == "") {
        alert("contact is required");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }
    if (!contact.match(regex)) {
        alert("contact has to be number");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }
    if (contact.length < 10 || contact.length > 10) {
        alert("contact number should be 10 digits");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (email == "") {
        alert("Email is required");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }
    if (!email.match(regex1)) {
        alert("Email not in format");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }

    if (password == "") {
        alert("password is required");
        document.getElementById('password').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('password').style.borderColor = "";
    }


    if (password != retype) {
        alert("Passwords do not match.");
        return false;
  
        return true;
        alert("Submitted details successfully");
    }


    if (addressLine1 == "") {
        alert("Address is required");
        document.getElementById('addressLine1').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('addressLine1').style.borderColor = "";
    }

    if (state == "") {
        alert("State is required");
        document.getElementById('state').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('state').style.borderColor = "";
    }
    if (zipcode == "") {
        alert("Zip code is required");
        document.getElementById('zipCode').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('zipCode').style.borderColor = "";
    }
    if (!zipcode.match(regex)) {
        alert("Zip code has to be a number");
        document.getElementById('zipCode').style.borderColor = "red";
        return false;
    } else {
        alert("Submitted details successfully");
        document.getElementById('zipCode').style.borderColor = "";
    }
}

function validateFormAdmin() {
    var id = document.forms["medicare2"]["adminId"].value;
    var firstName = document.forms["medicare2"]["firstName"].value;
    var LastName = document.forms["medicare2"]["lastName"].value;
    /* var Age = document.forms["medicare2"]["age"].value; */
    var dob = document.forms["medicare2"]["dob"].value;
    var Contact = document.forms["medicare2"]["contactNumber"].value;
    var email = document.forms["medicare2"]["email"].value;
    var password = document.forms["medicare2"]["password"].value;
    var retype = document.forms["medicare2"]["retype"].value;
    var regex = (/^.*[0-9].*$/);
    var regex1 = (/^.*[@][a-zA-Z]+[.][a-zA-Z]+$/);
    if (id == "") {
        alert("Id is required");
        return false;
    }

    if (id.length < 2 || id.length > 100) {
        alert("Title should have 2 to 100 characters.");
        return false;
    }

    if (firstName == "") {
        alert("First Name is required");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }
    if (firstName.match(regex)) {
        alert("First Name has to be an alphbet");
        document.getElementById('firstName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('firstName').style.borderColor = "";
    }

    if (LastName == "") {
        alert("Last Name is required");
        document.getElementById('lastName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('lastName').style.borderColor = "";
    }
    if (LastName.match(regex)) {
        alert("Last Name has to be an alphbet");
        document.getElementById('lastName').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('lastName').style.borderColor = "";
    }

    if (dob == "") {
        alert("Date of Birth is required");
        document.getElementById('dob').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('dob').style.borderColor = "";
    }

    if (Contact == "") {
        alert("contact is required");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (!Contact.match(regex)) {
        alert("contact has to be number");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (Contact.length < 10 || Contact.length > 10) {
        alert("contact should be 10 digits");
        document.getElementById('contactNumber').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('contactNumber').style.borderColor = "";
    }

    if (email == "") {
        alert("Email is required");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }

    if (!email.match(regex1)) {
        alert("Email not in format");
        document.getElementById('email').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('email').style.borderColor = "";
    }

    if (password == "") {
        alert("password is required");
        document.getElementById('password').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('password').style.borderColor = "";
       /* alert("Submitted details successfully");*/
    }



    if (password != retype) {
        alert("Passwords do not match.");
        return false;
  
        return true;
        alert("Submitted details successfully");
    }

}
/*function Toggle() {
    var temp = document.getElementById("typepass");
    if (temp.type === "password") {
        temp.type = "text";
    } else {
        temp.type = "password";
    }
}*/


function validateLogin() {
    var regex = (/^.*[0-9][a-zA-z].*$/);
    var username = document.forms["login"]["username"].value;
    if (username == "") {
        alert("UserName is required");
        document.getElementById('username').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('username').style.borderColor = "";
    }
    if (username.match(regex)) {
        document.getElementById('username').style.borderColor = "red";
        return false;
    } 
    var password = document.forms["login"]["password"].value;
    if (password == "") {
        alert("password is required");
        document.getElementById('password').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('password').style.borderColor = "";
    }
}

function ageCount() {
    var dob = document.getElementById("dob").value;
    var curdate = new Date();
    var dobdate = new Date(dob);

    var y1 = curdate.getFullYear();

    // getting current year
    var y2 = dobdate.getFullYear();

    if (y2 >= y1) {
        alert("DOB should not be greater than current date");
    } else {
        // calculating age
        var age = y1 - y2;
        document.getElementById("ageId").value = age;
        doucment.getElementById("ageId").focus();
    }

}

function disableBackButton() {
    window.history.forward();
}
setTimeout("disableBackButton()", 0);
window.onunload = function() {
    null;
};

var citiesByState = {
    Odisha : [ "Bhubaneswar", "Puri", "Cuttack" ],
    Maharashtra : [ "Mumbai", "Pune", "Nagpur" ],
    Kerala : [ "kochi", "Kanpur" ],
    AndraPradesh : [ "Visakhapatnam", " Vijayawada", "Guntur", "Nellore", "Tirupati" ],
    ArunachalPradesh : [ "Tawang", "Bhismaknagar", "Pasighat", "Ziro", "Bomdila" ],
    Assam : [ "Guwahati", "Tezpur", "Dibrugarh", "Silchar", " North Lakhimpur" ],
    Bihar : [ "Gaya", "Biharsharif", "Darbhanga", "Bhagalpur" ],
    Chhattisgarh : [ "Raipur", "Bilaspur", "Korba", "Durg-Bhilainagar", "Raigarh ", "Rajnandgaon" ],
    Goa : [ "Vasco-da-Gama", "Ponda", "Margao", "Mapusa ", "Goa", "Velha" ],
    Gujarat : [ "Ahmedabad", "Surat", "Rajkot", "Junagadh", "Vadodara" ],
    Haryana : [ "Faridabad", "Gurgaon", "Sonipat", "Panipat", "Ambala" ],
    HimachalPradesh : [ "Dharamshala", "Mandi", "Solan", "Bilaspur", "Chamba" ],
    Jharkhand : [ "Bokaro", "Jamshedpur", "Deoghar", "Hazaribagh", "Dhanbad" ],
    Karnataka : [ "Mysore", "Davangere", "Mangalore", "Hubli-Dharwad", "Belgaum" ],
    MadhyaPradesh : [ "Indore", "Gwalior", "Jabalpur", "Ujjain", "Sagar" ],
    Manipur : [ "Bishnupur", "Ukhrul", "Tamenglong", "Chandel", "Senapati" ],
    Meghalaya : [ "Cherrapunji", "Tura", "Jowai", "Baghmara", "Nongpoh" ],
    Mizoram : [ "Lunglei", "Serchhip", "Champhai", "Tuipang", "Mamit" ],
    Nagaland : [ "Tuensang", "Zunheboto", "Mokokchung", "Kiphire Sadar ", "Phek" ],
    Punjab : [ "Amritsar", "Jalandhar", "Ludhiana", " Patiala", "Kapurthala" ],
    Rajasthan : [ "Bikaner", "Jaisalmer", "Jodhpur", "Udaipur", "Ajmer" ],
    Sikkim : [ "Namchi", "Gyalshing", "Mangan", "Rabdentse" ],
    TamilNadu : [ "Tiruchirappalli", "Madurai", "Erode", "Vellore", "Coimbatore" ],
    Telangana : [ "Warangal", "Nizamabad", "Karimnagar", "Adilabad", "Khammam" ],
    Tripura : [ "Amarpur", "Kumarghat", "Udaipur", "Gakulnagar", "Kunjaban" ],
    UttarPradesh : [ "Noida", "Varanasi", "Allahabad", "Agra", "Kanpur" ],
    Uttarakhand : [ "Haridwar", "Roorkee", "Rishikesh", "Kashipur", "Haldwani" ],
    WestBengal : [ "Darjeeling", "Siliguri", "Asansol", "Howrah", "Durgapur" ]
}
function makeSubmenu(value) {
    if (value.length == 0)
        document.getElementById("citySelect").innerHTML = "<option></option>";
    else {
        var citiesOptions = "";
        for (cityId in citiesByState[value]) {
            citiesOptions += "<option>" + citiesByState[value][cityId] + "</option>";
        }
        document.getElementById("citySelect").innerHTML = citiesOptions;
    }
}
function displaySelected() {
    var country = document.getElementById("countrySelect").value;
    var city = document.getElementById("citySelect").value;
    alert(country + "\n" + city);
}
function resetSelection() {
    document.getElementById("countrySelect").selectedIndex = 0;
    document.getElementById("citySelect").selectedIndex = 0;
}
var myIndex = 0;
carousel();

function slide() {
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
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
function validateTest() {
    var reportId = document.forms["addPatient"]["reportId"].value;
    var patientId = document.forms["addPatient"]["patientId"].value;
    var doctorId = document.forms["addPatient"]["doctorId"].value;
    var testresult = document.forms["addPatient"]["testresult"].value;
    var servicedate = document.forms["addPatient"]["servicedate"].value;
    var diag1actualvalue = document.forms["addPatient"]["diag1actualvalue"].value;
    var diag1normalvalue = document.forms["addPatient"]["diag1normalvalue"].value;
    var diag2actualvalue = document.forms["addPatient"]["diag2actualvalue"].value;
    var diag2normalvalue = document.forms["addPatient"]["diag2normalvalue"].value;
    var diag3actualvalue = document.forms["addPatient"]["diag3actualvalue"].value;
    var diag3normalvalue = document.forms["addPatient"]["diag3normalvalue"].value;
    var diag4actualvalue = document.forms["addPatient"]["diag4actualvalue"].value;
    var diag4normalvalue = document.forms["addPatient"]["diag4normalvalue"].value;
    var diag5actualvalue = document.forms["addPatient"]["diag5actualvalue"].value;
    var diag5normalvalue = document.forms["addPatient"]["diag5normalvalue"].value;
    var diag6actualvalue = document.forms["addPatient"]["diag6actualvalue"].value;
    var diag6normalvalue = document.forms["addPatient"]["diag6normalvalue"].value;
    var doctorscomments = document.forms["addPatient"]["doctorscomments"].value;
    var otherinfo = document.forms["addPatient"]["otherinfo"].value;
    var regex = (/^.*[0-9].*$/);

    if (reportId == "") {
        alert("Report Id is required");
        document.getElementById('reportId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('reportId').style.borderColor = "";
    }
    if (!reportId.match(regex)) {
        alert("Report Id has to be numbers");
        document.getElementById('reportId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('reportId').style.borderColor = "";
    }

    if (patientId == "") {
        alert("Patient id is required");
        return false;
    }

    if (patientId.length < 2 || patientId.length > 100) {
        alert("Patient Id should have 2 to 100 characters.");
        return false;
    }
    if (!patientId.match(regex)) {
        alert("Patient Id Id has to be numbers");
        document.getElementById('patientId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('patientId').style.borderColor = "";
    }

    if (doctorId == "") {
        alert("Doctor Id is required");
        document.getElementById('doctorId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('doctorId').style.borderColor = "";
    }
    if (!doctorId.match(regex)) {
        alert("Doctor Id has to be numbers");
        document.getElementById('doctorId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('doctorId').style.borderColor = "";
    }

    if (servicedate == "") {
        alert("Service date is required");
        document.getElementById('servicedate').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('servicedate').style.borderColor = "";
    }

    if (testresult == "") {
        alert("Test Result date is required");
        document.getElementById('testresult').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('testresult').style.borderColor = "";
    }

    if (testresult < "2020") {
        alert("Test result date not valid");
        document.getElementById('testresult').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('testresult').style.borderColor = "";
    }

    if (diag1actualvalue == "") {
        alert("diag1 actual value is required");
        document.getElementById('diag1actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag1actualvalue').style.borderColor = "";
    }

    if (!diag1actualvalue.match(regex)) {
        alert("diga1 Id has to be numbers");
        document.getElementById('diag1actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag1actualvalue').style.borderColor = "";
    }

    if (diag1normalvalue == "") {
        alert("diag1normalvalue is required");
        document.getElementById('diag1normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag1normalvalue').style.borderColor = "";
    }
    if (!diag1normalvalue.match(regex)) {
        alert("diag1normalvalue Id has to be numbers");
        document.getElementById('diag1normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag1normalvalue').style.borderColor = "";
    }

    if (diag2actualvalue == "") {
        alert("diag2actualvalue is required");
        document.getElementById('diag2actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag2actualvalue').style.borderColor = "";
    }
    if (!diag2actualvalue.match(regex)) {
        alert("diga2 Id has to be numbers");
        document.getElementById('diag2actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag2actualvalue').style.borderColor = "";
    }

    if (diag2normalvalue == "") {
        alert("diag2normalvalue is required");
        document.getElementById('diag2normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag2normalvalue').style.borderColor = "";
    }
    if (!diag2normalvalue.match(regex)) {
        alert("diag2normalvalue Id has to be numbers");
        document.getElementById('diag2normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag2normalvalue').style.borderColor = "";
    }

    if (diag3actualvalue == "") {
        alert("diga3 is required");
        document.getElementById('diag3actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag3actualvalue').style.borderColor = "";
    }
    if (!diag3actualvalue.match(regex)) {
        alert("diga3 Id has to be numbers");
        document.getElementById('diag3actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag3actualvalue').style.borderColor = "";
    }

    if (diag3normalvalue == "") {
        alert("diag3normalvalue is required");
        document.getElementById('diag3normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag3normalvalue').style.borderColor = "";
    }
    if (!diag3normalvalue.match(regex)) {
        alert("diag3normalvalue Id has to be numbers");
        document.getElementById('diag3normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag3normalvalue').style.borderColor = "";
    }

    if (diag4actualvalue == "") {
        alert("diga4 is required");
        document.getElementById('diag4actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag4actualvalue').style.borderColor = "";
    }
    if (!diag4actualvalue.match(regex)) {
        alert("diga4 Id has to be numbers");
        document.getElementById('diag4actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag4actualvalue').style.borderColor = "";
    }

    if (diag4normalvalue == "") {
        alert("diag4normalvalue is required");
        document.getElementById('diag4normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag4normalvalue').style.borderColor = "";
    }

    if (!diag4normalvalue.match(regex)) {
        alert("diag4normalvalue Id has to be numbers");
        document.getElementById('diag4normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag4normalvalue').style.borderColor = "";
    }

    if (diag5actualvalue == "") {
        alert("diga5 is required");
        document.getElementById('diag5actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag5actualvalue').style.borderColor = "";
    }

    if (!diag5actualvalue.match(regex)) {
        alert("diga5 Id has to be numbers");
        document.getElementById('diag5actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag5actualvalue').style.borderColor = "";
    }

    if (diag5normalvalue == "") {
        alert("diag5normalvalue is required");
        document.getElementById('diag5normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag5normalvalue').style.borderColor = "";
    }
    if (!diag5normalvalue.match(regex)) {
        alert("diag5normalvalue Id has to be numbers");
        document.getElementById('diag5normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag5normalvalue').style.borderColor = "";
    }

    if (diag6actualvalue == "") {
        alert("diga6 is required");
        document.getElementById('diag6actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag6actualvalue').style.borderColor = "";
    }

    if (!diag6actualvalue.match(regex)) {
        alert("diga6 Id has to be numbers");
        document.getElementById('diag6actualvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag6actualvalue').style.borderColor = "";
    }

    if (diag6normalvalue == "") {
        alert("diag6normalvalue is required");
        document.getElementById('diag6normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag6normalvalue').style.borderColor = "";
    }
    if (!diag6normalvalue.match(regex)) {
        alert("diag6normalvalue Id has to be numbers");
        document.getElementById('diag6normalvalue').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('diag6normalvalue').style.borderColor = "";
    }

    if (doctorscomments == "") {
        alert("Doctors comments is required");
        document.getElementById('doctorscomments').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('doctorscomments').style.borderColor = "";
    }

    if (otherinfo == "") {
        alert("Other info is required");
        document.getElementById('otherinfo').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('otherinfo').style.borderColor = "";
        alert("Submitted details successfully");
    }
}
function validatebooking() {
    var DoctorId = document.forms["booking"]["DoctorId"].value;
    var dob1 = document.forms["booking"]["dob1"].value;
    var regex = (/^.*[0-9].*$/);

    if (dob1 == "") {
        alert("Booking Date is required");
        document.getElementById('dob1').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('dob1').style.borderColor = "";
    }

    if (DoctorId == "") {
        alert("Doctor Id is required");
        document.getElementById('DoctorId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('DoctorId').style.borderColor = "";
    }
    if (!DoctorId.match(regex)) {
        alert("Doctor Id has to be numbers");
        document.getElementById('DoctorId').style.borderColor = "red";
        return false;
    } else {
        document.getElementById('DoctorId').style.borderColor = "";
        alert("Submitted details successfully");
    }

}
