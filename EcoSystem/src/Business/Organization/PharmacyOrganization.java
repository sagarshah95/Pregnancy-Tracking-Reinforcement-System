/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Medicines.MedicineDirectory;
import Business.Role.DoctorRole;
import Business.Role.PharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author vasundhara
 */
public class PharmacyOrganization extends Organization{
    private MedicineDirectory medicineDirectory;
    public PharmacyOrganization(){
        super(Organization.Type.Pharmacy.getValue());
        this.medicineDirectory = new MedicineDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }
    
    
}
