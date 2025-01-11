/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARS;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.*;
import java.util.Vector;

public class AvailableF extends javax.swing.JFrame {

    /**
     * Creates new form AvailableF
     */
    public AvailableF() {
        initComponents();
           try{
           DB con = new DB();
           String q = "select * from flights";
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)availablef.getModel();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availablef = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(242, 55, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AeroNave.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo125.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/TAvailableFlight.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(330, 100, 150, 50);

        availablef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        availablef.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "From / Source", "To / Destination ", "Dep Time", "Arrival Time", "Flight Charge"
            }
        ));
        availablef.setAlignmentX(2.0F);
        availablef.setAlignmentY(2.0F);
        availablef.setGridColor(new java.awt.Color(0, 0, 0));
        availablef.setRowHeight(30);
        availablef.setSelectionBackground(new java.awt.Color(255, 255, 255));
        availablef.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(availablef);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 150, 800, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableF().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable availablef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
