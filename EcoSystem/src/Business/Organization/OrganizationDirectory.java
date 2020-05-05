/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization.Type;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
   // private Employee employee;
   // private PatientDirectory patientDirectory;
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
       // patientDirectory = new PatientDirectory();
    }


    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
   
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.CareTaker.getValue())){
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Machinery.getValue())){
            organization = new MachineryOrganization();
            organizationList.add(organization);
        }
        
        if (type.getValue().equals(Type.Banking.getValue())){
            organization = new BankingOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Sponsor.getValue())){
            organization = new SponsorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}