/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kontrol.kontrol_minumanImpl;

/**
 *
 * @author MARSHMALLOW
 */
public class minuman extends javax.swing.JInternalFrame {
    kontrol_minumanImpl k;
    String idminuman,namaminuman,statusminuman;
    int harga;
            
    /**
     * Creates new form user
     */
    public minuman() {
        initComponents();
        k = new kontrol_minumanImpl();
        tampildata();
        setobjek(false);
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidminuman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnamaminuman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbminuman = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        baru = new javax.swing.JButton();
        update = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        cbstatus = new javax.swing.JComboBox();
        canceledit = new javax.swing.JButton();
        peringatan = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Input Menu Minuman");

        jLabel2.setText("ID Minuman          :");

        jLabel3.setText("Nama Minuman     : ");

        jLabel4.setText("Harga                   :");

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });

        jLabel5.setText("Status Minuman   :");

        tbminuman.setBackground(new java.awt.Color(204, 204, 204));
        tbminuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Minuman", "Nama Minuman", "Harga", "Status Minuman"
            }
        ));
        tbminuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbminumanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbminuman);

        jLabel7.setText("| List Minuman");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        baru.setText("Baru");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        cbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Tersedia", "Kosong" }));

        canceledit.setText("Cancel Edit");
        canceledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceleditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(canceledit)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtidminuman, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtharga)
                                        .addComponent(txtnamaminuman)
                                        .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(baru)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(update)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(peringatan)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(simpan)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(hapus)))))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidminuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamaminuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peringatan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baru)
                    .addComponent(update)
                    .addComponent(simpan)
                    .addComponent(hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canceledit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        simpandata();
        baru.setEnabled(true);
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_simpanActionPerformed

    private void tbminumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbminumanMouseClicked
        // TODO add your handling code here:
        setformtable();
        baru.setEnabled(true);
        edit.setEnabled(true);
        hapus.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_tbminumanMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapusdata();
        baru.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        baru();
        txtidminuman.requestFocus();
        simpan.setEnabled(true);
        update.setEnabled(false);
        edit.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_baruActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updatedata();
        update.setEnabled(true);
        edit.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(true);
        canceledit.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        edit.setVisible(true);
        update.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(false);
        canceledit.setVisible(true);
        txtidminuman.setEnabled(false);
    }//GEN-LAST:event_editActionPerformed

    private void canceleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceleditActionPerformed
        // TODO add your handling code here:
        baru();
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
    }//GEN-LAST:event_canceleditActionPerformed

    private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(Character.isAlphabetic(enter)){
            evt.consume();
            peringatan.setVisible(true);
            peringatan.setText("Inputan harus angka");
        } else {
            peringatan.setVisible(false);
        }
    }//GEN-LAST:event_txthargaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JButton canceledit;
    private javax.swing.JComboBox cbstatus;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel peringatan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tbminuman;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidminuman;
    private javax.swing.JTextField txtnamaminuman;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private void simpandata() {
        idminuman = txtidminuman.getText();
        namaminuman = txtnamaminuman.getText();
        harga = Integer.parseInt(txtharga.getText());
        statusminuman = (String) cbstatus.getSelectedItem();
        
        if (txtidminuman.getText().isEmpty() || txtnamaminuman.getText().isEmpty() || txtharga.getText().isEmpty() || cbstatus.getSelectedIndex()== 0) {
          JOptionPane.showMessageDialog(rootPane,"data harus diisi","informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
        k.simpandata(idminuman,namaminuman, harga, statusminuman);
        JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
        tampildata();
        baru();
        setobjek(false);
        }
        
}

private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) tbminuman.getModel();
    dtm.setRowCount(0);
    k.tampildata(dtm);
    tbminuman.setModel(dtm);
}

private void setformtable() {
     txtidminuman.setText(tbminuman.getValueAt(tbminuman.getSelectedRow(), 0).toString());
     txtnamaminuman.setText(tbminuman.getValueAt(tbminuman.getSelectedRow(), 1).toString());
     txtharga.setText(tbminuman.getValueAt(tbminuman.getSelectedRow(), 2).toString());
     cbstatus.setSelectedItem(tbminuman.getValueAt(tbminuman.getSelectedRow(), 3).toString());
     
}

private void hapusdata() {
    idminuman = txtidminuman.getText();
    
    int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan menghapus data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (conf == 0) {
        k.hapusdata(idminuman);
    JOptionPane.showMessageDialog(rootPane,"Data berhasil dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
    tampildata();
    baru();
    setobjek(false);
    }
    
} 

private void updatedata() {
        idminuman = txtidminuman.getText();
        namaminuman = txtnamaminuman.getText();
        harga = Integer.parseInt(txtharga.getText());
        statusminuman = (String) cbstatus.getSelectedItem();
        
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan mengubah data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            k.updatedata(idminuman, namaminuman, harga, statusminuman);
            tampildata();
            baru();
            setobjek(false);
        }
    }

private void baru() {
    txtidminuman.setText(null);
    txtnamaminuman.setText(null);
    txtharga.setText(null);
    cbstatus.setSelectedIndex(0);
}

private void setobjek(boolean b) {
    txtidminuman.setEnabled(b);
    txtnamaminuman.setEnabled(b);
    txtharga.setEnabled(b);
    cbstatus.setEnabled(b);
}
    


}

    














