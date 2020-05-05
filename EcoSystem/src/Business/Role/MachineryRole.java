/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.MachineryOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MachineryRole.MachineryWorkAreaJPanel;

/**
 *
 * @author vasundhara
 */
public class MachineryRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business){
        return new MachineryWorkAreaJPanel(userProcessContainer, account, (MachineryOrganization)organization, enterprise);
    }
}
