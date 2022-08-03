/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_tuan4;

import JdbcOracleConnection.conn;
import dao.User_DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.frmDangNhap;

/**
 *
 * @author Admin
 */
public class GanQuyenDoiTuong extends javax.swing.JInternalFrame {
Connection conn=null;
    PreparedStatement preStatement=null;
    ResultSet result =null;
    DefaultTableModel dtmQuyen;
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
    /**
     * Creates new form PhanQuyenUser
     */
    public GanQuyenDoiTuong() {
        initComponents();
        open();
        dtmQuyen=(DefaultTableModel)jtbQuyen.getModel();
        hienThi();
        hienThi1();
       
    }
public void open(){
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");  
          String dbURL = "jdbc:oracle:thin:@localhost:1521:QLST" ;
          conn = DriverManager.getConnection(dbURL,strUsername,strPassword);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
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

        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbQuyen = new javax.swing.JTable();
        cbUser = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThuHoi = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbTable = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbquyen = new javax.swing.JComboBox<>();
        btnExit1 = new javax.swing.JButton();

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit.setText("Thoát");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("GÁN QUYỀN ĐỐI TƯỢNG");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Quyền đối tượng"));

        jtbQuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "GRANTEE", "OWNER", "TABLENAME", "GRANTOR", "PRIVILEGE"
            }
        ));
        jScrollPane1.setViewportView(jtbQuyen);

        jLabel6.setText("Tên người dùng");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        btnThuHoi.setText("Thu Hồi Quyền");
        btnThuHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuHoiActionPerformed(evt);
            }
        });

        btnTable.setText("Gán Quyền");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThuHoi, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnThuHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("Tên bảng");

        cbTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SANPHAM", "KHACHHANG", "NHANVIEN", "HOADON", "CTHOADON" }));

        jLabel8.setText("Quyền");

        cbquyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTER", "DELETE", "INSERT", "INDEX", "REFERENCES", "SELECT", "UPDATE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(48, 48, 48)
                                .addComponent(cbTable, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit1.setText("Thoát");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        // TODO add your handling code here:
        String quyen = cbquyen.getSelectedItem().toString();
        String user = cbUser.getSelectedItem().toString();
        String table = cbTable.getSelectedItem().toString();
    try {
        if (User_DAO.ganquyendt(quyen,table,user) == true)
        {
            JOptionPane.showMessageDialog(this,"Gán quyền ko thành công","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Gán quyền thành công","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
            hienThi();
        }
    } catch (SQLException ex) {
        Logger.getLogger(GanQuyenDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnTableActionPerformed

    private void btnThuHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuHoiActionPerformed
        // TODO add your handling code here:
        int row=jtbQuyen.getSelectedRow();
        String quyen = (String)jtbQuyen.getValueAt(row, 4);
        String user = (String)jtbQuyen.getValueAt(row, 0);
        String table=(String)jtbQuyen.getValueAt(row, 2);
    try {
        if (User_DAO.thuhoiquyendt(quyen,table,user) == true)
        {
            
            JOptionPane.showMessageDialog(this,"Thu hồi ko thành công","Thong Bao",JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(this,"Thu hồi thành công","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
            hienThi();
        }
    } catch (SQLException ex) {
        Logger.getLogger(GanQuyenDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnThuHoiActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không ?","Thoát",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.OK_OPTION)
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btnThuHoi;
    private javax.swing.JComboBox<String> cbTable;
    private javax.swing.JComboBox<String> cbUser;
    private javax.swing.JComboBox<String> cbquyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbQuyen;
    // End of variables declaration//GEN-END:variables
public void hienThi(){
            String sql ="select grantee,owner,table_name,grantor,privilege from dba_tab_PRIVS where owner = 'NHUNG'";
        try
        {
            preStatement=conn.prepareStatement(sql);
            result=preStatement.executeQuery();
            dtmQuyen.setNumRows(0);
            
            while(result.next()){
                Vector<Object> vec=new Vector<>();
                vec.add(result.getString("grantee"));
                vec.add(result.getString("owner"));
                vec.add(result.getString("table_name"));
                vec.add(result.getString("grantor"));
                vec.add(result.getString("privilege"));
                
                dtmQuyen.addRow(vec);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
}
public void hienThi1(){
            String sql ="select username from dba_users where profile = 'NHANVIEN' or profile = 'QUANLY'";
        try
        {
            preStatement=conn.prepareStatement(sql);
            result=preStatement.executeQuery();
            
            while(result.next()){
                cbUser.addItem(result.getString("username"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
}

}

