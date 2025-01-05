/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddGroupPanel.java
 *
 * Created on Nov 19, 2009, 12:05:35 AM
 */

package osa.ora.server.admin.ui;

import java.rmi.RemoteException;
import java.util.Vector;
import javax.swing.JOptionPane;
import osa.ora.server.admin.AdminApp;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.User;

/**
 *
 * @author ooransa
 */
public class UpdateRoomPanel extends javax.swing.JPanel {
    AdminApp adminApp;
    ControlPanel controlPanel;
    Vector<User> selectedUsers;
    /** Creates new form AddGroupPanel */
    public UpdateRoomPanel(AdminApp adminApp, ControlPanel controlPanel) {
        this.adminApp = adminApp;
        this.controlPanel = controlPanel;
        selectedUsers=new Vector<User>(0);
        initComponents();
    }
    public void updateModel() {
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups()));
        if(adminApp.getGroups()!=null && adminApp.getGroups().size()>0) {
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getGroups().get(0).getUsers()));
        }else{
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new Vector(0)));
        }
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getRooms()));
        if(adminApp.getRooms()!=null && adminApp.getRooms().size()>0){
            updateSelectedRoom();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        setLayout(null);

        jLabel1.setText("Room Name:");
        add(jLabel1);
        jLabel1.setBounds(20, 40, 110, 14);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.jpg"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(260, 200, 100, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(140, 200, 110, 30);

        jLabel2.setText("Room Users List:");
        add(jLabel2);
        jLabel2.setBounds(20, 70, 120, 14);

        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 150, 70);

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(180, 140, 49, 23);

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(40, 170, 90, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(240, 100, 140, 20);
        add(jTextField1);
        jTextField1.setBounds(100, 40, 220, 20);

        jLabel3.setText("Select Room:");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 80, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(30, 200, 100, 30);

        jLabel4.setText("Select Users:");
        add(jLabel4);
        jLabel4.setBounds(270, 70, 90, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2);
        jComboBox2.setBounds(240, 140, 140, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        add(jComboBox3);
        jComboBox3.setBounds(100, 10, 220, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        User user=(User)jComboBox2.getSelectedItem();
        int index=jComboBox2.getSelectedIndex();
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Can't identify selected User!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        if(selectedUsers.contains(user)){
            JOptionPane.showMessageDialog(this, "User Already Added To The Room!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        selectedUsers.add(user);
        updateListModel();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void updateListModel(){
        jList1.setModel(new javax.swing.AbstractListModel() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return selectedUsers.size(); }
            public Object getElementAt(int i) { return selectedUsers.get(i); }
        });
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] temp=jList1.getSelectedIndices();
        if(temp.length==1){
            selectedUsers.remove((User)jList1.getModel().getElementAt(temp[0]));
        }else{
            for(int i=temp.length-1;i>=0;i--){
                selectedUsers.remove((User)jList1.getModel().getElementAt(temp[i]));
            }
        }
        updateListModel();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlPanel.getParentDialog().setVisible(false);
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void reset(){
        selectedUsers=new Vector(0);
        jTextField1.setText("");
        updateListModel();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Room room=(Room)jComboBox3.getSelectedItem();
        int index=jComboBox3.getSelectedIndex();
        if (room == null || index==-1) {
            JOptionPane.showMessageDialog(this, "Can't identify selected Room", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        if (jTextField1.getText() == null || jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Room Name!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        if (selectedUsers.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select Room Members!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        for(int i=0;i<adminApp.getRooms().size();i++){
            if(adminApp.getRooms().get(i).getId()!=room.getId() && adminApp.getRooms().get(i).getName().equalsIgnoreCase(jTextField1.getText())){
                JOptionPane.showMessageDialog(this, "Please Select Another Room Name , Name Already exist!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
                return;
            }
        }
        room.setName(jTextField1.getText());
        int[] users=new int[selectedUsers.size()];
        for(int i=0;i<selectedUsers.size();i++){
            users[i]=selectedUsers.get(i).getId();
        }
        room.setUserId(users);
        try {
            room=adminApp.updateRoom(room);
            if(room!=null){
                adminApp.getRooms().set(index,room);
                jComboBox3.setSelectedIndex(index);
                JOptionPane.showMessageDialog(this,"Room Updated Successfully!");
            }else{
                JOptionPane.showMessageDialog(this, "Server Error!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(this, "Error Happen " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Room room=(Room)jComboBox3.getSelectedItem();
        int index=jComboBox3.getSelectedIndex();
        if (room == null || index==-1) {
            JOptionPane.showMessageDialog(this, "Can't identify selected Room", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            return;
        }
        try {
            //System.out.println("room no#="+index);
            room=adminApp.delRoom(room);
            if(room!=null){
                adminApp.getRooms().remove(index);
                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(adminApp.getRooms()));
                if(adminApp.getRooms().size()>0) {
                    jComboBox3.setSelectedIndex(0);
                    updateSelectedRoom();
                }
                JOptionPane.showMessageDialog(this,"Room Deleted Successfully!");
            }else{
                JOptionPane.showMessageDialog(this, "Server Error!", "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(this, "Error Happen " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE, adminApp.getErrorIcon());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        Group group=(Group)jComboBox1.getSelectedItem();
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(group.getUsers()));
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        updateSelectedRoom();
    }//GEN-LAST:event_jComboBox3ItemStateChanged
    private void updateSelectedRoom(){
        Room room=(Room)jComboBox3.getSelectedItem();
        selectedUsers=new Vector<User>(0);
        if(room!=null){
            jTextField1.setText(room.getName());
            if(room.getUserId()!=null && room.getUserId().length>0){
                for(int n=0;n<adminApp.getGroups().size();n++){
                    Vector<User> temp=adminApp.getGroups().get(n).getUsers();
                    if(temp!=null && temp.size()>0){
                        for(int l=0;l<temp.size();l++){
                            for(int i=0;i<room.getUserId().length;i++){
                                if(temp.get(l).getId()==room.getUserId()[i]){
                                    selectedUsers.add(temp.get(l));
                                }
                            }
                        }
                    }
                }
                updateListModel();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
