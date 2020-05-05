/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class VitalSignsHistory {
    public ArrayList<VitalSigns> vitalSignsHistory;
    
    public VitalSignsHistory(){
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public VitalSigns addVitalSigns(String name,String dob,String dom,String contactname,double contactnumber, String city,double bloodpressure,double haemoglobin,double temp,int pulse,int resp,int pregnancyperiod){
        VitalSigns vs = new VitalSigns(name,dob,dom,contactname,contactnumber,city,bloodpressure,haemoglobin,temp,pulse,resp,pregnancyperiod);
        vitalSignsHistory.add(vs);
        return vs;
    }
      public ArrayList<VitalSigns> getAbnormalList(double defaultMaxBP,double defaultMinBP,double defaultMaxHae, double defaultminHae, double defaultMaxTemp,double defaultMinTemp, int defaultMaxPulse,int defaultminPulse,int defaultMaxResp,int defaultminResp){
        ArrayList<VitalSigns> list= new ArrayList<VitalSigns>();
        for(VitalSigns vs: this.getVitalSignsHistory()){
            if((vs.getBloodPressure()< defaultMinBP || vs.getBloodPressure()>defaultMaxBP)||(vs.getTemperature()<defaultMinTemp|| vs.getTemperature()>defaultMaxTemp) ||(vs.getHaemoglobin()< defaultminHae || vs.getHaemoglobin()> defaultMaxHae)||(vs.getPulse()<defaultminPulse || vs.getPulse()>defaultMaxPulse)||(vs.getRespiration()<defaultminResp || vs.getRespiration()> defaultMaxResp)) {
            list.add(vs);
        }
        }
        return list;
    }
}
