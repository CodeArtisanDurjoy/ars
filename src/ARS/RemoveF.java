package ARS;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveF extends javax.swing.JFrame {

    /**
     * Creates new form RemoveF
     */
    public RemoveF() {
        initComponents();
        GetTable();
    }
    static void GetTable(){
    try{
           DB con = new DB();
           String q = "select * from flights";
           ResultSet rs = con.stm.executeQuery(q);
           ResultSetMetaData rsm = rs.getMetaData();
           int colamc = rsm.getColumnCount();
           DefaultTableModel dft = (DefaultTableModel)Removef.getModel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Removef = new javax.swing.JTable();
        fch = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        ffrom = new javax.swing.JTextField();
        fto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(242, 55, 34));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

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
        jPanel2.setBounds(0, 0, 800, 100);

        Removef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Removef.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "From / Source", "To / Destination ", "Dep Time", "Arrival Time", "Flight Charge"
            }
        ));
        Removef.setAlignmentX(2.0F);
        Removef.setAlignmentY(2.0F);
        Removef.setGridColor(new java.awt.Color(0, 0, 0));
        Removef.setRowHeight(30);
        Removef.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Removef.setShowHorizontalLines(true);
        Removef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemovefMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Removef);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 790, 330);
        jPanel1.add(fch);
        fch.setBounds(450, 130, 100, 30);
        jPanel1.add(id);
        id.setBounds(10, 130, 100, 30);
        jPanel1.add(name);
        name.setBounds(120, 130, 100, 30);
        jPanel1.add(ffrom);
        ffrom.setBounds(230, 130, 100, 30);
        jPanel1.add(fto);
        fto.setBounds(340, 130, 100, 30);

        jLabel2.setText("Flight Charge");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 110, 80, 16);

        jLabel4.setText("Flight ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 60, 16);

        jLabel5.setText("Flight Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 110, 70, 16);

        jLabel6.setText("From / Source");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 110, 90, 16);

        jLabel7.setText("To / Destination");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 110, 90, 16);

        jButton1.setBackground(new java.awt.Color(242, 55, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 130, 100, 30);

        jButton2.setBackground(new java.awt.Color(242, 55, 34));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 130, 100, 30);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    try{
        
        DB con = new DB();
        
        String sq = "DELETE FROM flights WHERE fid ='"+id.getText()+"'";
        con.stm.executeUpdate(sq);
        JOptionPane.showMessageDialog(null,"Flight Deleted");
        GetTable();
        id.setText("");
        name.setText("");
        ffrom.setText("");
        fto.setText("");
        fch.setText("");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,"Server Error \n"+e);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    String i;
    private void RemovefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemovefMouseClicked
    DefaultTableModel dft = (DefaultTableModel)Removef.getModel();
    int sindex = Removef.getSelectedRow();
    id.setText(dft.getValueAt(sindex,0)+"");
    name.setText(dft.getValueAt(sindex,1)+"");
    ffrom.setText(dft.getValueAt(sindex,2)+"");
    fto.setText(dft.getValueAt(sindex,3)+"");
    fch.setText(dft.getValueAt(sindex,6)+"");
    
    }//GEN-LAST:event_RemovefMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveF().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Removef;
    private javax.swing.JTextField fch;
    private javax.swing.JTextField ffrom;
    private javax.swing.JTextField fto;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
