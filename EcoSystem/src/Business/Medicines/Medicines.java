/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicines;

import java.util.Date;

/**
 *
 * @author vasundhara
 */
public class Medicines {
    
    private String medicineName;
    private int availCount;
    private String expDate;
    
    public Medicines(String medicineName, int availCount, String expDate){
        this.medicineName = medicineName;
        this.availCount = availCount;
        this.expDate = expDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getAvailCount() {
        return availCount;
    }

    public void setAvailCount(int availCount) {
        this.availCount = availCount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    @Override
    public String toString(){
        return medicineName;
    }
    
}
