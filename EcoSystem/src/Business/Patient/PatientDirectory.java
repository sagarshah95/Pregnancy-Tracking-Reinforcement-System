/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class PatientDirectory {
    //private static PatientDirectory patientDirectory;
    private ArrayList<Patient> patientList; 
  
    public PatientDirectory() {
        this.patientList = new ArrayList<>();
    }
    public ArrayList<Patient> getPatientList() {
        return this.patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public Patient createPatient(String name, String DateOfBirth, String DateOfMarrige, String EmergencyContactName, Double EmergencyContactNumber,String City,String PregnancyEligibility,String IsPregnant){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setDateOfBirth(DateOfBirth);
        patient.setDateOfMarriage(DateOfMarrige);
        patient.setEmergencyContactName(EmergencyContactName);
        patient.setEmergencyContactNumber(EmergencyContactNumber);
        patient.setCity(City);
        patient.setPregnancyEligibility(PregnancyEligibility);
        patient.setIsPregnant(IsPregnant);
        patientList.add(patient);
        return patient;
    }
}
