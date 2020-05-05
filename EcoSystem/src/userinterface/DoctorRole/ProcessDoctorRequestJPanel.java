/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.WorkQueue.DoctorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vasundhara
 */
public class ProcessDoctorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessDoctorRequestJPanel
     */
    JPanel userProcessContainer;
    DoctorWorkRequest request;
    public ProcessDoctorRequestJPanel(JPanel userProcessContainer, DoctorWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Response :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 74, 100, -1));

        resultJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 71, 88, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 121, 100, -1));

        submitJButton.setBackground(new java.awt.Color(0, 0, 0));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 121, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setResponse(resultJTextField.getText());
        request.setStatus("Completed");
        resultJTextField.setText("");
        JOptionPane.showMessageDialog(null, "Response Submitted");
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
