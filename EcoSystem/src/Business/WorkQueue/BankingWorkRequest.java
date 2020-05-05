/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author sagar
 */
public class BankingWorkRequest extends WorkRequest{
    String bankName;
    int reqFunds;
    String emergencyContactName;
    int emergencyContactNumber;
    String city;
    String requestType;
    String result;

    public BankingWorkRequest() {
        this.reqFunds=reqFunds;
        this.bankName=bankName;
        this.requestType=requestType;
        //this.dateOfRequest=dateOfRequest;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public double getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(int emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    public double getReqFunds() {
        return reqFunds;
    }

    public void setReqFunds(int reqFunds) {
        this.reqFunds = reqFunds;
    }

    @Override
    public String toString(){
        return bankName;
    }
}
