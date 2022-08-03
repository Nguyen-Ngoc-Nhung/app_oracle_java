package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import qlst.CT_HoaDon;
import qlst.HoaDon;
import qlst.KhachHang;
import qlst.NhanVien;
import qlst.SanPham;
import test_tuan2.mnuInstance;
import test_tuan2.mnuSession;
import test_tuan3.cau2;
import test_tuan4.GanQuyenDoiTuong;
import test_tuan4.GanQuyenHeThong;
import test_tuan4.createuser;
import test_tuan5.Profile;
import test_tuan5.Role;
import test_tuan5.audit;
import test_tuan5.policy;

/**
 *
 * @author Admin
 */
public class oracle_main extends javax.swing.JFrame {

    /**
     * Creates new form oracle
     */
    public oracle_main() {
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btndangnhap = new javax.swing.JButton();
        btninfouser = new javax.swing.JButton();
        btndangxuat = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnphanquyen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnuser = new javax.swing.JTextField();
        btnontime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btndangnhap1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mnuRegister = new javax.swing.JMenu();
        mnuDangKy = new javax.swing.JMenuItem();
        mnuProfile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuQuyen = new javax.swing.JMenu();
        mnuQuyenCaNhan = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuNhomQuyen = new javax.swing.JMenuItem();
        mnuGiamSat = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuThoat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mnuCT_HD = new javax.swing.JMenuItem();
        mnuHoaDon = new javax.swing.JMenuItem();
        mnuKhachHang = new javax.swing.JMenuItem();
        mnuNhanVien = new javax.swing.JMenuItem();
        mnuSP = new javax.swing.JMenuItem();
        mnuHD = new javax.swing.JMenu();
        mnuThongTin = new javax.swing.JMenuItem();
        mnuPro = new javax.swing.JMenuItem();
        mnuBaoCao = new javax.swing.JMenu();
        mnuAudit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPane.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/family-food-supermarket-shop-shopping-1031944-wallhere.com (2).jpg"))); // NOI18N

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 108, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btndangnhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndangnhap.setForeground(new java.awt.Color(0, 102, 102));
        btndangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign-up.png"))); // NOI18N
        btndangnhap.setText("Profile");
        btndangnhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangnhap.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btndangnhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        btninfouser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btninfouser.setForeground(new java.awt.Color(0, 102, 102));
        btninfouser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachhang.png"))); // NOI18N
        btninfouser.setText("Thông tin user");
        btninfouser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btninfouser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btninfouser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btninfouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninfouserActionPerformed(evt);
            }
        });

        btndangxuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndangxuat.setForeground(new java.awt.Color(0, 102, 102));
        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icondangxuat.png"))); // NOI18N
        btndangxuat.setText("Đăng xuất");
        btndangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangxuat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btndangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnphanquyen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnphanquyen.setForeground(new java.awt.Color(0, 102, 102));
        btnphanquyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N
        btnphanquyen.setText("Phân quyền");
        btnphanquyen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnphanquyen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnphanquyen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnphanquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphanquyenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tên đăng nhập ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Đăng nhập vào lúc");

        btnuser.setEditable(false);
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });

        btnontime.setEditable(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phong.png"))); // NOI18N

        btndangnhap1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndangnhap1.setForeground(new java.awt.Color(0, 102, 102));
        btndangnhap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/info.png"))); // NOI18N
        btndangnhap1.setText("Thông tin");
        btndangnhap1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangnhap1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btndangnhap1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndangnhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndangnhap)
                .addGap(18, 18, 18)
                .addComponent(btnphanquyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndangnhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndangxuat)
                .addGap(334, 334, 334)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnuser, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(btnontime))
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1588, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator5)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninfouser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndangxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnphanquyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnuser)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(btnontime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(4, 4, 4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndangnhap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(255, 204, 204));
        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnuHeThong.setBackground(new java.awt.Color(153, 255, 153));
        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supermarket.png"))); // NOI18N
        mnuHeThong.setMnemonic('f');
        mnuHeThong.setText("Hệ thống");
        mnuHeThong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnuRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconsua.png"))); // NOI18N
        mnuRegister.setText("Đăng kí");

        mnuDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign-up.png"))); // NOI18N
        mnuDangKy.setText("Tạo người dùng");
        mnuDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangKyActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuDangKy);

        mnuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        mnuProfile.setText("Tạo profile");
        mnuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfileActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuProfile);
        mnuRegister.add(jSeparator1);

        mnuQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N
        mnuQuyen.setText("Cấp quyền");

        mnuQuyenCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/unauthorized-person.png"))); // NOI18N
        mnuQuyenCaNhan.setText("Quyền cá nhân");
        mnuQuyenCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuyenCaNhanActionPerformed(evt);
            }
        });
        mnuQuyen.add(mnuQuyenCaNhan);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachhang.png"))); // NOI18N
        jMenuItem1.setText("Quyền đối tượng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuQuyen.add(jMenuItem1);

        mnuNhomQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chucvu.png"))); // NOI18N
        mnuNhomQuyen.setText("Nhóm quyền");
        mnuNhomQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhomQuyenActionPerformed(evt);
            }
        });
        mnuQuyen.add(mnuNhomQuyen);

        mnuGiamSat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/auditor.png"))); // NOI18N
        mnuGiamSat.setText("Giám sát");
        mnuGiamSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGiamSatActionPerformed(evt);
            }
        });
        mnuQuyen.add(mnuGiamSat);

        mnuRegister.add(mnuQuyen);

        mnuHeThong.add(mnuRegister);

        mnuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icondangxuat.png"))); // NOI18N
        mnuDangXuat.setMnemonic('s');
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDangXuat);
        mnuHeThong.add(jSeparator2);

        mnuThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        mnuThoat.setMnemonic('a');
        mnuThoat.setText("Thoát");
        mnuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThoatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuThoat);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/content-management-system.png"))); // NOI18N
        mnuQuanLy.setMnemonic('e');
        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnuCT_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/028-shopping online.png"))); // NOI18N
        mnuCT_HD.setMnemonic('t');
        mnuCT_HD.setText("Chi tiết hóa đơn");
        mnuCT_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCT_HDActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuCT_HD);

        mnuHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.png"))); // NOI18N
        mnuHoaDon.setMnemonic('d');
        mnuHoaDon.setText("Hóa đơn");
        mnuHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuHoaDon);

        mnuKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachhang.png"))); // NOI18N
        mnuKhachHang.setText("Khách hàng");
        mnuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhachHangActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuKhachHang);

        mnuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/014-cashier.png"))); // NOI18N
        mnuNhanVien.setText("Nhân viên");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuNhanVien);

        mnuSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/030-grocery cart.png"))); // NOI18N
        mnuSP.setText("Sản phẩm");
        mnuSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSPActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuSP);

        menuBar.add(mnuQuanLy);

        mnuHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/info.png"))); // NOI18N
        mnuHD.setMnemonic('h');
        mnuHD.setText("Thông tin");
        mnuHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnuThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file.png"))); // NOI18N
        mnuThongTin.setMnemonic('c');
        mnuThongTin.setText("Chi tiết");
        mnuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongTinActionPerformed(evt);
            }
        });
        mnuHD.add(mnuThongTin);

        mnuPro.setText("Session");
        mnuPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProActionPerformed(evt);
            }
        });
        mnuHD.add(mnuPro);

        menuBar.add(mnuHD);

        mnuBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/compliant1.png"))); // NOI18N
        mnuBaoCao.setMnemonic('h');
        mnuBaoCao.setText("Báo cáo");
        mnuBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnuAudit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/audit (1).png"))); // NOI18N
        mnuAudit.setText("Giám sát");
        mnuAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAuditActionPerformed(evt);
            }
        });
        mnuBaoCao.add(mnuAudit);

        menuBar.add(mnuBaoCao);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangKyActionPerformed
        // TODO add your handling code here:
        createuser u = new createuser();
        u.setVisible(true);
        this.jLabel1.add(u);
    }//GEN-LAST:event_mnuDangKyActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
        btnuser.setText("");
        btnontime.setText("");
        frmDangNhap frm=new frmDangNhap(this,true);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        process();
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThoatActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát?")==JOptionPane.OK_OPTION)
        System.exit(0);
    }//GEN-LAST:event_mnuThoatActionPerformed

    private void mnuCT_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCT_HDActionPerformed
        // TODO add your handling code here:
        CT_HoaDon p=new CT_HoaDon();
        p.setVisible(true);
        this.jLabel1.add(p);
    }//GEN-LAST:event_mnuCT_HDActionPerformed

    private void mnuGiamSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGiamSatActionPerformed
        // TODO add your handling code here:
        policy p=new policy();
        p.setVisible(true);
        this.jLabel1.add(p);
    }//GEN-LAST:event_mnuGiamSatActionPerformed

    private void mnuAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAuditActionPerformed
        // TODO add your handling code here:
        audit a=new audit();
        a.setVisible(true);
        this.jLabel1.add(a);
    }//GEN-LAST:event_mnuAuditActionPerformed

    private void mnuQuyenCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuyenCaNhanActionPerformed
        // TODO add your handling code here:
        GanQuyenHeThong ht  = new GanQuyenHeThong();
        ht.setVisible(true);
        this.jLabel1.add(ht);
    }//GEN-LAST:event_mnuQuyenCaNhanActionPerformed

    private void mnuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhachHangActionPerformed
        // TODO add your handling code here:
         KhachHang kh=new KhachHang();
        kh.setVisible(true);
        this.jLabel1.add(kh);
    }//GEN-LAST:event_mnuKhachHangActionPerformed

    private void mnuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSPActionPerformed
        // TODO add your handling code here:
        SanPham sp=new SanPham();
        sp.setVisible(true);
        this.jLabel1.add(sp);
    }//GEN-LAST:event_mnuSPActionPerformed

    private void mnuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfileActionPerformed
        // TODO add your handling code here:
        Profile tp = new Profile();
        tp.setVisible(true);
        this.jLabel1.add(tp);
    }//GEN-LAST:event_mnuProfileActionPerformed

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien nv =new NhanVien();
        nv.setVisible(true);
        this.jLabel1.add(nv);
    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void mnuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongTinActionPerformed
        // TODO add your handling code here:
        mnuInstance nv=new mnuInstance();
        nv.setVisible(true);
        this.jLabel1.add(nv);
    }//GEN-LAST:event_mnuThongTinActionPerformed

    private void btninfouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninfouserActionPerformed
        // TODO add your handling code here:
        cau2 tk=new cau2();
        tk.setVisible(true);
        this.jLabel1.add(tk);
    }//GEN-LAST:event_btninfouserActionPerformed

    private void mnuHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonActionPerformed
        // TODO add your handling code here:
        HoaDon ncc = new HoaDon();
        ncc.setVisible(true);
        this.jLabel1.add(ncc);
    }//GEN-LAST:event_mnuHoaDonActionPerformed

    private void mnuNhomQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhomQuyenActionPerformed
        // TODO add your handling code here:
        Role r=new Role();
        r.setVisible(true);
        this.jLabel1.add(r);
    }//GEN-LAST:event_mnuNhomQuyenActionPerformed

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        // TODO add your handling code here:
        Profile tp = new Profile();
        tp.setVisible(true);
        this.jLabel1.add(tp);
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void btnphanquyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphanquyenActionPerformed
        // TODO add your handling code here:
        GanQuyenHeThong ht  = new GanQuyenHeThong();
        ht.setVisible(true);
        this.jLabel1.add(ht);
    }//GEN-LAST:event_btnphanquyenActionPerformed

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnuserActionPerformed

    public void process(){
        btnuser.setText(SharedData.nguoi.getStrName());
        btnontime.setText(SharedData.nguoi1.getLast());
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        frmDangNhap frm = new frmDangNhap(this,true);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        process();
    }//GEN-LAST:event_formWindowOpened

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        btnuser.setText("");
        btnontime.setText("");
        frmDangNhap frm=new frmDangNhap(this,true);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        process();
    }//GEN-LAST:event_btndangxuatActionPerformed

    private void mnuProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProActionPerformed
        // TODO add your handling code here:
        mnuSession ht = new mnuSession();
        ht.setVisible(true);
        this.jLabel1.add(ht);
    }//GEN-LAST:event_mnuProActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        GanQuyenDoiTuong ht = new GanQuyenDoiTuong();
        ht.setVisible(true);
        this.jLabel1.add(ht);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btndangnhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap1ActionPerformed
        // TODO add your handling code here:
        mnuInstance nv=new mnuInstance();
        nv.setVisible(true);
        this.jLabel1.add(nv);
    }//GEN-LAST:event_btndangnhap1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle_main.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oracle_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oracle_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oracle_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oracle_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oracle_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btndangnhap1;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btninfouser;
    private javax.swing.JTextField btnontime;
    private javax.swing.JButton btnphanquyen;
    private javax.swing.JTextField btnuser;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAudit;
    private javax.swing.JMenu mnuBaoCao;
    private javax.swing.JMenuItem mnuCT_HD;
    private javax.swing.JMenuItem mnuDangKy;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuGiamSat;
    private javax.swing.JMenu mnuHD;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenuItem mnuHoaDon;
    private javax.swing.JMenuItem mnuKhachHang;
    private javax.swing.JMenuItem mnuNhanVien;
    private javax.swing.JMenuItem mnuNhomQuyen;
    private javax.swing.JMenuItem mnuPro;
    private javax.swing.JMenuItem mnuProfile;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuQuyen;
    private javax.swing.JMenuItem mnuQuyenCaNhan;
    private javax.swing.JMenu mnuRegister;
    private javax.swing.JMenuItem mnuSP;
    private javax.swing.JMenuItem mnuThoat;
    private javax.swing.JMenuItem mnuThongTin;
    // End of variables declaration//GEN-END:variables

}