/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Patient.PatientDirectory;
import Business.Role.CareTakerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class CareTakerOrganization extends Organization {
    
    private PatientDirectory patientdirectory;
    public CareTakerOrganization (){
        super(Organization.Type.CareTaker.getValue());
        this.patientdirectory=new PatientDirectory();
    }

  // public PatientDirectory getPatientdirectory() {
     //   return patientdirectory;
    //}

   /*public PatientDirectory getPatientdirectory() {
       return this.patientdirectory;
    }*/
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CareTakerRole());
        return roles;
    }

    public PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
}
