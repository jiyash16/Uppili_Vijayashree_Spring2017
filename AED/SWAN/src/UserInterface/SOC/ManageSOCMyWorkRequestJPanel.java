/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SOC;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.Validate;
import Business.WorkQueue.WorkFromHomeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ManageSOCMyWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;
    public ManageSOCMyWorkRequestJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
      
       
       populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblAdminWorkrequest.getModel();
        
        model.setRowCount(0);
         
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
          
            Object[] row = new Object[5];
            row[0] = request.getTicketNumber();
            row[1] = ((WorkFromHomeWorkRequest)request).getRequest();
            
            row[2] = request.getSender().getEmployee();
           
            row[3] = request;
            row[4] = request.getStatus();
           
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdminWorkrequest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnViewLogs = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage WorkRequest");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 170, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        tblAdminWorkrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket Number", "Request", "Sender", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAdminWorkrequest);
        if (tblAdminWorkrequest.getColumnModel().getColumnCount() > 0) {
            tblAdminWorkrequest.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblAdminWorkrequest.getColumnModel().getColumn(3).setPreferredWidth(75);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 880, 270));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Ticket");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 150, -1));

        btnSearch.setBackground(new java.awt.Color(255, 102, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, 30));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 140, 30));

        btnViewLogs.setBackground(new java.awt.Color(255, 102, 102));
        btnViewLogs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnViewLogs.setForeground(new java.awt.Color(255, 255, 255));
        btnViewLogs.setText("View Logs");
        btnViewLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLogsActionPerformed(evt);
            }
        });
        add(btnViewLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        btnview.setBackground(new java.awt.Color(255, 102, 102));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View Request Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchText = txtSearch.getText().trim();
        boolean boolsearch = Validate.isNumeric(searchText);
        if(!searchText.isEmpty())
        {
            if(boolsearch)
            {
                txtSearch.setBackground(Color.WHITE);
                DefaultTableModel model = (DefaultTableModel)tblAdminWorkrequest.getModel();
        
                 model.setRowCount(0);
                for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
                {
                    if(request.getTicketNumber()== Integer.parseInt(searchText))
                    {
                        Object[] row = new Object[5];
                        row[0] = request.getTicketNumber();
                        row[1] = ((WorkFromHomeWorkRequest)request).getRequest();

                        row[2] = request.getSender().getEmployee();

                        row[3] = request;
                        row[4] = request.getStatus();

                        model.addRow(row);
                    }
                }
                txtSearch.setText("");
            }
            else
            {
                if(!boolsearch)
                {
                    txtSearch.setBackground(Color.red);
                }
                else
                    txtSearch.setBackground(Color.WHITE);
            }
            
        }
        else
        {
            populateTable();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLogsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdminWorkrequest.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row");
            return;
        }
        WorkFromHomeWorkRequest request = (WorkFromHomeWorkRequest) tblAdminWorkrequest.getValueAt(selectedRow, 3);
        
          ViewLogsJPanel viewLogsJPanel = new ViewLogsJPanel(userProcessContainer,request,system);
        userProcessContainer.add("ViewLogsJPanel",viewLogsJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnViewLogsActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblAdminWorkrequest.getSelectedRow();
        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        WorkFromHomeWorkRequest request = (WorkFromHomeWorkRequest) tblAdminWorkrequest.getValueAt(selectedrow, 3);
        ViewSOCWorkFromHomeRequestDetailsJPanel viewSOCWorkFromHomeRequestDetailsJPanel = new ViewSOCWorkFromHomeRequestDetailsJPanel(userProcessContainer, request,system);
        userProcessContainer.add("ViewSOCWorkFromHomeRequestDetailsJPanel", viewSOCWorkFromHomeRequestDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewLogs;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdminWorkrequest;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
