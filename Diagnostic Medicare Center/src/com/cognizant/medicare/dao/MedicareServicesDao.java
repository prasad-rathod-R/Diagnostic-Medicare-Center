package com.cognizant.medicare.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.medicare.model.MedicareServices;

public interface MedicareServicesDao {
    public void insertMedicareDetails(MedicareServices medicare) throws ParseException;

    public List<MedicareServices> getMedicareDetails();

    public void updateMedicare(MedicareServices medicare);

    public MedicareServices getMedicareDetails(long medicareId);
}
