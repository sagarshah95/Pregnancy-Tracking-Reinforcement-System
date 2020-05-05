/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSigns;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
   // private String testResult;
   
    private Date requestDate;
    private Date resolveDate;
    private String Name;
    private String DateOfBirth;
    private String DateOfMarriage;
    private String EmergencyContactName;
    private Double EmergencyContactNumber;
    private String City;
    private String PregnancyEligibility;
    private String IsPregnant;
     private double BloodPressure;
    private double Haemoglobin;
    private double Temperature;
    private int Pulse;
    private int Respiration;
    private String CreationDate;

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public Double getEmergencyContactNumber() {
        return EmergencyContactNumber;
    }

    public void setEmergencyContactNumber(Double EmergencyContactNumber) {
        this.EmergencyContactNumber = EmergencyContactNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPregnancyEligibility() {
        return PregnancyEligibility;
    }

    public void setPregnancyEligibility(String PregnancyEligibility) {
        this.PregnancyEligibility = PregnancyEligibility;
    }

    public String getIsPregnant() {
        return IsPregnant;
    }

    public void setIsPregnant(String IsPregnant) {
        this.IsPregnant = IsPregnant;
    }
  
private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return Name;
    }
    
}
