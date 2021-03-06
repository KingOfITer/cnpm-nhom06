/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRM;

import BUS.ChiTietPhieuNhapBUS;
import BUS.PhieuNhapBUS;
import BUS.SanPhamBUS;
import DTO.ChiTietPhieuNhapDTO;
import DTO.PhieuNhapDTO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xenov
 */
public class ChiTietPhieuNhapFRM extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form ChiTietPhieuNhapFRM
     */
    public ChiTietPhieuNhapFRM() {
        initComponents();
        docDuLieu();
        txtDongia.setEditable(false);
        txtThanhtien.setEditable(false);
        setTitle("Quản lý chi tiết phiếu nhập");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMahd = new javax.swing.JComboBox<>();
        cbMasp = new javax.swing.JComboBox<>();
        txtDongia = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        txtThanhtien = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cbLoc = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết hóa đơn nhập"));

        jLabel1.setText("Mã hóa đơn");

        jLabel2.setText("Mã sản phẩm");

        jLabel3.setText("Đơn giá");

        jLabel4.setText("Số lượng");

        jLabel5.setText("Thành tiền");

        cbMahd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbMasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaspActionPerformed(evt);
            }
        });
        cbMasp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbMaspKeyTyped(evt);
            }
        });

        txtDongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiaActionPerformed(evt);
            }
        });

        txtSoluong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoluongFocusLost(evt);
            }
        });
        txtSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongActionPerformed(evt);
            }
        });
        txtSoluong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoluongKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoluongKeyTyped(evt);
            }
        });

        jButton8.setText("Quay lại");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Về menu");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbMahd, 0, 160, Short.MAX_VALUE)
                    .addComponent(cbMasp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtThanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã sản phẩm", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cập nhật");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Đặt lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Tìm kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Thoát");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cbLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tìm kiếm");

        jMenuItem1.setText("Tìm kiếm theo mã");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Tìm kiếm theo đơn giá");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Tìm kiếm theo số lượng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Tìm kiếm theo thành tiền");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(cbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!isValidToAdd()){
            return;
        }
        try{
            int i  = jt.getSelectedRow();
            if(i >= 0){
                ChiTietPhieuNhapDTO hd = getFromTextField();
                ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
                int cu = Integer.parseInt(jt.getValueAt(i,3)+"");
                String ma = cbMasp.getSelectedItem()+"";
                int result = bus.sua(hd,i);
                if(result == 1){
                    bus.ds = null;
                    docDuLieu();
                    int moi = Integer.parseInt(jt.getValueAt(i,3)+"");
                
                    ThemBotSoLuongSanPham(ma,1,cu,moi);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");
                }else{
                    JOptionPane.showMessageDialog(null, "Chi tiết hóa đơn không tồn tại");
                }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //tem
        if(!isValidToAdd()){
            return;
        }
        ChiTietPhieuNhapDTO hd = getFromTextField();
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        try{
            int result = bus.them(hd);
            if(result == 1){
                ThemBotSoLuongSanPham(cbMasp.getSelectedItem()+"",1,0,0);
                model.addRow(setVector(hd));
                jt.setModel(model);
                JOptionPane.showMessageDialog(null, "Thêm thành công");
             }else{
                JOptionPane.showMessageDialog(null, "Mã tồn tại. Thêm thất bại.");
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0){
            setTextFieldValue(i);
        }
    }//GEN-LAST:event_jtMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(null,"Xác nhận xóa ?","Xóa",JOptionPane.OK_CANCEL_OPTION);
        if(chon == JOptionPane.CANCEL_OPTION) return;
        int i = jt.getSelectedRow();
        if(i>=0){
            ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
            int result = bus.xoa(i);
            if( result == 1){
                model.removeRow(i);
                jt.setModel(model);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cbMahd.setSelectedIndex(0);
        cbMasp.setSelectedIndex(0);
        txtDongia.setText("");
        txtSoluong.setText("");
        txtThanhtien.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaspActionPerformed
        // TODO add your handling code here:
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        try{
            String dongia = bus.get("sanpham",cbMasp.getSelectedItem()+"");
            txtDongia.setText(dongia);
          
        }catch(Exception e){}
        try{
             int re = Integer.parseInt(txtSoluong.getText())*Integer.parseInt(txtDongia.getText());
             txtThanhtien.setText(String.valueOf(re));
         }catch(Exception e){} 
    }//GEN-LAST:event_cbMaspActionPerformed

    private void txtSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtSoluongActionPerformed

    private void txtDongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiaActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtDongiaActionPerformed

    private void txtSoluongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoluongKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtSoluongKeyPressed

    private void txtSoluongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoluongFocusLost
        // TODO add your handling code here:
         try{
             int re = Integer.parseInt(txtSoluong.getText())*Integer.parseInt(txtDongia.getText());
             txtThanhtien.setText(String.valueOf(re));
         }catch(Exception e){} 
    }//GEN-LAST:event_txtSoluongFocusLost

    private void cbMaspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMaspKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaspKeyTyped

    private void txtSoluongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoluongKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSoluongKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JTextField find = new JTextField("",10);
        JOptionPane.showMessageDialog(null, new Object[]{"Nhập mã",find});
        find.requestFocus();
            ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
            showOnTable(bus.timKiem(find.getText()));  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JComboBox from = new JComboBox(new Object[]{50000,100000,200000,300000,400000,500000,600000});
        JComboBox to = new JComboBox(new Object[]{100000,150000,250000,350000,450000,550000,650000});
        from.setEditable(true);
        to.setEditable(true);
        Object ob = new Object[]{"Đơn giá từ",from,"đến",to};
        JOptionPane.showMessageDialog(null, ob);
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
            showOnTable(bus.timKiemTheoDonGia(Integer.parseInt(from.getSelectedItem()+""),Integer.parseInt(to.getSelectedItem()+"")));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JComboBox from = new JComboBox(new Object[]{10,20,30,40,50,60,70,80,90,100,200,300,400});
        JComboBox to = new JComboBox(new Object[]{10,20,30,40,50,60,70,80,90,100,200,300,400});
        from.setEditable(true);
        to.setEditable(true);
        Object ob = new Object[]{"Số lượng từ",from,"đến",to};
        JOptionPane.showMessageDialog(null, ob);
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        showOnTable(bus.timKiemTheoSoLuong(Integer.parseInt(from.getSelectedItem()+""),Integer.parseInt(to.getSelectedItem()+"")));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JComboBox from = new JComboBox(new Object[]{50000,500000,1000000,2000000,3000000,4000000,5000000,6000000});
        JComboBox to = new JComboBox(new Object[]{1000000,1500000,2500000,3500000,4500000,5500000,6500000});
        from.setEditable(true);
        to.setEditable(true);
        Object ob = new Object[]{"Thành tiền từ",from,"đến",to};
        JOptionPane.showMessageDialog(null, ob);
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        showOnTable(bus.timKiemTheoThanhTien(Integer.parseInt(from.getSelectedItem()+""),Integer.parseInt(to.getSelectedItem()+"")));
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void cbLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocActionPerformed
        // TODO add your handling code here:
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        if((cbLoc.getSelectedItem()+"").equals("Tất cả")) showOnTable(bus.ds);
        else showOnTable(bus.timKiem(cbLoc.getSelectedItem()+""));
    }//GEN-LAST:event_cbLocActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jButton5ActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        PhieuNhapFRM hd = new PhieuNhapFRM();
        this.setVisible(false);
        PhieuNhapBUS bus = new PhieuNhapBUS();
        bus.ds=null;
        hd.docDuLieu();
        hd.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(null,"Xác nhận thoát ?","Thoát",JOptionPane.OK_CANCEL_OPTION);
        if(exit == JOptionPane.OK_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // TODO add your handling code here:
        this.setVisible(false);
        MenuFRM menu = new MenuFRM();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
    public boolean isValidToAdd(){
        
        if(!isNumberic(txtSoluong.getText())){
            JOptionPane.showMessageDialog(null, "Bạn phải nhập số lượng");
            return false;
        }
        if(!isNumberic(txtDongia.getText())){
            JOptionPane.showMessageDialog(null, "Bạn phải chọn sản phẩm");
            return false;
        }
        if(!isNumberic(txtThanhtien.getText())){
            JOptionPane.showMessageDialog(null, "Bạn phải nhập số lượng hoặc chọn sản phẩm");
            return false;
        }
        return true;
    }
    public void setTextFieldValue(int i){
        cbMahd.setSelectedItem(jt.getValueAt(i,0)+"");
        cbMasp.setSelectedItem(jt.getValueAt(i,1)+"");
        txtDongia.setText(jt.getValueAt(i,2)+"");
        txtSoluong.setText(jt.getValueAt(i,3)+"");
        txtThanhtien.setText(jt.getValueAt(i,4)+"");
    }
    public void setModelValue(ChiTietPhieuNhapDTO hd,int i){
        model.setValueAt(hd.getMahd(),i,0);
        model.setValueAt(hd.getMasp(),i,1);
        model.setValueAt(hd.getDongia(),i,2);
        model.setValueAt(hd.getSoluong(),i,3);
        model.setValueAt(hd.getThanhtien(),i,4);
        jt.setModel(model);
    }
    public ChiTietPhieuNhapDTO getFromTextField(){
        ChiTietPhieuNhapDTO hd = new ChiTietPhieuNhapDTO();
        hd.setMahd(cbMahd.getSelectedItem()+"");
        hd.setMasp(cbMasp.getSelectedItem()+"");
        hd.setDongia(Integer.parseInt(txtDongia.getText()));
        hd.setSoluong(Integer.parseInt(txtSoluong.getText()));
        hd.setThanhtien(Integer.parseInt(txtThanhtien.getText()));
        return hd;
    }
    public Vector setVector(ChiTietPhieuNhapDTO hd){
        Vector vt = new Vector();
        vt.add(hd.getMahd());
        vt.add(hd.getMasp());
        vt.add(hd.getDongia());
        vt.add(hd.getSoluong());
        vt.add(hd.getThanhtien());
        return vt;
    }
    public void showOnTable(ArrayList<ChiTietPhieuNhapDTO> ds){
        model=(DefaultTableModel)jt.getModel();
        model.setRowCount(0);
        for(ChiTietPhieuNhapDTO hd:ds){
            Vector head = setVector(hd);
            model.addRow(head);
        }
        jt.setModel(model);
    }
    public void loadCacClassKhac(){
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        Vector mahd = bus.load("phieunhap");
        Vector masp = bus.load("sanpham");
        Vector loc = bus.load("phieunhap");
        loc.add("Tất cả");
        cbMahd.setModel(new DefaultComboBoxModel(mahd));
        cbMasp.setModel(new DefaultComboBoxModel(masp));
        cbLoc.setModel(new DefaultComboBoxModel(loc));
        
    }
    public void docDuLieu(){
        ChiTietPhieuNhapBUS bus = new ChiTietPhieuNhapBUS();
        try{
            bus.docDuLieu();
            showOnTable(bus.ds);
            loadCacClassKhac();
            //taiDuLieuCacClassKhac();
        }catch(Exception e){}
    }
    public boolean isNumberic(String num){
        return num.matches("^\\d+$");
       
    }
    public void ThemBotSoLuongSanPham(String masp,int op,int cu, int moi){
        int value = Integer.parseInt(txtSoluong.getText());
        SanPhamBUS bus = new SanPhamBUS();
        System.out.println(value*op + "/" + (moi - cu));
        bus.ThemBotSoLuongSanPham(masp,value*op + moi - cu);
    }
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
            java.util.logging.Logger.getLogger(ChiTietPhieuNhapFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhapFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhapFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhapFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietPhieuNhapFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbLoc;
    public javax.swing.JComboBox<String> cbMahd;
    private javax.swing.JComboBox<String> cbMasp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtThanhtien;
    // End of variables declaration//GEN-END:variables
}
