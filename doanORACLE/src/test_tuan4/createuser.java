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
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.frmDangNhap;
import pojo.User_POJO;
import test_tuan3.cau2;

/**
 *
 * @author Admin
 */
public class createuser extends javax.swing.JInternalFrame {
    Connection connection = null;
    PreparedStatement preparedstatement = null;
    ResultSet result = null;
    DefaultTableModel dtmUser;
    DefaultTableModel dtmQuota;
    String strUsername = frmDangNhap.strTenDangNhap;
    String strPassword = frmDangNhap.strMatKhau;
    /**
     * Creates new form user
     */
    public createuser() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buttonGroup1.add(radiobtnLimited);
        buttonGroup1.add(radiobtnUnlimited);
        open();
        dtmUser = (DefaultTableModel)tblUser.getModel();
        hienThi();
        hienThiRole();
        hienThidsprofile();
        dtmQuota = (DefaultTableModel)tblQuota.getModel();
    }
        public void open(){
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");  
          String dbURL = "jdbc:oracle:thin:@localhost:1521:QLST" ;
          connection = DriverManager.getConnection(dbURL,strUsername,strPassword);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboboxtablespace = new javax.swing.JComboBox<>();
        radiobtnUnlimited = new javax.swing.JRadioButton();
        radiobtnLimited = new javax.swing.JRadioButton();
        txtQuota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbProfile = new javax.swing.JComboBox<>();
        cbRole = new javax.swing.JComboBox<>();
        btnSreach = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRefesh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuota = new javax.swing.JTable();
        btnSreach1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập thông tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel2.setText("Tên (user)");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật khẩu (pass)");

        jLabel4.setText("Không gian bảng (tablespace)");

        jLabel5.setText("Dung lượng (quota)");

        comboboxtablespace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SYSTEM", "SYSAUX", "UNDOTBS1", "TEMP", "USERS", "EXAMPLE" }));
        comboboxtablespace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxtablespaceActionPerformed(evt);
            }
        });

        radiobtnUnlimited.setText("Không giới hạn");

        radiobtnLimited.setText("Giới hạn");

        jLabel7.setText("Profile");

        jLabel6.setText("Nhóm quyền");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtQuota)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName)
                                .addComponent(txtMK)
                                .addComponent(comboboxtablespace, 0, 150, Short.MAX_VALUE))
                            .addComponent(radiobtnUnlimited)
                            .addComponent(cbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiobtnLimited))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboboxtablespace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radiobtnUnlimited))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobtnLimited)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19))
        );

        btnSreach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSreach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSreachActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Công Cụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel3.setToolTipText("");

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Notes.png"))); // NOI18N
        btnRefesh.setText("Làm mới");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete (1) (1).png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        btnAdd.setText("Thêm / Cập nhật");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên user", "Mật khẩu", "Profile"
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("User Oracle");

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        tblQuota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Không gian bảng", "Dung lượng"
            }
        ));
        jScrollPane2.setViewportView(tblQuota);

        btnSreach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file.png"))); // NOI18N
        btnSreach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSreach1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSreach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSreach1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSreach1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSreach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSreachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSreachActionPerformed
        // TODO add your handling code here:
//        try {
//            String sqlSelect = "SELECT * FROM CTPHIEUNHAP WHERE MAPN ='" +txtMaPN.getText()+"'";
//            preparedstatement = connection.prepareStatement(sqlSelect);
//            result = preparedstatement.executeQuery();
//            dtmpn.setRowCount(0);
//            while(result.next()){
//                Vector<Object> vector = new Vector<Object>();
//                vector.add(result.getString("MAPN"));
//                vector.add(result.getString("MASP"));
//                vector.add(result.getString("MALO"));
//                vector.add(result.getString("GIANHAP"));
//                vector.add(result.getString("SLNHAP"));
//                vector.add(result.getInt("TIENNHAP"));
//                dtmpn.addRow(vector);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnSreachActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        txtName.setText("");
        txtMK.setText("");
        comboboxtablespace.setSelectedItem(true);
        radiobtnUnlimited.setSelected(true);
        txtQuota.setText("");
        txtName.requestFocus();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row=tblUser.getSelectedRow();
        String NAME = (String)tblUser.getValueAt(row, 0);
                
        int tl = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "Xác nhận xóa", 
                JOptionPane.YES_NO_OPTION);
        if(tl== JOptionPane.YES_OPTION){
            try{
                
                String sqlDelete = String.format("DROP USER "+"%s"+" CASCADE",NAME);
                preparedstatement = connection.prepareStatement(sqlDelete);
                int x = preparedstatement.executeUpdate();
                if(x>0){
                    
                    JOptionPane.showMessageDialog(null, "Xóa không thành công");
                }
                else{
                    hienThi();
                    hienThiRole();
                    hienThidsprofile();
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không ?","Thoát",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.OK_OPTION)
//        System.exit(0);
            this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String Name =txtName.getText();
        String mk=txtMK.getText();
        String space = comboboxtablespace.getSelectedItem().toString();
        String quota = "Unlimited";
        if(radiobtnLimited.isSelected()){
            quota= txtQuota.getText();
         }//phan nhom q,profile mac dinh 
        String profile =cbProfile.getSelectedItem().toString();
        String role=cbRole.getSelectedItem().toString();
        //kich hoat mk khi quen
        
        //mk theo quy dnh
        if(checkUsername(Name))
             {
                 int ret = JOptionPane.showConfirmDialog(null, 
                    "Tên user ["+txtName.getText()+"] đã tồn tại, bạn có muốn cập nhật không ??",
                    "Thông báo",JOptionPane.YES_NO_OPTION);
            if(ret == JOptionPane.NO_OPTION) return;
                try{
                    String sqlUpdate = String.format
                ("ALTER USER "+"%s"+" DEFAULT TABLESPACE "+"%s"+" "
                + "QUOTA "+"%s"+" ON "+"%s"+" TEMPORARY TABLESPACE TEMP ACCOUNT UNLOCK",Name,space,quota,space);
        conn provider=new conn();
        provider.open(strUsername,strPassword);
        int x = provider.executeUpdate(sqlUpdate);
                if(x > 0){
                    
                    JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
                }
                else{
                    hienThi();
                    hienThiRole();
                    hienThidsprofile();
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                }
       
        provider.close();
            }
               catch(Exception ex){
                    ex.printStackTrace();
                }
             }
        else
        {
            try
            {
                 User_POJO hd = new User_POJO();
            hd.setStrName(Name);
            hd.setStrPass(mk);
            hd.setStrTableSpace(space);
            hd.setStrQuota(quota);
            hd.setProfile(profile);

                 String sqlrole=String.format("GRANT "+"%s"+" TO "+"%s"+" ",role,Name);
        conn provider=new conn();
        provider.open(strUsername,strPassword);
        int y= provider.executeUpdate(sqlrole);
                if(User_DAO.Createuser(hd)&& y > 0){
                    
                    JOptionPane.showMessageDialog(null, "Thêm không thành công");
                }
                else{
                    hienThi();
                    hienThiRole();
                    hienThidsprofile();
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                }
       
        provider.close();
            }
           catch(Exception ex){
                    ex.printStackTrace();
                }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnSreach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSreach1ActionPerformed
        // TODO add your handling code here:
        cau2 tk=new cau2();
        tk.setVisible(true);
    }//GEN-LAST:event_btnSreach1ActionPerformed

    private void comboboxtablespaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxtablespaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxtablespaceActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        // TODO add your handling code here:
        int row=tblUser.getSelectedRow();
        String name =(String)tblUser.getValueAt(row, 0);
        String sql = String.format("select tablespace_name , max_bytes from dba_ts_quotas where username = '"+"%s"+"' ",name);
            try
        {
            preparedstatement=connection.prepareStatement(sql);
            result=preparedstatement.executeQuery();
            dtmQuota.setNumRows(0);
            
            while(result.next()){
                Vector<Object> vec=new Vector<>();
                vec.add(result.getString("tablespace_name"));
                vec.add(result.getString("max_bytes"));
                dtmQuota.addRow(vec);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tblUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSreach;
    private javax.swing.JButton btnSreach1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbProfile;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JComboBox<String> comboboxtablespace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radiobtnLimited;
    private javax.swing.JRadioButton radiobtnUnlimited;
    private javax.swing.JTable tblQuota;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuota;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    public void hienThidsprofile(){
            String sql =String.format("Select profile from dba_profiles group by profile");
        try
        {
            preparedstatement=connection.prepareStatement(sql);
            result=preparedstatement.executeQuery();
            
            while(result.next()){
                cbProfile.addItem(result.getString("PROFILE"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
}
    private void hienThi() {
  
        String sql = "SELECT USERNAME,PASSWORD_VERSIONS,Profile FROM DBA_USERS";
        try
        {
            preparedstatement=connection.prepareStatement(sql);
            result=preparedstatement.executeQuery();
            dtmUser.setNumRows(0);
            
            while(result.next()){
                Vector<Object> vec=new Vector<>();
                vec.add(result.getString("USERNAME"));
                vec.add(result.getString("PASSWORD_VERSIONS"));
                vec.add(result.getString("PROFILE"));
                dtmUser.addRow(vec);
                
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    private boolean kiemTraTonTai(String Name) {
        try {
            String sqlSelect = "SELECT USERNAME FROM DBA_USERS WHERE USERNAME = ?";
            preparedstatement = connection.prepareStatement(sqlSelect);
            preparedstatement.setString(1 , Name);
            ResultSet rs = preparedstatement.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public boolean checkUsername(String username){
        
        boolean username_exist = false;
        
        String sql = "SELECT USERNAME FROM DBA_USERS WHERE USERNAME = ? ";
        
        try {
            preparedstatement = connection.prepareStatement(sql);
            preparedstatement.setString(1, username);
            result = preparedstatement.executeQuery();
        
            if(result.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Tên đăng nhập đã tồn tại , vui lòng nhập tên khác", "Lỗi tên đăng nhập", 2);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return username_exist ;
    }                
    public void hienThiRole(){
            String sql ="SELECT ROLE FROM DBA_ROLES WHERE COMMON = 'NO'";
        try
        {
            preparedstatement = connection.prepareStatement(sql);
            result=preparedstatement.executeQuery();
            
            while(result.next()){
                cbRole.addItem(result.getString("ROLE"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
}
}