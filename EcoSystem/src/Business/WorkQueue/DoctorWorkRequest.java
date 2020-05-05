/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSigns;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author my pc
 */
public class DoctorWorkRequest extends WorkRequest {
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
     private Date requestDate;
    private Date resolveDate;
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
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

    public int getPregnancyPeriod() {
        return PregnancyPeriod;
    }

    public void setPregnancyPeriod(int PregnancyPeriod) {
        this.PregnancyPeriod = PregnancyPeriod;
    }

   

        public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return PatientName;
    }
  /*    public ArrayList<VitalSigns> getAbnormalList(double defaultMaxBP,double defaultMinBP,double defaultMaxHae, double defaultminHae, double defaultMaxTemp,double defaultMinTemp, int defaultMaxPulse,int defaultminPulse,int defaultMaxResp,int defaultminResp){
        ArrayList<DoctorWorkRequest> list= new ArrayList<DoctorWorkRequest>();
        for(DoctorWorkRequest vs: ){
            if((vs.getBloodPressure()< defaultMinBP || vs.getBloodPressure()>defaultMaxBP)||(vs.getTemperature()<defaultMinTemp|| vs.getTemperature()>defaultMaxTemp) ||(vs.getHaemoglobin()< defaultminHae || vs.getHaemoglobin()> defaultMaxHae)||(vs.getPulse()<defaultminPulse || vs.getPulse()>defaultMaxPulse)||(vs.getRespiration()<defaultminResp || vs.getRespiration()> defaultMaxResp)) {
            list.add(vs);
        }
        }
        return list;
    } */
    
}
