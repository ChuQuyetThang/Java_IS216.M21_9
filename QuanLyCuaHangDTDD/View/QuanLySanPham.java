/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import ConnectDB_Notify.KiemTraDuLieu;
import ConnectDB_Notify.ThongBao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Process.prSanPham;
import Model.SanPham;
import Process.prKhuyenMai;
import Process.prNhaCungCap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author ASUS
 */
public class QuanLySanPham extends javax.swing.JPanel {
    private GiaoDienChinh parentForm;
    private DefaultTableModel tblModel;
    
    ArrayList<String> listmaNhaCungCap =  null;
    ArrayList<String> listmaKhuyenMai =  null;
    /**
     * Creates new form QuanLySanPham
     */
    public QuanLySanPham() {
        initComponents();
        
        initTable();
        
        loadDataToTable();
        
        setListMaNCC();
        
        setListMaKM();
    }
    
    
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã sản phẩm","Tên sản phẩm","Màu sắc", "Giá bán","Mã NCC","MãKM","Số lượng"});
        tableSP.setModel(tblModel);
    }
    
    private String getmaSP(){
        int count =0;
        prSanPham kt = new prSanPham();
        try {
            count = kt.maSP();
        } catch (Exception ex) {
            Logger.getLogger(QuanLyBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count<9){
            return "SP" + 00 +(count+1);
        }else if(count>9 && count<99){
            return "SP" + 0 +(count+1);
        }else
            return "SP"  +(count+1);
    }
    
    private void loadDataToTable(){
        try{
            prSanPham kt = new prSanPham();
            List<SanPham> list = kt.FindAll();
            tblModel.setRowCount(0);
            for(SanPham it :list){
                tblModel.addRow(new Object[]{
                it.getMaSP(), it.getTenSP(), it.getMauSac(), it.getDongia(), 
                it.getMaNCC(), it.getMaKM(), it.getSoluong()
                });
            }
            tblModel.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtGiaban = new javax.swing.JTextField();
        txtMausac = new javax.swing.JTextField();
        btnThemSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnCapnhatSP = new javax.swing.JButton();
        btnLuuSP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaSP1 = new javax.swing.JTextField();
        btnTracuuSP = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtslSP = new javax.swing.JTextField();
        cbmaNCC = new javax.swing.JComboBox<>();
        cbmaKM = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Sản Phẩm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Màu sắc:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giá bán:");

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGiaban.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMausac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnThemSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add.png"))); // NOI18N
        btnThemSP.setText("Thêm mới");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete.png"))); // NOI18N
        btnXoaSP.setText("Xóa");
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        btnCapnhatSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapnhatSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/update.png"))); // NOI18N
        btnCapnhatSP.setText("Cập nhật");
        btnCapnhatSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatSPActionPerformed(evt);
            }
        });

        btnLuuSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLuuSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/save.png"))); // NOI18N
        btnLuuSP.setText("Lưu");
        btnLuuSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSPActionPerformed(evt);
            }
        });

        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSP);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("THÔNG TIN SẢN PHẨM");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã sản phẩm:");

        txtMaSP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnTracuuSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTracuuSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/search.png"))); // NOI18N
        btnTracuuSP.setText("Tra cứu");
        btnTracuuSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracuuSPActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mã NCC:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Mã KM:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng:");

        txtslSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbmaNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbmaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbmaKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbmaKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTracuuSP)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtslSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMausac, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGiaban, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(cbmaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnLuuSP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnCapnhatSP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbmaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnThemSP)
                                            .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnTracuuSP))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtGiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(cbmaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtslSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSP)
                            .addComponent(btnLuuSP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaSP)
                            .addComponent(btnCapnhatSP))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapnhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatSPActionPerformed
        StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtMaSP, sb, "Mã sản phẩm trống!!");
        KiemTraDuLieu.DuLieuTrong(txtTenSP, sb, "Tên sản phẩm trống!!");
        if(sb.length()>0){
            ThongBao.showLoi(parentForm, sb.toString(), "Lỗi!!");
            return;
        }
        if(ThongBao.showXacNhan(parentForm, "Bạn có muốn cập nhật sản phẩm không?", "Hỏi")== JOptionPane.NO_OPTION){
            return;
        }
        try{
            SanPham sp =new SanPham();
            sp.setMaSP(txtMaSP.getText());
            sp.setTenSP(txtTenSP.getText());
            sp.setMauSac(txtMausac.getText());
            sp.setDongia(Long.parseLong(txtGiaban.getText()));
            sp.setMaNCC(cbmaNCC.getSelectedItem().toString());
            sp.setMaKM(cbmaKM.getSelectedItem().toString());
            sp.setSoluong(Long.parseLong(txtslSP.getText()));
            
            prSanPham kt = new prSanPham();
            if(kt.update(sp)&&sp.getSoluong()>=0&&sp.getDongia()>0){
                ThongBao.showThongBao(parentForm, "Sản phẩm đã được cập nhật", "Thông báo");
                loadDataToTable();
            }else{
                ThongBao.showXacNhan(parentForm, "Lỗi!! Không thể cập nhật.", "Cảnh báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnCapnhatSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        txtMaSP.setText(getmaSP());
        txtTenSP.setText("");
        txtGiaban.setText("");
        txtMausac.setText("");
        txtslSP.setText("0");
        txtslSP.setEnabled(false);
        loadDataToTable();
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnLuuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSPActionPerformed
        StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtMaSP, sb, "Mã sản phẩm trống!!");
        KiemTraDuLieu.DuLieuTrong(txtTenSP, sb, "Tên sản phẩm trống!!");
        if(sb.length()>0){
            ThongBao.showLoi(parentForm, sb.toString(), "Lỗi!!");
            return;
        }
        try{
            SanPham sp =new SanPham();
            sp.setMaSP(txtMaSP.getText());
            sp.setTenSP(txtTenSP.getText());
            sp.setMauSac(txtMausac.getText());
            sp.setDongia(Long.parseLong(txtGiaban.getText()));
            sp.setMaNCC(cbmaNCC.getSelectedItem().toString());
            sp.setMaKM(cbmaKM.getSelectedItem().toString());
            sp.setSoluong(Long.parseLong(txtslSP.getText()));
            
            prSanPham kt = new prSanPham();
            if(kt.insert(sp) && sp.getDongia()>0){
                ThongBao.showThongBao(parentForm, "Sản phẩm đã được lưu", "Thông báo");
                loadDataToTable();
                txtslSP.setEnabled(true);
            }else{
                ThongBao.showXacNhan(parentForm, "Lỗi!! Không thể lưu.", "Cảnh báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLuuSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtMaSP, sb, "Mã sản phẩm trống!!");
        if(sb.length()>0){
            ThongBao.showLoi(parentForm, sb.toString(), "Lỗi!!");
            return;
        }
        if(ThongBao.showXacNhan(parentForm, "Bạn có muốn xóa sản phẩm không?", "Hỏi")== JOptionPane.NO_OPTION){
            return;
        }
        try{
            prSanPham kt = new prSanPham();
            if(kt.delete(txtMaSP.getText())){
                ThongBao.showThongBao(parentForm, "Sản phẩm đã được xóa", "Thông báo");
                btnThemSPActionPerformed(evt);
                loadDataToTable();
            }else{
                ThongBao.showXacNhan(parentForm, "Lỗi!! Không thể xóa.", "Cảnh báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void tableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPMouseClicked
        try{
            int row = tableSP.getSelectedRow();
            
            if(row>=0){
                String id = (String) tableSP.getValueAt(row, 0);
                prSanPham kt = new prSanPham();
                SanPham sp = kt.FindByID(id);
                
                if(sp != null){
                    txtMaSP.setText(sp.getMaSP());
                    txtTenSP.setText(sp.getTenSP());
                    txtMausac.setText(sp.getMauSac());
                    txtGiaban.setText(String.format("%.0f",(double) sp.getDongia()));
                    cbmaNCC.setSelectedItem(sp.getMaNCC());
                    cbmaKM.setSelectedItem(sp.getMaKM());
                    txtslSP.setText(String.format("%.0f",(double) sp.getSoluong()));
                }
                txtslSP.setEnabled(true);
            }
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tableSPMouseClicked

    private void btnTracuuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTracuuSPActionPerformed
        try{
            prSanPham kt =new prSanPham();
            SanPham sp = kt.FindByID(txtMaSP1.getText());
            
            if(sp != null){
                txtMaSP.setText(sp.getMaSP());
                txtTenSP.setText(sp.getTenSP());
                txtMausac.setText(sp.getMauSac());
                txtGiaban.setText(String.format("%.0f",(double)sp.getDongia()));
                txtslSP.setText(String.format("%.0f",(double) sp.getSoluong()));
                cbmaNCC.setSelectedItem(sp.getMaNCC());
                cbmaKM.setSelectedItem(sp.getMaKM());
            }else{
                ThongBao.showThongBao(parentForm, "Không tìm thấy mã sản phẩm theo yêu cầu", "Thông báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnTracuuSPActionPerformed

    private void setListMaNCC(){
        prNhaCungCap kt = new prNhaCungCap();
        HashMap<String, String> listNhaCungCap = kt.getListNhaCungCap();
        listmaNhaCungCap = new ArrayList<String>();
        listmaNhaCungCap.addAll(listNhaCungCap.keySet());
        ArrayList<String> listMaNCC = new ArrayList<String>();
        listMaNCC.addAll(listNhaCungCap.values());
        cbmaNCC.setModel(new DefaultComboBoxModel(listMaNCC.toArray()));
    }
    private void setListMaKM(){
        prKhuyenMai kt = new prKhuyenMai();
        HashMap<String, String> listKhuyenMai = kt.getListKhuyenMai();
        listmaKhuyenMai = new ArrayList<String>();
        listmaKhuyenMai.addAll(listKhuyenMai.keySet());
        ArrayList<String> listMaKM = new ArrayList<String>();
        listMaKM.addAll(listKhuyenMai.values());
        cbmaKM.setModel(new DefaultComboBoxModel(listMaKM.toArray()));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhatSP;
    private javax.swing.JButton btnLuuSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTracuuSP;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JComboBox<String> cbmaKM;
    private javax.swing.JComboBox<String> cbmaNCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableSP;
    private javax.swing.JTextField txtGiaban;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSP1;
    private javax.swing.JTextField txtMausac;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtslSP;
    // End of variables declaration//GEN-END:variables
}
