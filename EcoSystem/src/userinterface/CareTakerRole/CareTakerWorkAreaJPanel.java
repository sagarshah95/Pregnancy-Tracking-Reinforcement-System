/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CareTakerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.CareTakerOrganization;
import Business.Organization.Organization;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
//import Business.
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author my pc
 */
public class CareTakerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CareTakerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise  enterprise;
    private CareTakerOrganization careTakerOrganization;
    private PatientDirectory patientDirectory;
    public CareTakerWorkAreaJPanel(JPanel userProcessContainer, UserAccount Account,Enterprise enterprise, Organization organization,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=Account;
        this.business=business;
        this.enterprise=enterprise;
        this.careTakerOrganization=(CareTakerOrganization)organization;
        this.patientDirectory= new PatientDirectory();
         for(Employee e : organization.getEmployeeDirectory().getEmployeeList())
             if(e.getName().equals(userAccount.getUsername())){
        valueLabel.setText(e.getName());
             }
         //this.setSize(1680, 1050);
        
        
      //  valueLabel.setText(organization.getEmployeeDirectory().getEmployeeList().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        createInfoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        countBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        createInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        createInfoBtn.setText("Add Information");
        createInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInfoBtnActionPerformed(evt);
            }
        });
        add(createInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CareTaker Work Area Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 350, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CareTaker:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, -1));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setText(" <value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 99, 20));

        countBtn.setBackground(new java.awt.Color(0, 0, 0));
        countBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        countBtn.setForeground(new java.awt.Color(255, 255, 255));
        countBtn.setText("Status");
        countBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtnActionPerformed(evt);
            }
        });
        add(countBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 31));
    }// </editor-fold>//GEN-END:initComponents

    private void createInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInfoBtnActionPerformed
        //System.out.println("caretaker1="+careTakerOrganization);
        CreateInformationScreenJPanel createInfoJPanel = new CreateInformationScreenJPanel(userProcessContainer, userAccount, careTakerOrganization, enterprise, business,patientDirectory);
        userProcessContainer.add("CreateInformationScreenJPanel",createInfoJPanel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createInfoBtnActionPerformed

    private void countBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtnActionPerformed
        ManageInformationJpanel manageinfoJPanel = new ManageInformationJpanel(userProcessContainer, userAccount, careTakerOrganization, enterprise, business,patientDirectory);
        userProcessContainer.add("ManageInformationJpanel",manageinfoJPanel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_countBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton countBtn;
    private javax.swing.JButton createInfoBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}