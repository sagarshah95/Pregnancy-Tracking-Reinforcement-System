/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sponsor;
import Business.Organization.Organization;
import java.util.ArrayList;
/**
 *
 * @author sagar
 */
public class SponsorDirectory {

    public ArrayList<Sponsor> getBankingList() {
        return bankingList;
    }

    public void setBankingList(ArrayList<Sponsor> bankingList) {
        this.bankingList = bankingList;
    }
    private ArrayList<Sponsor> bankingList;
    
    public SponsorDirectory(){
        this.bankingList = new ArrayList();
    }
    
    public Sponsor createBank(String BankName, int AvailFunds, int EmergencyContactNumber, int FundsApproved, String BranchName){
        Sponsor bank = new Sponsor();
        bank.setBankName(BankName);
        bank.setAvailFunds(AvailFunds);
        bank.setEmergencyContactNumber(EmergencyContactNumber);
        bank.setFundsApproved(FundsApproved);
        bank.setBranchName(BranchName);
        bankingList.add(bank);
        return bank;
    }
}
