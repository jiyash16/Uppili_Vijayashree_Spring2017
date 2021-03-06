/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Organization.DoctorOrganization;
import UserInterface.Nurse.*;
import Business.Organization.NurseOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.Validate;

import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Receptionist.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class DoctorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointmentReceptionistJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    DoctorOrganization organization;
    
    public DoctorWorkRequestJPanel(JPanel userProcessContainer, UserAccount userAccount,DoctorOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        populateTable();
       
    }
 public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblDoctorWorkRequest.getModel();
        
        model.setRowCount(0);
       // System.out.println("list doctor size"+organization.getWorkQueue().getWorkRequestList().size() );
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if(request.getStatus().equalsIgnoreCase("Cancelled"))
            {
            }
            else
            {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = ((HospitalWorkRequest) request).getNurseSender() == null ? null :((HospitalWorkRequest) request).getNurseSender().getEmployee();
            row[2] = ((HospitalWorkRequest) request).getDocreceiver() == null ? null : ((HospitalWorkRequest) request).getDocreceiver().getEmployee();
            row[3] = ((HospitalWorkRequest) request).getDiagonosis();
            row[4] = ((HospitalWorkRequest) request).getPatient();
            row[5] = request.getStatus();
            
            
            model.addRow(row);
            }
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

        btnBack = new javax.swing.JButton();
        lblswan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorWorkRequest = new javax.swing.JTable();
        btnAssignToMe1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Appointments");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 230, 50));

        tblDoctorWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Diagonosis", "Patient", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctorWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 920, 340));

        btnAssignToMe1.setBackground(new java.awt.Color(255, 102, 102));
        btnAssignToMe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAssignToMe1.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToMe1.setText("Assign To Me");
        btnAssignToMe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMe1ActionPerformed(evt);
            }
        });
        add(btnAssignToMe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignToMe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMe1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDoctorWorkRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select any row","Info",1);
            return;
        }
        
        HospitalWorkRequest request = (HospitalWorkRequest)tblDoctorWorkRequest.getValueAt(selectedRow, 0);
        if(request.getDocreceiver()== null)
        {
            request.setDocreceiver(userAccount);
            request.setStatus("Pending Doctor");
            //System.out.println("useraccoutb"+userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"WorkRequest already assigned","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignToMe1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe1;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTable tblDoctorWorkRequest;
    // End of variables declaration//GEN-END:variables
}
