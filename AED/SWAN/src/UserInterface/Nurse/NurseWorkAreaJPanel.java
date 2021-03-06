/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Nurse;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.UserAccountManagement.TimesheetJPanel;
import UserInterface.UserAccountManagement.ViewUpdatePersonDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    NurseOrganization organization;
    Enterprise enterprise;
    EcoSystem system;
    public NurseWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, NurseOrganization organization, Enterprise enterprise, EcoSystem business,int wfh) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = business;
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
        btnTmeSheet = new javax.swing.JButton();
        btnServeMyRequest = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnServePatient1 = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nurse WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, 40));

        btnTmeSheet.setBackground(new java.awt.Color(255, 153, 153));
        btnTmeSheet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTmeSheet.setForeground(new java.awt.Color(255, 255, 255));
        btnTmeSheet.setText("<html><Center><h3>Timesheet</h3><Center><html>");
        btnTmeSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmeSheetActionPerformed(evt);
            }
        });
        add(btnTmeSheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, 109));

        btnServeMyRequest.setBackground(new java.awt.Color(255, 102, 0));
        btnServeMyRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnServeMyRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnServeMyRequest.setText("<html><Center><h3>Serve</h3><h3>My Request</h3><Center><html>");
        btnServeMyRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeMyRequestActionPerformed(evt);
            }
        });
        add(btnServeMyRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 137, 110));

        btnProfile.setBackground(new java.awt.Color(0, 51, 204));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("<html><Center><h3>Update</h3><h3>Profile</h3><Center><html>");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 280, 110));

        btnServePatient1.setBackground(new java.awt.Color(0, 204, 51));
        btnServePatient1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnServePatient1.setForeground(new java.awt.Color(255, 255, 255));
        btnServePatient1.setText("<html><Center><h3>Serve</h3><h3>Patient</h3><Center><html>");
        btnServePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServePatient1ActionPerformed(evt);
            }
        });
        add(btnServePatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, 110));

        btnBookAppointment.setBackground(new java.awt.Color(204, 51, 255));
        btnBookAppointment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setText("<html><Center><h3>Book</h3><h3>Appointment</h3><Center><html>");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 89, 137, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTmeSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmeSheetActionPerformed
        // TODO add your handling code here:
        TimesheetJPanel timesheetNurseJPanel = new TimesheetJPanel(userProcessContainer,userAccount,0);
        userProcessContainer.add("TimesheetNurseJPanel",timesheetNurseJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);

    }//GEN-LAST:event_btnTmeSheetActionPerformed

    private void btnServeMyRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeMyRequestActionPerformed
        // TODO add your handling code here:
            ServeMyWorkRequestJPanel nurseServeMyRequest = new ServeMyWorkRequestJPanel(userProcessContainer,userAccount,organization,enterprise.getOrganizationDirectory());
        userProcessContainer.add("ServeMyWorkRequestJPanel",nurseServeMyRequest);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    
    }//GEN-LAST:event_btnServeMyRequestActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        ViewUpdatePersonDetailsJPanel viewUpdateNurse = new ViewUpdatePersonDetailsJPanel(userProcessContainer,userAccount.getEmployee(),userAccount ,"employee","edit",0);
        userProcessContainer.add("ViewUpdatePersonDetailsJPanel",viewUpdateNurse);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnServePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServePatient1ActionPerformed
        // TODO add your handling code here:
         ServePatientJPanel servePatientJPanel = new ServePatientJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ServePatientJPanel",servePatientJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnServePatient1ActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
          NurseWorkRequestJPanel nurseWorkRequest = new NurseWorkRequestJPanel(userProcessContainer,userAccount,organization,enterprise.getOrganizationDirectory());
        userProcessContainer.add("NurseWorkRequestJPanel",nurseWorkRequest);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnBookAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnServeMyRequest;
    private javax.swing.JButton btnServePatient1;
    private javax.swing.JButton btnTmeSheet;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
