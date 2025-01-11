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
public class UserRes extends javax.swing.JFrame {

    /**
     * Creates new form UserRes
     */
    public UserRes() {
        initComponents();
        String s = "SELECT * FROM `flightr` ";
        GetTable(s);
    }

    static void GetTable(String q){
    try{
           DB con = new DB();
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)Userr.getModel();
           dft.setRowCount(0);
           
            while (rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= colamc; i++) {
                v.add(rs.getString("Fname"));
                v.add(rs.getString("Fid"));
                v.add(rs.getString("ffrom"));
                v.add(rs.getString("fto"));
                v.add(rs.getString("dtime"));
                v.add(rs.getString("cabin"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("status"));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Userr = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(242, 55, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo125.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AeroNave.png"))); // NOI18N

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

        Userr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Userr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Flight ID", "From / Source", "To / Destination ", "Dep Time", "Cabin Class", "Flight Charge", "Booking Status"
            }
        ));
        Userr.setAlignmentX(2.0F);
        Userr.setAlignmentY(2.0F);
        Userr.setGridColor(new java.awt.Color(0, 0, 0));
        Userr.setRowHeight(30);
        Userr.setShowHorizontalLines(true);
        Userr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserrMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(Userr);

        jPanel1.add(jScrollPane12);
        jScrollPane12.setBounds(0, 110, 800, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserrMouseClicked
        /*DefaultTableModel dft = (DefaultTableModel)Viewt.getModel();
        int sindex = Viewt.getSelectedRow();
        flid= dft.getValueAt(sindex,0).toString();
        flname=dft.getValueAt(sindex,1).toString();
        flfrom=dft.getValueAt(sindex,2).toString();
        flto=dft.getValueAt(sindex,3).toString();
        fldtime=dft.getValueAt(sindex,4).toString();
        flch=dft.getValueAt(sindex,6).toString();*/
    }//GEN-LAST:event_UserrMouseClicked

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
            java.util.logging.Logger.getLogger(UserRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Userr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JTable userv;
    private static javax.swing.JTable userv1;
    private static javax.swing.JTable userv10;
    private static javax.swing.JTable userv2;
    private static javax.swing.JTable userv3;
    private static javax.swing.JTable userv4;
    private static javax.swing.JTable userv5;
    private static javax.swing.JTable userv6;
    private static javax.swing.JTable userv7;
    private static javax.swing.JTable userv8;
    private static javax.swing.JTable userv9;
    // End of variables declaration//GEN-END:variables
}
