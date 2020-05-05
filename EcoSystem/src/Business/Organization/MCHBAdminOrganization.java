/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.MCHBRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class MCHBAdminOrganization extends Organization{
     public MCHBAdminOrganization() {
        super(Type.MCHBAdmin.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MCHBRole());
        return roles;
    }
     @Override
    public String toString() {
        return Role.RoleType.MCHB.getValue();
    }
    
}
