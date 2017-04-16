/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserAccountManagement;


import Business.DateUtils;
import UserInterface.EnterpriseAdmin.*;
import Business.Organization.Organization;
import Business.Person.Employee;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.Validate;
import UserInterface.EnterpriseAdmin.ViewEmployeeDirectoryJPanel;
import UserInterface.UserAccountManagement.ObservingTextField;
import com.qt.datapicker.DatePicker;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javax.swing.JPanel;



/**
 *
 * @author Jiya
 */
public class ViewUpdatePersonDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
 JPanel userProcessContainer;
    Employee employee;
    Patient patient;
    SimpleDateFormat sdf;
    String persontype;
   UserAccount userAccount;
   int wfh;
        public ViewUpdatePersonDetailsJPanel(JPanel userProcessContainer, Person p,UserAccount userAccount, String persontype, String mode,int wfh) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
          this.persontype = persontype;
          this.userAccount = userAccount;
          this.wfh=wfh;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
      //  System.out.println("in sign up panel");
     
        if(userAccount == null)
        {
            lblpassword.setVisible(false);
            txtPassword.setVisible(false);
        }
        else
        {
            lblpassword.setVisible(true);
            txtPassword.setVisible(true);
            txtPassword.setText(userAccount.getPassword());
            
        }
        if(mode.equalsIgnoreCase("view"))
        {
            txtDOB.setEnabled(false);  
            txtAddress.setEnabled(false);
        txtEmail.setEnabled(false);
        txtLocation.setEnabled(false);
        txtPhone.setEnabled(false);
        btnUpdate.setVisible(false);
        btnUpdateAdmin.setVisible(false);
        txtPassword.setEnabled(false);
        chkMarried.setEnabled(false);
        radMale.setEnabled(false);
        radFemale.setEnabled(false);
        btnDatePicker.setVisible(false);
        btnUpdateAdmin.setVisible(false);
        
        
        }
        else
        {
                  txtAddress.setEnabled(true);
        txtEmail.setEnabled(true);
        txtLocation.setEnabled(true);
        txtPhone.setEnabled(true);
        btnUpdate.setVisible(true);
        btnDatePicker.setVisible(false);
        txtPassword.setEnabled(true);
             chkMarried.setEnabled(true);
        radMale.setEnabled(true);
        radFemale.setEnabled(true);
         ButtonGroup bG = new ButtonGroup();
                 bG.add(radMale);
                bG.add(radFemale);
                txtDOB.setEnabled(false);
        
        }
        if(persontype.equals("employee"))
        {
            btnUpdateAdmin.setVisible(false);
//            btnUpdate.setVisible(true);
            this.employee = (Employee) p;
              radMale.setEnabled(false);
        radFemale.setEnabled(false);
        
            populateForm();
              
        }
        else if(persontype.equals("admin"))
        {
            btnDatePicker.setVisible(true);
            txtDOB.setEnabled(false);
            btnUpdateAdmin.setVisible(true);
            btnUpdate.setVisible(false);
            this.employee = (Employee) p;
                txtAddress.setEnabled(true);
                txtEmail.setEnabled(true);
                txtLocation.setEnabled(true);
                txtPhone.setEnabled(true);
                btnDatePicker.setVisible(true);
                txtDOB.setEnabled(true);
                txtFirstName.setEnabled(true);
                txtLastName1.setEnabled(true);
                txtPassword.setEnabled(true);
                txtSSN.setEnabled(true);
                chkMarried.setEnabled(true);
                radFemale.setEnabled(true);
                radMale.setEnabled(true);
               
                populateAdmin();
        }
        else
        {
//            lblpassword.setVisible(false);
//            txtPassword.setVisible(false);
            this.patient = (Patient) p;
            populatePatientForm();
                btnUpdate.setVisible(false);
               btnUpdateAdmin.setVisible(false);
        }
      
    }
        public void populateAdmin()
        {txtDOB.setEnabled(false);
                lblHireDate.setVisible(true);
               
                  txthireDate.setVisible(true);
                  if(employee.getHireDate() != null)
                  {
                  txthireDate.setText(sdf.format(employee.getHireDate()));
                  }
                txtFirstName.setText(employee.getFirstName());
                txtLastName1.setText(employee.getLastName());
                if(employee.getAddress() != null)
                txtAddress.setText(employee.getAddress());
                if(employee.getDOB() != null)
                {
                    txtDOB.setText(sdf.format(employee.getDOB()));
                }
                if(employee.getEmail() != null)
                txtEmail.setText(employee.getEmail());
                if(employee.getLocation() != null)
                txtLocation.setText(employee.getLocation());
                if(employee.getPhone() != 0)
                txtPhone.setText(String.valueOf(employee.getPhone()));
                if(employee.getSsn() != null)
                txtSSN.setText(employee.getSsn());
                 if(employee.getGender() != null)
        {
            if(employee.getGender().equals("Male"))
            {
                radMale.setSelected(true);
                radFemale.setSelected(false);
            }
            else
            {
                radMale.setSelected(false);
                radFemale.setSelected(true);
            }
        }
        
        
        if(employee.isMaritalStatus())
        {
                chkMarried.setSelected(true);
        }
        else
        {
            chkMarried.setSelected(false);
        }
        try
        {
        if(employee.getPicture() != null)
        {
            ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(employee.getPicture())));//get the image from file chooser and scale it to match JLabel size
             lblPicture.setIcon(ii);
        }
        }
        catch(Exception e)
        {
            System.out.println("image error");
        }
       
        }
         public void populatePatientForm()
    {
        lblHireDate.setVisible(false);
        txthireDate.setVisible(false);
        radFemale.setEnabled(false);
        radMale.setEnabled(false);
        txtFirstName.setText(patient.getFirstName());
        txtLastName1.setText(patient.getLastName());
        
        txtAddress.setText(patient.getAddress());
        txtDOB.setText(sdf.format(patient.getDOB()));
        txtEmail.setText(patient.getEmail());
        txtLocation.setText(patient.getLocation());
        txtPhone.setText(String.valueOf(patient.getPhone()));
        txtSSN.setText(patient.getSsn());
        
            lblHireDate.setVisible(false);
            txthireDate.setVisible(false);
        if(patient.getGender() != null)
        {
            if(patient.getGender().equals("Male"))
            {
                radMale.setSelected(true);
                radFemale.setSelected(false);
            }
            else
            {
                radMale.setSelected(false);
                radFemale.setSelected(true);
            }
        }
        try
        {
        if(patient.getPicture() != null)
        {
            ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(patient.getPicture())));//get the image from file chooser and scale it to match JLabel size
             lblPicture.setIcon(ii);
        }
        }
        catch(Exception e)
        {
            System.out.println("image error");
        }

        
        if(patient.isMaritalStatus())
        {
                chkMarried.setSelected(true);
        }
        else
        {
            chkMarried.setSelected(false);
        }
        
    }
    public void populateForm()
    {
         lblHireDate.setVisible(true);
        txthireDate.setVisible(true);
        
                txtFirstName.setText(employee.getFirstName());
                txtLastName1.setText(employee.getLastName());
                txtAddress.setText(employee.getAddress());
                txtDOB.setText(sdf.format(employee.getDOB()));
                txtEmail.setText(employee.getEmail());
                txtLocation.setText(employee.getLocation());
                txtPhone.setText(String.valueOf(employee.getPhone()));
                txtSSN.setText(employee.getSsn());
                 lblHireDate.setVisible(true);
                    txthireDate.setVisible(true);

                    txthireDate.setText(sdf.format(employee.getHireDate()));
                
                if(employee.getGender().equals("Male"))
                {
                    radMale.setSelected(true);
                    radFemale.setSelected(false);
                }
                else
                {
                    radMale.setSelected(false);
                    radFemale.setSelected(true);
                }
                if(employee.isMaritalStatus())
                {
                    chkMarried.setSelected(true);
                }
                else
                {
                    chkMarried.setSelected(false);
                }
                try
                {
                     if(employee.getPicture() != null)
                    {
                     ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(employee.getPicture())));//get the image from file chooser and scale it to match JLabel size
                     lblPicture.setIcon(ii);
                    }
                }
                 catch(Exception e)
                    {
                         System.out.println("image error");
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

        lblswan = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblFirstName2 = new javax.swing.JLabel();
        lblFirstName3 = new javax.swing.JLabel();
        lblFirstName4 = new javax.swing.JLabel();
        lblFirstName5 = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtDOB = new ObservingTextField();
        txtEmail = new javax.swing.JTextField();
        txtLastName1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblFirstName7 = new javax.swing.JLabel();
        txtBrowse = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lblMaritalstatus = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblPicture = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        chkMarried = new javax.swing.JCheckBox();
        lblHireDate = new javax.swing.JLabel();
        txthireDate = new ObservingTextField();
        lblpassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnDatePicker = new javax.swing.JButton();
        btnUpdateAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Welcome To SWAN Network");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 230, 50));

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("<html>Email <font color = red>*</font></html>");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        lblFirstName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName1.setText("<html>First Name <font color = red>*</font></html>");
        add(lblFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblFirstName2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName2.setText("<html>Last Name <font color = red>*</font></html>");
        add(lblFirstName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblFirstName3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName3.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName3.setText("<html>Gender <font color = red>*</font></html>");
        add(lblFirstName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 20));

        lblFirstName4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName4.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName4.setText("<html>Date of Birth <font color = red>*</font></html>");
        add(lblFirstName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        lblFirstName5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName5.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName5.setText("<html>Phone <font color = red>*</font></html>");
        add(lblFirstName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        radMale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radMale.setForeground(new java.awt.Color(255, 255, 255));
        radMale.setSelected(true);
        radMale.setText("Male");
        radMale.setContentAreaFilled(false);
        add(radMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        radFemale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radFemale.setForeground(new java.awt.Color(255, 255, 255));
        radFemale.setText("Female");
        radFemale.setContentAreaFilled(false);
        add(radFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, 30));

        txtFirstName.setEnabled(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 30));

        txtDOB.setEnabled(false);
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 30));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 30));

        txtLastName1.setEnabled(false);
        add(txtLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblFirstName7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName7.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName7.setText("Address");
        add(lblFirstName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        txtBrowse.setEnabled(false);
        add(txtBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 140, 30));

        lblLocation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("Location");
        add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 140, 30));

        lblMaritalstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMaritalstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblMaritalstatus.setText("Marital Status");
        add(lblMaritalstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        lblssn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblssn.setForeground(new java.awt.Color(255, 255, 255));
        lblssn.setText("<html>SSN <font color = red>*</font></html>");
        add(lblssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 30));

        txtSSN.setEnabled(false);
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 140, 30));

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PersonIcon.png"))); // NOI18N
        add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 210, 170));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 30));

        btnBrowse.setBackground(new java.awt.Color(255, 102, 102));
        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowse.setText("Upload");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 270, 90, 30));

        chkMarried.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkMarried.setForeground(new java.awt.Color(255, 255, 255));
        chkMarried.setText(" Married");
        chkMarried.setOpaque(false);
        add(chkMarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 140, 30));

        lblHireDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHireDate.setForeground(new java.awt.Color(255, 255, 255));
        lblHireDate.setText("<html>Hire Date <font color = red>*</font></html>");
        add(lblHireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 30));

        txthireDate.setEnabled(false);
        add(txthireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 30));

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 30));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 140, 30));

        btnDatePicker.setBackground(new java.awt.Color(255, 102, 102));
        btnDatePicker.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDatePicker.setForeground(new java.awt.Color(255, 255, 255));
        btnDatePicker.setText("Pick Date");
        btnDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatePickerActionPerformed(evt);
            }
        });
        add(btnDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        btnUpdateAdmin.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAdmin.setText("Update");
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });
        add(btnUpdateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       // SmsSender sms = new SmsSender();
       try
       {
            
            String email = txtEmail.getText().trim();
            String phone = txtPhone.getText().trim();
           String password = txtPassword.getText().trim();
//            String gender = "";
//            if(radMale.isSelected())
//            {
//                radFemale.setSelected(false);
//                gender = "Male";
//            }
//            else if(radFemale.isSelected())
//            {
//                radMale.setSelected(false);
//                gender = "Female";
//            }
//            else
//            {
//                gender = null;
//            }
            String address = txtAddress.getText().trim();
            String location = txtLocation.getText().trim();
            boolean maritalStatus = false;
            if(chkMarried.isSelected())
            {
                maritalStatus = true;
            }
            else
            {
                maritalStatus = false;
            }
//            String ssn = txtSSN.getText().trim();

          
            boolean boolemail = Validate.isEmail(email);
            boolean boolphone = Validate.isPhone(phone);
            boolean booladdress = true;
            boolean boolpw = Validate.isalphanumeric(password);
            if(!address.isEmpty())
            {
                 booladdress = Validate.isalphanumeric(address);
            }

            boolean boollocation = true;
            if(!location.isEmpty())
            {
                boollocation =  Validate.isString(location);
            }

         
            if(!email.isEmpty() && !phone.isEmpty() && !password.isEmpty())
            {
                if(boolemail && boolphone && boolpw)
                {
                        txtEmail.setBackground(Color.WHITE);
                    txtPassword.setBackground(Color.WHITE);
                        txtPhone.setBackground(Color.WHITE);
                        txtAddress.setBackground(Color.WHITE);
                        txtLocation.setBackground(Color.WHITE);
                       userAccount.setPassword(password);
                    
                   if(employee != null)
                   {
                   
                    employee.setEmail(email);
                    employee.setLocation(location);
                    employee.setPhone(Long.parseLong(phone));
                    employee.setMaritalStatus(maritalStatus);
                    employee.setAddress(address);
                 
                    
                   }
                   else
                   {
                       patient.setEmail(email);
                    patient.setLocation(location);
                    patient.setPhone(Long.parseLong(phone));
                 patient.setMaritalStatus(maritalStatus);
                    patient.setAddress(address);
                 
                   
                   }
                    JOptionPane.showMessageDialog(null,"Details updated successfully","Success",1);
                     
                     
                }
                else
                {
                   
                    if(!boolemail)
                    {
                        txtEmail.setBackground(Color.red);
                    }
                    else
                        txtEmail.setBackground(Color.WHITE);
                    if(!boolphone)
                    {
                        txtPhone.setBackground(Color.red);
                    }
                    else
                        txtPhone.setBackground(Color.WHITE);
                    if(!booladdress)
                    {
                        txtAddress.setBackground(Color.red);
                    }
                    else
                        txtAddress.setBackground(Color.WHITE);
                    if(!boollocation)
                    {
                        txtLocation.setBackground(Color.red);
                    }
                    else
                        txtLocation.setBackground(Color.WHITE);
                   
                    if(!boolpw)
                    {
                        txtPassword.setBackground(Color.red);
                    }
                    else
                        txtPassword.setBackground(Color.WHITE);
                    JOptionPane.showMessageDialog(null,"Invalid data","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",1);
            }
       }
       catch(Exception e)
       {
           System.out.println("Error in date conversion");
                   
       }
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         CardLayout cl = (CardLayout) userProcessContainer.getLayout();
         cl.previous(userProcessContainer);
        

    
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
    try {
              JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    String filename = f.getAbsolutePath();
    txtBrowse.setText(filename);

        File file = new File(f.getAbsolutePath());
        ImageIcon ii=new ImageIcon(scaleImage(150, 150, ImageIO.read(file)));//get the image from file chooser and scale it to match JLabel size
        lblPicture.setIcon(ii);
        if(employee != null)
        {
            employee.setPicture(file);
        }
        else
        {
            patient.setPicture(file);
        }
    }catch (Exception ex) 
    {
      //  ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnBrowseActionPerformed
public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
    BufferedImage bi;
    bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(img, 0, 0, w, h, null);
    g2d.dispose();
    return bi;
}
    private void btnDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatePickerActionPerformed
        String lang = null;
        final Locale locale = getLocale(lang);
        DatePicker dp = new DatePicker(txtDOB, locale);
        //DatePicker.getDatePicker().setMaxDate(new Date());
        Date selectedDate = dp.parseDate(txtDOB.getText().trim());
        dp.setSelectedDate(selectedDate);
        dp.start(txtDOB);

    }//GEN-LAST:event_btnDatePickerActionPerformed

    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
        // TODO add your handling code here:
        try
       {
           Date date = new Date();
            String firstName = txtFirstName.getText().trim();
            String lastName = txtLastName1.getText().trim();
            String dob = txtDOB.getText().trim();
            String email = txtEmail.getText().trim();
            String phone = txtPhone.getText().trim();
            String hireDate = txthireDate.getText().trim();
            String gender = "";
            String password = txtPassword.getText().trim();
            if(radMale.isSelected())
            {
                radFemale.setSelected(false);
                gender = "Male";
            }
            else if(radFemale.isSelected())
            {
                radMale.setSelected(false);
                gender = "Female";
            }
            else
            {
                gender = null;
            }
            String address = txtAddress.getText().trim();
            String location = txtLocation.getText().trim();
            boolean maritalStatus = false;
            if(chkMarried.isSelected())
            {
                maritalStatus = true;
            }
            else
            {
                maritalStatus = false;
            }
            String ssn = txtSSN.getText().trim();

            boolean boolfirstName = Validate.isString(firstName);
            boolean boollastName = Validate.isalphanumeric(lastName);
            boolean booldob = Validate.isDate(dob);
             boolean boolhireDate = Validate.isDate(hireDate);
            boolean boolemail = Validate.isEmail(email);
            boolean boolphone = Validate.isPhone(phone);
            boolean booladdress = true;
            boolean boolpw = Validate.isalphanumeric(password);
            if(!address.isEmpty())
            {
                 booladdress = Validate.isalphanumeric(address);
            }

            boolean boollocation = true;
            if(!location.isEmpty())
            {
                boollocation =  Validate.isString(location);
            }

            boolean boolssn = Validate.isSSN(ssn);
         
            if(!firstName.isEmpty() && !lastName.isEmpty() && !dob.isEmpty() && !hireDate.isEmpty() && !email.isEmpty() && !phone.isEmpty() &&!ssn.isEmpty() && !password.isEmpty())
            {
                   if(DateUtils.isAfterDay(sdf.parse(dob), date))
                    {
                       JOptionPane.showMessageDialog(null,"Date of birth should not be future date","Warning",2);
                        return;

                    }
                if(boolfirstName && boollastName && booldob && boolhireDate && boolemail && boolphone && booladdress && boollocation && boolssn &&boolpw)
                {
                    txtFirstName.setBackground(Color.WHITE);
                    txtLastName1.setBackground(Color.WHITE);
                        txtDOB.setBackground(Color.WHITE);
                        txtEmail.setBackground(Color.WHITE);
                    
                        txtPhone.setBackground(Color.WHITE);
                        txtAddress.setBackground(Color.WHITE);
                        txtLocation.setBackground(Color.WHITE);
                        txtSSN.setBackground(Color.WHITE);
                    txtPassword.setBackground(Color.WHITE);
                    
                    employee.setFirstName(firstName);
                    employee.setLastName(lastName);
                    employee.setDOB(sdf.parse(dob));
                    employee.setEmail(email);
                    employee.setGender(gender);
                    employee.setMaritalStatus(maritalStatus);
                    employee.setLocation(location);
                    employee.setPhone(Long.parseLong(phone));
                    employee.setSsn(ssn);
                    employee.setAddress(address);
                    employee.setHireDate(sdf.parse(hireDate));
                    userAccount.setPassword(password);
                    JOptionPane.showMessageDialog(null,"Details updated successfully","Success",1);
                    if(wfh==1)
                    {
                        Validate.createLogFile(userAccount.getUsername(), "Employee updated his profile");
                    }
                }
                else
                {
                    if(!boolfirstName)
                    {
                        txtFirstName.setBackground(Color.red);
                    }
                    else
                        txtFirstName.setBackground(Color.WHITE);
                    if(!boollastName)
                    {
                        txtLastName1.setBackground(Color.red);
                    }
                    else
                        txtLastName1.setBackground(Color.WHITE);
                    if(!booldob)
                    {
                        txtDOB.setBackground(Color.red);
                    }
                    else
                        txtDOB.setBackground(Color.WHITE);
                    if(!boolemail)
                    {
                        txtEmail.setBackground(Color.red);
                    }
                    else
                        txtEmail.setBackground(Color.WHITE);
                    if(!boolphone)
                    {
                        txtPhone.setBackground(Color.red);
                    }
                    else
                        txtPhone.setBackground(Color.WHITE);
                    if(!booladdress)
                    {
                        txtAddress.setBackground(Color.red);
                    }
                    else
                        txtAddress.setBackground(Color.WHITE);
                    if(!boollocation)
                    {
                        txtLocation.setBackground(Color.red);
                    }
                    else
                        txtLocation.setBackground(Color.WHITE);
                    if(!boolssn)
                    {
                        txtSSN.setBackground(Color.red);
                    }
                    else
                        txtSSN.setBackground(Color.WHITE);
                    if(!boolpw)
                    {
                        txtPassword.setBackground(Color.red);
                    }
                    else
                        txtPassword.setBackground(Color.WHITE);

                    JOptionPane.showMessageDialog(null,"Invalid data","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",1);
            }
       }
       catch(Exception e)
       {
           System.out.println("Error in date conversion");
                   
       }
       
    }//GEN-LAST:event_btnUpdateAdminActionPerformed
    private Locale getLocale(String lang) {
     
     if(lang !=null && lang.length() >0)
     {
         return new Locale(lang);
     }
     else
     {
         
             return Locale.US;
     }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDatePicker;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateAdmin;
    private javax.swing.JCheckBox chkMarried;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstName2;
    private javax.swing.JLabel lblFirstName3;
    private javax.swing.JLabel lblFirstName4;
    private javax.swing.JLabel lblFirstName5;
    private javax.swing.JLabel lblFirstName7;
    private javax.swing.JLabel lblHireDate;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMaritalstatus;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lblswan;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBrowse;
    private ObservingTextField txtDOB;
    /*
    private javax.swing.JTextField txtDOB;
    */
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private ObservingTextField txthireDate;
    /*
    private javax.swing.JTextField txthireDate;
    */
    // End of variables declaration//GEN-END:variables

   
}