
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cognizant.medicare.dao.AdminDaoSqlImpl;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.model.Doctor;
import com.cognizant.medicare.model.Patient;

public class Bugging {

    @Test
    public void testadminDetailPwd() {

        Admin admin;
        AdminDaoSqlImpl dao = new AdminDaoSqlImpl();
        admin = dao.getAdminDetails("Deepthi");
        assertEquals("deepthi", admin.getPass_word());
    }
   /* @Test
    public void testadminDetailsInsert()
    {
        Admin admin=new Admin();
        AdminDaoSqlImpl dao=new AdminDaoSqlImpl();
        admin=dao.insertAdminDetails();
        assertEquals("1166",admin.getAdmin_Id());
    }*/

    @Test
    public void testpatientDetailPwd() {

        Patient patient;
        PatientDaoSqlImpl dao = new PatientDaoSqlImpl();
        patient = dao.getPatientDetails("reshma");
        assertEquals("reshma", patient.getPass_word());
    }

    @Test
    public void testdoctorDetailPwd() {

        Doctor doctor;
        DoctorDaoSqlImpl dao = new DoctorDaoSqlImpl();
        doctor = dao.getDoctorDetails("vishal");
        assertEquals("vishal", doctor.getPass_word());
    }

}
