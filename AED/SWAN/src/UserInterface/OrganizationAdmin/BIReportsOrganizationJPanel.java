/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationAdmin;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UserInterface.OrganizationAdmin.Reports.AppointmentTicketsStatusJPanel;
import UserInterface.OrganizationAdmin.Reports.EmployeesNotFilledTimesheetJPanel;
import UserInterface.OrganizationAdmin.Reports.HardWorkingEmployeesJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class BIReportsOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BIReportsJPanel
     */
       JPanel userProcessContainer;

    Enterprise enterprise;
        Organization organization;
    public BIReportsOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise,Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
   this.organization = organization;
        this.enterprise = enterprise;
   
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
        btnBack = new javax.swing.JButton();
        btnEmployeeCount1 = new javax.swing.JButton();
        btnEmployeeTimesheet = new javax.swing.JButton();
        btnticket = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BI Reports");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        btnEmployeeCount1.setBackground(new java.awt.Color(204, 0, 204));
        btnEmployeeCount1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEmployeeCount1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployeeCount1.setText("<html><Center><h3>Employee</h3><h3>Efficiency</h3><Center><html>");
        btnEmployeeCount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCount1ActionPerformed(evt);
            }
        });
        add(btnEmployeeCount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 130, 100));

        btnEmployeeTimesheet.setBackground(new java.awt.Color(0, 153, 0));
        btnEmployeeTimesheet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEmployeeTimesheet.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployeeTimesheet.setText("<html><Center><h3>Employees</h3><h3>Not Filled Timesheet</h3><Center><html>");
        btnEmployeeTimesheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeTimesheetActionPerformed(evt);
            }
        });
        add(btnEmployeeTimesheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, 100));

        btnticket.setBackground(new java.awt.Color(255, 102, 102));
        btnticket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnticket.setForeground(new java.awt.Color(255, 255, 255));
        btnticket.setText("<html><Center><h3>Appointments</h3><h3>Status</h3><Center><html>");
        btnticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnticketActionPerformed(evt);
            }
        });
        add(btnticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEmployeeCount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCount1ActionPerformed
        // TODO add your handling code here:
                HardWorkingEmployeesJPanel hardWorkingEmployeesJPanel = new HardWorkingEmployeesJPanel(userProcessContainer,enterprise,organization);
        userProcessContainer.add("HardWorkingEmployeesJPanel",hardWorkingEmployeesJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnEmployeeCount1ActionPerformed

    private void btnEmployeeTimesheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeTimesheetActionPerformed
        // TODO add your handling code here:
         EmployeesNotFilledTimesheetJPanel employeesNotFilledTimesheetJPanel = new EmployeesNotFilledTimesheetJPanel(userProcessContainer,enterprise,organization);
        userProcessContainer.add("EmployeesNotFilledTimesheetJPanel",employeesNotFilledTimesheetJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnEmployeeTimesheetActionPerformed

    private void btnticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnticketActionPerformed
        // TODO add your handling code here:
        AppointmentTicketsStatusJPanel appointmentTicketsStatusJPanel = new AppointmentTicketsStatusJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("AppointmentTicketsStatusJPanel",appointmentTicketsStatusJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnticketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEmployeeCount1;
    private javax.swing.JButton btnEmployeeTimesheet;
    private javax.swing.JButton btnticket;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
