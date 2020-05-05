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
public class medicineWorkRequest extends WorkRequest{
    //private String response;
    private String mediName;
    private int qty;    
    private String expDate;

    public String getMediName() {
        return mediName;
    }

    public void setMediName(String mediName) {
        this.mediName = mediName;
    }
    
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    
    /*public medicineWorkRequest(String response, int qty){
        this.response = response;
        this.qty = qty;
    }*/

    /*public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }*/

    
    
    @Override
    public String toString(){
        return mediName;
    }
}
