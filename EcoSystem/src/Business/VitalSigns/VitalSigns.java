/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author my pc
 */
public class VitalSigns extends WorkRequest{
    private String PatientName;
    private String DateOfBirth;
    private String DateOfMarriage;
    private String EmergencyContactName;
    private double EmergencyContactNumber;
    private String City;
    private double BloodPressure;
    private double Haemoglobin;
    private double Temperature;
    private int Pulse;
    private int Respiration;
    private int PregnancyPeriod;
    
 public VitalSigns(String name,String dob,String dom,String contactname,double contactnumber, String city,double bloodpressure,double haemoglobin,double temp,int pulse,int resp,int PregnancyPeriod){
     this.PatientName=name;
     this.DateOfBirth=dob;
     this.DateOfMarriage=dom;
     this.EmergencyContactName=contactname;
     this.EmergencyContactNumber=contactnumber;
     this.City=city;
     this.BloodPressure=bloodpressure;
     this.Haemoglobin=haemoglobin;
     this.Temperature=temp;
     this.Pulse = pulse;
     this.Respiration=resp;
     this.PregnancyPeriod=PregnancyPeriod;
}

    public int getPregnancyPeriod() {
        return PregnancyPeriod;
    }

    public void setPregnancyPeriod(int PregnancyPeriod) {
        this.PregnancyPeriod = PregnancyPeriod;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getDateOfMarriage() {
        return DateOfMarriage;
    }

    public void setDateOfMarriage(String DateOfMarriage) {
        this.DateOfMarriage = DateOfMarriage;
    }

    public String getEmergencyContactName() {
        return EmergencyContactName;
    }

    public void setEmergencyContactName(String EmergencyContactName) {
        this.EmergencyContactName = EmergencyContactName;
    }

    public double getEmergencyContactNumber() {
        return EmergencyContactNumber;
    }

    public void setEmergencyContactNumber(double EmergencyContactNumber) {
        this.EmergencyContactNumber = EmergencyContactNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getHaemoglobin() {
        return Haemoglobin;
    }

    public void setHaemoglobin(double Haemoglobin) {
        this.Haemoglobin = Haemoglobin;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public int getRespiration() {
        return Respiration;
    }

    public void setRespiration(int Respiration) {
        this.Respiration = Respiration;
    }
     @Override
    public String toString(){
        return PatientName;
    } 
}
