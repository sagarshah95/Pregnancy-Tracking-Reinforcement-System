/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SponsorRole;
import Business.Sponsor.SponsorDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class SponsorOrganization extends Organization{
    private SponsorDirectory sponsorDirectory;
    public SponsorOrganization (){
        super(Organization.Type.Sponsor.getValue());
        this.sponsorDirectory=new SponsorDirectory();
    }

    public SponsorDirectory getBankingDirectory() {
        return sponsorDirectory;
    }

    public void setBankingDirectory(SponsorDirectory bankingDirectory) {
        this.sponsorDirectory = bankingDirectory;
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SponsorRole());
        return roles;
    }   
}
