/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRM;

import DTO.ThongTinKhuyenMaiDTO;
import BUS.ThongTinKhuyenMaiBUS;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiens
 */
public class ThongTinKhuyenMaiFRM extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form ThongTinKhuyenMaiFRM
     */
    public ThongTinKhuyenMaiFRM() {
        initComponents();
        docKhuyenMai();
        
    }
    public void docKhuyenMai()
 {
       ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
       try
       {
           bus.docNhanVien();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
           return;
       }
       showOnTable(bus.ds);
       loadCacClassKhac();
    }
    public void showOnTable(ArrayList<ThongTinKhuyenMaiDTO> ds)
    {
        model =(DefaultTableModel) jt.getModel();
        model.setRowCount(0);
        for(ThongTinKhuyenMaiDTO km:ds){
           Vector data = setVector(km);
           model.addRow(data);
       }
       jt.setModel(model);
    }
    public Vector setVector(ThongTinKhuyenMaiDTO km){
        Vector vt = new Vector();
        vt.add(km.getMakm());
        vt.add(km.getMasp());
        vt.add(km.getGiamgia());
        vt.add(km.getQua());
        return vt;
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
        cbMakm = new javax.swing.JComboBox<>();
        cbMasp = new javax.swing.JComboBox<>();
        cbGiamgia = new javax.swing.JComboBox<>();
        txtQua = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết khuyến mãi"));

        jLabel1.setText("Mã khuyến mãi");

        jLabel2.setText("Mã sản phẩm");

        jLabel3.setText("Giảm giá");

        jLabel4.setText("Quà tặng");

        cbMakm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbMasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbGiamgia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbMakm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQua, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMakm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbGiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jButton6.setText("Thống kê");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Quay lại");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Thoát");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Mã sản phẩm", "Giảm giá", "Quà tặng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tìm kiếm");

        jMenuItem4.setText("Tìm kiếm theo mã");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Tìm kiếm theo giảm giá");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
            Vector km = new Vector();
            Vector sp = new Vector();
            try{
                km = bus.load("khuyenmai");
                sp = bus.load("sanpham");
            }catch(Exception e){}
            JComboBox cbkm = new JComboBox(new DefaultComboBoxModel(km));
            JComboBox cbsp = new JComboBox(new DefaultComboBoxModel(sp));
            cbkm.addItem("Tất cả");
            cbsp.addItem("Tất cả");
            Vector giamFrom = new Vector();
            Vector giamTo = new Vector();
            for(int i=0;i<=100;i++){
                giamFrom.add(i+"");
                giamTo.add(i+"");
            }
            
            JComboBox cbggFrom = new JComboBox(new DefaultComboBoxModel(giamFrom));
            JComboBox cbggTo = new JComboBox(new DefaultComboBoxModel(giamTo));
            JComboBox cbqua = new JComboBox(new String[]{"Có","Không","Tất cả"});
            JButton btn = new JButton("Thống kê");
            JTextField txtsoluong = new JTextField("",10);
            JTextField txtsoluongcogiamgia = new JTextField("",10);
            JTextField txtsoluongcoqua = new JTextField("",10);
            JPanel p0 = new JPanel(new GridLayout(3,2));
            JPanel p1 = new JPanel(new GridLayout(2,2));
            JPanel p2 = new JPanel(new GridLayout(1,2));
            p0.add(new JLabel("Số lượng"));
            p0.add(txtsoluong);
            p0.add(new JLabel("Có giảm giá"));
            p0.add(txtsoluongcogiamgia);
            p0.add(new JLabel("Có quà tặng"));
            p0.add(txtsoluongcoqua);
            p1.add(new JLabel("Mã khuyến mãi"));
            p1.add(new JLabel("Mã sản phẩm"));
            p1.add(cbkm);
            p1.add(cbsp);
            p2.add(cbggFrom);
            p2.add(cbggTo);
            btn.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                   int sl=0;
                   int cogiam=0;
                   int coqua=0;
                   try{
                       for(ThongTinKhuyenMaiDTO km:bus.thongKe(cbkm.getSelectedItem()+"",cbsp.getSelectedItem()+"",cbggFrom.getSelectedIndex(),cbggTo.getSelectedIndex(),cbqua.getSelectedItem()+"")){
                        sl++;
                        if(Integer.parseInt(km.getGiamgia()) > 0) cogiam++;
                        if(km.getQua().length() > 0) coqua++;
                        }
                   }catch(Exception evt){}
                        txtsoluong.setText(sl+"");
                        txtsoluongcogiamgia.setText(cogiam+"");
                        txtsoluongcoqua.setText(coqua+"");
               } 
            });
            Object ob = new Object[]{p1,"Giảm giá",p2,"Quà tặng",cbqua,btn,p0};
            JOptionPane.showMessageDialog(null,ob);
            
            try{
                showOnTable(bus.thongKe(cbkm.getSelectedItem()+"",cbsp.getSelectedItem()+"",cbggFrom.getSelectedIndex(),cbggTo.getSelectedIndex(),cbqua.getSelectedItem()+""));
            }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        // TODO add your handling code here:
        int i=jt.getSelectedRow();
        if(i<0) return;
        ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
        setTextFieldValue(bus.ds.get(i));
    }//GEN-LAST:event_jtMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThongTinKhuyenMaiDTO km = getFromTextField();
        ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
        int res = bus.them(km);
        if(res == 1){
            Vector vt = setVector(km);
            model.addRow(vt);
            jt.setModel(model);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Mã tồn tại. Thêm thất bại");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i<0) return;
        ThongTinKhuyenMaiDTO km = getFromTextField();
        ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
        int res = bus.sua(km,i);
        if(res == 1){
            setModelValue(km,i);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Sửa thất bại");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0){
            ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
            int res = bus.xoa(i);
            if(res == 1 ){
                model.removeRow(i);
                jt.setModel(model);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Xóa thất bại");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setTextFieldValue(new ThongTinKhuyenMaiDTO("KM001","SP001","0",""));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String res = JOptionPane.showInputDialog(null, "Nhập tìm kiếm","Tìm kiếm",JOptionPane.INFORMATION_MESSAGE);
        try{
            ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
            showOnTable(bus.timKiem(res));
        }catch(Exception e){}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(null,"Xác nhận thoát ?","Thoát",JOptionPane.OK_CANCEL_OPTION);
        if(exit == JOptionPane.OK_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MenuFRM menu = new MenuFRM();
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Vector giamFrom = new Vector();
            Vector giamTo = new Vector();
            for(int i=0;i<=100;i++){
                giamFrom.add(i+"");
                giamTo.add(i+"");
            }
        JComboBox cbggFrom = new JComboBox(new DefaultComboBoxModel(giamFrom));
        JComboBox cbggTo = new JComboBox(new DefaultComboBoxModel(giamTo));
        Object ob = new Object[]{cbggFrom,cbggTo};
        JOptionPane.showMessageDialog(null, ob);
        ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
        showOnTable(bus.timKiemTheoGiamGia(Integer.parseInt(cbggFrom.getSelectedItem()+""), Integer.parseInt(cbggTo.getSelectedItem()+"")));
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    public ThongTinKhuyenMaiDTO getFromTextField(){
        return new ThongTinKhuyenMaiDTO(cbMakm.getSelectedItem()+"",cbMasp.getSelectedItem()+"",cbGiamgia.getSelectedItem()+"",txtQua.getText());
    }
    public void setModelValue(ThongTinKhuyenMaiDTO km ,int i){
        model.setValueAt(km.getMakm(),i,0);
        model.setValueAt(km.getMasp(),i,1);
        model.setValueAt(km.getGiamgia(),i,2);
        model.setValueAt(km.getQua(),i,3);
        jt.setModel(model);
    }
    public void setTextFieldValue(ThongTinKhuyenMaiDTO km){
        cbMakm.setSelectedItem(km.getMakm());
        cbMasp.setSelectedItem(km.getMasp());
        cbGiamgia.setSelectedItem(km.getGiamgia());
        txtQua.setText(km.getQua());
    }
    public void loadCacClassKhac(){
        ThongTinKhuyenMaiBUS bus = new ThongTinKhuyenMaiBUS();
        try{
            Vector km = bus.load("khuyenmai");
            Vector sp = bus.load("sanpham");
            cbMakm.setModel(new DefaultComboBoxModel(km));
            cbMasp.setModel(new DefaultComboBoxModel(sp));
        }catch(Exception e){}
        
        Vector giam = new Vector();
        for(int i=0;i<=100;i++){
            giam.add(i+"");
        }
        cbGiamgia.setModel(new DefaultComboBoxModel(giam));
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
            java.util.logging.Logger.getLogger(ThongTinKhuyenMaiFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhuyenMaiFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhuyenMaiFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhuyenMaiFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinKhuyenMaiFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGiamgia;
    private javax.swing.JComboBox<String> cbMakm;
    private javax.swing.JComboBox<String> cbMasp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField txtQua;
    // End of variables declaration//GEN-END:variables
}
