/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Medicines.MedicineDirectory;

import Business.Role.MachineryRole;
//import Business.Role.PharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author vasundhara
 */
public class MachineryOrganization extends Organization{
    
    public MachineryOrganization(){
        super(Organization.Type.Machinery.getValue());       
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MachineryRole());
        return roles;
    }
}
