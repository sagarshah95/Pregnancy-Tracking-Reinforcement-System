/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankingRole;
import Business.Bank.BankingDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BankingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BankingWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sagar
 */
public class BankingWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private BankingOrganization bankingOrganization;
    private BankingDirectory bankDirectory;
    /**
     * Creates new form BankingWoekAreaJPanel
     */
    public BankingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise=enterprise;
        this.bankingOrganization = (BankingOrganization)organization;
        this.bankDirectory=bankDirectory;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel)FundsRequestJTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : bankingOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
            //row[0] = request;
            row[0] = request;
            //row[0] = ((BankingWorkRequest) request).getBankName();
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = ((BankingWorkRequest) request).getEmergencyContactNumber();
            row[4] = ((BankingWorkRequest) request).getCity();
            row[5] = ((BankingWorkRequest) request).getReqFunds();
            row[6] = ((BankingWorkRequest) request).getRequestType();           
            row[7] = request.getStatus();           
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        assignjButton2 = new javax.swing.JButton();
        processjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FundsRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1formMouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, 502));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 63, 140, 50));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 158, 40));

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 70, 180, 44));

        assignjButton2.setBackground(new java.awt.Color(0, 0, 0));
        assignjButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignjButton2.setForeground(new java.awt.Color(255, 255, 255));
        assignjButton2.setText("Assign to me");
        assignjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButton2ActionPerformed(evt);
            }
        });
        add(assignjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 180, 43));

        processjButton.setBackground(new java.awt.Color(0, 0, 0));
        processjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processjButton.setForeground(new java.awt.Color(255, 255, 255));
        processjButton.setText("Process");
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });
        add(processjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 179, 43));

        FundsRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        FundsRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        FundsRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name", "Sender", "Receiver", "Contact Number", "City", "Required funds", "Request type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FundsRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 172, 770, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bank Work Area Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1formMouseMoved

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
         populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = FundsRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row");
        }

        BankingWorkRequest request = (BankingWorkRequest)FundsRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Pending")){
        request.setStatus("Processing");

        BankingWorkRequestJPanel bankingWorkRequestJPanel = new BankingWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("BankingWorkRequestJPanel", bankingWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Select request available for processing");
        }
    }//GEN-LAST:event_processjButtonActionPerformed

    private void assignjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = FundsRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        BankingWorkRequest request = (BankingWorkRequest)FundsRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Sent")){
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Select another request");
        }
    }//GEN-LAST:event_assignjButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FundsRequestJTable;
    private javax.swing.JButton assignjButton2;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processjButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}