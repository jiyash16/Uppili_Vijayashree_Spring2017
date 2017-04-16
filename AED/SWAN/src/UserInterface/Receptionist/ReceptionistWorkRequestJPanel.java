/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receptionist;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ReceptionistWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointmentReceptionistJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    public ReceptionistWorkRequestJPanel(JPanel userProcessContainer,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblReceptionist.getModel();
        System.out.println("request"+userAccount.getWorkQueue().getWorkRequestList().size());
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
           
            Object[] row = new Object[6];
            row[0] = request.getMessage();
            row[1] = ((HospitalWorkRequest) request).getNursereceiver() == null? null :((HospitalWorkRequest) request).getNursereceiver().getEmployee();
            row[2] = ((HospitalWorkRequest) request).getDocreceiver() == null? null :((HospitalWorkRequest) request).getDocreceiver().getEmployee();
            row[3] = request.getStatus()== null ? "Pending" :request.getStatus();
           
            row[4] = ((HospitalWorkRequest) request).getRoomNumber();
            row[5] = ((HospitalWorkRequest) request).getPatient();
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

        btnBack = new javax.swing.JButton();
        lblswan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceptionist = new javax.swing.JTable();

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

        tblReceptionist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Nurse", "Doctor", "Status", "Room Number", "Patient"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReceptionist);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 980, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTable tblReceptionist;
    // End of variables declaration//GEN-END:variables
}