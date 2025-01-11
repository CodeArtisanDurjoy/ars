/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARS;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BookFlight extends javax.swing.JFrame {
    String flid,flname,flfrom,flto,fldtime,flch,cab;
    String frm;
    int Flightc;
    static String email=UserPanel.em;
    public BookFlight() {
        initComponents();
        try{
           DB con = new DB();
           String q = "select * from flights";
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)Bookingf.getModel();
           dft.setRowCount(0);
           
            while (rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= colamc; i++) {
                v.add(rs.getString("fid"));
                v.add(rs.getString("Flight_Name"));
                v.add(rs.getString("source"));
                v.add(rs.getString("destination"));
                v.add(rs.getString("dep_time"));
                v.add(rs.getString("arrival_time"));
                v.add(rs.getString("flight_charge"));
                }
              dft.addRow(v);
            }
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"Server error \n"+e);
       }
    }
    static void GetTable(String q){
    try{
           DB con = new DB();
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)Bookingf.getModel();
           dft.setRowCount(0);
           
            while (rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= colamc; i++) {
//                v.add(rs.getString("fid"));
//                v.add(rs.getString("Flight Name"));
//                v.add(rs.getString("From / Source"));
//                v.add(rs.getString("To / Destination"));
//                v.add(rs.getString("Dep Time"));
//                v.add(rs.getString("Arrival Time"));
//                v.add(rs.getString("Flight Charge"));
                    v.add(rs.getString("fid"));
                    v.add(rs.getString("Flight_Name"));
                    v.add(rs.getString("source"));
                    v.add(rs.getString("destination"));
                    v.add(rs.getString("dep_time"));
                    v.add(rs.getString("arrival_time"));
                    v.add(rs.getString("flight_charge"));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dest = new javax.swing.JComboBox<>();
        from = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bookingf = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cabin = new javax.swing.JComboBox<>();
        tam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Destination :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 120, 130, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Select From :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 90, 20);

        dest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UAE", "Saudi Arab", "Malaysia", "Qatar", "Canada", "Italy", "Japan", "United Kingdom", "Bangladesh" }));
        dest.setBorder(null);
        dest.setPreferredSize(new java.awt.Dimension(120, 40));
        dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destActionPerformed(evt);
            }
        });
        jPanel1.add(dest);
        dest.setBounds(150, 140, 120, 40);

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh", "UAE", "Saudi Arab", "Malaysia", "Qatar", "Canada", "Italy", "Japan", "United Kingdom" }));
        from.setBorder(null);
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        jPanel1.add(from);
        from.setBounds(20, 140, 120, 40);

        Bookingf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Bookingf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "From / Source", "To / Destination ", "Dep Time", "Arrival Time", "Flight Charge"
            }
        ));
        Bookingf.setAlignmentX(2.0F);
        Bookingf.setAlignmentY(2.0F);
        Bookingf.setGridColor(new java.awt.Color(0, 0, 0));
        Bookingf.setRowHeight(30);
        Bookingf.setShowHorizontalLines(true);
        Bookingf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Bookingf);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 800, 300);

        jButton3.setBackground(new java.awt.Color(242, 55, 34));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Book Flight");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(660, 140, 120, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Total Amount:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 120, 90, 20);

        cabin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Economy", "Premium Economy", "Business" }));
        cabin.setBorder(null);
        cabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinActionPerformed(evt);
            }
        });
        cabin.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cabinVetoableChange(evt);
            }
        });
        jPanel1.add(cabin);
        cabin.setBounds(280, 140, 140, 40);

        tam.setPreferredSize(new java.awt.Dimension(120, 40));
        tam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamActionPerformed(evt);
            }
        });
        jPanel1.add(tam);
        tam.setBounds(560, 140, 90, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Select Cabin Class :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 120, 130, 20);

        dat.setText("19/10/2024");
        dat.setPreferredSize(new java.awt.Dimension(120, 40));
        dat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datActionPerformed(evt);
            }
        });
        jPanel1.add(dat);
        dat.setBounds(430, 140, 120, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Add Date:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 120, 90, 20);

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
    
    private void destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destActionPerformed

    String bto = dest.getSelectedItem().toString();
    try{
    String qs = "SELECT * FROM `flights` WHERE `source` LIKE '"+frm+"' AND `destination` LIKE '"+bto+"'";
    GetTable(qs);
    DB con = new DB();
    ResultSet rs = con.stm.executeQuery(qs);
    if(rs.next()){
        String s = rs.getString("flight_charge");
        Flightc =Integer.parseInt(s);
    }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_destActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
    String bfrom = from.getSelectedItem().toString();
    frm = bfrom;
    try{
    String q = "SELECT * FROM `flights` WHERE `source` LIKE '"+bfrom+"'";
    GetTable(q);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    
    }//GEN-LAST:event_fromActionPerformed

//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        try{
//            String da = dat.getText();
//            DB con =new DB();
//            String qq = "INSERT INTO `flightr` (`User`, `Fid`, `Fname`, `ffrom`, `fto`, `dtime`, `date`, `cabin`, `cost`, `id`, `status`) VALUES ('"+email+"', '"+flid+"', '"+flname+"', '"+flfrom+"', '"+flto+"', '"+fldtime+"', '"+da+"', '"+cab+"', '"+flch+"', NULL, 'Active')";
//            con.stm.executeUpdate(qq);
//            JOptionPane.showMessageDialog(null,"Flight Booking Sucessfull");
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String da = dat.getText();

            // Convert date format
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = outputFormat.format(inputFormat.parse(da));

            DB con = new DB();
            String qq = "INSERT INTO `flightr` (`User`, `Fid`, `Fname`, `ffrom`, `fto`, `dtime`, `date`, `cabin`, `cost`, `id`, `status`) "
                    + "VALUES ('" + email + "', '" + flid + "', '" + flname + "', '" + flfrom + "', '" + flto + "', '" + fldtime + "', '" + formattedDate + "', '" + cab + "', '" + flch + "', NULL, 'Active')";
            con.stm.executeUpdate(qq);
            JOptionPane.showMessageDialog(null, "Flight Booking Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }


    private void cabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinActionPerformed
    cab = cabin.getSelectedItem().toString();
    int i = 0;
    if(cab=="Economy"){
        Flightc+=2000;
    }
    else if (cab=="Premium Economy"){
        Flightc+=3000;
    }
    else if (cab=="Business"){
        Flightc+=1000;
    }
    tam.setText(String.valueOf(Flightc));
    }//GEN-LAST:event_cabinActionPerformed

    private void tamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamActionPerformed

    private void datActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datActionPerformed

    private void cabinVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cabinVetoableChange

    }//GEN-LAST:event_cabinVetoableChange

    private void BookingfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingfMouseClicked
    DefaultTableModel dft = (DefaultTableModel)Bookingf.getModel();
    int sindex = Bookingf.getSelectedRow();
    flid= dft.getValueAt(sindex,0).toString();
    flname=dft.getValueAt(sindex,1).toString();
    flfrom=dft.getValueAt(sindex,2).toString();
    flto=dft.getValueAt(sindex,3).toString();
    fldtime=dft.getValueAt(sindex,4).toString();
    flch=dft.getValueAt(sindex,6).toString();
    }//GEN-LAST:event_BookingfMouseClicked


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
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Bookingf;
    private javax.swing.JComboBox<String> cabin;
    private javax.swing.JTextField dat;
    private javax.swing.JComboBox<String> dest;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tam;
    // End of variables declaration//GEN-END:variables
}
