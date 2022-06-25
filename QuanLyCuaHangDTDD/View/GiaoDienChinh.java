/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import ConnectDB_Notify.ChiaseDuLieu;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class GiaoDienChinh extends javax.swing.JFrame {

    private QuanLySanPham qlsp;
    private QuanLyKhachHang qlkh;
    private QuanLyNhaCungCap qlncc;
    private QuanLyKhuyenMai qlkm;
    private QuanLyBaoHanh qlbhanh;
    private QuanLyBanHang qlbh;
    private QuanLyNhanVien qlnv;
    private QuanLyPhongBan qlpb;
    private ThongKeDoanhThu tkdt;
    private TaoTaiKhoan ttk;
    
    /**
     * Creates new form NhanVien
     */
    public GiaoDienChinh() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        MoGiaoDienChinh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnQLSP = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnQLNCC = new javax.swing.JButton();
        btnQLBH = new javax.swing.JButton();
        btnQLKM = new javax.swing.JButton();
        btnQLBHanh = new javax.swing.JButton();
        btnQLNV = new javax.swing.JButton();
        btnQLPB = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnThongke = new javax.swing.JButton();
        TabMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnutaoTK = new javax.swing.JMenuItem();
        mnu_Logout = new javax.swing.JMenuItem();
        mnu_Exit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        mnuQLySP = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuKhachhang = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuNhacungcap = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuBanhang = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuKhuyenmai = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuBaohanh = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuNhanvien = new javax.swing.JMenuItem();
        mnuThongke = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuTKDT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/logout.png"))); // NOI18N
        btnLogout.setText("Đăng Xuất");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);
        jToolBar1.add(jSeparator9);

        btnQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/smartphone.png"))); // NOI18N
        btnQLSP.setText("Q.Lý Sản Phẩm");
        btnQLSP.setFocusable(false);
        btnQLSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSP);

        btnQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/customer.png"))); // NOI18N
        btnQLKH.setText("Q.Lý Khách Hàng");
        btnQLKH.setFocusable(false);
        btnQLKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLKH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLKH);

        btnQLNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/supplier.png"))); // NOI18N
        btnQLNCC.setText("Q.Lý Nhà Cung Cấp");
        btnQLNCC.setFocusable(false);
        btnQLNCC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNCC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNCCActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLNCC);

        btnQLBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/sales.png"))); // NOI18N
        btnQLBH.setText("Q.Lý Bán Hàng");
        btnQLBH.setFocusable(false);
        btnQLBH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLBH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLBHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLBH);

        btnQLKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/tag.png"))); // NOI18N
        btnQLKM.setText("Q.Lý Khuyến Mãi");
        btnQLKM.setFocusable(false);
        btnQLKM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLKM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKMActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLKM);

        btnQLBHanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/warranty.png"))); // NOI18N
        btnQLBHanh.setText("Q.Lý Bảo Hành");
        btnQLBHanh.setFocusable(false);
        btnQLBHanh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLBHanh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLBHanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLBHanhActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLBHanh);

        btnQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/staff.png"))); // NOI18N
        btnQLNV.setText("Q.Lý Nhân Viên");
        btnQLNV.setFocusable(false);
        btnQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLNV);

        btnQLPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/department.png"))); // NOI18N
        btnQLPB.setText("Q.Lý Phòng Ban");
        btnQLPB.setFocusable(false);
        btnQLPB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLPB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLPBActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLPB);
        jToolBar1.add(jSeparator10);

        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/turnover.png"))); // NOI18N
        btnThongke.setText("T.Kê Doanh Thu");
        btnThongke.setFocusable(false);
        btnThongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThongke);

        jMenu1.setText("Hệ thống");

        mnutaoTK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnutaoTK.setText("Tạo tài khoản");
        mnutaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnutaoTKActionPerformed(evt);
            }
        });
        jMenu1.add(mnutaoTK);

        mnu_Logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnu_Logout.setText("Đăng xuất");
        mnu_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_LogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_Logout);

        mnu_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnu_Exit.setText("Thoát");
        mnu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_Exit);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mnuQLySP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLySP.setText("Sản phẩm");
        mnuQLySP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLySPActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLySP);
        jMenu2.add(jSeparator3);

        mnuKhachhang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuKhachhang.setText("Khách hàng");
        mnuKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhachhangActionPerformed(evt);
            }
        });
        jMenu2.add(mnuKhachhang);
        jMenu2.add(jSeparator4);

        mnuNhacungcap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNhacungcap.setText("Nhà cung cấp");
        mnuNhacungcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhacungcapActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNhacungcap);
        jMenu2.add(jSeparator5);

        mnuBanhang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuBanhang.setText("Bán hàng");
        mnuBanhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBanhangActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBanhang);
        jMenu2.add(jSeparator2);

        mnuKhuyenmai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuKhuyenmai.setText("Khuyến mãi");
        mnuKhuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhuyenmaiActionPerformed(evt);
            }
        });
        jMenu2.add(mnuKhuyenmai);
        jMenu2.add(jSeparator7);

        mnuBaohanh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuBaohanh.setText("Bảo hành");
        mnuBaohanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBaohanhActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBaohanh);
        jMenu2.add(jSeparator8);

        mnuNhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNhanvien.setText("Nhân Viên");
        mnuNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanvienActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNhanvien);

        jMenuBar1.add(jMenu2);

        mnuThongke.setText("Thống kê");
        mnuThongke.add(jSeparator6);

        mnuTKDT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuTKDT.setText("Doanh thu");
        mnuTKDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTKDTActionPerformed(evt);
            }
        });
        mnuThongke.add(mnuTKDT);

        jMenuBar1.add(mnuThongke);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(TabMainBoard)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(TabMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnu_ExitActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MoGiaoDienChinh(){
        GiaoDienDangNhap gddn =new GiaoDienDangNhap(this, true);
        gddn.setVisible(true);
        
        dangnhapThanhCong();
    }
    
    private void dangnhapThanhCong(){
        if(ChiaseDuLieu.nguoiDangnhap.getCapBac().equals("Nhân viên")){
            mnuNhanvien.setEnabled(false);
            btnQLNV.setEnabled(false);
            btnQLPB.setEnabled(false);
            mnuThongke.setEnabled(false);
            btnThongke.setEnabled(false);
            mnutaoTK.setEnabled(false);
        }else if(ChiaseDuLieu.nguoiDangnhap.getCapBac().equals("Quản lý")){
            mnuNhanvien.setEnabled(true);
            btnQLNV.setEnabled(true);
            btnQLPB.setEnabled(true);
            mnuThongke.setEnabled(true);
            btnThongke.setEnabled(true);
            mnutaoTK.setEnabled(true);
        }
    }
    
    private void mnuQLySPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLySPActionPerformed
        if(qlsp==null){
            qlsp = new QuanLySanPham();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/smartphone_16px.png"));
            TabMainBoard.addTab("Quản Lý Sản Phẩm", icon, qlsp,"Quản Lý Sản Phẩm");
        }
        TabMainBoard.setSelectedComponent(qlsp);
    }//GEN-LAST:event_mnuQLySPActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        GiaoDienDangNhap dangnhap =new GiaoDienDangNhap(this, true);
        dangnhap.setVisible(true);
        dangnhapThanhCong();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        if(qlsp==null){
            qlsp = new QuanLySanPham();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/smartphone_16px.png"));
            TabMainBoard.addTab("Quản Lý Sản Phẩm", icon, qlsp,"Quản Lý Sản Phẩm");
        }
        TabMainBoard.setSelectedComponent(qlsp);
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void mnu_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_LogoutActionPerformed
        GiaoDienDangNhap dangnhap =new GiaoDienDangNhap(this, true);
        dangnhap.setVisible(true);
        dangnhapThanhCong();
    }//GEN-LAST:event_mnu_LogoutActionPerformed

    private void mnuKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhachhangActionPerformed
        if(qlkh==null){
            qlkh= new QuanLyKhachHang();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/customer_16px.png"));
            TabMainBoard.addTab("Quản Lý Khách Hàng",icon,qlkh,"Quản Lý Khách Hàng");
        }
        TabMainBoard.setSelectedComponent(qlkh);
    }//GEN-LAST:event_mnuKhachhangActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        if(qlkh==null){
            qlkh= new QuanLyKhachHang();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/customer_16px.png"));
            TabMainBoard.addTab("Quản Lý Khách Hàng",icon,qlkh,"Quản Lý Khách Hàng");
        }
        TabMainBoard.setSelectedComponent(qlkh);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void mnuNhacungcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhacungcapActionPerformed
        if(qlncc==null){
            qlncc= new QuanLyNhaCungCap();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/supplier_16px.png"));
            TabMainBoard.addTab("Quản Lý Nhà Cung Cấp",icon,qlncc,"Quản Lý Nhà Cung Cấp");
        }
        TabMainBoard.setSelectedComponent(qlncc);
    }//GEN-LAST:event_mnuNhacungcapActionPerformed

    private void btnQLNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNCCActionPerformed
        if(qlncc==null){
            qlncc= new QuanLyNhaCungCap();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/supplier_16px.png"));
            TabMainBoard.addTab("Quản Lý Nhà Cung Cấp",icon,qlncc,"Quản Lý Nhà Cung Cấp");
        }
        TabMainBoard.setSelectedComponent(qlncc);
    }//GEN-LAST:event_btnQLNCCActionPerformed

    private void mnuKhuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhuyenmaiActionPerformed
       if(qlkm==null){
            qlkm= new QuanLyKhuyenMai();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/tag_16px.png"));
            TabMainBoard.addTab("Quản Lý Khuyến Mãi",icon,qlkm,"Quản Lý Khuyến Mãi");
        }
        TabMainBoard.setSelectedComponent(qlkm);
    }//GEN-LAST:event_mnuKhuyenmaiActionPerformed

    private void btnQLKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKMActionPerformed
        if(qlkm==null){
            qlkm= new QuanLyKhuyenMai();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/tag_16px.png"));
            TabMainBoard.addTab("Quản Lý Khuyến Mãi",icon,qlkm,"Quản Lý Khuyến Mãi");
        }
        TabMainBoard.setSelectedComponent(qlkm);
    }//GEN-LAST:event_btnQLKMActionPerformed

    private void btnQLBHanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLBHanhActionPerformed
        if(qlbhanh==null){
            qlbhanh= new QuanLyBaoHanh();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/warranty_16px.png"));
            TabMainBoard.addTab("Quản Lý Bảo Hành",icon,qlbhanh,"Quản Lý Bảo Hành");
        }
        TabMainBoard.setSelectedComponent(qlbhanh);
    }//GEN-LAST:event_btnQLBHanhActionPerformed

    private void mnuBaohanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBaohanhActionPerformed
        if(qlbhanh==null){
            qlbhanh= new QuanLyBaoHanh();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/warranty_16px.png"));
            TabMainBoard.addTab("Quản Lý Bảo Hành",icon,qlbhanh,"Quản Lý Bảo Hành");
        }
        TabMainBoard.setSelectedComponent(qlbhanh);
    }//GEN-LAST:event_mnuBaohanhActionPerformed

    private void btnQLBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLBHActionPerformed
        if(qlbh==null){
            qlbh= new QuanLyBanHang();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/sale_16px.png"));
            TabMainBoard.addTab("Quản Lý Bán Hàng",icon,qlbh,"Quản Lý Bán Hàng");
        }
        TabMainBoard.setSelectedComponent(qlbh);
    }//GEN-LAST:event_btnQLBHActionPerformed

    private void mnuBanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBanhangActionPerformed
        if(qlbh==null){
            qlbh= new QuanLyBanHang();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/sale_16px.png"));
            TabMainBoard.addTab("Quản Lý Bán Hàng",icon,qlbh,"Quản Lý Bán Hàng");
        }
        TabMainBoard.setSelectedComponent(qlbh);
    }//GEN-LAST:event_mnuBanhangActionPerformed

    private void mnuNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanvienActionPerformed
        if(qlnv==null){
            qlnv= new QuanLyNhanVien();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/staff_16px.png"));
            TabMainBoard.addTab("Quản Lý Nhân Viên",icon,qlnv,"Quản Lý Nhân Viên");
        }
        TabMainBoard.setSelectedComponent(qlnv);
    }//GEN-LAST:event_mnuNhanvienActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        if(qlnv==null){
            qlnv= new QuanLyNhanVien();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/staff_16px.png"));
            TabMainBoard.addTab("Quản Lý Nhân Viên",icon,qlnv,"Quản Lý Nhân Viên");
        }
        TabMainBoard.setSelectedComponent(qlnv);
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnQLPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPBActionPerformed
        if(qlpb==null){
            qlpb= new QuanLyPhongBan();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/department_16px.png"));
            TabMainBoard.addTab("Quản Lý Phòng Ban",icon,qlpb,"Quản Lý Phòng Ban");
        }
        TabMainBoard.setSelectedComponent(qlpb);
    }//GEN-LAST:event_btnQLPBActionPerformed

    private void mnuTKDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTKDTActionPerformed
        if(tkdt==null){
            tkdt= new ThongKeDoanhThu();
            TabMainBoard.addTab("Thống Kê Doanh Thu",null,tkdt,"Thống Kê Doanh Thu");
        }
        TabMainBoard.setSelectedComponent(tkdt);
    }//GEN-LAST:event_mnuTKDTActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
        if(tkdt==null){
            tkdt= new ThongKeDoanhThu();
            TabMainBoard.addTab("Thống Kê Doanh Thu",null,tkdt,"Thống Kê Doanh Thu");
        }
        TabMainBoard.setSelectedComponent(tkdt);
    }//GEN-LAST:event_btnThongkeActionPerformed

    private void mnutaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnutaoTKActionPerformed
        if(ttk==null){
            ttk= new TaoTaiKhoan();
            TabMainBoard.addTab("Tạo Tài Khoản",null,ttk,"Tạo Tài Khoản");
        }
        TabMainBoard.setSelectedComponent(ttk);
    }//GEN-LAST:event_mnutaoTKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQLBH;
    private javax.swing.JButton btnQLBHanh;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLKM;
    private javax.swing.JButton btnQLNCC;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton btnQLPB;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnThongke;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuBanhang;
    private javax.swing.JMenuItem mnuBaohanh;
    private javax.swing.JMenuItem mnuKhachhang;
    private javax.swing.JMenuItem mnuKhuyenmai;
    private javax.swing.JMenuItem mnuNhacungcap;
    private javax.swing.JMenuItem mnuNhanvien;
    private javax.swing.JMenuItem mnuQLySP;
    private javax.swing.JMenuItem mnuTKDT;
    private javax.swing.JMenu mnuThongke;
    private javax.swing.JMenuItem mnu_Exit;
    private javax.swing.JMenuItem mnu_Logout;
    private javax.swing.JMenuItem mnutaoTK;
    // End of variables declaration//GEN-END:variables
}
