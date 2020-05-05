/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bank;
//import Business.Organization.CareTakerOrganization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author sagar
 */
public class Banking extends WorkRequest{
    private String BankName;
    private int AvailFunds;
    private int EmergencyContactNumber;
    private int FundsApproved;
    private String BranchName;    

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public int getAvailFunds() {
        return AvailFunds;
    }

    public void setAvailFunds(int AvailFunds) {
        this.AvailFunds = AvailFunds;
    }

    public int getEmergencyContactNumber() {
        return EmergencyContactNumber;
    }

    public void setEmergencyContactNumber(int EmergencyContactNumber) {
        this.EmergencyContactNumber = EmergencyContactNumber;
    }

    public int getFundsApproved() {
        return FundsApproved;
    }

    public void setFundsApproved(int FundsApproved) {
        this.FundsApproved = FundsApproved;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String BranchName) {
        this.BranchName = BranchName;
    }
    
    @Override
    public String toString() {
        return BankName;
    }
}
