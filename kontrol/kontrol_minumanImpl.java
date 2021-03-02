/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrol;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARSHMALLOW
 */
public class kontrol_minumanImpl extends koneksi {
    public kontrol_minumanImpl() {
        setkonek();
    }
    
    public void simpandata(String idminuman, String namaminuman, int harga, String statusminuman) {
       String sql = "INSERT INTO minuman VALUES ('"+idminuman+"','"+namaminuman+"','"+harga+"','"+statusminuman+"')";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_minumanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM minuman";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object[4];
            while(rs.next()) {
                data[0] = rs.getString("id_minuman");
                data[1] = rs.getString("nama_minuman");
                data[2] = rs.getInt("harga");
                data[3] = rs.getString("status_minuman");
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_minumanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void updatedata(String idminuman, String namaminuman, int harga, String statusminuman) {
         String sql = "UPDATE minuman SET nama_minuman = '"+namaminuman+"', harga = '"+harga+"', status_minuman = '"+statusminuman+"' WHERE id_minuman = '"+idminuman+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_minumanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      public void hapusdata(String idminuman) {
        String sql = "DELETE FROM minuman WHERE id_minuman = '"+idminuman+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_minumanImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
      
      public ResultSet cari(String cari) throws Exception {
          String sql = "SELECT * FROM minuman WHERE id_minuman = '"+cari+"'";
          return rs = st.executeQuery(sql);
      }

      public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM minuman WHERE id_minuman LIKE '%"+cari+"%' OR nama_minuman LIKE '%"+cari+"%' OR harga LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[4];
                while(rs.next()) {
                data[0] = rs.getString("id_minuman");
                data[1] = rs.getString("nama_minuman");
                data[2] = rs.getInt("harga");
                data[3] = rs.getString("status_minuman");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_minumanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
                  
      }
            
        
      }

