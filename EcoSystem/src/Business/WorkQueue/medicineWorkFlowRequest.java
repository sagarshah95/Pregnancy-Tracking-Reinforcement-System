/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author vasundhara
 */
public class medicineWorkFlowRequest extends WorkRequest{
    
    String medicineName;
    int qty;
    String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    

    public medicineWorkFlowRequest(String medicineName, int qty) {
        this.medicineName = medicineName;
        this.qty = qty;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    @Override
    
    public String toString(){
        return medicineName;
    }
    
    
}
