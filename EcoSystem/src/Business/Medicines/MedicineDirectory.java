/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicines;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vasundhara
 */
public class MedicineDirectory {
    public ArrayList<Medicines> medicineList;
    
    public MedicineDirectory(){
        this.medicineList = new ArrayList();
        /*medicineList = new ArrayList<Medicines>();
        Medicines m1 = new Medicines("crocin", 30, "11/20/2025");
        medicineList.add(m1);*/
    }

    public ArrayList<Medicines> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicines> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicines addMedicine(String mediName, int availCount, String expDate){
        Medicines medicines = new Medicines(mediName, availCount, expDate);
        medicines.setMedicineName(mediName);
        medicines.setAvailCount(availCount);
        medicines.setExpDate(expDate);
        medicineList.add(medicines);
        return medicines;
    }
    
}
