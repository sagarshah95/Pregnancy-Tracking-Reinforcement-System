/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSigns;
import Business.VitalSigns.VitalSignsHistory;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author my pc
 */
public class CriticalPatientJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private VitalSignsHistory vitalSignsHistory;
double defaultMaxBP;
double defaultMinBP;
double defaultMaxHae;
double defaultminHae;
double defaultMaxTemp;
double defaultMinTemp;
int defaultMaxPulse;
int defaultminPulse;
int defaultMaxResp;
int defaultminResp;
private UserAccount userAccount;
private LabOrganization laborganization;
private Enterprise enterprise;
private EcoSystem system;
ArrayList<DoctorWorkRequest> list;
    /**
     * Creates new form CriticalPatientJPanel
     */
    public CriticalPatientJPanel(JPanel userProcessContainer, VitalSignsHistory vitalSignsHistory,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system,double defaultMaxBP,double defaultMinBP,double defaultMaxHae,double defaultminHae,double defaultMaxTemp,double defaultMinTemp,int defaultMaxPulse,int defaultminPulse,int defaultMaxResp,int defaultminResp) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.vitalSignsHistory=vitalSignsHistory;
        this.userAccount=account;
        this.laborganization=(LabOrganization)organization;
        this.enterprise=enterprise;
        this.system=system;
        this.defaultMaxBP= defaultMaxBP;
        this.defaultMaxHae=defaultMaxHae;
        this.defaultMaxPulse=defaultMaxPulse;
        this.defaultMaxTemp=defaultMaxTemp;
        this.defaultMaxResp=defaultMaxResp;
        this.defaultMinBP=defaultMinBP;
        this.defaultMinTemp=defaultMinTemp;
        this.defaultminHae=defaultminHae;
        this.defaultminPulse=defaultminPulse;
        this.defaultminResp=defaultminResp;
      setCriticalTable( defaultMaxBP, defaultMinBP, defaultMaxHae, defaultminHae, defaultMaxTemp, defaultMinTemp, defaultMaxPulse, defaultminPulse, defaultMaxResp, defaultminResp);
    }
    public void setCriticalTable(double defaultMaxBP,double defaultMinBP,double defaultMaxHae, double defaultminHae, double defaultMaxTemp,double defaultMinTemp, int defaultMaxPulse,int defaultminPulse,int defaultMaxResp,int defaultminResp){
        list = getAbnormalList(defaultMaxBP, defaultMinBP, defaultMaxHae,  defaultminHae,  defaultMaxTemp, defaultMinTemp,  defaultMaxPulse, defaultminPulse, defaultMaxResp, defaultminResp);
        initialTextFields();
       populateTable(list);
    }
  public ArrayList<DoctorWorkRequest> getAbnormalList(double defaultMaxBP,double defaultMinBP,double defaultMaxHae, double defaultminHae, double defaultMaxTemp,double defaultMinTemp, int defaultMaxPulse,int defaultminPulse,int defaultMaxResp,int defaultminResp){
        ArrayList<DoctorWorkRequest> list= new ArrayList<DoctorWorkRequest>();
        for(WorkRequest vs:laborganization.getWorkQueue().getWorkRequestList()){
            if(vs instanceof DoctorWorkRequest)
            if((((DoctorWorkRequest) vs).getBloodPressure()< defaultMinBP || ((DoctorWorkRequest) vs).getBloodPressure()>defaultMaxBP)||(((DoctorWorkRequest) vs).getTemperature()<defaultMinTemp|| ((DoctorWorkRequest) vs).getTemperature()>defaultMaxTemp) ||(((DoctorWorkRequest) vs).getHaemoglobin()< defaultminHae || ((DoctorWorkRequest) vs).getHaemoglobin()> defaultMaxHae)||(((DoctorWorkRequest) vs).getPulse()<defaultminPulse || ((DoctorWorkRequest) vs).getPulse()>defaultMaxPulse)||((((DoctorWorkRequest) vs).getRespiration()<defaultminResp || ((DoctorWorkRequest) vs).getRespiration()> defaultMaxResp))) {
            list.add(((DoctorWorkRequest) vs));
        }
        }
        return list;
    }
    
    private void initialTextFields(){
    nameTextField.setText("");
    dobTextField.setText("");
    domTextField.setText("");
    numMonthsTextField.setText("");
    contactNameTextField.setText("");
    contactNumTextField.setText("");
    cityTextField.setText("");
    BloodPressureTextField.setText("");
    tempTextField.setText("");
    HaemoglobinTextField.setText("");
    pulseTextField.setText("");
    respTextField.setText("");
    //txtPulse.setText("");
   // populateTable(list);
    //txtDate.setText("");
}
  private void populateTable(ArrayList<DoctorWorkRequest> list){
    DefaultTableModel dtm =(DefaultTableModel) criticalPatientsJTable.getModel();
     dtm.setRowCount(0);
     for(WorkRequest vs:list){
          Object row[] = new Object[7];
            row[0] = vs;
            row[1] = ((DoctorWorkRequest) vs).getDateOfMarriage();
            row[2] = ((DoctorWorkRequest) vs).getEmergencyContactName();
            row[3] = ((DoctorWorkRequest) vs).getCity();
            row[4] = ((DoctorWorkRequest) vs).getBloodPressure();
            row[5] = ((DoctorWorkRequest) vs).getHaemoglobin();
            row[6] = ((DoctorWorkRequest) vs).getTemperature();
            ((DefaultTableModel) criticalPatientsJTable.getModel()).addRow(row);
     
     }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        criticalPatientsJTable = new javax.swing.JTable();
        viewVitalsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        dobTextField = new javax.swing.JTextField();
        domTextField = new javax.swing.JTextField();
        numMonthsTextField = new javax.swing.JTextField();
        contactNameTextField = new javax.swing.JTextField();
        contactNumTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        BloodPressureTextField = new javax.swing.JTextField();
        HaemoglobinTextField = new javax.swing.JTextField();
        tempTextField = new javax.swing.JTextField();
        respTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        criticalPatientsJTable.setBackground(new java.awt.Color(0, 0, 0));
        criticalPatientsJTable.setForeground(new java.awt.Color(255, 255, 255));
        criticalPatientsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientName", "Date of Marriage", "EmergencyContact", "City", "Blood Pressure", "Haemoglobin", "Temperature"
            }
        ));
        jScrollPane1.setViewportView(criticalPatientsJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 765, 92));

        viewVitalsBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewVitalsBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewVitalsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewVitalsBtn.setText("View Vital Signs");
        viewVitalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalsBtnActionPerformed(evt);
            }
        });
        add(viewVitalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Patient Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Date of Birth");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date of Marriage");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Expected Months");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Emergency Contact Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Emergency Contact Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("City");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 91, -1));

        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 107, -1));

        dobTextField.setEnabled(false);
        add(dobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 107, -1));

        domTextField.setEnabled(false);
        add(domTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 107, -1));

        numMonthsTextField.setEnabled(false);
        add(numMonthsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 107, -1));

        contactNameTextField.setEnabled(false);
        add(contactNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 107, -1));

        contactNumTextField.setEnabled(false);
        add(contactNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 107, -1));

        cityTextField.setEnabled(false);
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 107, 20));

        BloodPressureTextField.setEnabled(false);
        BloodPressureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodPressureTextFieldActionPerformed(evt);
            }
        });
        add(BloodPressureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 113, -1));

        HaemoglobinTextField.setEnabled(false);
        add(HaemoglobinTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 113, -1));

        tempTextField.setEnabled(false);
        add(tempTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 113, -1));

        respTextField.setEnabled(false);
        add(respTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 113, -1));

        pulseTextField.setEnabled(false);
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 113, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Blood Pressure");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Haemoglobin Level");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Temperature");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Pulse Rate");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Respiration Rate");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 100, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Critical Patients View Screen");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 370, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("**** Vital Signs highlighted in red are priority concern ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewVitalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalsBtnActionPerformed
        int copyselectedRow=0;
        int selectedRow = criticalPatientsJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table");
        }else{
            DoctorWorkRequest v = (DoctorWorkRequest) criticalPatientsJTable.getValueAt(selectedRow, 0);
            if(copyselectedRow!=selectedRow){
                BloodPressureTextField.setBorder(new LineBorder(Color.LIGHT_GRAY));
                 HaemoglobinTextField.setBorder(new LineBorder(Color.LIGHT_GRAY));
                  tempTextField.setBorder(new LineBorder(Color.LIGHT_GRAY));
                  pulseTextField.setBorder(new LineBorder(Color.LIGHT_GRAY));
                  respTextField.setBorder(new LineBorder(Color.LIGHT_GRAY));
                
            }
            copyselectedRow = selectedRow;
            // v.setPatientName(nameTextField.getText());
            nameTextField.setText(v.getPatientName());
            dobTextField.setText(v.getDateOfBirth());
            domTextField.setText(v.getDateOfMarriage());
            contactNameTextField.setText(v.getEmergencyContactName());
            contactNumTextField.setText(String.valueOf(v.getEmergencyContactNumber()));
            numMonthsTextField.setText(String.valueOf(v.getPregnancyPeriod()));
            cityTextField.setText(v.getCity());
            BloodPressureTextField.setText(String.valueOf(v.getBloodPressure()));
            HaemoglobinTextField.setText(String.valueOf(v.getHaemoglobin()));
            tempTextField.setText(String.valueOf(v.getTemperature()));
            pulseTextField.setText(String.valueOf(v.getPulse()));
            respTextField.setText(String.valueOf(v.getRespiration()));
            if((v.getBloodPressure()) < 90 ||(v.getBloodPressure())>140){
            BloodPressureTextField.setBorder(new LineBorder(Color.red));
            
   
        }
              if((v.getHaemoglobin()) < 10 ||(v.getHaemoglobin())>14){
            HaemoglobinTextField.setBorder(new LineBorder(Color.red));
            
        }
           if((v.getTemperature()) < 95 ||(v.getTemperature())>102.2){
            tempTextField.setBorder(new LineBorder(Color.red));
            
        }
               if((v.getPulse()) < 70 ||(v.getPulse())>90){
            pulseTextField.setBorder(new LineBorder(Color.red));
            
        }
                if((v.getRespiration()) < 15 ||(v.getRespiration())>18){
            respTextField.setBorder(new LineBorder(Color.red));
            
        } 
         
           // v.setStatus("Inqueue");
             
            // v.setDateOfBirth(dobTextField.getText());
            //// v.setDateOfMarriage(domTextField.getText());
            // v.setEmergencyContactName(contactNameTextField.getText());
            // v.setPregnancyPeriod(Integer.parseInt(numMonthsTextField.getText()));
            //          v.setEmergencyContactNumber(Double.parseDouble(contactNumTextField.getText()));
            // v.setCity(cityTextField.getText());
            // v.setBloodPressure(Double.parseDouble(BloodPressureTextField.getText()));
            //  v.setHaemoglobin(Double.parseDouble(HaemoglobinTextField.getText()));
            //   v.setTemperature(Double.parseDouble(tempTextField.getText()));
            //   v.setPulse(Integer.parseInt(tempTextField.getText()));
            //  v.setRespiration(Integer.parseInt(respTextField.getText()));
        }
       
    }//GEN-LAST:event_viewVitalsBtnActionPerformed
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void BloodPressureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodPressureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodPressureTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodPressureTextField;
    private javax.swing.JTextField HaemoglobinTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField contactNameTextField;
    private javax.swing.JTextField contactNumTextField;
    private javax.swing.JTable criticalPatientsJTable;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField domTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numMonthsTextField;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField respTextField;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JButton viewVitalsBtn;
    // End of variables declaration//GEN-END:variables
}
