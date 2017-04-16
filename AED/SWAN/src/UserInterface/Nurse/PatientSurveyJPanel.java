/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Nurse;

import Business.Person.Patient;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class PatientSurveyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientSurveyJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    public PatientSurveyJPanel(JPanel userProcessContainer, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radHappy);
        bg1.add(radSad);
        bg1.add(radNA);
        
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(radNever);
        bg2.add(radSomeTime1);
        
        
        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(radYes);
        bg3.add(radNo);
        
        
        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(radYesAttack);
        bg4.add(radNoAttack);
        bg4.add(radSTAttack);
        
        if(patient.isIsSurveyTaken())
        {
            radHappy.setEnabled(false);
            radNA.setEnabled(false);
            radNever.setEnabled(false);
            radNo.setEnabled(false);
            radNoAttack.setEnabled(false);
            radSTAttack.setEnabled(false);
            radSad.setEnabled(false);
            radSomeTime1.setEnabled(false);
            radYes.setEnabled(false);
            radYesAttack.setEnabled(false);
            btnSubmit.setVisible(false);
            
            if(patient.getSurveyQ1() != null)
            {
                if(patient.getSurveyQ1().equals("Happy"))
                {
                    radNA.setSelected(false);
                    radSad.setSelected(false);
                    radHappy.setSelected(true);
                }
                else if(patient.getSurveyQ1().equals("Depressed"))
                {
                    radNA.setSelected(false);
                    radSad.setSelected(true);
                    radHappy.setSelected(false);
                }
                else
                {
                    radNA.setSelected(true);
                    radSad.setSelected(false);
                    radHappy.setSelected(false);
                }
            }
             
            if(patient.getSurveyQ2() != null)
            {
                if(patient.getSurveyQ2().equals("Never"))
                {
                    radNever.setSelected(true);
                    radSomeTime1.setSelected(false);
                    
                }
                else
                {
                    radNever.setSelected(false);
                    radSomeTime1.setSelected(true);
                    
                }
                
            }
             
            if(patient.getSurveyQ3() != null)
            {
                if(patient.getSurveyQ3().equals("Yes"))
                {
                    radYes.setSelected(true);
                    radNo.setSelected(false);
                    
                }
                else
                {
                    radYes.setSelected(true);
                    radNo.setSelected(false);
                }
                
            }
             
            if(patient.getSurveyQ4() != null)
            {
                if(patient.getSurveyQ4().equals("Yes"))
                {
                    radYesAttack.setSelected(true);
                    radNoAttack.setSelected(false);
                    radSTAttack.setSelected(false);
                }
                else if(patient.getSurveyQ4().equals("No"))
                {
                    radYesAttack.setSelected(false);
                    radNoAttack.setSelected(true);
                    radSTAttack.setSelected(false);
                }
                else
                {
                    radYesAttack.setSelected(false);
                    radNoAttack.setSelected(false);
                    radSTAttack.setSelected(true);
                }
            }
        }
        else
        {
            radHappy.setEnabled(true);
            radNA.setEnabled(true);
            radNever.setEnabled(true);
            radNo.setEnabled(true);
            radNoAttack.setEnabled(true);
            radSTAttack.setEnabled(true);
            radSad.setEnabled(true);
            radSomeTime1.setEnabled(true);
            radYes.setEnabled(true);
            radYesAttack.setEnabled(true);
            btnSubmit.setVisible(true);
            
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
        jLabel1 = new javax.swing.JLabel();
        radHappy = new javax.swing.JRadioButton();
        radSad = new javax.swing.JRadioButton();
        radNA = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        radNever = new javax.swing.JRadioButton();
        radSTAttack = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radYes = new javax.swing.JRadioButton();
        radNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radYesAttack = new javax.swing.JRadioButton();
        radNoAttack = new javax.swing.JRadioButton();
        radSomeTime1 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();

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
        lblswan.setText("Patient Survey Form");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 230, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("4) Do you get panic attacks?");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 300, 30));

        radHappy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radHappy.setForeground(new java.awt.Color(255, 255, 255));
        radHappy.setText("Happy");
        radHappy.setOpaque(false);
        add(radHappy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        radSad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radSad.setForeground(new java.awt.Color(255, 255, 255));
        radSad.setText("Depressed");
        radSad.setOpaque(false);
        add(radSad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        radNA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radNA.setForeground(new java.awt.Color(255, 255, 255));
        radNA.setText("Don't Know");
        radNA.setOpaque(false);
        add(radNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1) How do you generally feel most of the time?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 300, 30));

        radNever.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radNever.setForeground(new java.awt.Color(255, 255, 255));
        radNever.setText("Never");
        radNever.setOpaque(false);
        add(radNever, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        radSTAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radSTAttack.setForeground(new java.awt.Color(255, 255, 255));
        radSTAttack.setText("Some Time");
        radSTAttack.setOpaque(false);
        add(radSTAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2) Do you ever feel life is not worth living?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 30));

        radYes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radYes.setForeground(new java.awt.Color(255, 255, 255));
        radYes.setText("Yes");
        radYes.setOpaque(false);
        add(radYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        radNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radNo.setForeground(new java.awt.Color(255, 255, 255));
        radNo.setText("No");
        radNo.setOpaque(false);
        add(radNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3) Are there things you feel guilty about?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 300, 30));

        radYesAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radYesAttack.setForeground(new java.awt.Color(255, 255, 255));
        radYesAttack.setText("Yes");
        radYesAttack.setOpaque(false);
        add(radYesAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        radNoAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radNoAttack.setForeground(new java.awt.Color(255, 255, 255));
        radNoAttack.setText("No");
        radNoAttack.setOpaque(false);
        add(radNoAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        radSomeTime1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radSomeTime1.setForeground(new java.awt.Color(255, 255, 255));
        radSomeTime1.setText("Some Time");
        radSomeTime1.setOpaque(false);
        add(radSomeTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 102, 102));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String surveyQ1 = "";
        String surveyQ2 = "";
        String surveyQ3 = "";
        String surveyQ4 = "";
        
                if(radNA.isSelected())
                {
                    patient.setSurveyQ1("NA");
                }
                else if(radHappy.isSelected())
                {
                    patient.setSurveyQ1("Happy");
                }
                else if(radSad.isSelected())
                {
                    patient.setSurveyQ1("Depressed");
                }
                if(radNever.isSelected())
                {
                    patient.setSurveyQ2("Never");
                }
                else if(radSomeTime1.isSelected())
                {
                    patient.setSurveyQ2("SomeTime");
                }
                 if(radNo.isSelected())
                {
                    patient.setSurveyQ3("No");
                }
                else if(radYes.isSelected())
                {
                    patient.setSurveyQ3("Yes");
                }
                if(radNoAttack.isSelected())
                {
                    patient.setSurveyQ4("No");
                }
                else if(radYesAttack.isSelected())
                {
                    patient.setSurveyQ4("Yes");
                }
                else if(radSTAttack.isSelected())
                {
                    patient.setSurveyQ4("SomeTime");
                }
                
        
        patient.setIsSurveyTaken(true);
        JOptionPane.showMessageDialog(null,"Thank you for completing survey","Information",1);
        radHappy.setEnabled(false);
        radNA.setEnabled(false);
        radNever.setEnabled(false);
        radNo.setEnabled(false);
        radNoAttack.setEnabled(false);
        radSTAttack.setEnabled(false);
        radSad.setEnabled(false);
        radSomeTime1.setEnabled(false);
        radYes.setEnabled(false);
        radYesAttack.setEnabled(false);
        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblswan;
    private javax.swing.JRadioButton radHappy;
    private javax.swing.JRadioButton radNA;
    private javax.swing.JRadioButton radNever;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radNoAttack;
    private javax.swing.JRadioButton radSTAttack;
    private javax.swing.JRadioButton radSad;
    private javax.swing.JRadioButton radSomeTime1;
    private javax.swing.JRadioButton radYes;
    private javax.swing.JRadioButton radYesAttack;
    // End of variables declaration//GEN-END:variables
}