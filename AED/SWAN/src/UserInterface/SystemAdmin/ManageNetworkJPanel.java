/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.Validate;
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
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;
    SimpleDateFormat sdf;
    public ManageNetworkJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system = system;
       AddNetworkJPanel.setVisible(false);
       sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
       txtNetworkName.setBackground(Color.WHITE);
       populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblNetwork.getModel();
        dtm.setRowCount(0);
        for(Network nw: system.getNetworkList())
        {
            Object row[] = new Object[4];
            row[0]= nw.getNetworkId();
            row[1] = nw;
            row[2] = sdf.format(nw.getCreatedOn());
            if(nw.getModifiedOn() == null)
            {
                row[3] = "";
            }
            else
            {
                row[3] = sdf.format(nw.getModifiedOn());
            }
            dtm.addRow(row);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        AddNetworkJPanel = new javax.swing.JPanel();
        lblAddNetwork = new javax.swing.JLabel();
        lblNetworkName = new javax.swing.JLabel();
        txtNetworkName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdateSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 40));

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Created On", "Modified On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNetwork.setPreferredSize(new java.awt.Dimension(452, 402));
        jScrollPane1.setViewportView(tblNetwork);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 70, 620, 100));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Network");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 130, -1));

        btnAdd.setBackground(new java.awt.Color(255, 102, 102));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Network");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        btnview.setBackground(new java.awt.Color(255, 102, 102));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View Network Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        AddNetworkJPanel.setOpaque(false);
        AddNetworkJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddNetwork.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblAddNetwork.setText("Network Details");
        AddNetworkJPanel.add(lblAddNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, -1));

        lblNetworkName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNetworkName.setForeground(new java.awt.Color(255, 255, 255));
        lblNetworkName.setText("<html>Network Name <font color = red>*</font></html>");
        AddNetworkJPanel.add(lblNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        AddNetworkJPanel.add(txtNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 30));

        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        AddNetworkJPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        AddNetworkJPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, -1));

        btnUpdateSave.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdateSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateSave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSave.setText("Save");
        btnUpdateSave.setEnabled(false);
        btnUpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSaveActionPerformed(evt);
            }
        });
        AddNetworkJPanel.add(btnUpdateSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        add(AddNetworkJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 450, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        AddNetworkJPanel.setVisible(false);
         int selectedrow = tblNetwork.getSelectedRow();
        if(selectedrow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row to edit","Information",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Network nw = (Network) tblNetwork.getValueAt(selectedrow, 1);
        system.deleteNetwork(nw);
        JOptionPane.showMessageDialog(null,"Network deleted successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddNetworkJPanel.setVisible(true);
        txtNetworkName.setEnabled(true);
        txtNetworkName.setText("");
        btnSave.setVisible(true);
        btnSave.setEnabled(true);
        btnUpdate.setVisible(false);
        btnUpdateSave.setVisible(false);
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = tblNetwork.getSelectedRow();
        if(selectedrow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row to edit","Information",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Network nw = (Network) tblNetwork.getValueAt(selectedrow, 1);
         AddNetworkJPanel.setVisible(true);
        txtNetworkName.setEnabled(false);
      txtNetworkName.setText(nw.getName());
         btnUpdate.setVisible(true);
         btnUpdate.setEnabled(true);
         btnSave.setVisible(false);
         btnUpdateSave.setVisible(true);
         btnUpdateSave.setEnabled(false);
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try
        {
         btnUpdate.setVisible(false);
        Date date = new Date();
        String date1 = sdf.format(date);
        String networkName = txtNetworkName.getText().trim();
        if(!networkName.isEmpty())
        {
            if(Validate.isalphanumeric(networkName))
            {
                txtNetworkName.setBackground(Color.WHITE);
                Network nw = system.createAndAddNetwork();
                nw.setName(networkName);
                nw.setCreatedOn(sdf.parse(date1));
                JOptionPane.showMessageDialog(null,"Network added succesfully","Succes",JOptionPane.INFORMATION_MESSAGE);
                txtNetworkName.setText("");
                populateTable();
                AddNetworkJPanel.setVisible(false);
            }
            else
            {
                txtNetworkName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null,"Invalid data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",JOptionPane.INFORMATION_MESSAGE);
                    
        }
        }
        catch(Exception e)
        {
            System.out.println("date parsing error");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnUpdateSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        txtNetworkName.setEnabled(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        // TODO add your handling code here:
        try
        {
        Date date = new Date();
        String date1 = sdf.format(date);
        int selectedrow = tblNetwork.getSelectedRow();
        Network nw = (Network) tblNetwork.getValueAt(selectedrow, 1);
        String networkName = txtNetworkName.getText().trim();
        if(!networkName.isEmpty())
        {
            if(Validate.isalphanumeric(networkName))
            {
                txtNetworkName.setBackground(Color.WHITE);
            
                nw.setName(networkName);
                nw.setModifiedOn(sdf.parse(date1));
                JOptionPane.showMessageDialog(null,"Network details updated successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                populateTable();
                AddNetworkJPanel.setVisible(false);
            }
            else
            {
                txtNetworkName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null,"Invalid data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Warning",2);
        }
        }catch(Exception e)
        {
            System.out.println("Date parsing error");
        }
    }//GEN-LAST:event_btnUpdateSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddNetworkJPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddNetwork;
    private javax.swing.JLabel lblNetworkName;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables
}