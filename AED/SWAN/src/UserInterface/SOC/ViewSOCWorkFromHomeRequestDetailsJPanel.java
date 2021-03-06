/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SOC;



import Business.EcoSystem;
import Business.GeoIP.GeoIPv4;
import Business.IPConfig;
import Business.Validate;
import UserInterface.UserAccountManagement.*;

import Business.WorkQueue.WorkFromHomeWorkRequest;

import java.awt.CardLayout;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;


import javax.swing.JPanel;



/**
 *
 * @author Jiya
 */
public class ViewSOCWorkFromHomeRequestDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    JPanel userProcessContainer;
    
    SimpleDateFormat sdf;
    WorkFromHomeWorkRequest request;
   EcoSystem system;
    public ViewSOCWorkFromHomeRequestDetailsJPanel(JPanel userProcessContainer, WorkFromHomeWorkRequest request,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
       sdf = new SimpleDateFormat("dd/MM/yyyy");
       populateForm();
      btnaddIP.setEnabled(false);
    }
    public void populateForm()
    {
        
            
            txtWFHDate.setText(sdf.format(request.getWfhDate()));
            txtFirstName.setText(request.getSender().getEmployee().getFirstName());
            txtLastName.setText(request.getSender().getEmployee().getLastName());
            txtIP.setText(request.getIp());
         
            txtDuration.setText(String.valueOf(request.getDuration()));
            txtReason.setText(request.getMessage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblswan = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblFirstName2 = new javax.swing.JLabel();
        lblFirstName4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtWFHDate = new ObservingTextField();
        txtDuration = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblssn = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        lblssn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnaddIP = new javax.swing.JButton();
        btnIP1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Request Details");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 230, 50));

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblDuration.setText("<html>Duration <font color = red>*</font></html>");
        add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, 20));

        lblFirstName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName1.setText("<html>First Name <font color = red>*</font></html>");
        add(lblFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        lblFirstName2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName2.setText("<html>Last Name <font color = red>*</font></html>");
        add(lblFirstName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        lblFirstName4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName4.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName4.setText("<html>WorkFromHome Date<font color = red>*</font></html>");
        add(lblFirstName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        txtFirstName.setEnabled(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 30));

        txtWFHDate.setEnabled(false);
        add(txtWFHDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, 30));

        txtDuration.setEnabled(false);
        add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, 30));

        txtLastName.setEnabled(false);
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblssn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblssn.setForeground(new java.awt.Color(255, 255, 255));
        lblssn.setText("<html>Reason <font color = red>*</font></html>");
        add(lblssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 30));

        txtReason.setEnabled(false);
        add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 140, 30));

        txtIP.setEnabled(false);
        add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, 30));

        lblssn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblssn1.setForeground(new java.awt.Color(255, 255, 255));
        lblssn1.setText("<html>IP <font color = red>*</font></html>");
        add(lblssn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 30, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("hours");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        btnaddIP.setBackground(new java.awt.Color(255, 102, 102));
        btnaddIP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnaddIP.setForeground(new java.awt.Color(255, 255, 255));
        btnaddIP.setText("Add IP");
        btnaddIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddIPActionPerformed(evt);
            }
        });
        add(btnaddIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 120, -1));

        btnIP1.setBackground(new java.awt.Color(255, 102, 102));
        btnIP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIP1.setForeground(new java.awt.Color(255, 255, 255));
        btnIP1.setText("Check Valid IP");
        btnIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIP1ActionPerformed(evt);
            }
        });
        add(btnIP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         CardLayout cl = (CardLayout) userProcessContainer.getLayout();
         cl.previous(userProcessContainer);
        

    
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnaddIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddIPActionPerformed
        // TODO add your handling code here:
        try
        {
        String ip = txtIP.getText().trim();
        String wfhdate = txtWFHDate.getText().trim();
        if(system.getRmap().checkIPPresent(ip) != null)
        {
            JOptionPane.showMessageDialog(null,"IP already added to network");
            
        }
        else
        {
            IPConfig iptoAdd = (IPConfig)system.getRmap().addnewIP();
            iptoAdd.setIp(ip);
            iptoAdd.setLocation("Chennai");
            //iptoAdd.setLocation(GeoIPv4.getLocation(ip));
            iptoAdd.setHomeip(1);
            iptoAdd.setWfhDate(sdf.parse(wfhdate));
            JOptionPane.showMessageDialog(null,"IP added to network","Success",1);
        }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnaddIPActionPerformed

    private void btnIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIP1ActionPerformed
        // TODO add your handling code here:
         String ip = txtIP.getText().trim();
        if(Validate.isIP(ip))
        {
            //call geoip
             
                //JOptionPane.showMessageDialog(null,"IP is valid and from "+GeoIPv4.getLocation(ip));
            JOptionPane.showMessageDialog(null,"IP is valid and from \n"+GeoIPv4.getLocation("72.229.28.185"));
            btnaddIP.setEnabled(true);
        }
        else
        {
            btnaddIP.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Invalid IP Location cannot be found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIP1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIP1;
    private javax.swing.JButton btnaddIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstName2;
    private javax.swing.JLabel lblFirstName4;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lblssn1;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtReason;
    private ObservingTextField txtWFHDate;
    /*
    private javax.swing.JTextField txtWFHDate;
    */
    // End of variables declaration//GEN-END:variables

   
}
