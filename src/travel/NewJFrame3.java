/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Namit
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public NewJFrame3() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        E1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        log = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        boundary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 101));

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jInternalFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1366, 273);

        jLabel93.setBackground(new java.awt.Color(0, 0, 0));
        jLabel93.setFont(new java.awt.Font("Papyrus", 1, 30)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("<html> <center>Savings Karo<br>TravelGo Karo</center>");
        jLabel93.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel93);
        jLabel93.setBounds(570, 860, 250, 120);

        jLabel94.setBackground(new java.awt.Color(0, 0, 0));
        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("<html>\nAn initiative by<br>\nNamit & Gaurav");
        jLabel94.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel94);
        jLabel94.setBounds(170, 930, 130, 40);

        jLabel95.setBackground(new java.awt.Color(0, 0, 0));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Contact:");
        jLabel95.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel95);
        jLabel95.setBounds(990, 860, 230, 60);

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("<html>+918375048094<br>+918860440405");
        jLabel96.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel96);
        jLabel96.setBounds(1000, 930, 140, 40);

        jLabel97.setBackground(new java.awt.Color(0, 0, 0));
        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("TravelGo");
        jLabel97.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel97);
        jLabel97.setBounds(160, 860, 230, 60);

        jLabel92.setBackground(new java.awt.Color(0, 0, 0));
        jLabel92.setText("jLabel92");
        jLabel92.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel92);
        jLabel92.setBounds(10, 850, 1380, 170);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(email);
        email.setBounds(580, 430, 280, 40);

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(pass);
        pass.setBounds(580, 480, 280, 40);

        E1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        E1.setText("Email address");
        jInternalFrame1.getContentPane().add(E1);
        E1.setBounds(470, 430, 90, 40);

        p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1.setText("Password     ");
        jInternalFrame1.getContentPane().add(p1);
        p1.setBounds(470, 480, 170, 40);

        log.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log.setText("     Log in with your email");
        jInternalFrame1.getContentPane().add(log);
        log.setBounds(560, 360, 250, 30);

        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(620, 550, 160, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jButton2.setText("Create New Account ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(580, 650, 250, 50);
        jInternalFrame1.getContentPane().add(jSeparator2);
        jSeparator2.setBounds(460, 620, 460, 90);

        boundary.setBackground(new java.awt.Color(255, 255, 255));
        boundary.setOpaque(true);
        jInternalFrame1.getContentPane().add(boundary);
        boundary.setBounds(440, 330, 500, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 986, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static String user;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con=null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            PreparedStatement pst=con.prepareStatement("select firstname from travelgo where email=? and password=?");
            pst.setString(1, email.getText());
            pst.setString(2, pass.getText());
            //user=email.getText();
            ResultSet x=pst.executeQuery();
            
            if(x.next()){
                user=x.getString(1);
		JOptionPane.showMessageDialog(this, "You have successfully logged in!");
                NewJFrame7 obj7=new NewJFrame7();
                obj7.setVisible(true);
                obj7.setExtendedState(MAXIMIZED_BOTH);
                this.dispose();
            }else{
		JOptionPane.showMessageDialog(this,"Invalid Username or Password.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NewJFrame6 obj6=new NewJFrame6();
        obj6.setVisible(true);
        obj6.setExtendedState(MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame3 obj=new NewJFrame3();
                obj.setVisible(true);
                obj.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel boundary;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel log;
    private javax.swing.JLabel p1;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
