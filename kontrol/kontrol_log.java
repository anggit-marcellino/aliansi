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
public class kontrol_log extends koneksi{
    public kontrol_log() {
        setkonek();
    }
    
    public void tampil(DefaultTableModel dtm) throws SQLException {
        String sql = "SELECT detail_order.id_detail_order, `order`.id_order, `order`.no_meja, `order`.tanggal, user.id_user, user.nama_user, minuman.id_minuman, minuman.nama_minuman, minuman.harga, `order`.keterangan, `order`.status_order\n" +"\n" +
                     "FROM user,`order`,minuman,detail_order \n"+
                     "WHERE detail_order.id_order = `order`.id_order AND `order`.id_user = user.id_user AND detail_order.id_minuman = minuman.id_minuman GROUP BY detail_order.id_order";
    rs = st.executeQuery(sql);
    Object [] data = new Object[11];
    while(rs.next()){
        data[0] = rs.getObject("id_detail_order");
        data[1] = rs.getObject("id_order");
        data[2] = rs.getObject("no_meja");
        data[3] = rs.getObject("tanggal");
        data[4] = rs.getObject("id_user");
        data[5] = rs.getObject("nama_user");
        data[6] = rs.getObject("id_minuman");
        data[7] = rs.getObject("nama_minuman");
        data[8] = rs.getObject("harga");
        data[9] = rs.getObject("keterangan");
        data[10] = rs.getObject("status_order");
        dtm.addRow(data);
    }
    }
}
