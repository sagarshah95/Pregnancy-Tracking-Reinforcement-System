/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Organization.CareTakerOrganization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkRequest;
import Business.VitalSigns.VitalSignsHistory;

/**
 *
 * @author my pc
 */
public class Patient extends WorkRequest{
    private String Name;
    private String DateOfBirth;
    private String DateOfMarriage;
    private String EmergencyContactName;
    private Double EmergencyContactNumber;
    private String City;
    private String PregnancyEligibility;
    private String IsPregnant;
  

    

   /* public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    } */

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
    @Override
    public String toString() {
        return Name;
    }
}

