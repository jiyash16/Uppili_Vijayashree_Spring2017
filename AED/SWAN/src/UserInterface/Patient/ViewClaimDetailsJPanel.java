/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Claims.Claim;
import Business.Claims.ClaimDirectory;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ViewClaimDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewClaimDetailsJPanel
     */
    JPanel userProcessContainer;
    ClaimDirectory claimDirectory;
    SimpleDateFormat sdf;
    public ViewClaimDetailsJPanel(JPanel userProcessContainer,ClaimDirectory claimDirectory) {
        initComponents();
     this.userProcessContainer = userProcessContainer;
     this.claimDirectory = claimDirectory;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        populateTable();
        AddClaimPanel.setVisible(false);
        
    }
    public void populateTable()
    {
         DefaultTableModel model = (DefaultTableModel) tblClaim.getModel();
       
        model.setRowCount(0);
        for(Claim claim : claimDirectory.getClaimList())
        {
           
                Object[] row = new Object[4];
                row[0] = claim;
                 row[1] = claim.getInsurancePolicy();
                 row[2] = claim.getClaimAmount();
                 row[3] =sdf.format(claim.getCreatedOn());


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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClaim = new javax.swing.JTable();
        lblswan = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        AddClaimPanel = new javax.swing.JPanel();
        lblAddOrganization2 = new javax.swing.JLabel();
        lblCoPay = new javax.swing.JLabel();
        txtCoPay = new javax.swing.JTextField();
        lblOrganizationType = new javax.swing.JLabel();
        lblClaimAmout = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        lblDiagonosis = new javax.swing.JLabel();
        txtInsuranceType = new javax.swing.JTextField();
        lblOrganizationType1 = new javax.swing.JLabel();
        txtInsurance = new javax.swing.JTextField();
        txtDiagonosis2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClaim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Claim ID", "Insurance Policy", "Claim Amount", "Created On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClaim);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, 600, 180));

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Claim Details");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 230, 50));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        btnView.setBackground(new java.awt.Color(255, 102, 102));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View Claim");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 130, -1));

        AddClaimPanel.setOpaque(false);
        AddClaimPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddOrganization2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddOrganization2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddOrganization2.setText("Claim Details");
        AddClaimPanel.add(lblAddOrganization2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, -1));

        lblCoPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCoPay.setForeground(new java.awt.Color(255, 255, 255));
        lblCoPay.setText("<html>Co Pay <font color = red>*</font></html>");
        AddClaimPanel.add(lblCoPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        txtCoPay.setEnabled(false);
        AddClaimPanel.add(txtCoPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 160, 30));

        lblOrganizationType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationType.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationType.setText("<html>Insurance Type <font color = red>*</font></html>");
        AddClaimPanel.add(lblOrganizationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblClaimAmout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblClaimAmout.setForeground(new java.awt.Color(255, 255, 255));
        lblClaimAmout.setText("<html>Claim Amount <font color = red>*</font></html>");
        AddClaimPanel.add(lblClaimAmout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        txtClaimAmount.setEnabled(false);
        AddClaimPanel.add(txtClaimAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        lblDiagonosis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDiagonosis.setForeground(new java.awt.Color(255, 255, 255));
        lblDiagonosis.setText("<html>Diagonosis <font color = red>*</font></html>");
        AddClaimPanel.add(lblDiagonosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        txtInsuranceType.setEnabled(false);
        AddClaimPanel.add(txtInsuranceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 30));

        lblOrganizationType1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationType1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationType1.setText("<html>Insurance  <font color = red>*</font></html>");
        AddClaimPanel.add(lblOrganizationType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtInsurance.setEnabled(false);
        AddClaimPanel.add(txtInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 30));

        txtDiagonosis2.setEnabled(false);
        AddClaimPanel.add(txtDiagonosis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 30));

        add(AddClaimPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 500, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRow = tblClaim.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        Claim c = (Claim) tblClaim.getValueAt(selectedRow, 0);
        AddClaimPanel.setVisible(true);
     
      
        txtInsurance.setText(c.getDiagonosis());
        txtInsurance.setEnabled(false);
        txtInsuranceType.setText(c.getInsurancePolicy().getInsuranceType().getValue());
        txtClaimAmount.setText(String.valueOf(c.getClaimAmount()));
        txtInsurance.setText(c.getInsurancePolicy().toString());
        txtDiagonosis2.setText(c.getDiagonosis());
        txtCoPay.setText(String.valueOf(c.getCoPay()));

    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddClaimPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddOrganization2;
    private javax.swing.JLabel lblClaimAmout;
    private javax.swing.JLabel lblCoPay;
    private javax.swing.JLabel lblDiagonosis;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblOrganizationType1;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTable tblClaim;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCoPay;
    private javax.swing.JTextField txtDiagonosis2;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtInsuranceType;
    // End of variables declaration//GEN-END:variables
}
