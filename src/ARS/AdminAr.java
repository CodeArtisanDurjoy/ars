/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARS;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class AdminAr extends javax.swing.JFrame {

    /**
     * Creates new form AdminAr
     */
    public AdminAr() {
        initComponents();
        GetTable();
    }
    static void GetTable(){
    try{
           DB con = new DB();
           String q = "select * from admindb";
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)Addr.getModel();
           dft.setRowCount(0);
           
            while (rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= colamc; i++) {
                v.add(rs.getString("username"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("password"));
                v.add(rs.getString("id"));
                }
              dft.addRow(v);
            }
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"Server error \n"+e);
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Addr = new javax.swing.JTable();
        afname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(242, 55, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AeroNave.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo125.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 110);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 180, 90, 20);

        apass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(apass);
        apass.setBounds(40, 260, 190, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 240, 70, 20);

        aname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(aname);
        aname.setBounds(40, 140, 190, 40);

        jButton1.setBackground(new java.awt.Color(242, 55, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete User ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 410, 190, 43);

        jButton2.setBackground(new java.awt.Color(242, 55, 34));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 310, 190, 43);

        jButton3.setBackground(new java.awt.Color(242, 55, 34));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 360, 190, 43);

        Addr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User Name", "Full Name", "Password", "ID"
            }
        ));
        Addr.setRowHeight(30);
        Addr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Addr);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 110, 540, 400);

        afname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(afname);
        afname.setBounds(40, 200, 190, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("User Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 120, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           DB con = new DB();
           String sq = "DELETE FROM admindb WHERE id ='"+idc+"'";
           con.stm.executeUpdate(sq);
           GetTable();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error\n"+e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        try{
        DB con = new DB();
        String s = "INSERT INTO `admindb` (`username`, `password`, `Name`, `id`) VALUES ('"+aname.getText()+"', '"+apass.getText()+"', '"+afname.getText()+"', NULL);";
        con.stm.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "User added Sucessfully");
        GetTable();
        aname.setText("");
        afname.setText("");
        apass.setText("");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Server Error"+ex);
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Text Filds are empty\n"+e);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
        try{
        DB con = new DB();
        String s = "UPDATE `admindb` SET `username` = '"+aname.getText()+"',`password` = '"+apass.getText()+"',`Name` = '"+afname.getText()+"' WHERE `id` = "+idc+";";
        con.stm.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "User added Sucessfully");
        aname.setText("");
        afname.setText("");
        apass.setText("");
        GetTable();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Server Error"+ex);
        }
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Text Filds are empty\n"+e);
    }
    }//GEN-LAST:event_jButton3ActionPerformed
    static int idc;
    private void AddrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddrMouseClicked
    DefaultTableModel dft = (DefaultTableModel)Addr.getModel();
    int sindex = Addr.getSelectedRow();
    aname.setText(dft.getValueAt(sindex,0)+"");
    afname.setText(dft.getValueAt(sindex,1)+"");
    apass.setText(dft.getValueAt(sindex,2)+"");
    idc = Integer.parseInt(dft.getValueAt(sindex,3)+"");
    }//GEN-LAST:event_AddrMouseClicked

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
            java.util.logging.Logger.getLogger(AdminAr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Addr;
    private javax.swing.JTextField afname;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField apass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
