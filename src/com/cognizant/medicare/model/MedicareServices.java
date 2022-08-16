package com.cognizant.medicare.model;

public class MedicareServices {
    private long Medicare_Service_ID;
    private String Medicare_Service;
    private String Service_Description;
    private double Amount;

    public MedicareServices() {

    }

    public MedicareServices(long medicare_Service_ID, String medicare_Service,
            String service_Description, double amount) {
        super();
        Medicare_Service_ID = medicare_Service_ID;
        Medicare_Service = medicare_Service;
        Service_Description = service_Description;
        Amount = amount;
    }

    public long getMedicare_Service_ID() {
        return Medicare_Service_ID;
    }

    public void setMedicare_Service_ID(long medicare_Service_ID) {
        Medicare_Service_ID = medicare_Service_ID;
    }

    public String getMedicare_Service() {
        return Medicare_Service;
    }

    public void setMedicare_Service(String medicare_Service) {
        Medicare_Service = medicare_Service;
    }

    public String getService_Description() {
        return Service_Description;
    }

    public void setService_Description(String service_Description) {
        Service_Description = service_Description;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        this.Amount = amount;
    }

    @Override
    public String toString() {
        return "MedicareServices [Medicare_Service_ID=" + Medicare_Service_ID
                + ", Medicare_Service=" + Medicare_Service + ", Service_Description="
                + Service_Description + ", Amount=" + Amount + "]";
    }

}
