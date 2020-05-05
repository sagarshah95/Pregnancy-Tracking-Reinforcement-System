/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CareTakerRole.CareTakerWorkAreaJPanel;

/**
 *
 * @author my pc
 */
public class CareTakerRole extends Role {
    
    /**
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @return
     */
    @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business){
        return new CareTakerWorkAreaJPanel(userProcessContainer,account,enterprise,organization,business);
    }
}
