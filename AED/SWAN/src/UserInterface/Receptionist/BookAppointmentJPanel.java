/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receptionist;

import Business.Appointments.Appointment;
import Business.Appointments.AppointmentDirectory;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.Validate;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class BookAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointmentJPanel
     */
   JPanel userProcessContainer;
   OrganizationDirectory organizationDirectory;
   UserAccount userAccount ;
   SimpleDateFormat sdf;
   Patient Viewpatient;
   ReceptionistOrganization organization;
    public BookAppointmentJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, UserAccount userAccount,ReceptionistOrganization organization ) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.organization = organization;
        sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        populateTable();
        
        AddAppointmentJPanel.setVisible(false);
        
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
       
        model.setRowCount(0);
        for(Organization o : organizationDirectory.getOrganizationList())
        {
            if(o instanceof PatientOrganization)
            { 
                
                for (Patient p: o.getPatientDirectory().getpatientList()){
                    
                Object[] row = new Object[3];
                row[0] = p.getPatientId();
                 row[1] = p;
                 row[2] = p.getPhone();
                 model.addRow(row);
            }
        }
        }
    }
    public void populateAppointment(Patient patient)
    {
        boolean flag = false;
          DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
      
        model.setRowCount(0);
       
        //System.out.println("size of workRequest"+ organization.getWorkQueue().getWorkRequestList().size());
         for (WorkRequest ap : organization.getWorkQueue().getWorkRequestList()){
          //      System.out.println("patient id"+((HospitalWorkRequest) ap).getPatient().getPatientId());
            //    System.out.println("input patient id"+patient.getPatientId());
             if(((HospitalWorkRequest) ap).getPatient() == patient)
             {
             ///    System.out.println("patients found match");
                Object[] row = new Object[4];
                row[0] = ap;
               flag = true;
                 row[1] = sdf.format(ap.getRequestDate());
                 row[2] = ((HospitalWorkRequest) ap).getRepsender().getEmployee();
                row[3] = ap.getStatus();
                 model.addRow(row);
            }
             
        }
         if(!flag)
         {
             model.setRowCount(0);
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
        tblAppointment = new javax.swing.JTable();
        btnViewAppointments = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        AddAppointmentJPanel = new javax.swing.JPanel();
        lblAddOrganization2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblPolicyNumber = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();

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
        lblswan.setText("Book Appointment");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 230, 50));

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reason", "Created On", "Created By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAppointment);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 620, 130));

        btnViewAppointments.setBackground(new java.awt.Color(255, 102, 102));
        btnViewAppointments.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnViewAppointments.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAppointments.setText("View Appointments");
        btnViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentsActionPerformed(evt);
            }
        });
        add(btnViewAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        btnBookAppointment.setBackground(new java.awt.Color(255, 102, 102));
        btnBookAppointment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPatient);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 620, 130));

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel Appointment");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        AddAppointmentJPanel.setOpaque(false);
        AddAppointmentJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddOrganization2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddOrganization2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddOrganization2.setText("Appointment Details");
        AddAppointmentJPanel.add(lblAddOrganization2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, -1));

        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        AddAppointmentJPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        lblPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicyNumber.setText("<html>Appointment Reason <font color = red>*</font></html>");
        AddAppointmentJPanel.add(lblPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));
        AddAppointmentJPanel.add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, 30));

        add(AddAppointmentJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 500, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        String appointmentReason = txtReason.getText().trim();
        boolean boolreason = Validate.isalphanumeric(appointmentReason);
        
        int selectedRow = tblPatient.getSelectedRow();
        Patient Viewpatient  = (Patient) tblPatient.getValueAt(selectedRow, 1);
        
        if(!appointmentReason.isEmpty())
        {
            if(boolreason)
            {
                Date date = new Date();
                txtReason.setBackground(Color.WHITE);

                HospitalWorkRequest nwr = new HospitalWorkRequest();
                nwr.setMessage(appointmentReason);
                nwr.setRepsender(userAccount);
                nwr.setRequestDate(date);
                nwr.setPatient(Viewpatient);
                nwr.setStatus("Booked");
                JOptionPane.showMessageDialog(null,"Appointment booked successfully");
               
                AddAppointmentJPanel.setVisible(false);
                
             Organization org = null;
            for (Organization organization : organizationDirectory.getOrganizationList()){
                if (organization instanceof NurseOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(nwr);
                organization.getWorkQueue().getWorkRequestList().add(nwr);
                
                userAccount.getWorkQueue().getWorkRequestList().add(nwr);
                 populateAppointment(Viewpatient);
            }
                }
            else
            {
                if(!boolreason)
                {
                    txtReason.setBackground(Color.red);
                }
                else
                    txtReason.setBackground(Color.WHITE);
                
                JOptionPane.showMessageDialog(null,"Invalid data","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Info",1);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatient.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        Patient Viewpatient = (Patient) tblPatient.getValueAt(selectedRow, 1);
        populateAppointment(Viewpatient);
    }//GEN-LAST:event_btnViewAppointmentsActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblPatient.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select patient","Information",1);
            return;
        }
        AddAppointmentJPanel.setVisible(true);
        txtReason.setText("");
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblAppointment.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
         int selectedRowpatient = tblPatient.getSelectedRow();
        if(selectedRowpatient < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any booked appointment","Information",1);
            return;
        }
        
        Patient Viewpatient  = (Patient) tblPatient.getValueAt(selectedRow, 1);
        
        WorkRequest ap = (WorkRequest) tblAppointment.getValueAt(selectedRow, 0);
        ap.setStatus("Cancelled");
        populateAppointment(Viewpatient);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddAppointmentJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewAppointments;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddOrganization2;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
