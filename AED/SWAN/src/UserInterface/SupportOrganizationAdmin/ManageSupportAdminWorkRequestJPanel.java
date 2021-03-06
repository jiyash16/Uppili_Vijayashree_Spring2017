/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupportOrganizationAdmin;

import UserInterface.OrganizationAdmin.*;
import UserInterface.EnterpriseAdmin.*;
import UserInterface.SystemAdmin.*;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.SOCOrganization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.WorkFromHomeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ManageSupportAdminWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    public ManageSupportAdminWorkRequestJPanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
      //  System.out.println("Organization name" + organization.getName());
       populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblAdminWorkrequest.getModel();
        
        model.setRowCount(0);
       //  System.out.println("organization wr" + organization.getWorkQueue().getWorkRequestList().size());
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
          
            Object[] row = new Object[7];
            row[1] = request.getTicketNumber();
            row[2] = ((WorkFromHomeWorkRequest)request).getRequest();
            
            row[3] = request.getSender().getEmployee();
           row[4] = ((WorkFromHomeWorkRequest)request).getAdminReceiver() == null?null:((WorkFromHomeWorkRequest)request).getAdminReceiver().getEmployee();
            row[5] = request;
            row[6] = request.getStatus();
            
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
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage WorkRequest");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 40));

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
                "Action", "Ticket Number", "Request", "Sender", "Receiver", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAdminWorkrequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 730, 260));

        btnReject.setBackground(new java.awt.Color(255, 102, 102));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 130, -1));

        btnApprove.setBackground(new java.awt.Color(255, 102, 102));
        btnApprove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 150, -1));

        btnview.setBackground(new java.awt.Color(255, 102, 102));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View Request Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) tblAdminWorkrequest.getModel();
        int rowcount = dtm.getRowCount();
        try
        {
        
        for(int i = 0; i <= rowcount ; i++)
        {
          //     System.out.println("row"+i +" selected value" + tblAdminWorkrequest.getValueAt(i, 0));
            WorkFromHomeWorkRequest wr =(WorkFromHomeWorkRequest) tblAdminWorkrequest.getValueAt(i, 5);
             //Component c = tblAdminWorkrequest.findComponentAt(i, 1);
             String status = (String)tblAdminWorkrequest.getValueAt(i, 6);
             Object chkbox = tblAdminWorkrequest.getValueAt(i, 0);
             
            if(chkbox != null && chkbox.equals(true) && status.equalsIgnoreCase("Pending"))
            {
           
              //  c.setEnabled(true);
                 wr.setStatus("Rejected Admin");
                 wr.setAdminApprovalStatus("Rejected");
            }
         
        }
        }
        catch(Exception e)
        {
            
        }
       // JOptionPane.showMessageDialog(null,"WorkRequest Rejected");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblAdminWorkrequest.getSelectedRow();
        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        WorkFromHomeWorkRequest request = (WorkFromHomeWorkRequest) tblAdminWorkrequest.getValueAt(selectedrow, 5);
          ViewWorkFromHomeRequestDetailsJPanel viewWFHRequestDetails = new ViewWorkFromHomeRequestDetailsJPanel(userProcessContainer, request);
        userProcessContainer.add("ViewWorkFromHomeRequestDetailsJPanel", viewWFHRequestDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) tblAdminWorkrequest.getModel();
        int rowcount = dtm.getRowCount();
      //  System.out.println("rowcount"+rowcount);
        try
        {
        
        for(int i = 0; i < rowcount ; i++)
        {
            //System.out.println("row"+i +" selected value" + tblAdminWorkrequest.getValueAt(i, 0));
            WorkFromHomeWorkRequest wr =(WorkFromHomeWorkRequest) tblAdminWorkrequest.getValueAt(i, 5);
             //Component c = tblAdminWorkrequest.findComponentAt(i, 1);
             String status = (String)tblAdminWorkrequest.getValueAt(i, 6);
             Object chkbox = tblAdminWorkrequest.getValueAt(i, 0);
             
            if(chkbox != null && chkbox.equals(true) && status.equalsIgnoreCase("Pending"))
            {
                 wr.setAdminApprovalStatus("Approved");
                 wr.setStatus("Approved Admin");
                 wr.setAdminReceiver(userAccount);
                  Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof SOCOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(wr);
               userAccount.getWorkQueue().getWorkRequestList().add(wr);
              //  System.out.println("Doctor organization"+org.getWorkQueue().getWorkRequestList().size());
                populateTable();
            }
            }
            else
            {
                
            }
         
        }
        }
        catch(Exception exp)
         {
                
         }
        
       // JOptionPane.showMessageDialog(null,"WorkRequest Approved");
        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdminWorkrequest;
    // End of variables declaration//GEN-END:variables
}
