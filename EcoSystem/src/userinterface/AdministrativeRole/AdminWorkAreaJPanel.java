

package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    private UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount= userAccount;
        valueLabel.setText(enterprise.getName());
        if(enterprise.getEnterpriseType().getValue().equals("MCHB")){
            carePerfBtn.setVisible(true);
            LabAssisBtn.setVisible(true);
            
        }else{
            carePerfBtn.setVisible(false);
            LabAssisBtn.setVisible(false);
            
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        carePerfBtn = new javax.swing.JButton();
        LabAssisBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        userJButton.setBackground(new java.awt.Color(0, 0, 0));
        userJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 250, -1));

        manageEmployeeJButton.setBackground(new java.awt.Color(0, 0, 0));
        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 250, -1));

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 0, 0));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 250, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        carePerfBtn.setBackground(new java.awt.Color(0, 0, 0));
        carePerfBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carePerfBtn.setForeground(new java.awt.Color(255, 255, 255));
        carePerfBtn.setText("CareTaker Performance Tracking");
        carePerfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carePerfBtnActionPerformed(evt);
            }
        });
        add(carePerfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 250, 30));

        LabAssisBtn.setBackground(new java.awt.Color(0, 0, 0));
        LabAssisBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabAssisBtn.setForeground(new java.awt.Color(255, 255, 255));
        LabAssisBtn.setText("Lab Assitant Performance Tracking");
        LabAssisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabAssisBtnActionPerformed(evt);
            }
        });
        add(LabAssisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,userAccount);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,userAccount);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void carePerfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carePerfBtnActionPerformed
        
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(6, "Count of Patient", "CTA");
        dcd.setValue(5, "Count of Patient", "CTB");
        dcd.setValue(4, "Count of Patient", "CTC");
        dcd.setValue(3, "Count of Patient", "CTD");
         JFreeChart jchart = ChartFactory.createBarChart("CareTaker Performance", "CareTaker Name", "Count of Patient", dcd, PlotOrientation.VERTICAL, false, true, false);
          CategoryPlot p = jchart.getCategoryPlot();
           p.setRangeGridlinePaint(Color.black);
           ChartFrame frame = new ChartFrame("Bar Chart for CareTaker 2018 Performance",jchart);
           frame.setVisible(true);
           frame.setSize(450, 350);
        
    }//GEN-LAST:event_carePerfBtnActionPerformed

    private void LabAssisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabAssisBtnActionPerformed
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("labA",new Integer(4));
        dataset.setValue("labB", new Integer(2));
        dataset.setValue("labC",new Integer(3));
        
        JFreeChart chart = ChartFactory.createPieChart("Lab Assistant Performance",dataset,true,true,true);
        PiePlot p = (PiePlot)chart.getPlot();
       // p.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame = new ChartFrame("Pie Chart for LabAssistant 2018 Performance",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_LabAssisBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LabAssisBtn;
    private javax.swing.JButton carePerfBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}