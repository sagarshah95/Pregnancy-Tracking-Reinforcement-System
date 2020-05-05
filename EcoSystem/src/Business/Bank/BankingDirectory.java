/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bank;
import Business.Organization.Organization;
import java.util.ArrayList;
/**
 *
 * @author sagar
 */
public class BankingDirectory {

    public ArrayList<Banking> getBankingList() {
        return bankingList;
    }

    public void setBankingList(ArrayList<Banking> bankingList) {
        this.bankingList = bankingList;
    }
    private ArrayList<Banking> bankingList;
    
    public BankingDirectory(){
        this.bankingList = new ArrayList();
    }
    
    public Banking createBank(String BankName, int AvailFunds, int EmergencyContactNumber, int FundsApproved, String BranchName){
        Banking bank = new Banking();
        bank.setBankName(BankName);
        bank.setAvailFunds(AvailFunds);
        bank.setEmergencyContactNumber(EmergencyContactNumber);
        bank.setFundsApproved(FundsApproved);
        bank.setBranchName(BranchName);
        bankingList.add(bank);
        return bank;
    }
}
