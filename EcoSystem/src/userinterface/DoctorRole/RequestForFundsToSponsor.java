/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MCHBEnterprise;
import Business.Network.Network;
import Business.Organization.CareTakerOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Sponsor.Sponsor;
import Business.Sponsor.SponsorDirectory;
import Business.UserAccount.UserAccount;
import Business.Employee.Employee;
import Business.Enterprise.FundingEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.SponsorOrganization;
import Business.WorkQueue.SponsorWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sagar
 */
public class RequestForFundsToSponsor extends javax.swing.JPanel {

    private JPanel userprocessContainer;
    private UserAccount userAccount;
    private DoctorOrganization doctorOrganization;
    Organization org;
    private Enterprise enterprise;
    private EcoSystem business;
    //private BankingDirectory bankingDirectory;
    public RequestForFundsToSponsor(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userprocessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.org = organization;
       // this.careTakerOrganization = new CareTakerOrganization();
        this.doctorOrganization = (DoctorOrganization) org;
       // System.out.println("caretaker org=" + this.careTakerOrganization);
        this.enterprise = enterprise;
        this.business = business;
        //this.bankingDirectory=bankingDirectory;
        popEntryFormTable();
    }
    /**
     * Creates new form RequestForFundsToBank
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bankNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RequiredFundsTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RequestTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EmergencyContactNameTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EmegerncyContactNumberTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        entryFormJTable = new javax.swing.JTable();
        createRecordBtn = new javax.swing.JButton();
        referToBankBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Funds Request Form Screen from Sponsors");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("       Sponsor Name");

        bankNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNameTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Required Funds");

        RequiredFundsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequiredFundsTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("    Request Type");

        RequestTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("                 Contact Name");

        CityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("                Contact Number");

        EmergencyContactNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyContactNameTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("                                City");

        EmegerncyContactNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmegerncyContactNumberTxtActionPerformed(evt);
            }
        });

        entryFormJTable.setBackground(new java.awt.Color(0, 0, 0));
        entryFormJTable.setForeground(new java.awt.Color(255, 255, 255));
        entryFormJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sponsor Name", "Required Funds", "Contact Person", "Contact Number", "City", "Request Type", "Status"
            }
        ));
        jScrollPane1.setViewportView(entryFormJTable);

        createRecordBtn.setBackground(new java.awt.Color(0, 0, 0));
        createRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        createRecordBtn.setText("Create");
        createRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRecordBtnActionPerformed(evt);
            }
        });

        referToBankBtn.setBackground(new java.awt.Color(0, 0, 0));
        referToBankBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        referToBankBtn.setForeground(new java.awt.Color(255, 255, 255));
        referToBankBtn.setText("Refer To Sponsor");
        referToBankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referToBankBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bankNameTxt)
                                .addComponent(RequiredFundsTxt)
                                .addComponent(RequestTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CityTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(EmergencyContactNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EmegerncyContactNumberTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(295, 295, 295)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(referToBankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmergencyContactNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RequiredFundsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RequestTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmegerncyContactNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(createRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(referToBankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNameTxtActionPerformed

    private void RequiredFundsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequiredFundsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RequiredFundsTxtActionPerformed

    private void EmergencyContactNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyContactNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmergencyContactNameTxtActionPerformed

    private void createRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRecordBtnActionPerformed
        // TODO add your handling code here:
        int reqFunds = 0 ;
        int emergencyContactNumber=0;
        String sponsorName = bankNameTxt.getText();
        try{
            reqFunds = Integer.parseInt(RequiredFundsTxt.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter the required funds in numbers only");
        }       
        String reqType = RequestTxt.getText();
        String emergencyContactName = EmergencyContactNameTxt.getText();
        try{
            emergencyContactNumber = Integer.parseInt(EmegerncyContactNumberTxt.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter the emergency contact number in numbers only");
        }
        String city = CityTxt.getText();      
        SponsorWorkRequest sponsorWorkRequest = new SponsorWorkRequest();
        sponsorWorkRequest.setSponsorName(sponsorName);
        sponsorWorkRequest.setReqFunds(reqFunds);
        sponsorWorkRequest.setRequestType(reqType);
        sponsorWorkRequest.setEmergencyContactName(emergencyContactName);
        sponsorWorkRequest.setEmergencyContactNumber(emergencyContactNumber);
        sponsorWorkRequest.setCity(city);
        sponsorWorkRequest.setStatus("InQueue");
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DoctorOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }

            }
        }
        if (org != null) {
            //System.out.println("userinterface.Farmer.FarmerComplaintRegistrationJPanel.requestTestJButtonActionPerformed()");
            org.getWorkQueue().getWorkRequestList().add(sponsorWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(sponsorWorkRequest);

            JOptionPane.showMessageDialog(null, "You have successfully added Funds Request Record !", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        popEntryFormTable();
        bankNameTxt.setText("");
        RequiredFundsTxt.setText("");
        RequestTxt.setText("");
        CityTxt.setText("");
        EmergencyContactNameTxt.setText("");
        EmegerncyContactNumberTxt.setText("");    
    }//GEN-LAST:event_createRecordBtnActionPerformed

    private void referToBankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referToBankBtnActionPerformed
        int selectedRow = entryFormJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table");
        }else{ 
            
            SponsorWorkRequest sponsorWorkRequest = (SponsorWorkRequest)entryFormJTable.getValueAt(selectedRow, 0);
            if (sponsorWorkRequest.getStatus().equals("InQueue")){
                sponsorWorkRequest.setSender(userAccount);
                sponsorWorkRequest.setStatus("Sent");
                Organization org = null;
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof FundingEnterprise) {                       
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                                    if (organization instanceof SponsorOrganization) {
                                        org = organization;
                                        break;
                                    }

                                }
                        }

                    }
                }
                if (org != null) {
                    //System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    //  if (org.getEmployeeDirectory().getEmployeeList()
                        org.getWorkQueue().getWorkRequestList().add(sponsorWorkRequest);
                        userAccount.getWorkQueue().getWorkRequestList().add(sponsorWorkRequest);

                        JOptionPane.showMessageDialog(null, "You have successfully submitted your funds request !", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    popEntryFormTable();

                }else{
                    JOptionPane.showMessageDialog(null, "This request is already processed");
            }
        }        
    }//GEN-LAST:event_referToBankBtnActionPerformed

    private void RequestTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RequestTxtActionPerformed

    private void CityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTxtActionPerformed

    private void EmegerncyContactNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmegerncyContactNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmegerncyContactNumberTxtActionPerformed
    public void popEntryFormTable() {
        DefaultTableModel model = (DefaultTableModel) entryFormJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()) {
            if(request instanceof SponsorWorkRequest){
            Object[] row = new Object[7];
            SponsorWorkRequest sponsorWorkRequest = (SponsorWorkRequest) request;
            row[0] = sponsorWorkRequest;
            row[1] = sponsorWorkRequest.getReqFunds();
            row[2] = sponsorWorkRequest.getEmergencyContactName();
            row[3] = sponsorWorkRequest.getEmergencyContactNumber();
            row[4] = sponsorWorkRequest.getCity();
            row[5] = sponsorWorkRequest.getRequestType();
            row[6] = sponsorWorkRequest.getStatus();
            model.addRow(row);
            } 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityTxt;
    private javax.swing.JTextField EmegerncyContactNumberTxt;
    private javax.swing.JTextField EmergencyContactNameTxt;
    private javax.swing.JTextField RequestTxt;
    private javax.swing.JTextField RequiredFundsTxt;
    private javax.swing.JTextField bankNameTxt;
    private javax.swing.JButton createRecordBtn;
    private javax.swing.JTable entryFormJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton referToBankBtn;
    // End of variables declaration//GEN-END:variables
}
