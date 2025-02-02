/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 * 
 * Copyright (C) 2010, vlad
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Base64Transformer.java
 *
 * Created on 29.03.2010, 12:38:41
 */

package httpanalyzer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlad
 */
public class Base64Transformer extends javax.swing.JDialog {

    /** Creates new form Base64Transformer */
    public Base64Transformer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        toBase64Button = new javax.swing.JButton();
        toTextButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        base64TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(httpanalyzer.HttpAnalyzerApp.class).getContext().getResourceMap(Base64Transformer.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        textTextArea.setColumns(20);
        textTextArea.setFont(resourceMap.getFont("textTextArea.font")); // NOI18N
        textTextArea.setRows(5);
        textTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), resourceMap.getString("textTextArea.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("textTextArea.border.titleFont"))); // NOI18N
        textTextArea.setName("textTextArea"); // NOI18N
        jScrollPane1.setViewportView(textTextArea);

        toBase64Button.setIcon(resourceMap.getIcon("toBase64Button.icon")); // NOI18N
        toBase64Button.setText(resourceMap.getString("toBase64Button.text")); // NOI18N
        toBase64Button.setToolTipText(resourceMap.getString("toBase64Button.toolTipText")); // NOI18N
        toBase64Button.setName("toBase64Button"); // NOI18N
        toBase64Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBase64ButtonActionPerformed(evt);
            }
        });

        toTextButton.setIcon(resourceMap.getIcon("toTextButton.icon")); // NOI18N
        toTextButton.setText(resourceMap.getString("toTextButton.text")); // NOI18N
        toTextButton.setToolTipText(resourceMap.getString("toTextButton.toolTipText")); // NOI18N
        toTextButton.setName("toTextButton"); // NOI18N
        toTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTextButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        base64TextArea.setColumns(20);
        base64TextArea.setFont(resourceMap.getFont("base64TextArea.font")); // NOI18N
        base64TextArea.setRows(5);
        base64TextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), resourceMap.getString("base64TextArea.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("base64TextArea.border.titleFont"))); // NOI18N
        base64TextArea.setName("base64TextArea"); // NOI18N
        jScrollPane2.setViewportView(base64TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(toBase64Button)
                        .addGap(18, 18, 18)
                        .addComponent(toTextButton)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toBase64Button)
                    .addComponent(toTextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toBase64ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBase64ButtonActionPerformed
        String base64 = new sun.misc.BASE64Encoder().encode(textTextArea.getText().getBytes());
        base64TextArea.setText(base64);
    }//GEN-LAST:event_toBase64ButtonActionPerformed

    private void toTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTextButtonActionPerformed
        try {
            // TODO add your handling code here:
            String base64Text = base64TextArea.getText();
            byte[] plainBuf = new sun.misc.BASE64Decoder().decodeBuffer(base64Text);
            textTextArea.setText(new String (plainBuf));
        } catch (IOException ex) {
            Logger.getLogger(Base64Transformer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_toTextButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Base64Transformer dialog = new Base64Transformer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea base64TextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textTextArea;
    private javax.swing.JButton toBase64Button;
    private javax.swing.JButton toTextButton;
    // End of variables declaration//GEN-END:variables

}
