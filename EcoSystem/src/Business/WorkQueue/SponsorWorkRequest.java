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
public class SponsorWorkRequest extends WorkRequest{
    String sponsorName;
    int reqFunds;
    String emergencyContactName;
    int emergencyContactNumber;
    String city;
    String requestType;
    String result;

    public SponsorWorkRequest() {
        this.reqFunds=reqFunds;
        this.sponsorName=sponsorName;
        this.requestType=requestType;
        //this.dateOfRequest=dateOfRequest;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public int getReqFunds() {
        return reqFunds;
    }

    public void setReqFunds(int reqFunds) {
        this.reqFunds = reqFunds;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public int getEmergencyContactNumber() {
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString(){
        return sponsorName;
    }
}
