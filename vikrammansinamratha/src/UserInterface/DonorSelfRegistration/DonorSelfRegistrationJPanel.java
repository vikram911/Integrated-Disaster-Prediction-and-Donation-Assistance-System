/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonorSelfRegistration;

import Business.EcoSystem;
import Business.Enterprise.DonationMgmtEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DonationOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.DonorRole;
import Business.Role.Role;
import javax.swing.JOptionPane;

/**
 *
 * @author namra
 */
public class DonorSelfRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form donorSelfRegistrationJPanel
     */
    private EcoSystem system;

    public DonorSelfRegistrationJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        registerBtn.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        userNameTxtFld = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        passwordPasswordFld = new javax.swing.JPasswordField();
        chkAgree = new javax.swing.JCheckBox();
        chkVolunteer = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Donor Registration");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 80, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("UserName : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 108, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 90, 30));
        add(nameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 246, 31));
        add(userNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 250, 30));

        registerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Register Now.PNG"))); // NOI18N
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 210, 40));
        add(passwordPasswordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 250, 30));

        chkAgree.setBackground(new java.awt.Color(255, 255, 255));
        chkAgree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkAgree.setText("I agree to terms and conditions");
        chkAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgreeActionPerformed(evt);
            }
        });
        add(chkAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 280, -1));

        chkVolunteer.setBackground(new java.awt.Color(255, 255, 255));
        chkVolunteer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkVolunteer.setText("I would like to volunteer in case of emergency");
        chkVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVolunteerActionPerformed(evt);
            }
        });
        add(chkVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Helping hand.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 270, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        if (nameTxtFld.getText().equals(""))// || nameTxtFld.getText().matches("[1-0]+") )
        {
            JOptionPane.showMessageDialog(null, "Invalid entry in name Field");
            return;
        }

        if (userNameTxtFld.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid entry in UserName Field");
            return;
        }

        if (passwordPasswordFld.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid entry in password Field");
            return;
        }
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof DonationMgmtEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DonationOrganization) {
                            Person person = organization.getPersonDirectory().createEmployee(nameTxtFld.getText());
                            Role role = new DonorRole();

                            if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userNameTxtFld.getText()) == false) {
                                JOptionPane.showMessageDialog(null, "User name already exists. Try a different one.");
                                return;
                            }

                            organization.getUserAccountDirectory().createUserAccount(userNameTxtFld.getText(), passwordPasswordFld.getText(), person, role);
                            JOptionPane.showMessageDialog(null, "Thank you for registering");
                            return;
                        }
                    }
                }

            }

        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void chkAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgreeActionPerformed
        // TODO add your handling code here:
        if(chkAgree.isSelected() == true)
        {
            registerBtn.setEnabled(true);
        }
        else if (chkAgree.isSelected() == false)
        {
            registerBtn.setEnabled(false);
        }
        
    }//GEN-LAST:event_chkAgreeActionPerformed

    private void chkVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVolunteerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVolunteerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAgree;
    private javax.swing.JCheckBox chkVolunteer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JPasswordField passwordPasswordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField userNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
