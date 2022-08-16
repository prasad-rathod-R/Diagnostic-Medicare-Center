package com.cognizant.medicare.dao;

import java.text.ParseException;

import com.cognizant.medicare.model.Admin;

public interface AdminDao {
    public void insertAdminDetails(Admin admin) throws ParseException;

    public Admin getAdminDetails(String username);

    public Admin getAdminDetails();

    public void updateAdminDetails(Admin admin);
}