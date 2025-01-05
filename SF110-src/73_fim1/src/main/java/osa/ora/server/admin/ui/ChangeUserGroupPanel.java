/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddUserPanel.java
 *
 * Created on Nov 19, 2009, 6:11:49 PM
 */

package osa.ora.server.admin.ui;

import java.util.Vector;
import javax.swing.JOptionPane;
import osa.ora.server.admin.AdminApp;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.User;

/**
 *
 * @author ooransa
 */
public class ChangeUserGroupPanel extends javax.swing.JPanel {
    AdminApp adminApp;
    ControlPanel controlPanel;
    /** Creates new form AddUserPanel */
    public ChangeUserGroupPanel(AdminApp adminApp, ControlPanel controlPanel) {
        this.adminApp = adminApp;
        this.controlPanel = controlPanel;
        initComponents();
    }

    public void updateModel() {
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups()));
        if(adminApp.getGroups()==null || adminApp.getGroups().size()>0){
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups().get(0).getUsers()));
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups()));
            if(adminApp.getGroups().get(0).getUsers()!=null && adminApp.getGroups().get(0).getUsers().size()>0){
                User user=adminApp.getGroups().get(0).getUsers().get(0);
                fillUser(user);
            }else{
                reset();
            }
        }else{
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new Vector(0)));
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups()));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();

        setLayout(null);

        jLabel1.setText("Username:");
        add(jLabel1);
        jLabel1.setBounds(10, 50, 90, 14);

        jLabel2.setText("Login Email:");
        add(jLabel2);
        jLabel2.setBounds(10, 80, 100, 14);

        jLabel4.setText("New Group:");
        add(jLabel4);
        jLabel4.setBounds(10, 110, 90, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(90, 20, 170, 20);

        jTextField2.setEditable(false);
        add(jTextField2);
        jTextField2.setBounds(90, 80, 170, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.jpg"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(140, 140, 110, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        add(jComboBox2);
        jComboBox2.setBounds(90, 50, 170, 20);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/online.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(20, 140, 110, 30);

        jLabel5.setText("User Group:");
        add(jLabel5);
        jLabel5.setBounds(10, 20, 90, 14);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        add(jComboBox3);
        jComboBox3.setBounds(90, 110, 170, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlPanel.getParentDialog().setVisible(false);
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Group group=(Group)jComboBox1.getSelectedItem();
        Group newGroup=(Group)jComboBox3.getSelectedItem();
        User user=(User)jComboBox2.getSelectedItem();
        int index=jComboBox2.getSelectedIndex();
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Can't identify selected User!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        if (group == null || newGroup==null) {
            JOptionPane.showMessageDialog(this, "Can't identify selected Group!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        if (group.getId() == newGroup.getId()) {
            JOptionPane.showMessageDialog(this, "New Group is the Same Old Group!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        try {
            user.setGroup_id(newGroup.getId());
            user = adminApp.updateUserGroup(user);
            if(user!=null){
                group.getUsers().remove(index);
                newGroup.getUsers().add(user);
                if(jComboBox2.getModel().getSize()>0){
                    jComboBox2.setSelectedIndex(0);
                    jComboBox2.validate();
                }else{
                    jComboBox1.setSelectedIndex(0);
                    jComboBox1.validate();
                }
                JOptionPane.showMessageDialog(this,"User Group Updated Successfully!");
            }else{
                JOptionPane.showMessageDialog(this, "Server Error!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(this, "Error Happen " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        Group group=(Group)jComboBox1.getSelectedItem();
        jComboBox3.setSelectedIndex(jComboBox1.getSelectedIndex());
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(group.getUsers()));
        if(group.getUsers()!=null && group.getUsers().size()>0){
            User user=group.getUsers().get(0);
            fillUser(user);
        }else{
            reset();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    private void reset(){
        jTextField2.setText("");
    }
    private void fillUser(User user){
        jTextField2.setText(user.getEmail());
    }
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        User user=(User)jComboBox2.getSelectedItem();
        if(user!=null){
            fillUser(user);
        }else{
            reset();
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
    }//GEN-LAST:event_jComboBox3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
