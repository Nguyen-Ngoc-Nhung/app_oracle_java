/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_tuan5;

import JdbcOracleConnection.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.frmDangNhap;

/**
 *
 * @author Admin
 */
public class policy extends javax.swing.JInternalFrame {
    Connection connection = null;
    PreparedStatement preparedstatement = null;
    ResultSet result = null;
    DefaultTableModel dtmPolicy;
    String strUsername = frmDangNhap.strTenDangNhap;
    String strPassword = frmDangNhap.strMatKhau;
    /**
     * Creates new form policy
     */
    public policy() {
        initComponents();
        open();
        dtmPolicy = (DefaultTableModel)tblPolicy.getModel();
        hienThi();
        hienThiDsUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        radioSelect = new javax.swing.JRadioButton();
        radioUpdate = new javax.swing.JRadioButton();
        radioInsert = new javax.swing.JRadioButton();
        radioDelete = new javax.swing.JRadioButton();
        radioMerge = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TxtColumn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnRefesh4 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPolicy = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nh???p th??ng tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel11.setToolTipText("");

        jLabel14.setText("T??n (user)");

        jLabel15.setText("Gi??m s??t tr??n");

        jLabel16.setText("Ho???t ?????ng gi??m s??t");

        jLabel17.setText("ID_AUDIT");

        radioSelect.setText("SELECT");

        radioUpdate.setText("UPDATE");

        radioInsert.setText("INSERT");

        radioDelete.setText("DELETE");

        radioMerge.setText("MERGE");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NHANVIEN", "KHACHHANG", "SANPHAM", "HOADON", "CTHOADON" }));

        jLabel2.setText("C???t ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioInsert)
                            .addComponent(radioUpdate))))
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(radioDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(radioSelect))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(radioMerge)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtColumn)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel17)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInsert)
                    .addComponent(radioDelete)
                    .addComponent(radioSelect))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioUpdate)
                    .addComponent(radioMerge))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "C??ng C???", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel7.setToolTipText("");

        btnRefesh4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checklist.png"))); // NOI18N
        btnRefesh4.setText("L??m m???i");
        btnRefesh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefesh4ActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete (1) (1).png"))); // NOI18N
        btnDelete.setText("X??a");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit.setText("Tho??t");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        btnAdd.setText("Th??m");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefesh4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Policy hi???n c??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jScrollPane2.setToolTipText("");

        tblPolicy.setBackground(new java.awt.Color(153, 255, 255));
        tblPolicy.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        tblPolicy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OBJECT_SCHEMA", " OBJECT_NAME", "POLICY_OWNER", "POLICY_NAME", "POLICY_COLUMN", "ENABLED", "SEL", "INS", "UPD", "DEL", "AUDIT_TRAIL", "POLICY_COLUMN_OPTIONS"
            }
        ));
        tblPolicy.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jScrollPane2.setViewportView(tblPolicy);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("POLICY/AUDIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void open(){
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
    private void btnRefesh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefesh4ActionPerformed
   
        txtID.setText("");
        txtID.requestFocus();
    }//GEN-LAST:event_btnRefesh4ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row=tblPolicy.getSelectedRow();
        String NAME = (String)tblPolicy.getValueAt(row, 0);
        String user=(String)tblPolicy.getValueAt(row, 1);
        String policy=(String)tblPolicy.getValueAt(row, 3);
        int tl = JOptionPane.showConfirmDialog(null, "B???n mu???n x??a?", "X??c nh???n x??a", JOptionPane.YES_NO_OPTION);
        if(tl== JOptionPane.YES_OPTION){
            try{

                String sqlDelete = String.format("BEGIN" +
                                            " dbms_fga.drop_policy (" +
                                                " OBJECT_SCHEMA => '"+"%s"+"' , " +
                                                " OBJECT_NAME => '"+"%s"+"' , " +
                                                " POLICY_NAME => '"+"%s"+"' " +
                                                " ); " +
                                                " END; ",NAME,user,policy);
                
                preparedstatement = connection.prepareStatement(sqlDelete);
                int x = preparedstatement.executeUpdate();
                if(x>0){
                    hienThi();
                    JOptionPane.showMessageDialog(null, "X??a th??nh c??ng");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "X??a kh??ng th??nh c??ng");
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null,"B???n c?? mu???n tho??t kh??ng ?","Tho??t",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.OK_OPTION)
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        String Name =jComboBox2.getSelectedItem().toString();
        String id_ten=txtID.getText();
        String table=jComboBox1.getSelectedItem().toString();
        String cot=TxtColumn.getText();
        String hd = "SELECT";
        if(radioUpdate.isSelected()){
            hd="UPDATE";
        }
        if(radioInsert.isSelected()){
            hd="INSERT";
        }
        if(radioDelete.isSelected()){
            hd="DELETE";
        }
        if(radioSelect.isSelected() && radioUpdate.isSelected()){
            hd= "SELECT,UPDATE";
         }
        if(radioSelect.isSelected()&& radioInsert.isSelected()){
            hd= "SELECT,INSERT";
        }
        if(radioSelect.isSelected() && btnDelete.isSelected()){
            hd="SELECT,DELETE";
        }
        if(checkUsername(id_ten))
        {
            JOptionPane.showMessageDialog(null,
                "T??n gi??m s??t ["+txtID.getText()+"] ???? t???n t???i",
                "L???i",JOptionPane.YES_NO_OPTION);
        }
        else
        {
            try
            {
                String sql = String.format("BEGIN" +
                                            " dbms_fga.add_policy (" +
                                                " OBJECT_SCHEMA => '"+"%s"+"' , " +
                                                " OBJECT_NAME => '"+"%s"+"' , " +
                                                " POLICY_NAME => '"+"%s"+"' , " +
                                                " AUDIT_COLUMN =>'"+"%s"+"' , " +
                                                " STATEMENT_TYPES => '"+"%s"+"' " +
                                                " ); " +
                                                " END; ",Name,table,id_ten,cot,hd);
                conn provider=new conn();
                provider.open(strUsername,strPassword);
                int x = provider.executeUpdate(sql);
                if(x > 0){
                    hienThi();
                    JOptionPane.showMessageDialog(null, "Th??m th??nh c??ng");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Th??m kh??ng th??nh c??ng");
                }

                provider.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtColumn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefesh4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioDelete;
    private javax.swing.JRadioButton radioInsert;
    private javax.swing.JRadioButton radioMerge;
    private javax.swing.JRadioButton radioSelect;
    private javax.swing.JRadioButton radioUpdate;
    private javax.swing.JTable tblPolicy;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
     private void hienThi() {
        
        String sql = "SELECT * FROM DBA_AUDIT_POLICIES";
        try
        {
            preparedstatement=connection.prepareStatement(sql);
            result=preparedstatement.executeQuery();
            dtmPolicy.setNumRows(0);
            
            while(result.next()){
                Vector<Object> vec=new Vector<>();
                vec.add(result.getString("OBJECT_SCHEMA"));
                vec.add(result.getString("OBJECT_NAME"));
                vec.add(result.getString("POLICY_OWNER"));
                vec.add(result.getString("POLICY_NAME"));
                vec.add(result.getString("POLICY_COLUMN"));
                vec.add(result.getString("ENABLED"));
                vec.add(result.getString("SEL"));
                vec.add(result.getString("INS"));
                vec.add(result.getString("UPD"));
                vec.add(result.getString("DEL"));
                vec.add(result.getString("AUDIT_TRAIL"));
                vec.add(result.getString("POLICY_COLUMN_OPTIONS"));
                dtmPolicy.addRow(vec);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public boolean checkUsername(String username){
        
        boolean username_exist = false;
        
        String sql = "SELECT * FROM DBA_AUDIT_POLICIES WHERE POLICY_NAME = ? ";
        
        try {
            preparedstatement = connection.prepareStatement(sql);
            preparedstatement.setString(1, username);
            result = preparedstatement.executeQuery();
        
            if(result.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "T??n gi??m s??t ???? t???n t???i , vui l??ng nh???p t??n kh??c", "L???i t??n gi??m s??t", 2);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return username_exist ;
    }     
    public void hienThiDsUser(){
            String sql =String.format("select username from dba_users where account_status = 'OPEN'");
        try
        {
            preparedstatement = connection.prepareStatement(sql);
            result = preparedstatement.executeQuery();
            
            while(result.next()){
                jComboBox2.addItem(result.getString("USERNAME"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
}
}
