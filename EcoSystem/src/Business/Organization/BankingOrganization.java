/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BankingRole;
import Business.Bank.BankingDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class BankingOrganization extends Organization{
    private BankingDirectory bankingDirectory;
    public BankingOrganization (){
        super(Organization.Type.Banking.getValue());
        this.bankingDirectory=new BankingDirectory();
    }

    public BankingDirectory getBankingDirectory() {
        return bankingDirectory;
    }

    public void setBankingDirectory(BankingDirectory bankingDirectory) {
        this.bankingDirectory = bankingDirectory;
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankingRole());
        return roles;
    }   
}
